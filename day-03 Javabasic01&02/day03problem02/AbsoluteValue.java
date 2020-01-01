/*
* @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
* @version 1.0
*
* 王道day3作业第二题
* 用位运算符求一个整数的绝对值。
*
*/

package day03problem02;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入一个整数
        int intNumber = in.nextInt();
        in.close();
        int AbsoluteValue;

        //求该整数的绝对值
        if(intNumber < 0) {
            AbsoluteValue = ~intNumber + 1;//包括符号位按位取反加一
        } else {
            AbsoluteValue = intNumber;
        }
        System.out.println(AbsoluteValue);
    }
}
