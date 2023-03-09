package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao deptDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dept = deptDao.findById(3);
		
		System.out.println(dept);
		// ------------------------
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = deptDao.findAll();
		
		list.forEach(System.out::println);
		// ------------------------
		
		System.out.println("\n=== TEST 3: department insert ===");
		
		Department newDept = new Department(null, "Music");
		deptDao.insert(newDept);
		
		System.out.println("Inserted! New id = " + newDept.getId());
		// ------------------------
		
		System.out.println("\n=== TEST 4: department update ===");
		
		dept = deptDao.findById(1);
		dept.setName("Food");
		deptDao.update(dept);
		
		System.out.println("Update completed!");
		// ------------------------
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		
		deptDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
