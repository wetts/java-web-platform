package com.wetts.designpattern.iterator.example;

public class Boss {

	public static void main(String[] args) {
		IProject project = new Project();
		project.add("aaa", 1, 2);
		project.add("bbb", 23, 11111);
		
		IProjectIterator iterator = project.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getProjectInfo());
		}
	}
}
