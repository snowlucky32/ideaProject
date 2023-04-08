import java.io.*;
import java.util.Scanner;

public class Test3_1 {

	/*
	 * 数据转换算法
	 *功能：将十进制数N转换为r进制数。
	 */
	public static void conversion(int N, int r) {
		SequenceStack<Integer> s = new SequenceStack<Integer>();
		/* 定义一个顺序栈 */
		while (N != 0) {
			s.push(N % r); // 余数进栈
			N = N / r;     // 计算整数商
		}
		System.out.print("转换结果为：");
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要转换的十进制数：");
		Integer number=sc.nextInt();
		System.out.println("请输入要转换的进制：");
		Integer r=sc.nextInt();
		conversion(number,r);
	}
}
