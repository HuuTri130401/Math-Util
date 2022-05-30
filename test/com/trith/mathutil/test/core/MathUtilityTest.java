/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trith.mathutil.test.core;

import com.trith.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //Đây là class sẽ sử dụng các hàm của thư viện framework JUnit
    //để kiểm thử / kiểm tra code chính - hàm tính giai thừa () bên 
    //class core.MathUtil
    //viết code để test code chính bên kia !
    
    //có nhiều quy tắc đặt tên hàm kiểm thử , thường sẽ nói lên mục đích của các case , tình huống kiểm thử 
    //tình huống sài app theo kiểu thành công và thất bại !!
    
    //hàm dưới đây là tình huống hàm chạy thành công trả về ngon 
    //ta sẽ sài hàm kiểu well - đưa 5! 6! .. ko chơi -5 -6!
    
   //@Test JUnit sẽ phối hợp vs JVM để chạy hàm này 
   //Test phía hậu trường chính là puclic static void main()
   //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa  
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0; //Test thử tình huống tử tế đầu vào , m phải chạy đúng 
        long expected = 1; //hy vọng rằng 0! = 1
        //long actual = ;  //gọi hàm cần test bên core/app chính / core chính 
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
    //gộp thêm vài case thành công / đưa vào ngon / hàm phải ngon 
    Assert.assertEquals(2, MathUtil.getFactorial(2));
    Assert.assertEquals(6, MathUtil.getFactorial(3));
    Assert.assertEquals(24, MathUtil.getFactorial(4));
    Assert.assertEquals(24, MathUtil.getFactorial(5));
    }   //hàm giúp so sánh 2 giá trị nào đó giống nhau ko , nếu giống nhau thì ra xanh đèn đường , được thông , code ngon
                                            //ít nhất cho case đang test
        //nếu thảy màu đỏ đèn đường  (expected và actuual ko giống nhau ) / ko tương thích nhau 
    
        //hàm ý expected và actual ko giống nhau 
       
    
}
