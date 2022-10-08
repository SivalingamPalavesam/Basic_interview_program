package example;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int n = 10;
		  int max = 100;
		Random obj = new Random();
		
		for(int i = 1 ;i <=n;i++)
		{
			System.out.println(obj.nextInt(max));
		}
	}

}
