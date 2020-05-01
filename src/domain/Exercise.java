package domain;
/** ���������� ������� ���������
* @author Katia Zourab
*/
public class Exercise {
	
	public static int recursion(int i, int j) {
		 /** ������� ������ */
		if (i == 0) {
			return j + 1;
			}
		/** ��� ��������/����������� ������� */
		else if (j == 0 && i > 0) {
			return recursion(i - 1, 1);
			} 
		/** ��� ��������/����������� ������� */
		else {
			return recursion(i - 1, recursion(i, j - 1));
			}
		}
}