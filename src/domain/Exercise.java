package domain;
/** Вычисление функции Аккермана
* @author Katia Zourab
*/
public class Exercise {
	
	public static int recursion(int i, int j) {
		 /** Базовый случай */
		if (i == 0) {
			return j + 1;
			}
		/** Шаг рекурсии/рекурсивное условие */
		else if (j == 0 && i > 0) {
			return recursion(i - 1, 1);
			} 
		/** Шаг рекурсии/рекурсивное условие */
		else {
			return recursion(i - 1, recursion(i, j - 1));
			}
		}
}