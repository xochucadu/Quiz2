package oop.q2;

import java.util.List;
import java.util.ArrayList;

/**
 * Quiz #2 - Task 1
 *
 * This program demonstrates working with Java Lists within the package oop.q2.
 * It initializes two predefined lists:
 * - list1: A list of integers representing indices.
 * - list2: A list of strings containing various string elements.
 *
 * The program processes these two lists to create a third list, list3,
 * by accessing elements from list2 based on a formula using values from list1.
 * Specifically, for each element 'x' in list1, it computes the index
 * as (2 * x - 1) to get an element from list2, which is then added to list3.
 *
 * The program prints list3 as the output.
 *
 * This program is designed to work with any values in list1 and list2,
 * provided the calculated indices are within the bounds of list2.
 *
 * Package: oop.q2
 *
 * Author: Bezhanovi Nikita
 * Date: 2025-05-15
 */


public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(6, 6, 5, 9, 3, 5, 6, 8, 9, 5, 4, 4, 2);

        List<String> list2 = List.of("ErJ", "zqD", "hvs", "xxu", "33A", "17vK", "nFA2p", "T68L", "I10", "oXQy", "XDbq", "iiv", "DiR", "9ne7", "xFWE", "UADy", "7HUZm", "X5IF");

        List<String> list3 = new ArrayList<>();


        for (int i = 0; i < list1.size(); i++) {
            int index = list1.get(i);
            list3.add(list2.get(2 * index - 1));
        }
        System.out.println(list3);
}
}