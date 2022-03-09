package com.dipankar;

public class getMaxValue {

    public static void main(String[] args) {
        System.out.println(getMax(15958));
        System.out.println(getMax(-5859));
        System.out.println(getMax(-5000));
        System.out.println(getMax(5000));
    }
    private static int getMax(int n){
        char trgtchar = '5';
        int max = n>0 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
        String str = String.valueOf(Math.abs(n));
        int index = str.indexOf(trgtchar);
        while(index>=0){
            int temp = Integer.parseInt(new StringBuffer(str).deleteCharAt(index).toString());
            if(n>0){
                if(temp>max)
                    max = temp;
            }
            else {
                if(temp<max)
                    max = temp;
            }
            index = str.indexOf(trgtchar,index + 1);

        }
        if(n<0)
            max = max * -1;
        return max;
    }
}
