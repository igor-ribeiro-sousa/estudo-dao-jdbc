package application;

import modal.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		Seller seller = selerDao.findById(3);
		System.out.println(seller);
		
	}

}
