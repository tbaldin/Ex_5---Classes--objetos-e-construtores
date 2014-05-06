import java.util.*;

class main{
	public static void main(String[] args){
		Post p = new Post();
		Scanner s;
		s = new Scanner(System.in);
		String nome = new String();
		int id;
		System.out.println("Nome");
		nome = s.nextLine();
		System.out.println("Id");
		id = s.nextInt();
		s.nextLine();
		String texto = new String();
		System.out.println("Texto");
		texto=s.nextLine();
		
		
		p.getAutor().setNome(nome);
		p.getAutor().setId(id);
		p.setTexto(texto);
		p.imprimeResumo();
	}
}

