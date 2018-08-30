package amazone;

public class KadaneAlgorithm 
{
	static int maxSubArraySum(int a[], int size)
	{
	   int max_so_far = a[0];
	   int curr_max = a[0];
	 
	   for (int i = 1; i < size; i++)
	   {
	        curr_max = Integer.max(a[i], curr_max+a[i]);
	        max_so_far = Integer.max(max_so_far, curr_max);
	   }
	   return max_so_far;
	}
}
