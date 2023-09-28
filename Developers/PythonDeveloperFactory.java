package Developers;

public class PythonDeveloperFactory implements DeveloperFactory{
	public Developer createDeveloper() {
		return new PythonDeveloper();
	}
}
