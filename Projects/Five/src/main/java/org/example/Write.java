package org.example;

import java.io.FileOutputStream; import java.io.IOException; import java.io.ObjectOutputStream; import java.util.ArrayList;

public class Write { public static void write(ArrayList<Watch> _list, boolean flag) { { try { FileOutputStream fos = new FileOutputStream("Watch.bin"); ObjectOutputStream oos = new ObjectOutputStream(fos); oos.writeInt(_list.size()); for (Watch item: _list) { oos.writeObject(item); }
        if (flag) { for (Watch item : _list) { System.out.println("Write:"); System.out.println(item); System.out.println(); } } oos.close(); } catch (IOException e) { e.printStackTrace(); } } } }
