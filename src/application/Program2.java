package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: department insert ====");
		Department dep = new Department(7, "Compras");
		departmentDao.insert(dep);
		System.out.println("Inserted! " + dep);
		
		System.out.println();
		System.out.println("=== TEST 2: department update ====");
		dep.setName("Suporte");
		departmentDao.update(dep);
		System.out.println("Updated! " + dep);
		
		System.out.println();
		System.out.println("=== TEST 3: department delete ====");
		System.out.println("Digite o ID do departamento que deseja apagar: ");
		departmentDao.deleteById(sc.nextInt());
		System.out.println("Deleted!");
		
		System.out.println();
		System.out.println("=== TEST 4: department findById ====");
		System.out.println("Digite o ID do departamento que deseja buscar: ");
		Department dep2 = departmentDao.findById(sc.nextInt());
		System.out.println(dep2);

		System.out.println();
		System.out.println("=== TEST 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		
		sc.close();
	}

}
