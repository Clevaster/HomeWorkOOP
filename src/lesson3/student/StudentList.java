package lesson3.student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

  /*  public Student findByName(String name){
        for (int i = 0; i <list.length ; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return list[i];
            else return null; //???????
        }
    }*/


    public List<Student> findByName(String name) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                result.add(list[i]);
        }

        return result;
    }

    public List<Student> findbBySurname(String surname) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(surname))
                result.add(list[i]);
        }

        return result;
    }

/*	2) remove student-------------------------------------------------------*/

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
