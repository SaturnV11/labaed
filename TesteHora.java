public class TesteHora{
	public static void main (String [] args){
		Hora hora = Hora.parseHora("8:30");

		System.out.println(hora.formatar());
	}
}
