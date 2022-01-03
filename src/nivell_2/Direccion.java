package nivell_2;

public class Direccion implements Dato{
	
	private String dir;
	
	public Direccion() {
	}

	
	@Override
	public String write() {
		return dir;
	}
	
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	public String getDir() {
		return dir;
	}
	
}
