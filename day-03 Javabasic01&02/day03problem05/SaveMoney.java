/*
 * @author 王道19th吴开桥 wkq0@qq.com on 2019/12/30.
 * @version 1.0
 *
 * 王道day3作业第五题
 * 小芳的妈妈每天给她2.5元钱，她都会存起来，
 * 但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱；
 * 请问，经过多少天，小芳存的钱才可以多于100块？
 *
 */

package day03problem05;

public class SaveMoney {
    int day = 0;    //天数
    double dayMoney = 2.5;  //每天获得多少钱
    double Money = 0.0; //存钱总数额

    public static void main(String[] args) {
        SaveMoney xiaoFang = new SaveMoney();
        do{
            ++xiaoFang.day;
            /*
            从第一天开始每天获得2.5元
            必须从第一天开始计账
            如果从第0天开始则第一次记账时会计支出6元，显然不符题意
            */
            xiaoFang.Money += xiaoFang.dayMoney;
            if(xiaoFang.day%5 == 0){
                //第五的倍数天支出6元
                xiaoFang.Money -= 6.0;
            }
        } while(xiaoFang.Money < 100.0);//当总金额大于100元时终止循环
        System.out.println("小芳需要经过" + xiaoFang.day + "天才能存到100元");
        System.out.println("至今小芳共有" + xiaoFang.Money + "元");
    }
}
