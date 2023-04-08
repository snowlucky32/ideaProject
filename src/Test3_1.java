import java.io.*;
import java.util.Scanner;

public class Test3_1 {

	/*
	 * ����ת���㷨
	 *���ܣ���ʮ������Nת��Ϊr��������
	 */
	public static void conversion(int N, int r) {
		SequenceStack<Integer> s = new SequenceStack<Integer>();
		/* ����һ��˳��ջ */
		while (N != 0) {
			s.push(N % r); // ������ջ
			N = N / r;     // ����������
		}
		System.out.print("ת�����Ϊ��");
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫת����ʮ��������");
		Integer number=sc.nextInt();
		System.out.println("������Ҫת���Ľ��ƣ�");
		Integer r=sc.nextInt();
		conversion(number,r);
	}
}
