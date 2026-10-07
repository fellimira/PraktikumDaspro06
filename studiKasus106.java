import java.util.Scanner;
public class studiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
            System.out.print("Total harga: Rp " + totalHarga);
            System.out.print("\nDiskon: Rp " + diskon);
            System.out.print("\nTotal bayar: Rp " + totalBayar);
            if (uangBayar >= totalBayar) {
                kembalian = uangBayar - totalBayar;
                System.out.print("\nKembalian: Rp " + kembalian);
            } else {
                kurang = totalBayar - uangBayar;
                System.out.print("\nUang anda kurang: Rp " + kurang);
            }
        }
        sc.close();
    }
}