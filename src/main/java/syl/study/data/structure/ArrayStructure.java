package syl.study.data.structure;

/**
 * 数组数据结构的 Demo 测试类
 *
 * @author 史彦磊
 * @create 2016-12-11 12:12
 */
public class ArrayStructure {



    public static void main(String[] args) {
        Integer [] arr = new Integer[10];
        System.out.println(arr.length);
        int i;
        int num = arr.length;
        int searchKey=66;
        arr[0]=77;
        arr[1]=67;
        arr[2]=55;
        arr[3]=44;
        arr[4]=33;
        arr[5]=22;
        arr[6]=11;
        arr[7]=88;
        arr[8]=99;
        arr[9]=101;
        //列出数组中的所有数据项
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //查找数组中数据值为66的
        for (i = 0; i < arr.length; i++) {
            if (arr[i]==searchKey){
                break;
            }
        }
        if (i == num){
            System.out.println("找不到"+searchKey);
        }else{
            System.out.println("找到了"+searchKey);
        }

        //删除55
        searchKey =55;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey){
                break;
            }
        }
        num--;
        for (int k = i; k < num; k++) {
            arr[k]=arr[k+1];
        }

        for (i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }

    }


}
