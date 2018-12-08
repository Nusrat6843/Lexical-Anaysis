package lab1;

import java.util.Scanner;


public class Lab1 {

	static String code;
	private static Scanner sc;

	
	static String[] keyWord = {"int", "float", "double", "long", "char", "if", "else", "for", "while", "do", "include"};
	static String[] MathOperator = {"+", "-", "*", "/", "%"};
	static String[] LogicalOperator = {">", "<", "=", "==", ">=", "<="};		
	static String[] Symbol = {"!", "@", "#", "&", "(", ")", "_", "{", "}", ";", ":", ",", ".", "?", "[", "]", "%d", "%f", "%lf", "%ld", "%i"};
	static String[] headerFile = {"stdio.h", "conio.h", "string.h", "math.h", "stdlib.h"};
	static String[] functions = {"main", "printf", "scanf"};

    public static void main(String[] args) {
       
		System.out.println("Write your Code here:  \n\n");
		
		sc = new Scanner(System.in);
		
		code = sc.nextLine();
		
		String[] split = code.split(" ");
		String[] nameOfEachWord = new String[split.length];
	
		
		int i;
		
		for (i = 0; i < split.length; i++)
		{
			nameOfEachWord[i] = check(split[i], nameOfEachWord);
		}
		
		
		System.out.println("\n\n\n");
		for (i = 0; i < split.length; i++)
		{
			nameOfEachWord[i] = check(split[i], nameOfEachWord);
		}
		
	
		printingMethod(split, nameOfEachWord);
		
	}
	
	
	public static String check(String splitedCode, String[] nameOfEachWord)
	{
		int j;
		

			
		for(j=0; j<keyWord.length; j++)
		{
			if(splitedCode.equals(keyWord[j]))
			{
				return "Keyword";
			}
		}
		for(j=0; j<MathOperator.length; j++)
		{
			if(splitedCode.equals(MathOperator[j]))
			{
				return "Math Operator";
			}
		}
		for(j=0; j<LogicalOperator.length; j++)
		{
			if(splitedCode.equals(LogicalOperator[j]))
			{
				return "Logical Operator";
			}
		}
		for(j=0; j<Symbol.length; j++)
		{
			if(splitedCode.equals(Symbol[j]))
			{
				return "Symbol";
			}
		}
		for(j=0; j<headerFile.length; j++)
		{
			if(splitedCode.equals(headerFile[j]))
			{
				return "Header File";
			}
		}
		for(j=0; j<functions.length; j++)
		{
			if(splitedCode.equals(functions[j]))
			{
				return "Functions";
			}
		}
		try
		{
			Integer.parseInt(splitedCode);
			return "Numeric Value";
		} 
		catch (Exception e)
		{
			return "Variables";
		}
		
	}
	
	
	
	public static void printingMethod(String[] splitedCode, String[] nameOfEachWord)
	{
		int j;	
		boolean var = false;
		
		
		System.out.println("\n\n\n");
		
		
		System.out.print("Keyword:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Keyword"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Math Operator:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Math Operator"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Logical Operator:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Logical Operator"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Symbol:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Symbol"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Header File:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Header File"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Numeric Value:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Numeric Value"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Variables:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Variables"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
		
		
		System.out.print("Functions:   ");
		for (j = 0; j < nameOfEachWord.length; j++)
		{
			if(nameOfEachWord[j].equals("Functions"))
			{
				for (int i = 0; i < j; i++)
					if(splitedCode[i].equals(splitedCode[j]))
						var = true;

				if (var == false)
					System.out.print(" "+splitedCode[j]);
			}
		}
		var = false;
		System.out.print("\n\n");
	
		
	}
	
    }
    

