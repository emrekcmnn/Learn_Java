package lesson_4_Operators;

public class AritmaticOperators {
    public static void main(String[] args) {
        /*
        -->     +  Additive operator (also used for String concatenation)
        -->     -  Subtraction operator
        -->     *  Multiplication operator
        -->     /  Division operator
        -->     %  Remainder operator

         */




  //      int sayi=4+5;
  //      System.out.println(sayi+12+" sayi"+3+3+3);  //output 21 sayi333
//         System.out.println("sayi2 =" + sayi+10); //soldan sağa okuyarak geldiği için artık string olarak okur.
//        System.out.println(sayi+12+"sayi"); // ilk sayıları toplayıp sonra stringi yazdı.
//
  //      int sayi=15%4;
  //     System.out.println("sayi : "+sayi);

        double x=5;
        x=x+1;
 //      System.out.println(x);       // 6.0
//
//        double toplamBorc=99.99;
//        int odeme=50;
//       int kalanBorc=(int)(toplamBorc-odeme);
//       //                 (49.99)
//        System.out.println(kalanBorc);        // 49


        double toplamBorc=99.99;
        double odeme=50.00;
        double kalanBorc=toplamBorc-odeme;
                       //  (49.99)
 //       System.out.println(kalanBorc);      //49,99



        double sayi1=22;
        int bolen=5;
        double sonuc=sayi1/bolen;
        System.out.print(sonuc);

    }
}
