package Lesson3.Developers;

/**
 * Created by Lena on 22.05.2015.
 */
public class InternDeveloper extends Developer {

    public InternDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 0.5);
    }
}
