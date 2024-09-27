import java.util.Scanner;

class Tiga {
  public static void main(String[] args) {
    // Variable
    int jariJari;
    double pi = 3.14;
    Scanner scan = new Scanner(System.in);

    // Masukkan jari-jari
    System.out.print("Masukkan jari-jari: ");
    jariJari = scan.nextInt();

    // tampilkan luas lingkaran (pi kali r kali r)
    System.out.print("Luas lingkaran: " + (pi * jariJari * jariJari));
    
    // tutup scanner
    scan.close();
  }
}
