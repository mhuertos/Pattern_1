package nivel_3;

public class Bicicleta implements IVehicle{

	@Override
	public void arrancar() {
		System.out.println("La bicicleta arrenca");
	}

	@Override
	public void accelerar() {
		System.out.println("la bicicleta accelera");
	}

	@Override
	public void frenar() {
		System.out.println("la bicicleta frena");
	}
	
}
