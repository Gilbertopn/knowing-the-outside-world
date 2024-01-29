package com.mjv.curso;


import com.mjv.curso.service.ProcessFileService;
import com.mjv.curso.service.ReadFileService;
import com.mjv.curso.service.WriteFileService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class MainSystemJavaApplication {

	public static void main(String[] args) {

		String[] lines = new String[]{
				"Homem de Ferro",
				"Capitão América",
				"Thor",
				"Hulk",
				"Viúva Negra",
				"Gavião Arqueiro",
				"Pantera Negra",
				"Homem-Aranha",
				"Doutor Estranho",
				"Capitã Marvel",
				"Feiticeira Escarlate",
				"Falcão",
				"Máquina de Combate",
				"Wolverine",
				"Deadpool"
		};

		String path = "C:\\Users\\gilbe\\Pastas em GERAL\\Projetos Spring\\CursoJava\\Workspace\\knowing-the-outside-world\\file-heroes.txt";




		WriteFileService.writeLinesToFile(lines, path);

		String[] readLines = ReadFileService.readLinesFromFile(path);

		ProcessFileService.processAndPrintStats(readLines);
	}
}
