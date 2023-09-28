package Developers;

public class PhpDeveloperFactory implements DeveloperFactory {
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}
}
