public class KonversiTipeDataNumber {
    public static void main(String[] args) {

        //konversi tipe data number ada dua

        //widening Casting
        /*
        di lakukan secara (otomatis) oleh java karena batas maximum dan minimumnya masih
        mencakupi. selama konversinya mengikuti ini
        byte->short->int->long->float->double.
         */
        byte iniByte = 10; //tulisan (iniByte) merupakan variabel jadi ikuti saja dulu nanti di folder pembahan variable
        short iniShort = iniByte;
        int iniInt = iniShort;
        System.out.println("nilai byte = " + iniByte);
        System.out.println("nilai konversi byte -> short = " + iniShort);
        System.out.println("nilai konversi short -> int = " + iniInt + "\n");
        //tugas kalian membuat konversi selanjutnya sampai tipe data double

        //Narowing Casting
        /*
        ini dilakukan secara (manual) karena terkadang batas max dan min nya tidak mencakupi.
        konversi manual kebalikan dari konversi otomatis
        double->float->long->int->short->byte
        hati-hati dalam melakukan konversi karena bisa terjadi number overflow (angkanya muter sampai
        dapat angka yang kita masukan
         */

        //contoh number overflow
        short value = 200;
        byte value2 = (byte) value;
        System.out.println("konversi dari short value = 200 ke byte = " + value2);
        /*
        tujuan kita belajar batas maximum adalah untuk melihat kalau kita menggunakan angka
        tidak boleh lebih dari batas min dan max nya
         */

        //Narowing Casting (konversi Manual)
        double value6 = 100;
        float value5 = (float) value6;
        long value4 = (long) value5;
        System.out.println("nilai double = " + value6);
        System.out.println("nilai konversi double -> float = " + value5);
        System.out.println("nilai konversi float -> long = " + value4);
    }
}
