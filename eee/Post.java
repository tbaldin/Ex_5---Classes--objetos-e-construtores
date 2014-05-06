class Post{
	private Autor autor;
	private String texto;
	
	public Post(){
		autor = new Autor();
	}
	
	public Autor getAutor(){
		return this.autor;
	}
	public void setAutor(Autor a){
		this.autor = a;
	}
		
	public String getTexto(){
		return this.texto;
	}
	public void setTexto(String n){
		this.texto=n;
	}
	
	public void imprimeResumo(){
		System.out.println("Nome: " + this.getAutor().getNome() + "Id: " + this.getAutor().getId() + "Texto: " + this.getTexto() ) ;
	}
}