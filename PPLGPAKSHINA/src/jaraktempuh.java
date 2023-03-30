import java.util.Scanner;

public class jaraktempuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inputan beban
        System.out.println("Masukan Bobot Muatan : ");
        double bobot = input.nextDouble();

        // inputan jarak
        System.out.println("Tentukan Jarak (dalam KM) : ");
        int jarak = input.nextInt();

        // inputan kecepatan
        System.out.println("Masukan Kecepatan (dalam dalam km/h): ");
        double kecepatan = input.nextDouble();

        // menghitung waktu 
        double waktu = jarak / kecepatan;
        
        // menghitung konsumsi bensin
        double hargaBBM = 14500;    //harga bensin per liter 
        double konsumsBBM = 1;     //setiap km memakai bensin 1 liter
        double totalBensin = konsumsBBM * jarak; //total pemakaian bensin nya dalam liter
        double totHargaBBM = totalBensin * hargaBBM; //total harga bensin nya 

        // output
        System.out.println("Anda Membawa Muatan Seberat : " + bobot + ".KG");
        System.out.println("Waktu Tempuhnya : " + waktu + " Jam");
        System.out.println("Total Konsumsi BBm (Dalam Liter): " + totalBensin + " liter");
        System.out.println("Total Biaya BBM adalah : Rp." + totHargaBBM);

        input.close();
    }
}
