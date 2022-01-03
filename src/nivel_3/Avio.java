package nivel_3;

public class Avio implements IVehicle{

	@Override
	public void arrancar() {
		System.out.println("L'avió arrenca");
	}

	@Override
	public void accelerar() {
		System.out.println("L'avió accelera");
	}

	@Override
	public void frenar() {
		System.out.println("L'avió frena.");
	}
	
}
