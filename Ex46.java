package loops;

import javax.swing.JOptionPane;

public class Ex46 {

	public static void main(String[] args) {

		int userInput;

		String userAnswer;

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number: "));

			if (userInput < 2) {

				JOptionPane.showMessageDialog(null, +userInput + " number is not prime.");
			}

			else if (userInput == 2) {

				JOptionPane.showMessageDialog(null, +userInput + " number is  prime.");

			}

			else if (userInput % 2 == 0) {

				JOptionPane.showMessageDialog(null, +userInput + " number is not prime.");

			}

			else {

				boolean isPrime = true;

				for (int i = 3; i <= Math.sqrt(userInput); i += 2) {

					/*
					 * Quando você testa um número para ver se é primo, já sabe que qualquer número
					 * par maior que 2 não é primo, porque ele será divisível por 2.
					 * 
					 * Exemplo: 4, 6, 8, 10, 12, etc., são divisíveis por 2, então não há
					 * necessidade de verificá-los no loop.
					 */

					if (userInput % i == 0) {

						isPrime = false;

						break; //
					}
				}

				if (isPrime) {

					JOptionPane.showMessageDialog(null, userInput + " number is prime.");

				} else {

					JOptionPane.showMessageDialog(null, userInput + " number is not prime.");
				}
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue??");

			userAnswer.trim();

		} while (userAnswer.equals("yes"));

	}

}
