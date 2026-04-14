public class Selecao{
	public static void ordenar(Restaurante array, int n){
		for(int i = 0, i < (n - 1), i++){
			int menor = i;

			for(int j = i + 1; j < n; j++){
				if(compareTo(int array[j], int array[menor])
					menor = j;
			}
			swap(array, i, menor);
		}
	}
	
	private static void swap(Restaurante array, int i, int j){
		Restaurante temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	// metodo de comparacao
	private static int compareTo(Restaurante e1, Restaurante e2){
		int resp;
		if(e1.getId() < e2.getId()) resp = -1;
		else  if(e1.getId() == e2.getId()) resp = 0;
		else resp = 1;

		return resp;
	}
}
