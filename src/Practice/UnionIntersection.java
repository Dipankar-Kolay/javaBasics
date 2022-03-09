package Practice;

import java.util.HashSet;


public class UnionIntersection {
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,3,2,6};
        Union(arr1,arr2);
        Intersection(arr1,arr2);

    }
    static void Union(int[] arr1, int[] arr2){
        HashSet hs = new HashSet();
        for(int i =0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs);
    }
    static void Intersection(int[] arr1, int[] arr2){
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }

}
