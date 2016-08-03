package com.wetts._book.advice.classAndObjectAndMethod;

public class Client_11 {

}

interface Father_11 {
	public int strong();
}

interface Mother_11 {
	public int kind();
}

class FatherImpl implements Father_11 {

	@Override
	public int strong() {
		return 8;
	}
	
}

class MotherImpl implements Mother_11 {

	@Override
	public int kind() {
		return 8;
	}
	
}

class Son_11 extends FatherImpl implements Mother_11 {

	@Override
	public int strong() {
		return super.strong() + 1;
	}
	
	@Override
	public int kind() {
		return new MotherSpecial().kind();
	}
	
	private class MotherSpecial extends MotherImpl {
		
		@Override
		public int kind() {
			return super.kind() - 1;
		}
	}
	
}

class Daughter extends MotherImpl implements Father_11 {

	@Override
	public int strong() {
		return new FatherImpl() {
			@Override
			public int strong() {
				return super.strong() - 2;
			}
		}.strong();
	}
	
}
