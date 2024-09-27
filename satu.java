class Satu {
  public static void main(String[] args) {
    // Masukkan semua variable
    String nama = "Laukpindang";
    String mtk = "96";
    int inggris = 90;

    // Ubah (parse) 
    int parsedMtk = Integer.parseInt(mtk);

    System.out.println("Nama: " + nama);
    System.out.println("Nilai MTK: " + mtk);
    System.out.println("Nilai inggris: " + inggris);
    System.out.println("Nilai: " + mtk + inggris);
    System.out.println("========================");
    System.out.println("Total: " + (inggris + parsedMtk));
  }
}