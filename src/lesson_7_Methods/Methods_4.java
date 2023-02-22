package lesson_7_Methods;

import java.util.Random;

public class Methods_4 {
    public static void main(String[] args) {
        //sum methodu çağrıları
        sum();//konsolda bir sonuc veremez
//    System.out.println(sum());
//    int i = sum();
//    System.out.println("i = " + i);
//    System.out.println(sum() + 10);
//
//    //sum 2 methodu çağrıları
//    System.out.println("sum2 = "+sum2(5, 10));
//
//    System.out.println(sum2(5, 20) + sum());//30
//    System.out.println("---------");
//
//    System.out.println(    sum2(sum(),5)                );
//
//    int x = sum2(sum(),5);
//    System.out.println("x = " + x);

        System.out.println(generateLetter(5));


    }

//return type methods

    public static int sum() {
        return 5;
    }

    public static int sum2(int a, int b) {
        int i = a + b;
        return i;
//        return a+b;
    }


    //    kullanıcıya istediği miktarda
//    random olarak harf veren bir method yazınız.
//    65-90  arası alfabetik char değerler için

    public static String generateLetter(int a) {
        Random rd = new Random();
        char ch;
        String str = "";

        for (int i = 0; i < a; i++) {
            ch = (char) (rd.nextInt(26) + 65);
//             str = str+ch+" ";
            str += ch + " ";
        }
        return str;
    }


}
