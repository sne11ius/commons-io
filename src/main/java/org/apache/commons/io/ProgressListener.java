package org.apache.commons.io;

public interface ProgressListener {

	void onProgress(long current, long total);
	
}
