package syl.study.data.structure;

/**
 * 使用 “海伦一秦九韶公式 ”计算三角形面积
 * S =√(p*(p-a)*(p-b)*(p-c))
 * S = Math.sqrt(p*(p-a)*(p-b)*(p-c))
 * p = (a+b+c)/2
 *
 * @author 史彦磊
 * @create 2016-12-17 10:14.
 */
public class TriangleArea {


    public static void main(String[] args) {
        area(3,4,5);
    }


    /**
     * 计算三角形的面积
     * @param a  边长a
     * @param b  边长b
     * @param c  边长c
     */
    public static void area(double a, double b, double c){
        double p = (a+b+c)/2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("三角形的面积为:"+area);
    }
}
