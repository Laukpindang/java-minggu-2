import java.util.Scanner;

class Lima {
  public static void main(String[] args) {
    // Variable
    int angka1, angka2;
    Scanner scan = new Scanner(System.in);

    // Masukkan angka 1
    System.out.print("Masukkan bilangan pertama: ");
    angka1 = scan.nextInt();
    
    // Masukkan angka 2
    System.out.print("Masukkan bilangan kedua: ");
    angka2 = scan.nextInt();

    // tampilkan penjumlahan, pengurangan, perkalian, pembagian, dan sisa
    System.out.println("penjumlahan: " + (angka1 + angka2));
    System.out.println("pengurangan: " + (angka1 - angka2));
    System.out.println("perkalian: " + (angka1 * angka2));
    System.out.println("pembagian: " + (angka1 / angka2));
    System.out.println("sisa: " + (angka1 % angka2));

    // tutup scanner
    scan.close();
  }
}
