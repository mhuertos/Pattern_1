package nivell_2;

public class Numero implements Dato{
	
	private String numero;
	
	public Numero(){
	}

	@Override
	public String write() {
		return numero;
	}
	
	public void setNumero(String num) {
		numero = num;
	}
	
	public String getNumero() {
		return numero;
	}
}
