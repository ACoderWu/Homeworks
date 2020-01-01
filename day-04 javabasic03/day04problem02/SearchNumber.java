/**
 * @Description SearchNumber
 * @Project HomeWorks
 * @Author 王道19th吴开桥
 * @E-mail wkq0@qq.com
 * @LoginUser wkq00
 * @Date 2019/12/31 星期二
 * @Version 1.0
 * @IDE IntelliJ IDEA
 */

package day04problem02;

import java.util.Scanner;

/**
 * @Content 王道day04作业第二题
 * 有一组整数，每个都出现了两次，只有一个出现了一次，
 * 求这个数字(想想是否能不借助计数变量)
 */
public class SearchNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intNumbers[] = getIntegerArray();   //输入整数字符串面值数组，以空格隔开

        for (int subscript1 = 0; subscript1 < intNumbers.length; subscript1++) {
            for (int subscript2 = subscript1+1; subscript2 < intNumbers.length; subscript2++) {
                //只与当前元素的后续元素比较，因为前面的在本身的过程中已经比较过了
                if (intNumbers[subscript1] == intNumbers[subscript2]) {
                    //如果两数相等则都归零
                    intNumbers[subscript1] = 0;
                    intNumbers[subscript2] = 0;
                }
            }
        }

        //遍历输出输出单身数
        output(intNumbers);
    }

    public static void output(int[] intNumbers) {
        for (int subscript = 0; subscript < intNumbers.length; subscript++) {
            //遍历数组
            if (intNumbers[subscript] != 0) {
                //如果有某个元素不等于0，则该数是单身数，输出之，然后退出循环
                System.out.println(intNumbers[subscript]);
                break;
            }
            if (subscript == intNumbers.length - 1) {
                //如果遍历到最后元素全是0，则该数就是0，输出之
                System.out.println(0);
            }
        }
    }

    private static int[] getIntegerArray() {
        // 读取数组，以空格隔开，按回车结束
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); //用nextLine（）可以读取一整行，包括了空格
        String arr[] = str.split(" ");    //按空格拆分字符串成字符串数组
        // split方法可以将字符串按间隔符分拆为字符串数组
        int nums[] = new int[arr.length];
        for (int subscript = 0; subscript < nums.length; subscript++) {
            //将整数面值的字符数组转换为整型面值数组，parseInt方法有此功能
            nums[subscript] = Integer.parseInt(arr[subscript]);
        }

        return nums;
    }
}
