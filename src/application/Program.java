package application;

import java.util.List;

import modal.entities.Department;
import modal.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = selerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = selerDao.findByDepartment(dep);
		list.forEach(System.out::println);;
		
	}

}
