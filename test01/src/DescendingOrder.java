
public class DescendingOrder {
	
	public static void main(String[] args) {
		int[] ar= {20,8,17,6,5,10,1};
		int temp;
		for(int base=0;base<ar.length; base++) {
			for(int start=base+1; start<ar.length; start++) {
				if(ar[base]<ar[start]) {
					temp = ar[base];
					ar[base]=ar[start];
					ar[start]=temp;
					}
				}
			}
		int ndx=0;						
		while(ndx<ar.length) {
			System.out.print(ar[ndx]+" ");
			ndx++;
		}
	}
}
