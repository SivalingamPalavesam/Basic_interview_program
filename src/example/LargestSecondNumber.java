package example;

public class LargestSecondNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 2, 5, 7 };
		int n = arr.length;

		for (int i = 1; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("************" + arr[n - 2]);
	}

}
