package Palindrome;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Palindrome {

    public static  Object[] findPalindrome(String[] arr){
        return Arrays.stream(arr)
                .filter(i -> new StringBuilder(i).reverse().toString().equals(i))
                .toArray();
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter list spaced by a single space : ");
        String str = io.nextLine();
        String[] arr = str.split(" ");
        Palindrome ob=new Palindrome();
        Object[] objects = ob.findPalindrome(arr);
        Consumer<Object> consumer = System.out::println;
        Arrays.stream(objects).forEach(consumer::accept);
    }
}
