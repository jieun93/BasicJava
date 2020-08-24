package com.java.extendsClass;

import sub03.Divide;
import sub03.Input;
import sub03.Minus;
import sub03.Multi;
import sub03.Output;
import sub03.Sum;

public class Main {

	private Input input;
	private Output output;
	private Sum sum;
	private Minus minus;
	private Multi multi;
	private Divide divide;
	
	
	private Main(){
		//input = new IntInput();
		output = new IntOutput();
		sum =  new IntSum();
		minus = new IntMinus();
		multi = new IntMulti();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
