#include <stdio.h>

typedef struct{
	int dia;
	int mes;
	int ano;
} Data;

Data parse_data(char* s ){
	// s --> yyyy-mm-dd
	Data data;
	
	// formatação de leitura
	sscanf(s, "%d-%d-%d", &data.ano, &data.mes, &data.dia);

	return data;
}

void formatar_data(Data* data, char* buffer){
	sprintf(buffer, "%02d/%02d/%04d", data->dia, data->mes, data->ano);
}

int main(){
	Data data = parse_data("2000-01-01");
	char data_formatada[11];

	formatar_data(&data, data_formatada);
	printf("%s\n", data_formatada);
	
	return 0;
}
