package domain;
/** ���������� ������� ���������
* @author Katia Zourab
*/
public class Exercise {
	
	public static int recursion(int m, int n) {
		 /** ������� ������ */
		if (m == 0) {
			return n + 1;
			}
		/** ��� ��������/����������� ������� */
		else if (n == 0 && m > 0) {
			return recursion(m - 1, 1);
			} 
		/** ��� ��������/����������� ������� */
		else {
			return recursion(m - 1, recursion(m, n - 1));
			}
		}
}