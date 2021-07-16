import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, tarih, ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        ort = mat + fizik + kimya + tarih + turkce + muzik;
        System.out.println(ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
