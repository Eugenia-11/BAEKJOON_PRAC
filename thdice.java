package BJ2;

import java.util.Scanner;

public class thdice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
 
		// ���� ��� ������ �ٸ� ���
		if (a != b && b != c && a != c) {
			int max;
			
			if (a > b) {
				
				if (c > a) {
					max = c;
				} 
			
				else {
					max = a;
				}
			}
			
			else {
				
				if (c > b) {
					max = c;
				}
				
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// ��� �� �� �̻��� ���� ���� ������ ������ ���
		else {
			// 3���� ������ ��� ���� ���
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				// a�� bȤ�� c���� ���� ���
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b�� c�� ���� ���
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}