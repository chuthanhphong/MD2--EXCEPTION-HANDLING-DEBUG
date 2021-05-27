package bt2;

import java.util.Random;
import java.util.Scanner;

public class Randomnumber {
    public Integer[] CreatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách các phần tử là ");
        for(int i =0; i<arr.length;i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ,");
        }
        return arr;
    }

    public static void main(String[] args) {
        Randomnumber randomnumber = new Randomnumber();
        Integer [ ] arr = randomnumber.CreatRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số");
        int x = sc.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
