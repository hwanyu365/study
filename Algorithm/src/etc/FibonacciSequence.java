package etc;

public class FibonacciSequence {

	public static void main(String[] args) {
		FibonacciSequence fs = new FibonacciSequence();
		int x = 50;
		long duration = System.nanoTime();
		long result1 = fs.getFib(x);
		duration = System.nanoTime() - duration;
		System.out.format("%sth value in Fibonacci Sequence is %s (%s ns)", x, result1, duration);
		
		duration = System.nanoTime();
		long result2 = fs.getFib2(x);
		duration = System.nanoTime() - duration;
		System.out.format("\n%sth value in Fibonacci Sequence is %s (%s ns)", x, result2, duration);
	}

	private long getFib(long x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return getFib(x - 1) + getFib(x - 2);
		}
	}

	private long getFib2(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			long pp = 0;
			long p = 1;
			long result = 0;

			for (int i = 2; i <= x; i++) {
				result = pp + p;
				pp = p;
				p = result;
			}
			return result;
		}
	}
}