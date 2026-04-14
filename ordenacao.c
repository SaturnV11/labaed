#include <stdio.h>

int compare_to(int e1, int e2){
	
	int resp;
	if(e1 < e2)	  resp = -1;
	else if(e1 == e2) resp = 0;
	else 		  resp = 1;
	
	return resp;
}

void swap(int array[], int i, int j){
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}

void ordenar_selecao(int array[], int n){
	for(int i = 0; i < (n-1); i++){
		int menor = i;
		
		for(int j = i + 1; j < n; j++){
		if(compare_to(array[j], array[menor]) < 0){
				menor = j;
			}
		}
		swap(array, i, menor);
	}
}

int main (){
	int  n = 5;
	int array[] = {13, 7, 21, 1, 5};

	ordenar_selecao(array, n);

	for(int i = 0; i < n; i++){
       		printf("%d, ", array[i]);
	}
	printf("\n");
	
	return 0;
}
