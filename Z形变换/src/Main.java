import java.util.ArrayList;
import java.util.List;
/**
 * Demo class
 *
 * @author Xuan Gu
 * @date 2019/11/13
 */
public class Main {
    public static void main(String[] args) {
        String s="LEETCODEISHIRING";
        int numRows=3;
        String res=convert(s,numRows);
        System.out.println(res);
    }

    private static String convert(String s, int numRows) {
        if(numRows==1) {
            return s;
        }
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        int curr=0;
        Boolean goingDown=false;
        for(char c:s.toCharArray()) {
            list.get(curr).append(c);
            if(curr==0 || curr==numRows-1) {
                goingDown=!goingDown;
            }
            curr+=goingDown?1:-1;
        }
        StringBuilder sbd=new StringBuilder();
        for(int i=0;i<numRows;i++) {
            sbd.append(list.get(i));
        }
        return sbd.toString();
    }
}
