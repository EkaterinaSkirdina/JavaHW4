package SeminarsHW.HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        scanner.close();
        System.out.println(list);

        List<Integer> reverseList = new LinkedList<>();
        while (!list.isEmpty()) {
            reverseList.add(((LinkedList<Integer>) list).pollLast());
        }
        System.out.println(reverseList);
    }
}
