package com.test;

import java.util.*;

import static org.apache.commons.lang3.Validate.*;
import static org.apache.commons.lang3.StringUtils.*;

class Section {
	
	private final String sectionID;
	
	Section(String sectionID){
		notBlank(sectionID);
		
		isTrue(isAlphanumeric(sectionID), "sectionID must be alphanumeric:" + sectionID);
		
		this.sectionID = sectionID;
	}
	
	@Override 
	public String toString() {
		return sectionID;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) 
			return true;
		if(o == null || getClass() != o.getClass()) 
			return false; 
		
		Section section = (Section) o;
		
		return Objects.equals(sectionID, section.sectionID);
	}
	
	// @Override 
	// public int hashCode() {
	// 	return sectionID;
	// }
}
