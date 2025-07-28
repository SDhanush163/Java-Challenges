package com.DataStructures;

/*--------------------------------------------------------------------------------------------------
Reverse an Array: Mastering In-Place Swaps for Efficient Reordering
Write a method called reverse() with an int array as a parameter. The method should not return any
value. In other words, the method is allowed to modify the array parameter. To reverse the array,
you have to swap the elements, so that the first element is swapped with the last element and so on.
For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].

The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

TIP: When swapping the elements, use a variable to temporarily hold the current element.
NOTE: The method should be defined as private static.
NOTE: Do not add a main method to the solution code.
NOTE: Classes that are not in the java.lang package should be manually imported.
--------------------------------------------------------------------------------------------------*/

import java.util.Arrays;

public class C44_ReverseArray {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6};
        reverse(elements);
    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int i = 0, j = arr.length - 1, len = arr.length, temp;
        for (; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j - i];
            arr[j - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
