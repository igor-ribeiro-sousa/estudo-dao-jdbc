package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modal.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
		
		System.out.println("\n=== TEST 1: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		
		System.out.println("\n=== TEST 2: department insert ===");
		Department dep = new Department(null, "Igor Ribeiro");
		departmentDao.insert(dep);
		System.out.println("Sucesso! Novo id = " + dep.getId());
		

		System.out.println("=== TEST 3: department findById ===");
		Department newDep = departmentDao.findById(3);
		System.out.println(newDep);
		
				
		System.out.println("\n=== TEST 4: department update ===");
		newDep = departmentDao.findById(1);
		newDep.setName("Virna Helena");
		departmentDao.update(newDep);
		System.out.println("Update Concluido!");
		
		
		System.out.println("\n=== TEST 5: Department delete ===");
		System.out.println("Digite o Id para deletar");
		int id = scan.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deletado com sucesso!");
		
		scan.close();
		
	}

}
