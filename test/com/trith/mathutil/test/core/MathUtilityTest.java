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
    public void testGetFactorialGivenRightArgumentReturnWell() {
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
        Assert.assertEquals(6, MathUtil.getFactorial(120));
//    Assert.assertEquals(24, MathUtil.getFactorial(5));
    }   //hàm giúp so sánh 2 giá trị nào đó giống nhau ko , nếu giống nhau thì ra xanh đèn đường , được thông , code ngon
    //ít nhất cho case đang test
    //nếu thảy màu đỏ đèn đường  (expected và actuual ko giống nhau ) / ko tương thích nhau 

    //hàm ý expected và actual ko giống nhau 
    //Tình huống hàm getF() ta thiết kế 2 tình huống xử lí 
    //1. Đưa data tử tế từ 0-20 , ta tính đúng đc n! - done
    //2. Đưa data vào cà chớn , âm , >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //Rất mong ngoại lệ xuất hiện vs n cà chớn này 
    //Nếu hàm nhận vào n < 0 hoặn n > 20 và hàm ném ra ngoại lệ 
    //=> hàm chạy đúng như thiết kế - Xanh phải xuất hiện 
    //Nếu hàm nhận vào n > 0 và n < 20 và ko ném ra ngoại lệ thì hàm sai thiết kế 
    //sai kì vọng - XUẤT HIỆN ĐỎ    
    //Test case: 
    //input -5
    //expected : IllegalArgument Exception xuất hiện
    //NGOẠI LỆ PHẢI XUẤT HIỆN 
    //Tình huống bất thường ,  ngoại lệ , ngoài thuộc tính , dự liệu 
    //là những thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường = cách chúng có xuất hiện hay 0
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      euqals() là bằng nhau hay ko trên value !!!
    //MÀU ĐỎ DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT NHƯNG KHÔNG PHẢI CÁI NGOẠI LỆ TA KÌ VỌNG
    //KÌ VỌNG SAI, KHÔNG PHẢI NÉM SAI 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentReturnThrowsException(){
//        MathUtil.getFactorial(-5); //hàm @Test chạy , hay hàm getF() chạy 
//                                //sẽ phải ném về ngoại lệ NumberFormat...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentReturnThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy , hay hàm getF() chạy 
        //sẽ phải ném về ngoại lệ NumberFormat...
    }

    //cách khác để bắt ngoại lệ xuất hiện , viết tự nhiên hơn 
    //xài lambda
    //Testcase hàm sẽ ném  về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi vs 21!
    @Test
    public void testGetFactorialGivenWrongArgumentReturnThrowsException_LambdaVersion() {

//        Assert.assertThrows(IllegalAccessException.class,//lập trình hàm là đưa vào hàm vào trong 1 hàm khác 
//                () -> MathUtil.getFactorial(-5));
//       MathUtil.getFactorial(-5); //hàm @Test chạy , hay hàm getF() chạy 
    }

    //Bắt ngoại lệ xem hàm có ném về ngoại lệ hay ko khi n cà chớn 
    //có ném tức là đúng thiết kế -> xanh 
    @Test
    public void testGetFactorialGivenWrongArgumentReturnThrowsException_TryCatch() {
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5); //hàm @Test chạy , hay hàm getF() chạy 
        } catch (Exception e) {
            //bắt try catch là JUnit chuyển xanh do đã chủ dộng kiểm soát ngoại lệ 
            //nhưng ko chắc ngoại lệ mình cần xuất hiện hay ko ?
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage());
        
        }

    }

}
