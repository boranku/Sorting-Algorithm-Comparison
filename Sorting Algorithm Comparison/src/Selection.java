
public class Selection extends Algorithms{
	
	public Selection(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		super(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);	
		}

	public void sort(int a[]) {
		int size = a.length;
		for(int i=0;i<size-1;i++) {
			int indexSmallest = i;
			for(int j=i+1;j<size;j++) if(a[j]<a[indexSmallest] && j<size) indexSmallest = j;;
			if(indexSmallest != i) {
				int t = a[indexSmallest];
				a[indexSmallest] = a[i];
				a[i] = t;
			}
			
		}
	}

	@Override
	protected long calculateRun(int[] a) {
		int[] temp = a;
		long start = System.nanoTime();
		sort(temp);
		long end = System.nanoTime();
		return end-start;
	}
}
