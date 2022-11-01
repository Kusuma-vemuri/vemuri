import java.util.*;
import java.util.Arrays;
class Code1{
  static void rearrange(int arr[],int n){
    int max_ele=arr[n-1];
    int min_ele=arr[0];
    for(int i=0;i<n;i++){
      if(i%2==0){
        arr[i]=max_ele;
        max_ele-=1;
      }
      else{
        arr[i]=min_ele;
        min_ele+=1;
      }
    }
  }
  public static void  main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
   System.out.println();
   rearrange(arr,n);
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }

  }




}

