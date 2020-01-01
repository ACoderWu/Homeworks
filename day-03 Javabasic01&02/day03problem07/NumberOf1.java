/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day3作业第六题
 * 对于一个整数(int类型)，输出该整数对应的二进制中，包含1的个数
 *
 */

package day03problem07;

import java.util.Scanner;

public class NumberOf1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int integer = in.nextInt();
        in.close();
        int count = 0;  //存储二进制位上为1的计数

        while( integer > 0){
            switch (integer%2){
                case 1: count++;    //当模为1时即有一位二进制位为1
                                    //不加break，利用case的穿透效果
                case 0: integer /= 2;   //自除2
                break;  //为了语法规范，不丢最后一个break
            }
        }
        System.out.println(count);
    }
}
