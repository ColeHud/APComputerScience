
public class MergeSorting 
{
	public static void main(String[] args)
	{
		
	}
	
	//merge
	public static void merge(int[] a, int low, int mid, int high)
	{
		int[] temp = new int[high - low + 1];
		
		int i = low;
		int j = mid + 1;
		int n = 0;
		
		//sort the elements into temp
		while(i <= mid || j <= high)
		{
			if(i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			else if(j > high)
			{
				temp[n] = a[i];
				i++;
			}
			else if(a[i] < a[j])
			{
				temp[n] = a[i];
				i++;
			}
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}
		
		for(int k = low; k<= high; k++)
		{
			a[k] = temp[k - low];
		}
	}
	
	//merge sort
}
