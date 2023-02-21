package lesson_4_Operators;

import java.util.Scanner;

public class AllOperatorsSummary {
    public static void main(String[] args) {
     /*
        double x=10.5;
        int y=(int)x;
        System.out.println(y);

        short a=5,b=10,c;    //byte,short,int işlemlerde sonuç devamlı int
        c=(short) (a+b);



        int x=10;
        double y=4;
        int z=(int)(x/y);
        System.out.println("z = " + z);
//


int x=-35%3;
        System.out.println(x);
         int sonuc = 35 + -12 / ((-3*2) %5);
        System.out.println("sonuc = " + sonuc);
        */
//Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır.
// Toplantıya 113 katılmıştır.
//1.Toplantı salonun toplam kapasitesi nedir?
//2.Kaç adet boş koltuk vardır ?
//3.Kaç adet sırada oturulmaktadır ?
//4. Kaç sıra tamamen boş kalmıştır.
//5.Oturulan sıralarda kaç adet boş koltuk vardır?

        Scanner scan=new Scanner(System.in);

        System.out.print("Toplantı salonunda kaç adet sıra koltuk vardır: ");
        double sira=scan.nextDouble();
        System.out.print("Toplantı salonundaki her sırada kaç adet koltuk vardır: ");
        double siradakiKoltukSayisi=scan.nextDouble();
        System.out.print("Toplantıkaç kişi katılmıştır: ");
        double toplamKisiSayisi=scan.nextDouble();

        //1.Toplantı salonun toplam kapasitesi nedir?
        double toplamkapasite=sira*siradakiKoltukSayisi;
        System.out.println("toplam kapasite: "+toplamkapasite);

        //2.Kaç adet boş koltuk vardır ?
        double bosKoltukSayisi=toplamkapasite-toplamKisiSayisi;
        System.out.println("bosKoltukSayisi = " + bosKoltukSayisi);

        //3.Kaç adet sırada oturulmaktadır ?
        double toplamOturulanSiraSayisi=Math.ceil(toplamKisiSayisi/siradakiKoltukSayisi);
        System.out.println("toplamOturulanSiraSayisi = " + toplamOturulanSiraSayisi);

        //4. Kaç sıra tamamen boş kalmıştır.
        System.out.println("Tamamen boş sira sayisi:" +(sira-toplamOturulanSiraSayisi));

        //5.Oturulan sıralarda kaç adet boş koltuk vardır?
        System.out.println("oturulan sırada kaç adet boş koltuk vardır: "+(siradakiKoltukSayisi-(toplamKisiSayisi%siradakiKoltukSayisi)));





    /*

        // (=, +=, -=, *=, /=, %=)
        int x=16;
        System.out.println(x+=4);  //x=x+4    x=6
        System.out.println(x-=4);   //x=x-4   x=2
        System.out.println(x*=4);   //x=x*4   x=8
        System.out.println(x/=4);   //x=x/4   x=2
        System.out.println(x%=4);   //x=x%4   x=2


        //Ternary(üçlü) Operator:
        int a=6;
        int b=8;
        String isim=(false)?"harun":"mehmet";
        System.out.println("isim = " + isim);

        //x--; x=x-1;
        //--x; x=x-1;
        int x=5;
        System.out.println(!true);
        System.out.println(--x);
        System.out.println(++x);
        System.out.println(!(5>10));
        int i=5;
        i =     i++ + --i + ++i +i--;
        //Bellek 6    5   + 6 + 6
        //işlem  5  + 5   + 6  +6
        //5   +5  + 6 +6


        System.out.println("i = " + i);



        //scanner sınıfı kullanarak bir sayı al.
        // Sayının iki katını al, 30
        // 10 ekle,               40
        // 2'ye böl   20
        // sonra tuttuğun sayıyı bulduğun sayıdan çıkar. 20-15 5
        //çıkan sonucu ekrana yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("sayi: ");
        double sayi= scan.nextDouble();
        double sayi2=sayi;
        sayi2*=2;
        sayi2+=10;
        sayi2/=2;

        System.out.println(sayi2-sayi);

        // kullanıcan sayi1 ve sayi2 olacak şekilde 2 değer alın ve bu değerlerin
        //yerlerini değiştirin.  sayi1=5 sayi2=10    sayi1=10 sayi2=5 x=5 y=10
        //System.out.println("x: " +x+" y: "+y);   x:10 y:5

        int x=5;
        int y=10;
        int z=x;
        x=y;
        y=z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


//= atama operatorüdür

        //System.out.println(5!=7);
        //== operatorü referasları kontrol eder. , primitive data type larda kullanılabilir
        //fakat non primitive(String,Array vs) lerde hatalı sonuçlar verebilir
        // Stringlerde içeriği kontrol etmek için equals yöntemi kullanacağız

        int x=5;
        int y=6;
        System.out.println(x>=y);


        // mantıksal operatorlerde ikili olursa ilk parametreyi
        //kontrol eder 2. parametreyi duruma göre kontrol eder
        // mantıksal operatorlerde tekli olursa iki parametreyide kontrol eder


        boolean a= false || true;
        System.out.println(a);

        int a=5,b=10,c=10;
        boolean sonuc = a>b || (b>=c && a<=b);
        //            false || (true && true)
        //              false || true
        //                 true

        int a=5,b=10,c=10;
        boolean sonuc = a>b || b>=c && !(a>c);
        //            a>b || b>=c && !(false)
        //             a>b || b>=c && true
        //              a>b || true && true
        //               false|| true
        //              true

        int a=5;
        boolean b=true;
        boolean sonuc = a++==5 && --a == 11%6 || !b;
        //               true &&  5==5 || false
        //                true&& true || false
        //                     true||false
        //                          true
        */
    }
}
