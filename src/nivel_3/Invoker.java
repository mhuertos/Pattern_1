package nivel_3;

public class Invoker {
	private Command comando;
	
	public Invoker(Command comando) {
		this.comando = comando;
	}
	
	public void run() {
		comando.execute();
	}

}
