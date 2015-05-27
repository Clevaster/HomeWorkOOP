package lesson411.monitor11;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> fileNameList = new ArrayList<>();
		fileNameList.add("e:\\1.txt");
		fileNameList.add("e:\\java\\1.txt");
		fileNameList.add("e:\\java\\2.txt");
		fileNameList.add("e:\\java\\3.txt");

		Monitor m = new Monitor(new FileEvent(), fileNameList);
		m.start();
	}
}