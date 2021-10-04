import java.util.Arrays;
import java.util.Collections;

public class BinPacking {

	/* Copy firstFit() from above */

	// Returns number of bins required using first fit
	// decreasing offline algorithm
	static int firstFitDec(Integer weight[], int n, int c)
	{

		// First sort all weights in decreasing order
		Arrays.sort(weight, Collections.reverseOrder());

		// Now call first fit for sorted items
		return firstFit(weight, n, c);
	}

	static int firstFit(Integer weight[], int n, int c)
	{
		// Initialize result (Count of bins)
		int res = 0;

		// Create an array to store remaining space in bins
		// there can be at most n bins
		int []bin_rem = new int[n];

		// Place items one by one
		for (int i = 0; i < n; i++)
		{
			// Find the first bin that can accommodate
			// weight[i]
			int j;
			for (j = 0; j < res; j++)
			{
				if (bin_rem[j] >= weight[i])
				{
					bin_rem[j] = bin_rem[j] - weight[i];
					break;
				}
			}

			// If no bin could accommodate weight[i]
			if (j == res)
			{
				bin_rem[res] = c - weight[i];
				res++;
			}
		}
		return res;
	}

	// Driver code
	public static void main(String[] args)
	{
		Integer weight[] = { 47110,19031,17312,17312,17311,16633,11557,11311,7565,6882,5881,5662,3983,3613,2920,2549,2548,1214,430,430,349,264,259,246,172,130,98,97,83,58,53,52,45,28,24,17,16,16,10,9,8,6,6,5,4,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,942 };
		int c = 5000;
		int n = weight.length;
		System.out.print("Number of bins required in First Fit " + "Decreasing : "
				+ firstFitDec(weight, n, c));
	}
}
