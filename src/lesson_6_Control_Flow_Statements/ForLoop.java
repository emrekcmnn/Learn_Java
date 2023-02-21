package lesson_6_Control_Flow_Statements;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //      keyword   bşalngıç/initialization       şart/condition   increment/decrement
        for(         int i = 0;                     i<=5;                i++){
//            the code which is here be excuted as long as condition is true
//            burada ki kod condition tru oldukça yürütülecek
            System.out.println(i);
        }
//        this code will executed, if loop condition turn to false
//        loop un conditionu false olduğunda code buradan devam eder
        System.out.println("hey compiler başın döndümü");

//        example
        for(int i = 10; i>0; i--){
            System.out.print(i+" ");
        }
//        example
        System.out.println();
        for(int i = 0; i<4; i++){
            System.out.print("he");
        }
        System.out.println(":-)");




        //        task1

//Bir program yazın ve 0-100 arasındaki tüm sayıları yan yana yazdırsın.
        for (int i = 0; i <= 100; i++) {
            System.out.print(i+" ");
        }
        //        task2
//Bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırsın.
        System.out.println("------task2");
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
//        task3
//Bir program yazın ve 50-10 arasındaki tüm tek sayıları yazdırsın.
        System.out.println("\n------task3");
        for (int i = 50; i > 10; i--) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
//        task4
//Bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırsın.
        System.out.println("\n------task4");
        for (int i = 0; i < 100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
//        task5
//Bir program yazın ve 1-100 arasındaki sayıların toplamını konsola yazdırın
        System.out.println("\n------task5");
        int sum = 0;
        for(int i = 1; i<=100; i++){
//            sum=sum+i;
            sum+=i;
//            if (sum>2000 && sum<3000){
//                System.out.println("sum = " + sum);
//            }
//            System.out.println("i "+i+ " iken sum = "+sum);
        }
//        System.out.println("------");
        System.out.println("sum = "+sum);//5050

//        Task6
//        Bir program yazın ve 1-20 ye kadar olan sayıları 3 ile çarpın.
        System.out.println("\n------task6");
        for (int i = 1; i <=20; i++) {
            System.out.println(i + " X " + 3 + " = " + (i * 3));
//            System.out.println(i + " X 3 = " + (i * 3));
        }
// 1 alternatif çüzüm:
        int x = 0;
        for (int i = 1; i <=20; i++) {
            x = i * 3;
            System.out.println(x);
        }
//        task7
//Bir program yazın ve 0-30 arasındaki sayılardan tek olanlara 3
//ekleyin ve çift olanları 2 ile çarpın.
        System.out.println("\n------task7");
        for (int i = 0; i <= 30; i++) {
            if (i%2==1){
                System.out.println(i + "+3 = "+(i+3));
            }else{
                System.out.println("\t"+i + "X2 = "+ i*2);
            }
        }
//        task8
//        Bir program yazın ve 30-70 arasındaki 3 ün katlarını yazdırın
        System.out.println("\n------task8");
        for (int i = 30; i < 70; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
//        task9
//        Bir program yazın ve 0-1000 arası sonu 11 ile biten tüm sayıları
//        yazdırın
        System.out.println("\n------task9");
        for (int i = 0; i < 1000; i++) {
            if (i%100==11){
                System.out.print(i+" ");
            }
        }
//        task10
//        Bir program yazın kullanıcıdan sayı aralığı alın ve aralıktaki
//        sayıların hepsini çarpın.
        System.out.println("\n------task9");
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen 2 sayı giriniz");
        int i = sc.nextInt();
        int i2 = sc.nextInt();
        int init;
        int cont;

//        kullanıcıın girdiği sayıların buyuk
//        kucuk denetimi yapılmalı ve kucuk olan
//        j ye başlangıc degeri olarak atanmalı
        if (i>i2){
            init = i2;
            cont = i;
        }else{
            init = i;
            cont = i2;
        }
        int multiplication = 1;
        for (int j = init; j < cont; j++) {
            System.out.println("j = " + j);
            multiplication*=j;
        }
        System.out.println("multiplication = " + multiplication);



    }
}
