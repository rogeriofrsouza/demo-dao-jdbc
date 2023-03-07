package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dept = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, dept);
		
		System.out.println(seller);
	}

}
