import java.util.Scanner;

class Dua {
  public static void main(String[] args) {
    // Variable
    int angka1, angka2, sementara;
    Scanner scan = new Scanner(System.in);

    // Masukkan angka 1
    System.out.print("Masukkan bilangan pertama: ");
    angka1 = scan.nextInt();
    
    // Masukkan angka 2
    System.out.print("Masukkan bilangan kedua: ");
    angka2 = scan.nextInt();

    // tampilkan angka 1 dan 2
    System.out.println("Angka 1: " + angka1);
    System.out.println("Angka 2: " + angka2);
    
    // pindahkan angka 1 ke sementara
    sementara = angka1;
    // pindahkan angka 2 ke angka 1
    angka1 = angka2;
    // pindahkan sementara ke angka 2
    angka2 = sementara;
    
    // tampilkan angka 1 dan 2 yg sudah diubah
    System.out.println("Angka 1: " + angka1);
    System.out.println("Angka 2: " + angka2);

    // tutup scanner
    scan.close();
  }
}
