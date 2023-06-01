public class MoveZerosToEnd {
	public static void main(String[] args){
		int[] arr = {1,2,0,3,0,4,0,5};
		int size =arr.length;
		int z=0, nz=0;
		while(nz<size){
			if(nz != 0){
			int temp = arr[nz];
			arr[nz] = arr[z];
			arr[z] = temp;
			nz++;
			z++;
		}
		else{
			nz++;
		}
	}
		for(int x: arr){
			System.out.print(x+" ");
		}

}
}
