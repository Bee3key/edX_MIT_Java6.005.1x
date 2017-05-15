/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tzeentch
 */
public class NewJAvaClass {
    public static List func() {
        List<Integer> list = new ArrayList<>();
        int n = 3;
        while (n != 1) {
            list.add(n);
            if (n%2 == 0) {
                n = n/2;
            }else {
                n = 3 * n + 1;
            }
        }
        list.add(n);  
        //System.out.println("Some string " + list);
        return list;
    }
    public static void func2(List<Integer> list) {
        int max = 0;
        for (int x : list ) {
            max = Math.max(x, max);
        }
        System.out.println("List: " + list);
        System.out.println("Max: " + max);
    }
    public static void func3() {
        Map<String, Double> treasures = new HashMap<>();
        String x = "palm";
        treasures.put("beach", 25.);
        treasures.put("palm", 50.);
        treasures.put("cove", 75.);
        treasures.put("x", 100.);
        treasures.put("palm", treasures.get("palm") + treasures.size());
        treasures.remove("beach");
        double found = 0;
        for (double treasure : treasures.values()) {
            found += treasure;
        }
        System.out.println("A1: " + treasures.get(x));
        System.out.println("A2: " + treasures.get("x"));
        System.out.println("A3: " + found);
        
    }
    public static void func4() {
        Map<String, Integer> treasures = new HashMap<>();
        treasures.put("beach", 25);
        Integer result = treasures.putIfAbsent("beach", 75);
        System.out.println("A3: " + result);
    }
    public static void func5() {
        String s = "a";
        s = s + "b";
        System.out.println("String: " + s);
        StringBuilder ab = new StringBuilder("a");
        
        System.out.println("String Builder: " + ab.append("b"));
                
    }
}
