package lesson311.student11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClass {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));

//--------From console throws Exception ------------------
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Enter Name");
                String name1 = reader.readLine();
                System.out.println("Enter Surname");
                String surname1 = reader.readLine();
                System.out.println("Enter birth in format dd.MM.yyyy");
                String forDate = reader.readLine();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date date1 = dateFormat.parse(forDate);

                sl.add(new Student(name1, surname1, date1));


            } catch (Exception e) {
                System.out.println("Wrong name, surname or birthDate.");
                break;
            }
        }


        int n = sl.find("Seva");
        System.out.println("Find by name - " + sl.get(n).getName()
                + " " + sl.get(n).getSurname() +
                ": " + sl.get(n).getBirth().toString());

        sl.remove(n);

        try {
            sl.printAll();
        } catch (Exception e) {
            System.out.println("-----------End-----------");
        }

    }

}




/*--------------------------------------------System.arraycopy
        int arr1[] = { 0, 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 0, 1, 2, 3, 4, 5, 6};

        int x = 4;

        int arr3[] = {01, 10, 20, 30, 40, 50, 60};

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr3, 0, x);
        System.arraycopy(arr2, x+1, arr3, x, arr2.length-x-1);
        System.out.print("array3 = ");
        System.out.print(arr3[0] + " ");
        System.out.print(arr3[1] + " ");
        System.out.print(arr3[2] + " ");
        System.out.print(arr3[3] + " ");
        System.out.print(arr3[4] + " ");
        System.out.print(arr3[5] + " ");
        System.out.print(arr3[6] + " ");      */







