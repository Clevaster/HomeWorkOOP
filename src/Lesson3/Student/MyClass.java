package Lesson3.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClass {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));

//1)список вводился с клавиатуры____________________________________________________

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Enter Name");
                String name1 = reader.readLine();
                System.out.println("Enter Surname");
                String surname1 = reader.readLine();
                System.out.println("Enter birth in format yyyy, mm, dd");
                String forDat1e = reader.readLine();

                Date date1 = new Date(forDat1e);
                sl.add(new Student(name1, surname1, date1));
/*  3) при введении неправильных данных (пустое имя, неправильная дата) программа кидала исключение
     и обрабатывала его с выводом соотв. сообщений на экран.*/
            } catch (Exception e) {
                System.out.println("Wrong name, surname od birth.");
            }



//Find by name____________________________________________________
            int n = sl.find("Seva");
            System.out.println(sl.get(n).getName()
                    + " " + sl.get(n).getSurname() +
                    ": " + sl.get(n).getBirth().toString());

            sl.remove(n);
            sl.printAll();




//Why?????????? 3886.02.01__Что то не так с датой в принципе____________________________________
//       SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd");
//       System.out.println(formatDate.format(sl.get(n).getBirth()));
//______________________________________________________________-

        }


    }


}
