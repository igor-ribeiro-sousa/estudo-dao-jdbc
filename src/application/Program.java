package application;

import java.util.Date;

import modal.entities.Department;
import modal.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
