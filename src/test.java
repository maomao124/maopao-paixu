import java.util.Scanner;

/**
 * Project name(项目名称)：冒泡排序法
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 20:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] score = new double[5];
        for (int i = 0; i < score.length; i++)
        {
            System.out.print("请输入第 " + (i + 1) + " 个成绩：");
            score[i] = scan.nextDouble();
        }
        System.out.println("排序前的元素值：");
        for (double val : score)
        {
            System.out.print(val + "\t");
        }
        System.out.println();

        System.out.println("通过冒泡排序方法对数组进行排序：");
        for (int i = 0; i < score.length - 1; i++)
        {
            // 比较相邻两个元素，较大的数往后冒泡
            for (int j = 0; j < score.length - 1 - i; j++)
            {
                if (score[j] > score[j + 1])
                {
                    double temp = score[j + 1]; // 把第一个元素值保存到临时变量中
                    score[j + 1] = score[j]; // 把第二个元素值转移到第一个元素变量中
                    score[j] = temp; // 把临时变量（第一个元素的原值）保存到第二个元素中
                }
                System.out.print(score[j] + " "); // 对排序后的数组元素进行输出
            }
            System.out.print("【");
            for (int j = score.length - 1 - i; j < score.length; j++)
            {
                System.out.print(score[j] + " ");
            }
            System.out.println("】");
        }
    }
}
