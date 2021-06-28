package algoPack;

import java.util.Random;

public class InputOrders {

	public int[] randomInput(int size) {
		int[] rand = new int[size];
		Random rnd = new Random();
		int i;
		for (i = 0; i < size; i++) {
			rand[i] = size + (int) (Math.random() * 10000);
		}
		return rand;
	}

	public int[] orderedInput(int size) {
		int[] rand = new int[size];
		Random rnd = new Random();
		int number;
		int i;
		for (i = 0; i < size; i++) {
			if (i == 0)
				number = rnd.nextInt(100);
			else {
				do {
					number = rand[i - 1] + (int) (Math.random() * 1000);
				} while ( rand[i - 1] == number );
			}
			if(number <= 10000) {
			rand[i] = number;
			}
		}
		return rand;
	}

	public int[] reverseOrderedInput(int size) {
		int[] first = orderedInput(size);
		int[] second = new int[size];
		int j = size;
		int i;
		for (i = 0; i < size; i++) {
			second[j - 1] = first[i];
			j = j - 1;
		}

		return second;
	}
}
