package test;

import domain.Exercise;
/** ��������� ������������
* �������������� ������.
* @author Katia Zourab
*/
public class TestResult {
	/** �������� �������� ���������������� ������ */
    public static void main(String[] args) {
        int i = 2;
		int j = 2;
		if(i > 0 && j > 0) {
			/** ����� ����������� ������� */
			System.out.println("����� " + Exercise.recursion(i, j)); 
        }
        else{
            System.out.println("������� ������������� ����� �����!!!");}
    }
}
