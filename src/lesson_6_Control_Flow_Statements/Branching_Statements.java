package lesson_6_Control_Flow_Statements;

public class Branching_Statements {
    public static void main(String[] args) {
          /*    for (int i = 0; i <10 ; i++) {

            for (int j = 1; j < 70; j++) {
                if(j==3){
                    break;
                }
                System.out.println(j+".iç döngü loop");
            }
            System.out.println(i+ ". dış döngü loop");

        }





       boolean a=true;
        int i=1;
        while (a){

            System.out.println(i);
            i++;
            for (int j = 0; j <50 ; j++) {
                if(j==2){
                    a=false;
                    break;

                }
            }
   //1.soru: Kullanıcıdan sonsuz sayıda sayı girmesini isteyin -1
        // girer ise sistemden çıkış sağlasın

      //  2.soru:  0 dan 10 kadar bilgisayara bir sayı tutturun ve kullanıcın 4 hakda bunu bilmesini isteyin
        //kullanıcı bilirse "bildiniz tebrikler" yazdırın ve sistemden çıkın
        //bilemez ise 4. hakkından sonra "maalesef bilemediniz tuttuğum sayı... dı" diyerek sistemden çıkın

        }



        //1.soru: Kullanıcıdan sonsuz sayıda sayı girmesini isteyin -1
        // girer ise sistemden çıkış sağlasın
        System.out.println("Çıkmak için lütfen -1 giriniz");
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("lütfen bir sayı giriniz: ");
            int x=scan.nextInt();
            if(x==-1) {
                break;
            }
            System.out.println("girdiğiniz sayı: "+x);
        }

        int x=5;
        if(x==6){
            System.out.println("beş");}
        System.out.println("kod devam ediyor");
*/


        //  2.soru:  0 dan 10 kadar bilgisayara bir sayı tutturun ve kullanıcın 4 hakda bunu bilmesini isteyin
        //kullanıcı bilirse "bildiniz tebrikler" yazdırın ve sistemden çıkın
        //bilemez ise 4. hakkından sonra "maalesef bilemediniz tuttuğum sayı... dı" diyerek sistemden çıkın
        /*
        Random random=new Random();                //random.nextInt(10)   0 1 2 3 4 5 6 7 8 9
        int x= random.nextInt(10);           //random.nextInt(10)+1 1 2 3 4 5 6 7 8 9 10

    System.out.println("4 hakkınız var tuttuğum sayıyı tahmin et bakalım ");
    for (int i = 1; i <5; ) {
        Scanner scan=new Scanner(System.in);
        System.out.print(i+".tahin:");
        int y= scan.nextInt();
        if(x==y){
            System.out.println("Doğru tahmin tebrikler");
            break;
        }
        i++;
        if(i==5){
            System.out.println("tutuğum sayı "+x+ "di. bilemedin");
            break;
        }
        System.out.println("Tekrar dene");
    }


*/

        /*
        Scanner scan=new Scanner(System.in);
        Random random=new Random();                //random.nextInt(10)   0 1 2 3 4 5 6 7 8 9
        int x= random.nextInt(10);
        System.out.println("4 hakkınız var tuttuğum sayıyı tahmin et bakalım ");
        System.out.print("tahin:");
        int y= scan.nextInt();
        for (int i = 1; i <4; i++ ) {

            if(x!=y){
                System.out.println("tekrar dene");
                System.out.print("tahin:");
                y= scan.nextInt();
            }else {
                System.out.println("tebrikler bildiniz");
                break;
            }



        }
        if(x!=y){
            System.out.println("bilemediniz tuttuğum sayı: "+x);
        }

*/


        //Sonsuz bir While döngüsü içerisine kullanıcıdan 2 sayı isteyin ve
        // toplamını ekrana yazdırın sayı toplamı
        // 50 ye eşit ise proramdan çıkış işlemi gerçekleştirin.
/*
        Scanner scan=new Scanner(System.in);

while(true){
    System.out.println(" lütfen 2 sayı giriniz: ");
    System.out.print("1. sayı: ");
    int x=scan.nextInt();
    System.out.print("2. sayı: ");
    int y=scan.nextInt();
    if((x+y)==50){
        break;
    }

//Örnek : Nested if ve  loop kullanarak
// öncelikle 2 sayı alın ardından menüyü gösterin kullanıcıdan hangi işlemi yapmak istediğini sorun.
// 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış kullanıcının isteğine göre işlem yapın.
// ve işlemin sonucunu ekrana yazın
        Scanner scan=new Scanner(System.in);

    while (true){
        System.out.print("1.sayı");
        int x=scan.nextInt();
        System.out.print("2.sayı");
        int y=scan.nextInt();
        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış ");
        int islem= scan.nextInt();
       int result=0;

        if(islem==1){
     result=x+y;
     }else if(islem==2){
     result=x-y;
     }else if(islem==3){
     result=x*y;
        }else if(islem==4){
     if(y!=0){
        result=x/y;
    }
}else if(islem==5) {
    break;
}
        System.out.println("sonuc= "+result);


*/


        //1 den 10 kadar olan  5 hariç sayıları yazdırın
     /*   for (int i = 0; i <10 ; i++) {
            if(i==5){
                continue;
            }
            System.out.print(i+" ");

        }

*/
   /*     int i=0;
while (i<10){
    if(i==5){
        i++;
        continue;
    }
    System.out.print(i+" ");
    i++;
}

*/


        //0den 10(10 dahil değil) kadar olan sayıları ekrana yazdırın 3 ve 7 hariç
/*
        for (int i = 0; i <10 ; i++) {
            if(i==3||i==7){ continue;}
            System.out.print(i+" ");
        }

        */
        /*
        int i=0;
        while(i<10){
            if(i==3||i==7){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }

*/

        int i=0;
        do{
            if(i==3||i==7){
                i++;
                continue;
            }
            System.out.print(i+" ");
            i++;
        }while (i<10);

        /*

        System.out.println("program başladı");

      disLoop:  for (int i = 0; i <3 ; i++) {
            System.out.println("dış loop");
         icLoop:   for (int j = 0; j < 2; j++) {
                        if(j==1){
                            continue disLoop;
                        }
                        System.out.println("iç loop");

                     }

        }
        System.out.println("program sonlandı");

*/


        //banka menüsü 1 hesabımdaki parayı görme
        //          2 para ekleme
        //          3 kart iade
        // para ekleme
        //  1 havale
        //   2 eft
        //   3 bir önceki menüye dön
        //   4 kart iade

        /*
        Scanner scan=new Scanner(System.in);
        int para=2000;
     firstLoop:   while (true){
            System.out.println("Bankamıza hoş geldiniz");
            System.out.println("yapmak istediğiniz işlemi seçiniz?");
            System.out.println("1 hesabımdaki parayı görme");
            System.out.println("2 para ekleme");
            System.out.println("3 kart iade");

            int x= scan.nextInt();

            if(x==1){
                System.out.println("bankadaki hesabınızdaki para miktarı : "+para);
            }else if(x==2){

               while(true){
                    System.out.println("Para ekleme sayfasına hoş geldiniz");
                    System.out.println("1 EFT");
                    System.out.println("2 HAVALE");
                    System.out.println("3 Bir Önceki menüye dön");
                    System.out.println("4 Kart iade");
                    System.out.print("secim: ");
                    int secim=scan.nextInt();
                    if(secim==1){
                        System.out.println("eft yapıldı");
                    }else if(secim==2){
                        System.out.println("havale yapıldı");
                    }else if(secim==3){
                        break;  //continue firstLoop;
                    }else if(secim==4){
                        break firstLoop;
                    }else{
                        System.out.println("hatalı giriş");
                        continue firstLoop; //break;
                    }
                }

            }else if(x==3){
                break;
            }else {
                System.out.println("hatalı giriş");
            }



        }

*/
        System.out.println();
        int j=15;

        firsLoop: for( i=0; i<10; i++){
            System.out.println(i+" i");
            for (; true ; ) {
                System.out.println(j);
                j++;
                if(j==20){
                    continue firsLoop;
                }
                if(j==22){
                    break firsLoop;
                }
                System.out.println("merhaba");
            }



        }




    }
}
