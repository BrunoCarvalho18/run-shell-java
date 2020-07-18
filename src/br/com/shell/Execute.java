package br.com.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Execute {

	public static void main(String[] args) {
		ProcessBuilder processBuilder = new ProcessBuilder();

		processBuilder.command("cmd.exe", "/c", "adb get-serialno");

		try {
			Process process = processBuilder.start();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String linha;
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
