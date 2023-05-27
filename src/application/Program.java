package application;

import modal.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = selerDao.findById(3);
		System.out.println(seller);
		
	}

}
