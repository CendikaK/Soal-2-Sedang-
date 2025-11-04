import java.util.Scanner;

public class Soal_2_Sedang {

    public static double hv(double jari, double tinggi){
        double volume = Math.PI * (jari * jari) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari -jari: ");
        double jari = input.nextDouble();
        System.out.println("Masukkan Tinggi: ");
        double tinggi = input.nextDouble();

        double volume = hv(jari,tinggi);
        System.out.println("Total volume dari tabung adalah: " + volume);
        

    }
}



