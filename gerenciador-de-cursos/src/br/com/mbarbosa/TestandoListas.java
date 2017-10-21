package br.com.mbarbosa;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add("Spring MVC");
		cursos.add("Dominando o framework Collections");
		cursos.add("Java Web");
		
//		String primeiroCurso = cursos.get(0);
//		cursos.remove(1);
//		
//		cursos.forEach(curso -> {
//			System.out.println("Curso: " + curso);
//		});

		Collections.sort(cursos);
		
		System.out.println(cursos);
		
	}
	
}
