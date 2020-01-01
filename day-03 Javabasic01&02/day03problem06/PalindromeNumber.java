/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day3作业第六题
 * 请在控制台输出满足如下条件的五位数（回文数）
 *	  个位等于万位
 *	  十位等于千位
 *	  个位+十位+千位+万位=百位
 *
 */

package day03problem06;

public class PalindromeNumber {
    public static void main(String[] args) {
        for(int number = 10000; number < 100000; number++){
            int unit = number%10;   //个位
            int decade = number%100/10; //十位
            int hundred = number%1000/100;  //百位
            int kilobit = number%10000/1000;    //千位
            int myriabit = number/10000;    //万位

            if(unit == myriabit && decade == kilobit && (unit+decade+kilobit+myriabit) == hundred){
                //判断是否回文数
                System.out.println(number);
            }
        }
    }
}
