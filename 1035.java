import java.util.Arrays;
import java.util.Scanner;

/***
 * ACM竞赛题
 * @author deng88598424
 * 题目来源 TJOJ http://acm.tongji.edu.cn/problem.php?id=1035
 * title:最优比赛策略
 * input
 * 2
 * 30 20
 * output:
 * 70
 */
public class main {
    public int bestgame(){
        System.out.print("请输入题数：");
        Scanner input=new Scanner(System.in);
        int M=input.nextInt();
        System.out.print("请依次输入题目的难度参数：");
        int[] N=new int[M];
        for (int i=0;i<N.length;i++){
            N[i]=input.nextInt();
        }
        Arrays.sort(N);
        int sum=0;
        for (int i=0;i<N.length;i++){
            for (int j=0;j<N.length-i;j++){
                sum+=N[j];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        main m=new main();
        m.bestgame();
    }
}
