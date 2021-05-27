package bt4;

import java.util.Scanner;

public class Triagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập  x ");
        int x= sc.nextInt();
        System.out.println("nhập  y ");
        int y = sc.nextInt();
        System.out.println("nhập  z ");
        int z = sc.nextInt();
        Triagle.testTriangle(x,y,z);
    }
    static void testTriangle(int x, int y, int z) {
            try {
                if(x<0 || y<0 || z<0 || x+y<=z || y+z <=x || x+z<=y) throw new IIIengalTrianggleException();
                else System.out.println("là tam giác");

            }catch (IIIengalTrianggleException e){
                System.out.println(e.toString());

            }
}}
