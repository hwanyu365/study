package util;

public class ArrayUtils {

	public static String printArray(int[] target) {
		String log = "{";
		for (int i = 0; i < target.length; i++) {
			if (i > 0) {
				log += ", ";
			}
			log += target[i];
		}
		log += "}";
		return log;
	}

	public static String printArray(int[][] target) {
		String log = "{";
		for (int i = 0; i < target.length; i++) {
			if (i == 0) {
				log += "{";
			} else {
				log += ", {";
			}
			for (int j = 0; j < target[i].length; j++) {
				if (j > 0) {
					log += ", ";
				}
				log += target[i][j];
			}
			log += "}";
		}
		log += "}";
		return log;
	}

	public static void exchange(int[] list, int i, int j) {
		int temp = list[j];
		list[j] = list[i];
		list[i] = temp;
	}
}
