package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderBuffer {

	public static void main(String[] args) {

		String path = "C:\\temp\\int2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String perc = br.readLine();

			while (perc != null) {

				System.out.println(perc);

				perc = br.readLine();
			}

		} catch (IOException e) {

			System.out.println("Error" + e.getMessage());

		}

	}
}
