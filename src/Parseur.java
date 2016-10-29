import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Parseur {

	public static void main(String[] args) {
		
		 
		 
		   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chemin vers un fichier CSV ?");

		
		File csvFile = new File(scanner.next());
		System.out.println("Quel est le délimiteur?");

		String delimiter = scanner.next();
		ArrayList<Vector> fileInfoArrayList = new ArrayList<Vector>();
		long debut = System.currentTimeMillis();
		Scanner doc;
		try {
			doc = new Scanner(csvFile);
			doc.useDelimiter("\n");
			String csvFileName;
			doc.next();
			while (doc.hasNext()) {
				csvFileName = doc.next();
				fileInfoArrayList.add(parseVect(csvFileName, delimiter));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				long fin = System.currentTimeMillis();
		   System.out.println("Méthode exécutée en " + Long.toString(fin - debut) + " millisecondes");

	}

	public static Data Parsing() {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Vector<String>> fileInfoArrayList = new ArrayList<Vector<String>>();
		Scanner doc;
		String delimiter;
		System.out.println("Chemin vers un fichier CSV ?");
		File csvFile = new File(scanner.next());
		System.out.println("Quel est le délimiteur?");

		delimiter = scanner.next();
		try {
			doc = new Scanner(csvFile);
			doc.useDelimiter("\n");
			String csvFileName;
			doc.next();
			while (doc.hasNext()) {
				csvFileName = doc.next();
				fileInfoArrayList.add(parseVect(csvFileName, delimiter));

			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		return new Data(fileInfoArrayList);
	}

	public static Vector parseVect(String csvFileName, String delimiter) {

		Vector<String> Result = new Vector<String>();
		int size = 0;
		String[] row = csvFileName.split(delimiter);

		for (String string : row) {
			Result.add(string);
			size++;
		}

		System.out.println(Result.size());
		return Result;
	}
	

}