import java.util.Random;


public class Main {

	public static void main(String[] args) {

		int[] a1 = generateArray(1000);
		int[] a2 = generateArray(5000);
		int[] a3 = generateArray(15000);
		int[] a4 = generateArray(30000);
		int[] a5 = generateArray(60000);
		int[] a6 = generateArray(100000);
		int[] a7 = generateArray(200000);
		int[] a8 = generateArray(400000);
		int[] a9 = generateArray(600000);
		int[] a10 = generateArray(800000);
		int[] a = generateArray(8);
		
		Insertion i = new Insertion(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		Quick q = new Quick(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		Merge m = new Merge(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		Selection s = new Selection(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		Bubble b = new Bubble(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		m.calculate();
		i.calculate();
		s.calculate();
		b.calculate();
		
	}
	
	public static int[] generateArray(int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		int i=0;
		while (i<size) {
			arr[i++] = rand.nextInt(size);
		}
		return arr;
	}

}
