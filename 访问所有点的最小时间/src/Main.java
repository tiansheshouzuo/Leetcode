public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {3, 4},{-1,0}};
        int res=minTimeToVisitAllPoints(array);
        System.out.println("res="+res);
    }
        public static int minTimeToVisitAllPoints(int[][] points) {
            int sum=0;
            for(int i=0;i<points.length-1;i++) {
                sum+=count(points[i][0],points[i][1],points[i+1][0],points[i+1][1]);
                System.out.println(sum);
            }
            return sum;
        }
        public static int count(int x1,int y1,int x2, int y2) {
            if(x1>x2) {
                int temp;
                temp=x1;
                x1=x2;
                x2=temp;
            }
            if(y1>y2) {
                int temp;
                temp=y1;
                y1=y2;
                y2=temp;
            }
            int min=Math.min(x2-x1,y2-y1);
            return min+Math.max(x2-x1,y2-y1)-min;
        }
}
