/**
 *  Java program to create, update, and delete HashMap.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of HashMap.
        Map<Double, String> myMap = new HashMap<>();

        // Add elements.
        myMap.put(6.8, "a");
        myMap.put(7.8, "b");
        myMap.put(1.8, "c");
        myMap.put(6.7, "d");
        myMap.put(5.2, "f");

        // Display.
        System.out.println(myMap); // Output: {1.8=c, 6.7=d, 6.8=a, 5.2=f, 7.8=b}

        // Remove.
        myMap.remove(6.7);

        // Display each element at new line..
        for (Map.Entry<Double, String> elements : myMap.entrySet()) {
            System.out.println(elements);
        }

        // Remove all.
        myMap.clear();

    }
}