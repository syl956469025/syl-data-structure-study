package syl.study.data.structure;

import java.util.function.Function;

/**
 * 二分法求零点
 *
 * @author 史彦磊
 * @create 2016-12-16 22:38
 */
public class ErfenMethod {


    public static void main(String[] args) {
        s4();
    }


    /**
     * 利用二分法求函数  f(x) = 2^x + 3x -7 的零点
     * x  0     1      2
     * y  -6    -2     3
     * 结果: x0 = 1.433189674007142;
     */
    public static void s1() {
        System.out.println(point0(1, 2, 0.1, x0 -> {
            return Math.pow(2, x0) + 3 * x0 - 7;
        }));
    }

    /**
     * 使用二分法求函数 f(x) = Math.pow(0.8, x0) - 1 - Math.log(x0); 的零点
     * x0 为:-0.90625
     */
    public static void s2() {
        System.out.println(point0(-1, 0, 0.1, x0 -> {
            return (x0 + 1) * (x0 - 2) * (x0 - 3) - 1;
        }));
    }

    /**
     * 使用二分法求函数 f(x) = (x0 +1)*(x0-2)*(x0-3)-1; 的零点
     * x0 为:0.875
     */
    public static void s3() {
        System.out.println(point0(0, 1, 0.1, x0 -> {
            return Math.pow(0.8, x0) - 1 - Math.log(x0);
        }));
    }

    /**
     * 使用二分法求函数 f(x) = Math.log(x0) - 2/x0; 的零点
     * x0 为:2.25
     */
    public static void s4(){
        System.out.println(point0(2, 3, 0.1, x0 -> {
            return Math.log(x0) - 2/x0;
        }));
    }


    /**
     * 使用二分查找法求函数的零点
     *
     * @param min 区间下届
     * @param max 区间上届
     * @param fun 函数方程式
     * @param abs 精度
     * @return 返回满足零点的x值
     */
    public static double point0(double min, double max, double abs, Function<Double, Double> fun) {
        double y;
        if (max < min){
            throw new RuntimeException("参数异常，上届小于下届（max < min）");
        }
        double x0 = (min + max) / 2;
        do {
            if (fun.apply(min) * fun.apply(max) >0 ){
                throw new RuntimeException("该函数在区间["+min+","+max+"] 上没有零点");
            }
            System.out.println("x0 为:" + x0);
            y = fun.apply(x0);
            if (Math.abs(y - 0) < abs) {
                System.out.println("函数的零点为:" + x0);
                System.out.println("y 值为:" + y);
                break;
            }
            if (fun.apply(min) * y < 0) {
                max = x0;
            }
            if (fun.apply(max) * y < 0) {
                min = x0;
            }
            x0 = (min + max) / 2;
        } while (Math.abs(y - 0) > abs);
        return x0;
    }


}
