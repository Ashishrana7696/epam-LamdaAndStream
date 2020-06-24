package StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class stringList {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter size of list : ");
        int n = io.nextInt();

        for (int i = 0; i < n; i++) {
            String s = io.next();
            list.add(s);
        }


        List<String> getMyList= list.stream()
                .filter(value -> value.charAt(0) == 'a' && value.length() == 3)
                .collect(Collectors.toList());


        System.out.println(getMyList);


    }
}

