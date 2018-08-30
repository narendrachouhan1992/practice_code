package dynamic;

public class MatrixChainMultiplicationRecursive {
	static int matrixChainMulti(int[] arr, int i, int j)
	{
		int min =Integer.MAX_VALUE;
		if(i==j)
		{
			return 0;
		}
		else
		{
			for(int k=i;k<j;k++)
			{
				int count = matrixChainMulti(arr, i, k) +
						matrixChainMulti(arr, k+1, j) +
                        arr[i-1]*arr[k]*arr[j];
				if(min> count)
					min=count;
			}
			
		}
		return min;
	}
	 public static void main(String args[])
	    {
	        int arr[] = new int[] {1, 2, 3, 4, 3};
	        int n = arr.length;
	 
	        System.out.println("Minimum number of multiplications is "+
	        		matrixChainMulti(arr, 1, n-1));
	 
	    }
}

