package nivel_3;

public class Vaixell implements IVehicle{

	@Override
	public void arrancar() {
		System.out.println("El vaixell arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("El vaixell accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("el vaixell frena.");
		
	}
	
}
