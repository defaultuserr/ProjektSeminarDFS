package csvData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class csvReader {

	public static void main(String[] args) {
		String xfileLocation = "C:\\Users\\sezer\\Desktop\\HR.csv";
		String line;
		ArrayList<String> aList = new ArrayList<String>();
		Scanner scanIn = null;
		
		
		try{
			scanIn = new Scanner(new BufferedReader(new FileReader(xfileLocation)));
			while (scanIn.hasNextLine()){
				line = scanIn.nextLine();
				String [] inputLine = line.split(";");
				aList.add(inputLine[0]);
			}
		} catch (Exception e)
		{
			System.out.println(e);
		}
		int sz = aList.size();
		for(int i = 0; i< sz; i++){
			System.out.println(aList.get(i).toString());
		}

	}

}
