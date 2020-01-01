/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day2作业第四题
 * 下面这条语句会打印出什么呢？为什么？
 * System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
 * 解释：Long.toHexString()方法是将一个整数转换成十六进制的字符串。
 *
 * 本题总结：不要使用混合数据类型运算
 */

package day02problem04;

public class MixedDataTypeOperations {
    public static void main(String[] args) {
        //Long.toHexString()：输出一个整数的六进制字符串
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
        //0xcafebabe是int型32位负整数，十六进制形式首位为c时意味着二进制形式的首位为1，即符号位为1
        //0x100000000L是long型64位正整数0x0000 0001 0000 0000
        //0xcafebabe在运算时自动转化为long型时，符号位不变，高位填充1，即为0xffff ffff cafe babe
        // 0x0000 0001 0000 0000
        //+0xffff ffff cafe babe
        //=0x0000 0000 cafe babe
        //=0xcafebabe 即输出结果为 cafebabe
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
