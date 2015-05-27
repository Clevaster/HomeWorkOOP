package lesson3.developers;

/**
 * Created by Lena on 22.05.2015.
 */

/*1. Create Inheritor of the Developer. Add to project.*/

public class InternDeveloper extends Developer {

    public InternDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 0.5);
    }
}
