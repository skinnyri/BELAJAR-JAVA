public class TipeDataNumber02 {
    public static void main(String[] args) {

        //floating point number

        /*
        floating point number merupakan tipe data pecahan dan desimal. Yang terdiri dari
        float dan double.
        */
        float iniFloat = 10;
        float iniFloat2 = 10.5F; //kalau pake koma wajib menambahkan F untuk menunjukan ini float
        double iniDouble = 10.5;
        /* jika anda menemukan pecahan seperti 22/7 sebaiknya menggunakan tipe data ini
        karena hasilnya lebih akurat. Kenapa gak pake integer number bang?
        karena jika satu bilangan yang hasilnya koma maka tidak akan di cetak kalau
        kita menggunakan integer number.
        perhatikan contoh ini dan lihat outputnya (run)
         */

        int iniInteger = 22/7;
        System.out.println("hasil dari tipe data int = " + iniInteger);

        float IniFloat = 22/7F;
        System.out.println("\nhasil dari tipe data float = " + IniFloat);

        /*
        sama halnya dengan tipe data integer number, floating juga punya max dan min angka
        yang dapat di akses. dan cara pengecekan pun sama
         */
        System.out.println("--------------float----------------");
        float[] defaultFloat = new float[5];
        System.out.println("default float: " + defaultFloat[0]);
        System.out.println("batas min float: " + Float.MIN_VALUE);
        System.out.println("batas max float: " + Float.MAX_VALUE);
        System.out.println("batas bytes float: " + Float.BYTES + " BYTES");
        System.out.println("batas bit float: " + Float.SIZE + " BIT\n");
        //tugas buatlah tipe data double sama halnya sintax di atas

    }
}
