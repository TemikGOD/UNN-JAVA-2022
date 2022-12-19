package org.example; import java.util.ArrayList; import java.util.Collections;

public class Store { ArrayList<Watch> list = new ArrayList<>(); public Store() { Collections.addAll(list, new Watch("Casio", 220, 13, 30), new Seconds("Philipp Plein", 75000, 10, 36, 40)); } }
