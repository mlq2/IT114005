public class JavaLoops {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 8, 18, 30, 48, 53, 60 };
		int b, c;
		c = a.length;
		for (b = 0; b < c; b++) {
			if (a[b] % 2 == 0) {
				System.out.println(a[b] + " is an even number.");
			}
		}
	}
}
