/**
 * @Description DigitJump
 * @Project HomeWorks
 * @Author 王道19th吴开桥
 * @E-mail wkq0@qq.com
 * @LoginUser wkq00
 * @Date 2019/12/31 星期二
 * @Version 1.0
 * @IDE IntelliJ IDEA
 */

package day04problem04;

import java.util.Scanner;

/**
 * @Content 王道day04作业第四题
 * 给定一个非负整数数组，你最初位于数组的第一个位置。数组中的每个元素代表你在该位置可以跳跃的最大长度。判断你是否能够到达最后一个位置。
 * 例如：
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * <p>
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ，
 * 所以你永远不可能到达最后一个位置。
 */
public class DigitJump {
    static boolean is = false;  //记录可否通达的全局变量

    public static void main(String[] args) {
        // 读取数组
        int[] nums = getIntegerArray();

        //从第0位遍历数组
        canArrive(nums, 0);

        System.out.println(is);
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

    private static void canArrive(int nums[], int distance) {

        int step = nums[distance];  //每位元素所能跨过的最大步数
        if (distance + step >= nums.length - 1) {
            //判断当前路程加最大步数能否到达终点
            is = true;
        } else if (step > 0) {
            //如果不能则循环递归本方法
            do{
                if (nums[distance + 1] > 0)
                    //如果下一位元素步数大于0，则递归本方法
                    canArrive(nums, ++distance);
            }while (step-- > 0);
        }
    }
}



























