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

public class SearchSqrtInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入一个整数
        int number = in.nextInt();
        in.close();
        int sqrtNumber = 1; //记录要和输入数比较的数

        for(int sqrt = 0; sqrtNumber < number; sqrt++){
            //循环乘2，直到大于输入的数为止
            sqrtNumber *= 2;
        }
        System.out.println(sqrtNumber);
    }
}
