/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATAMINING_UTS;
import java.util.*;
/**
 *
 * @author Riki Reza Ryansyah
 */
public class FPGROWTH_RIKI {
     static int minSupport = 2;

    public static void main(String[] args) {

        // Contoh dataset transaksi
        List<List<String>> transactions = Arrays.asList(
            Arrays.asList("Bread", "Milk"),
            Arrays.asList("Bread", "Diaper", "Beer", "Eggs"),
            Arrays.asList("Milk", "Diaper", "Beer", "Cola"),
            Arrays.asList("Bread", "Milk", "Diaper", "Beer"),
            Arrays.asList("Bread", "Milk", "Diaper", "Cola")
        );

        // Step 1: Hitung frekuensi item
        Map<String, Integer> itemFrequency = new HashMap<>();
        for (List<String> transaction : transactions) {
            for (String item : transaction) {
                itemFrequency.put(item, itemFrequency.getOrDefault(item, 0) + 1);
            }
        }

        // Step 2: Buang item di bawah minimum support
        Map<String, Integer> frequentItems = new HashMap<>();
        for (String item : itemFrequency.keySet()) {
            if (itemFrequency.get(item) >= minSupport) {
                frequentItems.put(item, itemFrequency.get(item));
            }
        }

        // Step 3: Sort item dalam transaksi berdasarkan frekuensi
        List<List<String>> filteredTransactions = new ArrayList<>();
        for (List<String> transaction : transactions) {
            List<String> filtered = new ArrayList<>();
            for (String item : transaction) {
                if (frequentItems.containsKey(item)) {
                    filtered.add(item);
                }
            }

            // Sorting descending berdasarkan frekuensi
            filtered.sort((a, b) -> frequentItems.get(b) - frequentItems.get(a));
            if (!filtered.isEmpty()) {
                filteredTransactions.add(filtered);
            }
        }

        System.out.println("Frequent Items (min support = " + minSupport + "):");
        for (String item : frequentItems.keySet()) {
            System.out.println(item + " = " + frequentItems.get(item));
        }

        System.out.println("\nFiltered & Sorted Transactions:");
        for (List<String> trans : filteredTransactions) {
            System.out.println(trans);
        }


    }
    
}
