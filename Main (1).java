import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Membuat object ArrayList untuk menyimpan data String
        ArrayList<String> arraylist = new ArrayList<>();
        
        // Menambahkan beberapa elemen ke ArrayList
        arraylist.add("Halo");
        arraylist.add("Dunia");
        arraylist.add("!");
        
        //Menampilkan elemen ArrayList menggunakan loop for
        for(String str : arraylist){
            System.out.println(str);
        }
        
        // Membuat objek ArrayDeque untuk menyimpan data integer
        ArrayDeque<Integer> arraydeque = new ArrayDeque<>();
        
        //Menambahkan bebeberapa elemen ke ArrayDeque
        arraydeque.add(1);
        arraydeque.add(2);
        arraydeque.add(3);
        
        // Menampilkan elemen ArrayDeque menggunakan iterator
        for (int num : arraydeque){
            System.out.println(num);
        }
    }
  
    
}
