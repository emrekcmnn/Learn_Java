package lesson_4_Operators;

public class AritmaticOperators2 {
    public static void main(String[] args) {
        // int sayi=5+3-2;
        // int sayi=5*3-3;
        //  int sayi=15%4*(3-1);
        //  int sayi=35 + 12 / 3 % 2 ;
        //        35+4 % 2
        //         35+0
        //          35

        int sayi=35 + 15 / 3 % 2 * (3-1);
        //       35+  15/ 3 %2 *2
        //        35+ 5%2*2
        //        35 +1*2
        //        35+2=37
        System.out.println(sayi);

//        double x=89.88;
//        int y=(int)x;           //  narrowing casting
//        System.out.print(y);
//
//        short a=89;
//        double b=a;             //  widenning casting
//        System.out.print(b);

        short  x=5,y=6,z ;
        z=(short) (x+y);

        double yariCap=3;
        double pi=3.14;
        double alan=pi*yariCap*yariCap;
        double cevre=2*pi*yariCap;

        System.out.println("Alan : "+alan+"\nCevre : "+cevre);


         /* double f=350;
        double c=(f-32)/1.8;
        System.out.println(f+" fahrenheit="+c+" Celcius"); */


        // ℃=(℉-32) /1.8    (c*1.8)+32=f
        int c=36;
        double f=(c*1.8)+32;
        System.out.println(c+" Celcius "+f+" fahrenheit ");



   /*  int year=2022;
       int aliBirthYear=1990;
        int aliAge=year-aliBirthYear;

        System.out.print(aliAge); */

//        int x=2022;
//        int y=1990;
//        int aliAge=x-y;
//        System.out.println("Ali'nin yaşı: "+aliAge);
//        System.out.print("Ahmet'in yaşı: "+(aliAge-5));
    }
}
