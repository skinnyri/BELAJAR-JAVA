public class TipeDataNumber {
    public static void main(String[] args) {

        //tipe data number ada dua jenis yaitu fundamental dan non-fundamental

        //kita bahas tipe data fundamental yang terdiri dari:

        //1. integer number
        /*
        tipe data integer number merupakan bilangan bulat.
        masih gak ngerti apa itu bilangan bulat?
        bilangan bulat adalah bilangan yang tanpa koma.
        tapi kalau koma di java kita menggunakan titik.
        tipe data fundamental integer number terdiri dari
        tipe data byte, short, int, long (bedanya dari kapasitas)
        untuk cek max, min, size, bit, dan default ikuti kode program di bawah ini
        nanti saya jelaskan di catatan paling bawah kenapa batas max dan min
        dan batas memorinya begitu
        */

        byte value = 10;
        short value1 = 100;
        int value2 = 1000;
        long value3 = 10000;
        long value4 = 10000L;
        // bisa di tambahkan L untuk menggambarkan ini long

        System.out.println("--------------byte----------------");
        byte [] iniByte = new byte[5];
        System.out.println("default byte: " + iniByte[0]);
        System.out.println("batas min byte: " + Byte.MIN_VALUE);
        System.out.println("batas max byte: " + Byte.MAX_VALUE);
        System.out.println("batas bytes byte: " + Byte.BYTES + " BYTES");
        System.out.println("batas bit byte: " + Byte.SIZE + " BIT\n");
         /*
         tugas kalian adalah buat short, int, long.
         catatan jika (Byte.MIN_VALUE) bahwa setiap awalan tipe data harus
         nenggunakan huruf kapital seperti pada contoh byte
         */

        System.out.println("penjelsanan");
        /*
        ==> byte dan bit merupakan kapasitas memory yang di butuhkan untuk
        menyimpan tipe data.

        ==> 1 Bytes (bita) = 8 bit
        di bahasa pemerograman assambly ada 2 bilangan [0 dan 1] maka 1*2^8.
        pada batas max; karena di ambil satu untuk negatifnya maka menjadi
        (2^7 - 1) = 127.
        sedangkan untuk batas min karena sda di ambil satu dari max maka hanya
        (-2^7) = 128.

        ==> default merupakan stelan standar. nah maksudnya ini apa?
        jika kalian tidak memasukan nilai dari variabel pada tipe data primitif maka
        dia akan terbaca nilainya = 0
        */

        //2. floating point number (bilangan Pecahan atau desimal)
        //kita bahas di src TipeDataNumber02


    }
}
