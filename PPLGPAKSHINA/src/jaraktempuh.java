import javax.swing.JOptionPane;

public class jaraktempuh {
    public static void main(String[] args) {
        // inputan bobot
        double bobot = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan bobot : "));

        // inputan jarak
        int jarak = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jarak : "));

        // inputan kecepatan
        double kecepatan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Kecepatan : "));

        // menghitung waktu 
        double waktu = jarak / kecepatan;
        
        // menghitung konsumsi bensin
        double hargaBBM = 14500;    //harga bensin per liter 
        final double konsumsBBM = 1;     //setiap km memakai bensin 1 liter
        double totalBensin = jarak / konsumsBBM;
        double bensinBeban = totalBensin + (totalBensin * (3/100)); //pemakaian BBM dalam liter, dan setiap bobot bertambah maka 3% dari bobot akan menambah konsumsi BBM sebanyak 3%
        double totHargaBBM = bensinBeban * hargaBBM; //total harga bensin nya 


        // output
        JOptionPane.showMessageDialog(null, "Anda Membawa Muatan Seberat : " + bobot + ".KG" + "\nWaktu Tempuhnya :  " + waktu + " Jam" + "\nTotal Konsumsi BBM : " + bensinBeban + " Liter" + "\nTotal Biaya BBM Adalah : Rp. " + totHargaBBM);
}
}