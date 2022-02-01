package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
   @Override
   public int compare(Flavor flavor1, Flavor flavor2) {
//    return o1.getName().compareTo(o2.getName());
       //Ingredients comparator tweak:
       return flavor2.getAllergens().size() - flavor1.getAllergens().size();
   }
}
