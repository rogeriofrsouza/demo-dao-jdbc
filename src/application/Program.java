package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dept = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, dept);
		
		/*
		 * Program não conhece a implementação, somente a interface
		 * Injeção de dependência sem implementação explícita (Factory)
		 */
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
