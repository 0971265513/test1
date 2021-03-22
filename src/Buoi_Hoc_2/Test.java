/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_Hoc_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Mời cạnh %d: ", i + 1);
            a[i] = sc.nextInt();
        }
        String kq;
        kq = (Math.pow(a[0], 2) == (Math.pow(a[1], 2) + Math.pow(a[2], 2))? "Là Tam giác vuông" : "-1";
        System.err.println(kq);
        kq = (a[1] > a[0] && a[1] > a[2])? "Là Tam giác vuông" : "-1";
        System.err.println(kq);
        kq = (a[2] > a[1] && a[2] > a[0])? "Là Tam giác vuông" : "-1";
        System.err.println(kq);
        kq = (a[2] == a[1] && a[2] == a[0])? "Là Tam giác vuông" : "-1";
        System.err.println(kq);
        kq = ( a[1] <= 0 || a[2] <= 0 || a[0] <= 0)? "Là Tam giác vuông" : "-1";
        System.err.println(kq);
  
//            if (a[0] > a[1] && a[0] > a[2]) {
//                if (Math.pow(a[0], 2) == (Math.pow(a[1], 2) + Math.pow(a[2], 2))) {
//                    System.out.println("Là Tam giác vuông");
//                } else {
//                    System.out.println("-1");
//                }
//            } else if (a[1] > a[0] && a[1] > a[2]) {
//                if (Math.pow(a[1], 2) == (Math.pow(a[2], 2) + Math.pow(a[0], 2))) {
//                    System.out.println("Là Tam giác vuông");
//                } else {
//                    System.out.println("-1");
//                }
//            }else if(a[2] > a[1] && a[2] > a[0]) {
//                if (Math.pow(a[2], 2) == (Math.pow(a[1], 2) + Math.pow(a[0], 2))) {
//                    System.out.println("Là Tam giác vuông");
//                } else {
//                    System.out.println("-1");
//                }
//            }else if(a[2] == a[1] && a[2] == a[0]){
//                    System.out.println("-1");
//            }else if( a[1] <= 0 || a[2] <= 0 || a[0] <= 0){
//                    System.out.println("-1");
//            }

    }
}
