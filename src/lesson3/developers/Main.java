package lesson3.developers;

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
//2. Create the list of developers with salary more then 1500 y.e.


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

/*  3. �������� ���, ������� �������� ������ �������� Developer
�� 3 ��������� ������ ��� Juniors, Seniors � Team Leads. ������� ������ �� �����.*/
        System.out.println("3.-------------------------");

        for (Developer x : list) {
            if (x instanceof JuniorDeveloper)
                System.out.println("Junior " + x.getName() + ", salary: " + x.getSalary());
            else if (x instanceof SeniorDeveloper)
                System.out.println("Senior " + x.getName() + ", salary: " + x.getSalary());
            else if (x instanceof TeamLeadDeveloper)
                System.out.println("TeamLead " + x.getName() + ", salary: " + x.getSalary());
        }

/* 4. Rectangle*/
        System.out.println("4.-------------------------");

  /*      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine()); //������ ������
        int n = Integer.parseInt(reader.readLine()); //������ ������*/

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
