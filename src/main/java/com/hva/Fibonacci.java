package com.hva;

//create a class fibonacci
public class Fibonacci {

    // create a method which data type long array and take integer
    public static long[] generate(int length) {
        long[] sequence = new long[length];// create a sequence (arraty) with given length
        // loop for fibonacci conditon
        for (int i = 0; i < sequence.length; i++) {
            if (i < 2) {
                sequence[i] = i;// if i<2 than it is return the same number
            } else {
                sequence[i] = sequence[i - 1] + sequence[i - 2];// using recursion find the sequence
            }

        }
        return sequence;// return the sequence(array)
    }

    // main
    public static void main(String[] args) {
        int length = 4;// give the length
        long[] sequence;// declear sequence array with long data type
        sequence = generate(length);// calling the function and the reurn array
        System.out.println("fibo :");
        for (int i = 0; i < sequence.length; i++) {
            System.out.println(sequence[i] + " ");// print the values
        }

    }

}
