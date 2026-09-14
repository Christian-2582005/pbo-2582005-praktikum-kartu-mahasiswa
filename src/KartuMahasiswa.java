import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Percobaan pertama: NIK ditampung pakai int
        // int nik = scanner.nextInt();
        // Errornya: incompatible types: possible lossy conversion from long to int
        // Soalnya NIK 16 digit jauh melewati batas int (maks 2.147.483.647),
        // jadi harus pakai long, bukan int.

        System.out.print("NIK (16 digit) : ");
        long nik = scanner.nextLong();

        System.out.print("Umur : ");
        int umur = scanner.nextInt();

        System.out.print("Tinggi badan cm : ");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Golongan darah : ");
        char golonganDarah = scanner.next().charAt(0);

        System.out.print("Sudah menikah : ");
        boolean sudahMenikah = scanner.nextBoolean();

        // Jebakan di sini: nextBoolean() menyisakan newline di buffer,
        // kalau langsung nextLine() dipakai, nama akan kebaca kosong.
        // Makanya perlu satu nextLine() kosong dulu untuk membuang sisa itu.
        scanner.nextLine();

        System.out.print("Nama lengkap : ");
        String namaLengkap = scanner.nextLine();

        System.out.println();
        System.out.println("----- KARTU MAHASISWA -----");
        System.out.println("Nama : " + namaLengkap);
        System.out.println("NIK : " + nik);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggiBadan + " cm");
        System.out.println("Gol darah : " + golonganDarah);
        System.out.println("Menikah : " + sudahMenikah);

        scanner.close();
    }
}