/**
 * @Description TargetSum
 * @Project HomeWorks
 * @Author 王道19th吴开桥
 * @E-mail wkq0@qq.com
 * @LoginUser wkq00
 * @Date 2019/12/31 星期二
 * @Version 1.0
 * @IDE IntelliJ IDEA
 */

package day04problem03;

import java.util.Scanner;

/**
 * @Content 王道day04作业第3题
 * 给定一个整数数组 nums?和一个目标值 target，请你在该数组中找出和为目标值
 * 的那两个整数，并返回他们的数组下标。
 * 如给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 */
public class TargetSum {
    public static void main(String[] args) {
        // 读取数组
        int nums[] = getIntegerArray();

        //输入目标值
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        in.close();

        //按题意输出结果
        for (int subscript1 = 0; subscript1 < nums.length; subscript1++) {
            for (int subscript2 = subscript1 + 1; subscript2 < nums.length; subscript2++) {
                //每一位元素只与它后面的元素比较，因为前面的元素在本身的过程中与它比较过了
                if (nums[subscript1] + nums[subscript2] == target) {
                    //如果两数相加为输入的target值，则输出两者下标
                    System.out.println("[" + subscript1 + ", " + subscript2 + "]");
                }
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
