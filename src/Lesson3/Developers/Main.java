package Lesson3.Developers;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7)
        };
        StringBuilder sb;

        for (Developer d : list) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

        System.out.println("2.-------------------------");
/*2. Создать список разработчиков и заполнить его случайным образом.
 Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.*/

        Developer[] list2 = {

                new SeniorDeveloper("One", 1000, 3), //in list2
                new SeniorDeveloper("Two", 1000, 4),  //in list2
                new SeniorDeveloper("Tree", 1000, 1),   //in list2
                new InternDeveloper("Noth", 500, 0),    // no
                new TeamLeadDeveloper("BigDyaya", 3000, 6)   // no
        };

        for (Developer c : list2) {
            if ((c instanceof SeniorDeveloper && c.getSalary() > 1500)) {
                sb = new StringBuilder() // !!!
                        .append(c.getName())
                        .append(": ")
                        .append(c.getBasicSalary())
                        .append(" -> ")
                        .append(c.getSalary());
                System.out.println(sb);
            }
        }

/*  3. Написать код, который разделит список объектов Developer
на 3 отдельных списка для Juniors, Seniors и Team Leads. Вывести списки на экран.*/
        System.out.println("3.-------------------------");

        for (Developer x : list) {
            if (x instanceof JuniorDeveloper)
                System.out.println("Junior " + x.getName() + ", salary: " + x.getSalary());
            else if (x instanceof SeniorDeveloper)
                System.out.println("Senior " + x.getName() + ", salary: " + x.getSalary());
            else if (x instanceof TeamLeadDeveloper)
                System.out.println("TeamLead " + x.getName() + ", salary: " + x.getSalary());
        }

/* 4. Написать программу, которая будет рисовать на консоли
прямоугольник с заданными длинами сторон.*/
        System.out.println("4.-------------------------");

  /*      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine()); //задаем ширину
        int n = Integer.parseInt(reader.readLine()); //задаем высоту*/

        int m = 5;
        int n = 3;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }





    }
}
