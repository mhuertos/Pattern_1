package nivell_1;

public class App {
	
	public static void main(String[] args) {
		Undo c = Undo.getInstancia();
		c.guardaComandament("ctrl + c");
		c.guardaComandament("ctrl + v");
		c.guardaComandament("pwd");
		c.guardaComandament("ls");
		
		Undo d = Undo.getInstancia();
		d.llistaComandament();
	}

}
