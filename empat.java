import java.util.Scanner;

class Empat {
  public static void main(String[] args) {
    // Variable
    int fahrenheit;
    double celcius;
    Scanner scan = new Scanner(System.in);

    // Masukkan Fahrenheit
    System.out.print("Masukkan Fahrenheit: ");
    fahrenheit = scan.nextInt();

    // masukkan celcius berdasarkan fahrenheit
    celcius = 5.0/9.0 * (fahrenheit-32);

    // tampilkan Celcius
    System.out.print("Celcius: " + celcius);
    
    // tutup scanner
    scan.close();
  }
}
