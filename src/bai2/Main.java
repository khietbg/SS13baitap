package bai2;

import java.util.*;

public class Main {
   public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//
        for (int i = 0; i < 10; i++) {

            list.add(new Random().nextInt(10));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        System.out.println("nhap so can tim ");
        int key = scanner.nextInt();
        int left= 0;
        int right = list.size()-1;
        System.out.println(binarySearch(list, left, right,key));

    }

    public static int binarySearch(ArrayList<Integer> list,int left,int right,int key){
       int mid = (left+right)/2;
        if (right>=left){
           if (list.get(mid) == key) return mid;
            if (list.get(mid)>key) return binarySearch(list, left, mid-1 , key);
            return binarySearch(list,mid+1,right,key);
        }
        return -1;
    }
}
