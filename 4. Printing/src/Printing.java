public class Printing {
    public static void main(String[] args) {

        //ada tiga jenis printing yang ada di java
        //print()
        //akan menampilkan text apa adanya tanpa spasi
        System.out.print("hello world-1");
        System.out.print("hello world-2");
        //ini kalau di run hello world-1 dan hello world-2 tanpa enter

        //bisa gak bang pake print manual. jawabannya bisa dengan \n
        //\n artinya new line
        System.out.print("\nhello world-3");

        //println()
        //println artinya print dalam satu baris. singkatnya menggunakan enter
        System.out.println("hello world-4");

        //printf()
        //printf atau print format yang menggabungkan string lebih kompleks
        //%d untuk desimal atau angka
        //%f untuk bilangan pecahan atau floating point number
        //%s untuk string
        //%n artinya new line atau baris baru
        //dan masih banyak lagi. silahkan cari di google

        System.out.printf("Wiro %s %d","sableng",212);
    }
}
