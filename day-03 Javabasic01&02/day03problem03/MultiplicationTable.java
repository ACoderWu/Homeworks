/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day3作业第三题
 * 输出九九乘法表。
 *
 */

package day03problem03;

public class MultiplicationTable {
    public static void main(String[] args){
        for(int number1 = 1; number1 < 10; number1++){
            //定义每式第二个乘数
            for(int number2 = 1; number2 <= number1; number2++){
                //定义每式第一个乘数
                int number = number1 * number2; //定义积
                System.out.print(number2 + "*" + number1 + "=" + number);
                if(number1 != number2){
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
