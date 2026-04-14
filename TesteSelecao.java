public class TesteSelecao{
	public static void main(String [] args){
		Restaurante[] array = {
			new Restaurante (3, "Ra"),
			new Resturante (7, "Rz"),
			new Restaurante (5, "Rb"),
			new Restaurante (1, "Rd")
		};

		int n = array.length;

		Selecao.ordenar(array, n);
	
		for(int i = 0; i < n; i++)
			array[i].imprimir();
	}
}
