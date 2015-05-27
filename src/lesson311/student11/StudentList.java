package lesson311.student11;

import java.text.SimpleDateFormat;

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

    public int findSurname(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

/*	2) remove student11-------------------------------------------------------*/

    public void remove(int n) {

        System.out.println(list[n].getName() + " " + list[n].getSurname() + " was removed from list");
        Student[] listTemp = new Student[100];

        System.arraycopy(list, 0, listTemp, 0, n);
        System.arraycopy(list, n + 1, listTemp, n, list.length - n - 1);

        list = listTemp;


    }


    public void printAll() {
        System.out.println("-----List of students----");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        for (Student s : list)
            System.out.println(s.getName()
                    + " " + s.getSurname() +
                    ": " + dateFormat.format(s.getBirth()));
    }
}
