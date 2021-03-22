package Buoi_Hoc_2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try {
//            double diem;
//            String name;
//            System.out.println("Mời nhập tên");
//            name = sc.nextLine();
//            System.out.println("Mời nhập điểm");
//            diem = Double.parseDouble(sc.nextLine());
//
//            System.out.printf("Tên: %s", name);
//            System.out.printf("Tên: %f", diem);
//        }catch(NumberFormatException ex){
//            System.out.println("Lỗi");
//        }
            
//            String a = "3";
//            String b = "4";
//            
//            int a1 = Integer.parseInt(a);
//            int b1 = Integer.parseInt(b);            
//            System.out.println("c="+(a1+b1));

            float diem;
            System.out.println("Mời nhập điểm");
            diem = sc.nextFloat();
            String xeploai = diem > 5 ? "Đạt" : "Trượt";
            System.out.println("Xếp loại:"+xeploai);
            
            if(diem < 5){
                System.out.println("Trượt");
            }else if(diem < 7){
                System.out.println("TB");
            }else if(diem <8){
                System.out.println("Khá");
            }else{
                System.out.println("Gioi");
            }
           
    }
}
