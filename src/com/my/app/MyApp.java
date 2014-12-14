package com.my.app;

import java.io.IOException;

import com.my.exceptions.MyException;

public class MyApp {

	public static void main(String[] args){
		int[] myIntArray = new int[1];
		try{
			int b=myIntArray[0];
			throw new MyException("I've thrown an exception!");
			
		}
		catch (IndexOutOfBoundsException e){
			System.err.println("IndexOutOfBoundsException " + e.getMessage());
		}
		catch (MyException e){
			System.err.println("in MyException catch block");
			System.err.println(e.getMessage());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("in finally block");
		}
	}
}
