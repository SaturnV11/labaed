public class TesteData{
	public static void main(String[] args){
		Data data = Data.parseData("2000-01-01");

		System.out.println(data.formatar());
	}
}
