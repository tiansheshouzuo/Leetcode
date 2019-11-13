/**
 * Demo class
 *
 * @author Xuan Gu
 * @date 2019/11/13
 */
public class Main {
    public static void main(String[] args) {
        int num=1994;
        String s=intToRoman(num);
        System.out.println(s);
    }

    private static String intToRoman(int num) {
        int[] str={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V", "IV","I"};
        StringBuilder sbd=new StringBuilder();
        int index=0;
        while(num>0) {
            int count=num/str[index];
            while(count-->0) {
                sbd.append(symbol[index]);
            }
            num%=str[index];
            index++;
        }
        return sbd.toString();
    }
}
