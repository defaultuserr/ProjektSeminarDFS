package csvData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class csvReader {

	public static void main(String[] args) {
		// Change the file location for your own purpose
		String xfileLocation = "C:\\Users\\sezer\\Desktop\\HR.csv";
		
		// will take a full row of the csv data
		String line;
		
		ArrayList<String> aList = new ArrayList<String>();
		Scanner scanIn = null;
		
		
		try{
			scanIn = new Scanner(new BufferedReader(new FileReader(xfileLocation)));
			// this will go through the complete csv data
			while (scanIn.hasNextLine()){
				line = scanIn.nextLine();
				String [] inputLine = line.split(";");
				//in the array of the inputLine are the columns of the csv
				//you can add the column you want to use by changing the "Array"-number
				aList.add(inputLine[0]);
			}
		} catch (Exception e)
		{
			//if an error occurs then the exception will appear
			System.out.println(e);
		}
		//this last part is for demonstrating the filled arraylist
		int sz = aList.size();
		for(int i = 0; i< sz; i++){
			System.out.println(aList.get(i).toString());
		}

	}

}
