package nivel_3;

public class Coche implements IVehicle{

	@Override
	public void arrancar() {
		System.out.println("El coche arranca.");	
	}

	@Override
	public void accelerar() {
		System.out.println("el coche accelera.");
	}

	@Override
	public void frenar() {
		System.out.println("el coche frena.");
	}
}
