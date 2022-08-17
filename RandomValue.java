package PatternPrograms;

import java.util.Random;

public class RandomValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random =new Random();
		int x = random.nextInt(); // int x= random.nextInt(10)+0;
		System.out.println(x);
		
		double y = random.nextDouble();
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		System.out.println(z);
	}

}