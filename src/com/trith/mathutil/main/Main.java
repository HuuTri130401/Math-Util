/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trith.mathutil.main;

import com.trith.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
       
        //Thử nghiệm hàm tính giai thừa coi đúng như thiết kế hay không 
        //Ta phải đưa các tình huống sử dụng hàm trong thực tế 
        //ví dụ : -5 coi tính dc hok 
        //0 coi tính mấy 
        //20 coi tính mấy 
        //21 coi tính mấy
        //Test case : một tình huống hàm / app hay màn hình / tính năng đc đưa vào sử dụng 
        //Giả lập hành vi sài của ai đó !!!
        
        //Test case : là 1 tình huống sử dụng, sài app (hàm) mà nó bao hàm 
        //Data đầu vào cụ thể nào đó 
        //Output đầu ra ứng với xử lí của hàm / chức năng của app , dĩ nhiên dùng đầu vào 
        //để xử lí 
        //Kì vọng : Mong hàm sẽ trả về value nào đó ứng với input ở trên
        //So sánh để xem kq có như kì vọng hay ko
   
    long expected = 120; //kì vọng hàm ói về 120 nếu 5!
    int n = 5; //input
    long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected);
        System.out.println("5! = " + actual + " (Actual)");
    }   
            
}
