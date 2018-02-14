package it.cast.p2.File;

import java.io.File;
import java.io.FilenameFilter;

public class FilterBySufix implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		
		
		
		return name.endsWith(".java");
	}

}
