package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*
		 * Program não conhece a implementação, somente a interface
		 * Injeção de dependência sem implementação explícita (Factory)
		 */
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");	
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);	
		List<Seller> list = sellerDao.findByDepartment(department);
		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
