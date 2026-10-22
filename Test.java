public class Test{

	public static void main(String[] args){

		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		for(int i=5;i<10;i++){

			b[i-b.length] = i+1;	
		}	
	
		int[] c = {a[0],b[0],a[1],b[1],a[2],b[2],a[3],b[3],a[4],b[4]};	
		int[] d = new int[a.length+b.length];
		
		for(int i=0;i<d.length;i++){

			if(i%2 ==0){

				d[i] = a[i/2];
			}else{

				d[i] = b[i/2];
			}
		}
				

	}
}
