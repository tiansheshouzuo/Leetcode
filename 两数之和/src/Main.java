import java.util.*;
/**
 * Demo class
 *
 * @author Xuan Gu
 * @date 2019/11/13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int[] res=new int[2];
            int t=sc.nextInt();
            int[] sum=new int[]{1,2,4};
            res=solution(sum,t);
            System.out.println("["+res[0]+","+res[1]+"]");
        }
    }

    private static int[] solution(int[] sum, int t) {
        int[] arr=new int[2];
        for(int i=0;i<sum.length-1;i++){
            int dif=t-sum[i];
            for(int j=i+1;j<sum.length;j++){
                if(dif==sum[j]) {
                    arr[0]=sum[i];
                    arr[1]=sum[j];
                    return arr;
                }
            }
        }
        return arr;

    }


}
