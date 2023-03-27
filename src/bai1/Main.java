package bai1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
                list.clear();
        }
        for (Character ch:max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}