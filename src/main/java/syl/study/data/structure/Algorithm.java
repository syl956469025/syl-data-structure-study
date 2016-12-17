package syl.study.data.structure;

/**
 * 算法设计
 *
 * @author 史彦磊
 * @create 2016-12-17 10:36.
 */
public class Algorithm {


    public static void main(String[] args) {
//        demo1(1,-2,1);
//        demo2(1,100);
//        demo3(2005, 0.05, 200, 300);
        demo4(993,773);

    }


    /**
     * 设计一个求解一元二次方程 ax^2 + bx +c =0 的算法
     * 分析：
     * 我们知道 判别式△ = b^2 - 4ac >0 则方程有两个不相等的实根，x1 = (-b+√△)/2a ,  x2 = (-b - √△)/2a
     * 若判别式 △ = 0 ，则方程有两个相等的实根 x1 = x2 = -b/2a
     * 若判别式 △ < 0 , 则方程没有实根。
     */
    public static void demo1(double a, double b, double c) {
        double flag = Math.pow(b, 2) - 4 * a * c;
        if (flag < 0) {
            System.out.println("该方程没有实根！");
            return;
        }
        double p = -b / 2 * a;
        if (flag == 0) {
            System.out.println("该方程有两个相等的实根 x1 = x2 = " + p);
            return;
        }
        double q = Math.sqrt(flag) / 2 * a;
        if (flag > 0) {
            System.out.println("该方程有两个不相等的实根 x1 =" + (p + q) + " x2 = " + (p - q));
        }
    }


    /**
     * 求和 例如 求 1+2+3+ ···+ 100的和
     *
     * @param min 开始值
     * @param max 结束值
     */
    public static void demo2(double min, double max) {
        double sum = (max + min) * (max - min + 1) / 2;
        System.out.println("和为:" + sum);
    }

    /**
     * 某工厂2005年年生产总值为200W，技术革新以后，预计以后每年都会比上一年增长5%，计算最早哪一年年生产总值可以超过300W
     * 分析  y: 年生产总值  x ：相对于2005年以后增长的年份
     * 由条件和得  y = 200*(1+0.05)^x
     * x 则是 以1.05为低，y/200的对数
     */
    public static void demo3(int nowyear, double step, double current, double target) {
        double x = Math.log10(target / current) / Math.log10(1 + step);
        System.out.println("预计在 [" + (nowyear + Math.ceil(x)) + "年 年生产总值可以达到 " + target + "万");
        do {
            double yearincreament = current * step;
            current = current + yearincreament;
            nowyear++;
        } while (current < target);
        System.out.println(nowyear);
    }


    /**
     * 使用辗转相除法 又称欧几里得算法
     * 计算两个数的最大公约数
     * @param min 两个数中较小的数
     * @param max 两个书中较大数
     * 求最大公因数：
     *  方法1：
     * 先用两个公有质因数连续去除，一直除到所得的商是互为指数为止，然后把所有的除数连乘起来就是最大公因数
     *  方法2： 辗转相除法
     *  用两个数中较大的数除以较小的额数，得到商和余数，余数和较小数的公约数也是 原来两个数的公约数，重复上述操作
     *  当余数为0时的商就是最大公约数。
     */
    public static void demo4(int min,int max){
        if (min == max){
            System.out.println("最大公约数为 ： "+min);
            return;
        }
        do {
            int flag = max % min;
            if (flag == 0){
                System.out.println("最大公约数为:" + min);
                break;
            }
            max = min;
            min = flag;
        }while (true);

    }


}
