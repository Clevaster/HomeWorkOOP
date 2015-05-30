package lesson4.monitor;

import util.Constants;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> fileNameList = new ArrayList<>();
		fileNameList.add(Constants.FILE_PATH_4 + "1.txt");
		fileNameList.add(Constants.FILE_PATH_4 + "2.txt");
		fileNameList.add(Constants.FILE_PATH_4 + "3.txt");
		fileNameList.add(Constants.FILE_PATH_4 + "4.txt");


		Monitor m = new Monitor(new FileEvent(), fileNameList);
		m.start();
	}
}