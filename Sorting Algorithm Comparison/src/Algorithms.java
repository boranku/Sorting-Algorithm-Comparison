
public abstract class Algorithms {
	
	public long[] avgTimes = new long[10];
	int[] a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
	public long[] runTimes = new long[30];
	
	public Algorithms(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9, int[] a10) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6; 
		this.a7 = a7;
		this.a8 = a8;
		this.a9 = a9;
		this.a10 = a10;
	}
	
	public void calculate() {
		int startIndex = 0;
		int avgIndex = 0;
		while(startIndex<30) {
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a1);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a2);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a3);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1)+ ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a4);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a5);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a6);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a7);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a8);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a9);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
			for(int i=0;i<3;i++) {
				runTimes[startIndex] = calculateRun(a10);
				startIndex++;
				System.out.println("Run " + Integer.toString(avgIndex+1) + "." + Integer.toString(i+1) + ": " + runTimes[startIndex-1]);
			}
			avgTimes[avgIndex] = (runTimes[startIndex-1]+runTimes[startIndex-2]+runTimes[startIndex-3])/3;
			System.out.println("Average "+ Integer.toString(avgIndex+1) + ": " + avgTimes[avgIndex]+"\n");
			avgIndex++;
		}
		
	}

	protected abstract long calculateRun(int[] a);
	
	

}
