package JAVA101;
import java.util.Scanner;
public class onbirinci_ornek {
    public static void main(String[] args) {
        int sicaklik ;

        Scanner input = new Scanner(System.in);

        System.out.println("sıcaklık değerini giriniz: ");
        sicaklik = input.nextInt();

        String sonuc = sicaklik < 5 ? "kayağa git" :
                ( (sicaklik >=5 && sicaklik <= 15) ? "sinemaya git" :
                        (( sicaklik >=10 && sicaklik <=25 ) ? "pikniğe git" :
                                ((sicaklik > 25 ) ? " yüzmeye git " : "program sonlandı")));
        System.out.println(sonuc);
    }
}
