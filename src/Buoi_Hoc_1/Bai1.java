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
public class Bai1 {

    public static void main(String[] args) {
        Scanner Cat = new Scanner(System.in);
        String name;
        double weight;
        int age;
        System.out.println("Mời nhập Name:");
        name = Cat.nextLine();
        System.out.println("Mời nhập Weight: ");
        weight = Cat.nextDouble();
        System.out.println("Mời nhập Age:");
        age = Cat.nextInt();

        System.out.printf("Name: %s", name);
        System.out.printf("Age: %.2f", weight);
        System.out.printf("Weight: %d", age);

    }
}
