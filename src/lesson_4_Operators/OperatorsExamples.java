package lesson_4_Operators;

import java.util.Scanner;

public class OperatorsExamples {
    public static void main(String[] args) {
            /*
        task
        Askere alım şartları 20 yaşından küçük olmamak ve sağlıklı
        olmaktır.
        isSoldier boolean değişkenine askerlik şartlarını kontrol
        ettiriniz. İnt age ve boolean healty değişkenlerini kullanınız.
        */
        int age = 20;
        boolean healty = true;

        boolean isSoldier = age>=20 && healty==true;
        System.out.println("isSoldier :"+isSoldier);

        /*task
        kullanıcıdan bir sayı alın sayı hem 3 hem 5 bölünüyorsa veya
        her ikisini de bölünmüyorsa false veren bir boolean kontrolü
        sağlayın.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i = scan.nextInt();
        //15 için     true     true  ----> false
        //17 için     false    false ----> false
        //25 için     false    true  ----> true
        //9 için      true     false ---->true
        boolean b1 =  i%3==0 ^ i%5==0;
        System.out.println("b1 = " + b1);

        /* task
        Kullanıcıdan boy ve kilosunu sorun. Boyun son 2 rakamının
        ifade ettiği değer kilosunun 5 fazlası ve 10 eksiği aralığında
        ise true döndüren bir boolean kontrolü sağlayın.
         */
        System.out.println("lütfen boyunuzu giriniz");
        int boy = scan.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        int kilo = scan.nextInt();

        int lengthPram = boy%100;
        System.out.println("lengthPram = " + lengthPram);
        // 180 boy için         70                     85
        boolean status = kilo>=lengthPram-10 && kilo<=lengthPram+5;
        System.out.println("status = " + status);

        // Example
//        Bir uygulama tasarlayın sizi hoş geldiniz mesajı ile karşılasın.
//                Size yaşadığınız şehrin nüfusunu sorsun. Eğer nüfus 1,5
//        milyondan fazla ve 10 milyondan az ise ve konuşulan dil
//        Türkçe ise liveInTur isimli boolean değeri true döndürsün.
//                Ve konsola « You live in Turkey true ?» ifadesini
//        değişken kullanarak yazdıralım.

//        System.out.println("        WELCOME");
//        System.out.println("Yaşadığınız şehrin nüfusu kaçtır?");
//        int population = scan.nextInt();
//        System.out.println("Konuşulan dil nedir (Türkçe ise 'true' yazınız) ?");
//        boolean language = scan.nextBoolean();
//        boolean bl = population > 1500000;
//        boolean bl1 =population < 10000000;
//
//        boolean liveInTur = bl && bl1 && language;
//        System.out.println(liveInTur);
//
//        System.out.println("You live in Turkey true ?");



        // Example
        System.out.print("Üç adet sayı giriniz\nBirinci Sayı : ");
        int num1 = scan.nextInt();
        System.out.print("İkinci Sayı : ");
        int num2 = scan.nextInt();
        System.out.print("Üçüncü Sayı : ");
        int num3 = scan.nextInt();

        boolean bl = num1>num2 || num1>num3;
        System.out.println("bl = " + bl);


    }
}
