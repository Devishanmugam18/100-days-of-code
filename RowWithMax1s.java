public class RowWithMax1s {
	static int findRow(int[][] arr, int N, int M){
		int row = 0;
		int col = M-1;
		int max_row_index = -1;
		
		while(row<N && col >=0){
			if(arr[row][col]==1){
				max_row_index=row;
				col--;
			}
			else{
				row++;
			}
		}
		return max_row_index;
	}
	public static void main(String[] args){
		int[][] arr= {{0, 1, 1, 1},
		           {0, 0, 1, 1},
		           {1, 1, 1, 1},
		           {0, 0, 1, 1}};
		int N = 4;
		int M=4;
		int ans = findRow(arr, N, M);
		System.out.println(ans);
	}
	

}
