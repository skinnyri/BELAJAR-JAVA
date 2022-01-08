public class TipeDataString {
    public static void main(String[] args) {
        //tipe data string adalah tipe data yang berisikan text
        //di java, tipe data String Di reperentasikan sebagai String
        // untuk membuat String kita menggunakan karakter petik dua(") sebelum dan sesudah teks
        //default value nya adalah null atau tak terhingga
        String kosong = null;
        System.out.println(kosong);

        String firstName = "minoritas";
        String lastName = "Profesionla";
        String FullName = firstName + " " + lastName;

        System.out.println(firstName + " " + lastName);
        //untuk menggabungakan String menggunakan tanda tambah (+)
        System.out.println(FullName);


    }
}
