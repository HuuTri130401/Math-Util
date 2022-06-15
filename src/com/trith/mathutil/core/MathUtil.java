/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trith.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //Trong class này cung cấp cho ai đó nhiều hàm xử lí toán học 
    //Clone class Math của JDK
    //Hàm thư viện sài chung cho ai đó, ko cần lưu lại trạng thái / giá trị 
    //chọn thiết kế là hàm static

    //hàm tính giai thừa !!!
    //n! = 1.2.3.4...n
    //không có giai thừa cho số âm 
    // 0! = 1! = 1 quy ước 
    //Giai thừa hàm đồ thị dốc đứng , tăng nhanh về giá trị 
    //20 giai thừa là 18 số 0 , vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long 
    //bài này quy ước tính n! trong khoảng từ 0 - 20
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
//        if(n == 0 || n == 1)
//            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
//        long product = 1; //tích nhân dồn , con heo đất
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        return product;
//    }
    // Học đệ quy trong 30s
    // Đệ quy là hiện tượng gọi lại chính mình với 1 quy mô khác 
    // Ví dụ : con búp bê Nga, giống nhau và lồng trong nhau 
    // búp bê to, búp bê nhỏ hơn, nhỏ nhỏ hơn, nhỏ hơn nữa...đến điểm dừng
    // Tính dùm tui 6!
    // n! = 1.2.3.4.5.6. ... .n
    // 6! = 6.5!
    // 5! = 5.4!
    // 4! = 4.3!
    // 3! = 3.2!
    // 2! = 2.1! //điểm dừng
    // 11 = 1;
    //quy ước: 1! = 0! = 1;
    // deal : n! = n * (n - 1)!
    
    public static long getFactorial(int n) {
        
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0...20. Plz!");
        }
        
        if (n == 0 || n == 1) {
            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
        }
        return n * getFactorial(n - 1);//công thức đệ quy
    }

}
