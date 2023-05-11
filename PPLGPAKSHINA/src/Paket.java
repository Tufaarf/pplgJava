import java.util.Scanner; 

public class platnomor {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Masukan Jumlah : ");
        int jumlahPaket = input.nextInt();

        int JumlahKendaraan = jumlahPaket / 15; //1 mobil dapat membawa 15 paket

        if (jumlahPaket % 15 != 0) {
            JumlahKendaraan++;
            System.out.println("Jumlah Kendaraan Yang Diperlukan : " + JumlahKendaraan);

        } else {
            System.out.println("Paket Tidak Boleh Kosong");
        }

        input.close();
    }
}
