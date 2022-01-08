public class Literlas {
    public static void main(String[] args) {

        /*
        tipe data number di java secara default merupakan decimal literlas
        atau bilangan baris 10. java mendukung beberapa literals
            ==> Decimal:
            baris 10, yang artinya digitnya adalah 0 sampai 9. Secara default
            number di java adalah decimal (baris 10)
         */
        int decimal = 10;
        System.out.println("nilai decimal = " + decimal);

        /*
        ==> hexadecimal:
        Baris 16, dimana digitnya adalah 0 sampai 9 dan A sampai F. untuk membuat
        hexadecimal, kita wajib menambahkan 0x(nol+x) di awal angka
         */
        int hexadecimal = 0xFFFFFF;
        System.out.println("nilai hexadecimal = " + hexadecimal);

        /*
        ==> Binary:
        Baris 2, dimana angka digitnya adalah 0 dan 1. untuk membuat binary,
        kita wajib menambahkan 0b (nol + b) di awawl angka
         */

        int binaryDecimal = 0b010101; //ini kalau di tambahkan angka selain nol dan satu akan error
        System.out.println("nilai binaryDecimal = " + binaryDecimal);
    }
}
