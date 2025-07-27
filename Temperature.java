package BirinciHafta;
import java.util.Scanner;
// TODO Temp değişkenlerini kaldır koşulları if'in içine ekle.
//NOt: Değişken isimlendirirken açık olmaya dikkat et.

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;

        System.out.print("Sıcaklık değerini giriniz:");
        heat = input.nextDouble();

        if (heat <= 5) {
            System.out.print("Bugün kayak yapmak için güzel bir gün.");
        } else if (heat > 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat < 25) {
            System.out.print("Arkadaşlarınla piknik yapabilirsin.");
        } else {
            System.out.print("Yüzmeye gidebilirsin.Biraz serinle.");
        }
    }
}

