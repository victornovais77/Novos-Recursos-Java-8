package br.com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.modelo.Usuario;

public class MethodReference {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Victor", 150);
		Usuario user2 = new Usuario("Guilherme", 90);
		Usuario user3 = new Usuario("Paulo", 140);
		Usuario user4 = new Usuario("Rodrigo", 130);

		List<Usuario> usuarios = Arrays.asList(user1,user2,user3,user4);

		usuarios.forEach(Usuario::tornaModerador);
		
		usuarios.stream().filter(u -> u.getPontos() > 100).forEach(System.out::println);

		

	}

}
