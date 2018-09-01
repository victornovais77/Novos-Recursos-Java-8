package br.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.modelo.Usuario;

public class OrdenaUsuarios {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Victor", 150);
		Usuario user2 = new Usuario("Guilherme", 190);
		Usuario user3 = new Usuario("Paulo", 140);
		Usuario user4 = new Usuario("Rodrigo", 130);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);

		// ordena usuarios por ordem alfabetica
		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
        usuarios.forEach(System.out::println);

		List<String> usuarios2 = Arrays.asList("Rafael", "Sergio", "Bruno", "Rodrigo");

	  //ordena usuarios por ordem alfabetica
		usuarios2.sort(Comparator.naturalOrder());
	  //usuarios2.sort(String.CASE_INSENSITIVE_ORDER);

		System.out.println("Usuarios2:");
		System.out.println(usuarios2);
	}

}
