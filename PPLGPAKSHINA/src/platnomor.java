import java.util.Scanner; 

public class platnomor {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Masukan Bobot : ");
        int bobotBawaan = input.nextInt();

        int JumlahKendaraan = bobotBawaan / 3; //1 mobil dapat membawa 3kg

        if (bobotBawaan % 3 != 0) {
            JumlahKendaraan++;
        }

        System.out.println("Jumlah Kendaraan Yang Diperlukan : " + JumlahKendaraan);

        input.close();
    }
}
