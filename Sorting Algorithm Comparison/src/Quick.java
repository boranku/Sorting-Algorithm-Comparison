
public class Quick extends Algorithms{
	
	public Quick(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		super(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
	}

	public void sort(int[] a, int l, int h){
		int q = partition(a, l, h);
		if(q-1 > l){
			sort(a, l, q-1);
	    }
	    if(q < h) {
	    	sort(a, q, h);
	    }
	}
	public int partition(int[] a, int left, int right){
		int pivot = a[left];
	    do {
	        while(a[right] > pivot) {right--;}
	        while(a[left] < pivot) {left++;}
	        if(right>=left) {
	            int t = a[left];
	            a[left] = a[right];
	            a[right] = t;
	            right--;
	            left++;
	        }
	    }while(left<=right);
	    return left;
	}

	@Override
	protected long calculateRun(int[] a) {
		int[] temp = a;
		long start = System.nanoTime();
		sort(temp, 0, temp.length-1);
		long end = System.nanoTime();
		return end-start;
	}
}