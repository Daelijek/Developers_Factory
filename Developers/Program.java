package Developers;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Input the string of the developers that you want to create \n1. Input 'Java' to create Java Developer \n2. Input 'C++' to create C++ developer \n3. Input 'Python' to create Python Developer \n4. Input 'PHP' to create PHP developer \nInput Section: ");
		String specialty = sc.nextLine();
		DeveloperFactory developerFactory = creationBySpecialty(specialty);
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
		sc.close();
	}

	static DeveloperFactory creationBySpecialty(String specialty) {
		if(specialty.equals("Java")) {
			return new JavaDeveloperFactory();
		}
		else if(specialty.equals("C++")) {
			return new CppDeveloperFactory();
		}
		else if(specialty.equals("Python")) {
			return new PythonDeveloperFactory();
		}
		else if(specialty.equals("PHP")) {
			return new PhpDeveloperFactory();
		}
		else {
			throw new RuntimeException(specialty + "is working not correctly");
		}
	}
}
