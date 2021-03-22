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
public class bai1 {

    public static void main(String[] args) {
//        int a, b;
//
//        Scanner bai1 = new Scanner(System.in);
//        System.out.println("Mời nhập a:");
//        a = bai1.nextInt(); //đọc vào 1 số nguyên
//        System.out.println("Mời nhập b:");
//        b = bai1.nextInt(); //đọc vào 1 số nguyên
//
//        System.out.println("Nghiệm x =" + (float) -b / a);
           
//		int a = 2;
//		int b = 3;
//		int tich = 1;
//		while( b > 0){
//			tich *= a;
//			b++;
//		}
//		System.out.print(tich);
                
//                Scanner sc = new Scanner(System.in);
//                System.err.println("Mời nhập chuỗi: ");
//		String s = sc.nextLine();
//                System.err.println("Mời nhập Kí tự: ");
//		char c = sc.nextLine().charAt(0);
//		int count = 0;
//		for(int i = 0; i < s.length();i ++){
//			if(s.charAt(i) == c){
//				count ++;
//			}
//		}
//		System.out.print(count);



//                Scanner sc = new Scanner(System.in);
//                System.err.println("mời nhập chuỗi :");
//		String s = sc.nextLine();
//                System.err.println("Mời nhập kí tự: ");
//		char c = sc.nextLine().charAt(0);
//		int count = 0;
//		for(int i = 0; i < s.length();i ++){
//			if(s.charAt(i) == c){
//				count ++;
//			}
//		}
//		System.out.print(count);


                Scanner sc = new Scanner(System.in);
                System.out.println("Moi nhap chuỗi:" );
		String s = sc.nextLine();
                System.out.println("Moi nhap kí tự:" );
		char c = sc.next().charAt(0);
		int kq = -1;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == c) {
				kq = i;
                                break;
			}
		}
                System.err.println(+kq);
    }

}
