package domain;

public class Exercise {
	public static int recursion(int m, int n) {
		 // ������� ������
		if (m == 0) {
			return n + 1;
			}
		// ��� ��������/����������� �������
		else if (n == 0 && m > 0) {
			return recursion(m - 1, 1);
			} 
		// ��� ��������/����������� �������
		else {
			return recursion(m - 1, recursion(m, n - 1));
			}
		}
	public static void main(String[] args) {
		System.out.println(recursion(2, 2)); // ����� ����������� �������
		}
	}