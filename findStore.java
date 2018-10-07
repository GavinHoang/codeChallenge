
public class findStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] stores = {2, 11, 8, 10};
		int[] houses = {7, 2, 3, 4, 5, 9};
		for(int i: solution(stores, houses))
		System.out.print(i + " ");
	}
	
	public static int[] solution(int[] stores, int[] houses) {
        // write your code in Java SE 8
		int[] returned = new int[houses.length];
		int[] absValues = new int[stores.length];
		for(int i = 0; i < houses.length; i++) // take a house: houses[i] and find its closest store
		{
			for(int j = 0; j < stores.length; j++)
			{
				int sub = Math.abs(houses[i] - stores[j]);
				absValues[j] = sub;
			}
			int index = 0;
			int min = absValues[0];
			for(int x = 0; x < absValues.length; x++)
			{
				if(absValues[x] < min)
				{	
					min = absValues[x];
					index = x; // track the index of the smallest distance value in stores
				}
			}
			
			returned[i] = stores[index];
		}
		
		return returned;
    }

}
