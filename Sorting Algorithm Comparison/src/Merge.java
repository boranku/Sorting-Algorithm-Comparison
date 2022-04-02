
public class Merge extends Algorithms{
	
	public Merge(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		super(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
	}
	

	public void sort(int a[], int l, int r) {
		int mid;
		if(r-l>=1) {  // >=
			if(r-l+1==2) {
				if(a[l]>a[r]) {
					int temp = a[l];
					a[l] = a[r];
					a[r] = temp;   
				}
			}
			else {
				mid = (r+l)/2;
				sort(a, l, mid);
				sort(a, mid+1, r);
				merge(a, l, mid, r);				
			}
		}	
	}
	public void merge(int a[], int l, int m, int r) {    
	    int lSize = m - l + 1;
	    int rSize = r - m;
	    int left[] = new int[lSize];
	    int right[] = new int[rSize];
	    
	    for(int i=0;i<lSize;i++) {left[i] = a[l+i];}
	    for(int j=0;j<rSize;j++) {right[j] = a[m+j+1];}
	    
	    int iLeft=0, iRight=0, iMain=l;
	    
	    while(iLeft<lSize && iRight<rSize) {
	    	if(left[iLeft]<=right[iRight]) {
	    		a[iMain] = left[iLeft];
	    		iLeft++;
	    	}
	    	else {
	    		a[iMain] = right[iRight];
	    		iRight++;
	    	}
	    	iMain++;
	    }
	    while(iLeft<lSize) {
	    	a[iMain] = left[iLeft];
    		iLeft++;
    		iMain++;
	    }
	    while(iRight<rSize) {
	    	a[iMain] = right[iRight];
    		iRight++;
    		iMain++;
	    }
	    
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
