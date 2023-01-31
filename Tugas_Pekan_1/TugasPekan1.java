package Tugas_Pekan_1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class TugasPekan1 {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    File file = new File("Tugas_Pekan_1/result.txt");

    while (true) {
      System.out.print(
        "Pilihan menu: \n" +
        "\t1. Penjumlahan\n" +
        "\t2. Pengurangan\n" +
        "\t3. Perkalian\n" +
        "\t4. Pembagian\n" +
        "\t5. Sisa bagi\n" +
        "Masukan pilihan menu 1 - 5 (0 untuk keluar): "
      );
      int menu = input.nextInt();
      if (menu == 0) {
        break;
      }
      double hasil, operan, operan2 = 0;
      String operator = "";

      switch (menu) {
        case 1:
          System.out.print("Masukan angka ke 1 : ");
          operan = input.nextDouble();
          System.out.print("Masukan angka ke 2 : ");
          operan2 = input.nextDouble();
          hasil = operan + operan2;
          operator = "+";
          break;
        case 2:
          System.out.print("Masukan angka ke 1 : ");
          operan = input.nextDouble();
          System.out.print("Masukan angka ke 2 : ");
          operan2 = input.nextDouble();
          hasil = operan - operan2;
          operator = "-";
          break;
        case 3:
          System.out.print("Masukan angka ke 1 : ");
          operan = input.nextDouble();
          System.out.print("Masukan angka ke 2 : ");
          hasil = operan * operan2;
          operator = "*";
          break;
        case 4:
          System.out.print("Masukan angka ke 1 : ");
          operan = input.nextDouble();
          System.out.print("Masukan angka ke 2 : ");
          operan2 = input.nextDouble();
          hasil = operan / operan2;
          operator = "/";
          break;
        case 5:
          System.out.print("Masukan angka ke 1 : ");
          operan = input.nextDouble();
          System.out.print("Masukan angka ke 2 : ");
          hasil = operan % operan2;
          operator = "%";
          break;
        default:
          System.out.println(
            "\nerrormsg : Pilihan menu tidak valid \n" +
            "\t   Masukan pilihan menu 1 - 5\n"
          );
          continue;
      }
      String hasilFormat = (hasil % 1 == 0)
        ? String.format("%.0f", hasil)
        : String.format("%.2f", hasil);

      String operanFormat = (operan % 1 == 0)
        ? String.format("%.0f", operan)
        : String.format("%.2f", operan);

      String operan2Format = (operan2 % 1 == 0)
        ? String.format("%.0f", operan2)
        : String.format("%.2f", operan2);

      System.out.println(
        "Hasil dari " +
        operanFormat +
        " " +
        operator +
        " " +
        operan2Format +
        " = " +
        hasilFormat +
        "\n"
      );

      FileWriter writer = new FileWriter(file, true);
      writer.write(
        "Hasil dari " +
        operanFormat +
        " " +
        operator +
        " " +
        operan2Format +
        " = " +
        hasilFormat +
        "\n"
      );
      writer.close();
    }
    input.close();
  }
}
