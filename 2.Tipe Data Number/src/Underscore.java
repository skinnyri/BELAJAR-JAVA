public class Underscore {
    public static void main(String[] args) {
        /*
        di java kita bisa menambahkan garis bawah pada angka.
        tidak ada arti khusus dengan garis bawah di angka,
        digunakan haya agar mempermudah kita membaca angka
         */

        byte iniByte = 100;
        short iniShort = 1_000;
        int iniInteger = 10_000_000;
        long iniLong = 1_000_000_000;
        long iniLong2 = 1_000_000_000L;

        float iniFloat = 10_00.45F;
        double iniDouble = 10_00.45;

        System.out.println("nilai dari byte " + iniByte);
        System.out.println("nilai dari short " + iniShort);
        System.out.println("nilai dari integer " + iniInteger);
        System.out.println("nilai dari long " + iniLong);
        System.out.println("nilai dari long ke-dua " + iniLong2);
        System.out.println("nilai dari float " + iniFloat);
        System.out.println("nilai dari double " + iniDouble);
    }
}
