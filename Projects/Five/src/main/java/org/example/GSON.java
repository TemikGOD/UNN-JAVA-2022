package org.example; import com.google.gson.Gson; import com.google.gson.GsonBuilder; import java.util.ArrayList;

public class GSON { Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public String writeJson(ArrayList<Watch> list, boolean flag) { String item = GSON.toJson(list);
        if (flag) { System.out.println("Write:"); System.out.println(item); System.out.println(); } return item; }
    public void readJson(String item, boolean flag) { ArrayList<Watch> list = (ArrayList<Watch>) (GSON.fromJson(item, ArrayList.class));
        if (flag) { System.out.println("Read:"); System.out.println(list.toString()); } } }
