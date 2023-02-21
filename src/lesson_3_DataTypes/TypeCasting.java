package lesson_3_DataTypes;

public class TypeCasting {
    public static void main(String[] args) {
   /*        Type Casting
       Bir veri türünün başka bir veri türüne atandığında gerçekleşen bir dönüştürme( converting işlemidir
       2 tip casting vardır
        -widening casting automatically küçük data type inden büyük olana doğru olur
        -Narrowing casting manually büyük data type inden küçük olana doğru olur
         */

/*

//        double x=89.88;
//        int y=(int)x;           //  narrowing casting
//        System.out.print(y);
//
//        short a=89;
//        double b=a;             //  widenning casting
//        System.out.print(b);



         byte x=5;  //8 bit
         int y=10;  //32 bit
       // y=x;      //32 bitlik bir alana 8 bit lik bir veriyi genişleme = widenning casting
       x=(byte)y;

      //  System.out.println(x);

        int z=130;
        byte t;
        t=(byte)130;                 //narrowing casting   veri kaybı olabilir.
        System.out.println(t);

        double x=100;
        int y=50;
       // y=(int)x;
        x=y;
        System.out.println(x);


        //byte,short ve int türündeki veriler ile işlem yapıldığında sonuç devamlı int'dir.
        byte x=2;
        byte y=2;
        int z;
        z=x+y;


        short a=5;
        short b=10;
        int c=a+b;
        //int,double,string,float, char
 */

        int a = 5, b = 10, c = a + b;
        System.out.println(c);

        short d = (short) c;
        System.out.println(d);
    }
}
