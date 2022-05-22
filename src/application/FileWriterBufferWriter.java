package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good evening", "Good Night" };

		String path = "C:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String ln : lines) {

				bw.write(ln);
				bw.newLine();

			}

		}
		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
