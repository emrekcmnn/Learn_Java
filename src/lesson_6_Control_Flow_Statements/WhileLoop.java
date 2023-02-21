package lesson_6_Control_Flow_Statements;

public class WhileLoop {
    public static void main(String[] args) {


        int speed = 110;
        while (speed >= 100) {
            System.out.println("break");
            speed--;
        }
        System.out.println("speed = " + speed);


//    While loop kullanarak Bir program yazın ve 100 kadar olan tek
//    sayıları yazdırsın.
        System.out.println("---------");

        int i = 0;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }

//        While loop kullanarak Bir program yazın ve 25 kadar olan tek
//        sayıları toplasın
        System.out.println("\n-----------");
        int i1 = 0;
        int sum = 0;
        while (i1 <= 25) {
            if (i1 % 2 == 1) {
                sum+= i1;
            }
            i1++;
        }
        System.out.println("sum = " + sum);

    }
}
