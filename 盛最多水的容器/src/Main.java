/**
 * Demo class
 *
 * @author Xuan Gu
 * @date 2019/11/13
 */
public class Main {
    public static void main(String[] args) {
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        int res=maxArea(height);
        System.out.println(res);
    }

    private static int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++) {
            for(int j=i+1;j<height.length;j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }
}
