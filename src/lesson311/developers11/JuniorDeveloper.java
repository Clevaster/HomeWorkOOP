package lesson311.developers11;

public class JuniorDeveloper extends Developer {

	public JuniorDeveloper(String name, double basicSalary, int experience) {
		super(name, basicSalary, experience); //use parent constructor
	}

	@Override
	public double getSalary() {
		return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
