import java.util.*;

public class SetEx1{
    public static void main(String[] args){
      Set<Integer> s=new HashSet<>();
      int[] arr={1,2,3,4,5};
      int[] arr={3,4,5,6,7};
      for(int i=0;i<arr.length;i++){
        if(s.contains(arr[i])){
            System.out.println(arr[i]);
        }
        s.add(arr[i]);
      }
      
    }
}