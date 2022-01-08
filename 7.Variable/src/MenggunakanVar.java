public class MenggunakanVar {
    public static void main(String[] args) {
        //sejak java 10 kita bisa membuat variable dengan kata kunci var
        //ini mempermudah kita untuk tidak salah menggunakan tipe data
        // namun kita tidak boleh deklarasi
        // var nama; <== ini bakal error
        /*
         walaupun
         var name;
         name = "minoritas profesional"; <== ini juga akan error
         kita harus langsung inisialisasi
         */
        var name = "minoritas profesional";
        //kenpa tidak boleh deklarasi karena biar java membaca secara langsung jenis tipe data yg digunakan
        System.out.println(name);

    }
}
