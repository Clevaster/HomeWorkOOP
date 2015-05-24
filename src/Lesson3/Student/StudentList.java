package Lesson3.Student;

public class StudentList {
    private Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s) {
        list[p++] = s;
    }

    public Student get(int n) {
        return list[n];
    }

    public int find(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

/*	2) была возможность удалять
    студента по номеру */

    public void remove(int n) {
        Student[] listtemp = new Student[list.length - 1];
        System.arraycopy(list, 0, listtemp, 0, n - 1);
        System.arraycopy(list, n + 1, listtemp, n, list.length - n - 1);
        list = listtemp;

    }

    public void printAll() {
        for (int n = 0; n < 100; n++) {
            System.out.println(list[n].getName()
                    + " " + list[n].getSurname() +
                    ": " + list[n].getBirth().toString());
        }
    }
}