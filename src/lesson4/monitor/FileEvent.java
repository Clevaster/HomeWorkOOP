package lesson4.monitor;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileEvent implements IFileEvent {


	@Override
	public void onFileAdded(File file) {
		System.out.println("File added: " + file);
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		System.out.println(df.format(file.lastModified()));

	}
}
