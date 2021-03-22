/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_Hoc_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner Cat = new Scanner(System.in); //tạo đối tượng scanner
        String name;
        double weight;
        int age;

        System.out.println("Mời nhập Weight: ");
//        weight = Double.parseDouble(Cat.nextLine());
//        Trước là một kiểu số double sau là một kiểu kí tự String
        weight = Cat.nextDouble();
        Cat.nextLine();
        System.out.println("Mời nhập Name:");
        name = Cat.nextLine();

        System.out.println("Mời nhập Age:");
        age = Integer.parseInt(Cat.nextLine());

        System.out.printf("While: %.2f", weight);
        System.out.printf("Name:%s", name);
        System.out.printf("Weight:%d", age);
    }

}
