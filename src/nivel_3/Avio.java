package nivel_3;

public class Avio implements IVehicle{

	@Override
	public void arrancar() {
		System.out.println("L'avi� arrenca");
	}

	@Override
	public void accelerar() {
		System.out.println("L'avi� accelera");
	}

	@Override
	public void frenar() {
		System.out.println("L'avi� frena.");
	}
	
}
