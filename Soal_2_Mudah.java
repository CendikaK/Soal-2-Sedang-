import java.util.Scanner;

public class Soal_2_Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angkamu: ");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angkamu adalah: " + angka + " yaitu angka genap");
        } else {
            System.out.println("Angkamu adalah: " + angka + " yaitu angka ganjil");
        }
    }
}
