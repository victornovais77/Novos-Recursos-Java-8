package br.com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.modelo.Usuario;

public class Streams {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Victor", 150);
		Usuario user2 = new Usuario("Guilherme", 190);
		Usuario user3 = new Usuario("Paulo", 140);
		Usuario user4 = new Usuario("Rodrigo", 130);

		List<Usuario> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
	    //Filtra aprimeira list usuario e "transforma" em outra list usuarioFiltrado
		List<Usuario> filteredUsers = users.stream().filter(u -> u.getPontos() >= 140)
		                                            .collect(Collectors.toList());
		
	    //Filtra e mapeia a quantidade de usuarios de cada Usuario
		filteredUsers.stream().filter(u -> u.getPontos() >= 150)
		                                    .mapToInt(Usuario::getPontos)
		                                    .forEach(System.out::println);

		int sum = filteredUsers.stream().mapToInt(Usuario::getPontos).sum();
		
		System.out.println("A Soma de Pontos de todos os Usuarios é de: " + sum +" Pontos");
		
	}

}
