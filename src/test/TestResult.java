package test;

import domain.Exercise;
/** Выполняет тестирование
* разработанного класса.
* @author Katia Zourab
*/
public class TestResult {
	/** Проверка основной функциональности класса */
    public static void main(String[] args) {
        byte i = 2;
		byte j = 2;
		if(i > 0 && j > 0) {
			/** Вызов рекурсивной функции */
			System.out.println("Ответ " + Exercise.recursion(i, j)); 
        }
        else{
            System.out.println("Введите положительные целые числа!!!");}
    }
}
