package com.test;

import java.util.*;

class Student {
	
	private final int studentNumber;
	private final Collection<Section> sections = new ArrayList<>();
	
	Student(int studentNumber, Collection<Section> sections){
		if (studentNumber < 0) {
			throw new IllegalArgumentException("Invalid Negative StudentNumber: " + studentNumber);
		}
		if(sections == null) {
			throw new NullPointerException("Null Section");
		}
		this.studentNumber = studentNumber;
		this.sections.addAll(sections);
		this.sections.removeIf(Objects::isNull);
	}
	
	
	void enlist(Section section) {
		if(section==null) {
			throw new NullPointerException("Null Section Enlistment");
		}

		if(sections.contains(section)){
			throw new RuntimeException("Multiple Same Section");
		}

		this.sections.add(section);
	}
	
	
	@Override 
	public String toString() {
		return "Student# " + studentNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) 
			return true;
		if(o == null || getClass() != o.getClass()) 
			return false; 
		
		Student student = (Student) o;
		
		return studentNumber == student.studentNumber;
	}
	
	@Override 
	public int hashCode() {
		return studentNumber;
	}
}
