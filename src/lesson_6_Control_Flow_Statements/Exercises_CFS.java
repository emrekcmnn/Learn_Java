package lesson_6_Control_Flow_Statements;

import java.util.Scanner;

public class Exercises_CFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x=10;
        int y;
        if (x==10) {
            y = 20;
            System.out.println(y);
        }

//        System.out.println(y);// if blogu compile time da
//                                  yurumediği için y bir deger
//                                  alamdı o yuzden hata veriyor




//        task
        double blance = 3000;
        double priceOfSuit = 2000;
        if (priceOfSuit <= blance) {
//            System.out.println("suiti satın alabilirim");
            System.out.println("kalan bakiye : " + (blance - priceOfSuit));
        } else {
            System.out.println("yetersiz bakiye");
        }

//        write a program; 2 numara kabul etsin numaraların eşit
//        olup olmadığını döndürsün. Eşitse concat yapsın.eşit değilse kücük sayı kadar
//        buyuk sayıyı yazdırsın
        //      Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int i = sc.nextInt();//5
        int i2 = sc.nextInt();//10

        if (i == i2) {//false
            System.out.println("numbersConcat : " + i + i2);
        } else {
            int cond;
            int bigNumber;

            if (i > i2) {
                cond = i2;
                bigNumber = i;
            } else {
                cond = i;
                bigNumber = i2;
            }
            for (int j = 0; j < cond; j++) {
                System.out.print(bigNumber + " ");
            }
        }

        /*
        Not aralığı Harf karşılığı
            85-100  A
            70-85   B
            55-70   C
            40-55   D
            0-40    F
         */
        System.out.println("Not giriniz:");
        int not = sc.nextInt();

        if (not<=100 && not>85){
            System.out.println("your grade is A");
        } else if (not <= 85 && not>70) {
            System.out.println("your grade is B");

        } else if (not <= 70 && not > 55) {
            System.out.println("your grade is C");

        }else if(not<=55 && not>40){
            System.out.println("your grade is D");

        }else if(not<=40 && not>0) {
            System.out.println("your grade is F");

        }else {
            System.out.println("boyle bir not giremezsiniz.");
        }



              /*
        Bir ışık devresini kontrol eden bir program yazın. Kullanıcıyı
        «for lighting, use switch»
        mesajı ile karşılasın. Işığın başlangıç durumu kapalı veya açık olabilir.
        Örneğin «Light is off. To on, turn button to 1» başlangıç da kullanıcıya bildirsin.

        1. Işık 1 komutunu aldığında sistem «for lighting, use
        switch» «Light is on, to off turn button to 0» bildiriminde
        bulunsun.

        2. maddeyi sonsuz bir döngüde çalışacak şekilde
        tasarlayınlayın.

        • Reminder: 0 ve 1 için switch yapısı, sürekli kullanıcıya
        sormak için while yapısı kullanılabilir.
         */



        while (true) {

            int button = 0;

            while (button != 1 && button == 0) {
                System.out.println("for lighting, use switch\n" +
                        "Light is off. To on, turn button to 1");

                button = sc.nextInt();
            }

            switch (button) {
                case 0:
                    System.out.println("light is off");
                    break;
                case 1:
                    System.out.println("light is on");
                    break;
            }

            while (button == 1 && button != 0) {
                System.out.println("for lighting, use switch\n" +
                        "Light is on. To off, turn button to 0");
                button = sc.nextInt();

            }
        }


//            Random rd = new Random();
//            int i = rd.nextInt(10);
//            System.out.println(i);
//        Bir program yazın eğer x in değeri 10 ise y ye 20 atansın




    }
}