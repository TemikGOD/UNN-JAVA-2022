package org.example; import java.io.FileInputStream; import java.io.IOException; import java.io.ObjectInputStream; import java.util.ArrayList;

public class Read { public static void read(boolean flag) { ArrayList<Watch> list = new ArrayList<>(); { try { FileInputStream fis = new FileInputStream("Watch.bin"); ObjectInputStream ois = new ObjectInputStream(fis); int size = ois.readInt(); for (int i = 0; i < size; i++) { list.add((Watch) (ois.readObject())); }
        if (flag) { for (Watch item : list) { System.out.println("Read:"); System.out.println(item); System.out.println(); } } ois.close(); } catch ( IOException | ClassNotFoundException e) { e.printStackTrace(); } } } }
