class LeftRotation
{
	public static void main(String[] args)
	 {
		int[] arr = new int[]{1,2,3,4,5};
		int d = 4;
		System.out.println("Sample Input: ");
		for (int i=0;i<arr.length ;i++ )
		 {
			System.out.print(arr[i] + " ");
		}
		for (int i=0;i<d ;i++ )
		 {
			int j,first;
			first=arr[0];
			for (j=0;j<arr.length-1 ;j++ )
			 {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		System.out.println();
		System.out.println(" Sample Output: ");
		for (int i=0;i<arr.length ;i++ )
		 {
			System.out.print(arr[i] + " ");
		}
	}
}