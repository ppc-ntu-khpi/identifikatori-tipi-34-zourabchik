package test;

import domain.Exercise;
/** Выполняет тестирование
* разработанного класса.
* @author Katia Zourab
*/
public class TestResult {
	/** Проверка основной функциональности класса */
    public static void main(String[] args) {
        int n = 2;
		int m = 2;
		if(n > 0 && m > 0) {
			/** Вызов рекурсивной функции */
			System.out.println("Ответ " + Exercise.recursion(n, m)); 
        }
        else{
            System.out.println("Введите положительные целые числа!!!");}
    }
}
