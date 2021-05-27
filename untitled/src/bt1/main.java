package bt1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sô a");
        double a = sc.nextDouble();
        System.out.println("Nhập sô b");
        double b = sc.nextDouble();
        if(a!=0){
            System.out.println(b/a);
        }else if(b==0){
            System.out.println("tất cả các nghiệm");
        }else System.out.println("vô nghiệm");

    }
}
