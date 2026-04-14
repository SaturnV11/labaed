public class Resturante{
	private int id;
	private String nome;
	
	// construtor
	public Restaurante (int id, String nome){
		this.id = id;
		this.nome = nome;
	}

	// get
	public int getId(){
		return id;
	}
	public String getNome(){
		return nome;
	}

	public void imprimir(){
		System.out.println(id + ", " + nome);
	}
}
