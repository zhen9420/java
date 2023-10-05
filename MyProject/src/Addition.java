import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        System.out.println("请输入若干个数，每输入一个数回车确认\n最后输入数字0结束操作");
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (true){
            double n = input.nextDouble();
            if(n == 0) break;
            m ++;
            sum += n;

        }
        System.out.printf("%d个数个和为%f",m,sum);
    }
}
