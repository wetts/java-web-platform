package com.wetts._book.advice.classAndObjectAndMethod;

/**
 * 匿名类的构造函数很特殊
 * 
 * @author wetts
 * @created 2015/06/07
 *
 */
public class Client_10 {

	public static void main(String[] args) {
		Calculator c = new Calculator(1, 2) {
			{
				setOperator(Ops.ADD);
			}
		};
		System.out.println(c.getResult());
	}
}

enum Ops {ADD, SUB}

class Calculator {
	
	private int i, j, result;
	
	public Calculator() {}
	
	public Calculator(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	protected void setOperator(Ops op) {
		result = op.equals(Ops.ADD) ? i + j : i - j;
	}
	
	public int getResult() {
		return result;
	}
}
