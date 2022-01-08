public class Finals {
    public static void main(String[] args) {
        //untuk membuat value nilainya tidak berubah lagi
        //kita bisa menggunakan final sebelum tipe data

        var angka = 10;
        angka = 20;
        System.out.println(angka);
        //ini untuk value tidak bisa di ubah
        final var value = 10;
        // value = 20; <= akan error
        System.out.println(value);
        //final atau konstan atau tetap

    }
}
