package test;

import domain.Exercise;
/** ��������� ������������
* �������������� ������.
* @author Katia Zourab
*/
public class TestResult {
	/** �������� �������� ���������������� ������ */
    public static void main(String[] args) {
        byte i = 2;
		byte j = 2;
		if(i > 0 && j > 0) {
			/** ����� ����������� ������� */
			System.out.println("����� " + Exercise.recursion(i, j)); 
        }
        else{
            System.out.println("������� ������������� ����� �����!!!");}
    }
}
