package Lesson_3_DataTypes;

public class ExampleDataType_EscapeSeq {
    public static void main(String[] args) {

        int radius = 10;
        double PI = 3.14;

        double area = PI * radius * radius;
        double primeter = 2 * PI * radius;

        System.out.println("Yarışapı " + radius + "cm " +
                "olan çemberin çevresi " + primeter + "cm " +
                " çemberin alanı " + area + "cm² dır");

        System.out.println("--------------------------------");

        //        11- Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
//        İfadesini bir değişkene atayın ve yıl başka bir değişken ile
//        kontrol edilebilsin.

        int a = 1543;
        int b = 1455;
        int c = 1354;
        int d = 1453;
        System.out.println("Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.");
        System.out.println("Fatih Sultan Mehmet " + 1453 + " yılında İstanbul u fethetmiştir.");
        System.out.println("Fatih Sultan Mehmet " + d + " yılında İstanbul u fethetmiştir.");

        int correctAnswer = 1453;
        boolean result_sonuc = d == correctAnswer;
        System.out.println("d sıkkı " + d + " cevabı " + result_sonuc + " dur");

        System.out.println();

        System.out.println("Ali \"İngilizce çalışmalısın\" dedi.\n\n\"/-\\asan>>\n\n\'kırmızı mı\' \'mavi mi\' istersin?");


//      1 den 5 kadar olan sayıları tek satır kod ile konsolda alt alta yazdırın.
        System.out.println("1\n2\n3\n4\n5");

//   "hello world" yazdırın
        System.out.println("\"hello world\"");

//       21'' monitor    yazdırın
        System.out.println("21'' monitor");
        System.out.println("21\" monitor");

//       'eve geç kalma' dedi yazdırın
        System.out.println("'eve geç kalma' dedi");


    }
}
