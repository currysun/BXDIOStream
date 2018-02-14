package it.cast.p2.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FilterByHidden implements FileFilter {



	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.isHidden();
	}

}
