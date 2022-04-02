
public class Insertion extends Algorithms{

	public Insertion(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		super(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
	}
	
	public void sort(int a[]) {
		int len = a.length;
		for(int i=1;i<len;i++) {
			int value = a[i];
			int j = i-1;
			while(j>=0 && value<=a[j]){
	            a[j+1] = a[j];     
	            j = j-1;    
	        }    
	        a[j+1] = value;  
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
