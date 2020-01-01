/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day3作业第四题
 * 键盘录入x的值，计算出y的并输出。x和y的关系满足如下：
 *   x>=3	  y = 2x + 1;
 *   -1<x<3	  y = 2x;
 *   x<=-1	  y = 2x – 1;
 *
 */

package day03problem04;

import java.util.Scanner;

public class RelationCompute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入一个整数赋值x
        int x = in.nextInt();
        in.close();
        int y = 0;

        if(x >= 3){
            //根据x的值按条件赋值y
            y = 2*x+1;
        } else if(x <= -1){
            y = 2*x - 1;
        } else {
            y = 2*x;
        }
        System.out.println(y);
    }
}
