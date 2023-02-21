package lesson_6_Control_Flow_Statements;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++){
            System.out.println("Outer loop " + i + ". kez döndü");
            for (int j = 1; j < 5; j++) {
                System.out.println("\tinner loop " + j + ". kez döndü");

            }
        }
        //    task 1
//    * * *
//    * * *
//    * * *
//    * * *
//    * * *
        System.out.println("----task 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        task 2
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        System.out.println("----task 2");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        task3
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
        System.out.println("----task 4");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
//        task5
//        * * * * * * * * *
//        * * * * * * * *
//        * * * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        System.out.println("----task 5");
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        task6
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        System.out.println("----task 6");
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        task7
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *
        System.out.println("----task 7");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int t = 6-i; t > 0; t--) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        task8
//        1
//        2 3
//        4 5 6
//        7 8 9 10

        for (int i = 0; i <4 ; i++) {

            for (int j = 0,k=1; j <=i ; j++) {
                System.out.print(k+++"  ");

            }
            System.out.println();
        }
    }
}
