package PatternPrograms;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j,rows,columns;
		String symbol;
		System.out.print("enter no of rows : ");
		rows = sc.nextInt();
		System.out.print("enter no of columns : ");
		columns = sc.nextInt();
		System.out.print("enter Symbols : ");
		symbol = sc.next();
		for(i=1;i<=rows;i++)
		{
			for(j=0;j<columns;j++)
			{
			System.out.print(" "+symbol);
			}
		System.out.println();

		}
	}
}