package repository;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int sum =0;
		
		for (int Arra: sumArray) 
		{
			sum += Arra;
		}
		System.out.println(sum);
		
		// User 2 fer la resta dels elements de subArray
		
		
		
		// User 3 fer la multiplicació dels elements de prodArray
		
		int mult = 1;
		
		for (int num : prodArray) 
		{
			mult *= num;
		}
		
		System.out.println(mult);

	}

}
