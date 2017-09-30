package syl.study.data.structure;

/**
 * 有序数组
 *
 * @author 史彦磊
 * @create 2016-12-13 22:38
 */
public class OrdArray {

    private Long [] arr;

    private int numele;

    public OrdArray(int size){
        if (size<1){
            throw new RuntimeException("有序数组的大小必须大于0");
        }
        arr = new Long[size];
        numele = 0;
    }

    public int insert(long value){
        if (numele == 0){
            arr[numele]=value;
        }else{
            int index = Math.abs(numele / 2)+1;
            if (arr[index] > value){

            }
        }
        return 0;
    }




}
