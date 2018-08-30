package dynamic;

public class MatrixChainMultiplicationDynamic {
	static void printParanthasis(int i, int j, int[][] bracket, char name) 
	{
		if (i == j)
	    {
	        System.out.print(name++);
	        return;
	    }
		System.out.print('(');
		printParanthasis(i,bracket[i][j], bracket, name);
		System.out.print(')');
		System.out.print('(');
		printParanthasis(bracket[i][j]+1, j, bracket, name);
		System.out.print(')');
		
	}
	static int matrixChainMulti(int[] arr, int n)
	{
		int[][] dp = new int[n][n];
		int[][] bracket = new int[n][n];
		int j=0,q;
		for(int i=0;i<n;i++)
		{
			dp[i][i] = 0;
		}
		for(int L=2;L<n;L++)
		{
			for(int i=1;i<n-L+1;i++)
			{
				j= i+L-1;
				
				dp[i][j] = Integer.MAX_VALUE;
				 for (int k=i; k<=j-1; k++)
	                {
	                    // q = cost/scalar multiplications
	                    q = dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j];
	                    if (q < dp[i][j])
	                        dp[i][j] = q;
	                    	bracket[i][j] = k;
	                }
			}
		}
		
		printParanthasis(1, n-1, bracket, 'A');
		return dp[1][n-1];
	}
	 public static void main(String args[])
	    {
	        int arr[] = new int[] {1, 2, 3, 4, 3};
	        int n = arr.length;
	 
	        System.out.println("Minimum number of multiplications is "+
	        		matrixChainMulti(arr, 5));
	 
	    }
}

