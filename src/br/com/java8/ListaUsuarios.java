package br.com.java8;

import java.util.ArrayList;
import java.util.List;

import br.com.modelo.Usuario;

public class ListaUsuarios {

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

		usuarios.removeIf(u -> u.getPontos() > 160);

		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

}
