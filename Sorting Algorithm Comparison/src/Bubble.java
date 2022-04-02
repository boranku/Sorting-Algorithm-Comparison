
public class Bubble extends Algorithms{
	
	public Bubble(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		super(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
	}
	
	public void sort(int a[]) {
		int size = a.length-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i;j++) {
				if(a[j]>a[j+1]) {
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
		}
	}
	
	public long calculateRun(int[] a) {
		int[] temp = a;
		long start = System.nanoTime();
		sort(temp);
		long end = System.nanoTime();
		return end-start;
	}
}
