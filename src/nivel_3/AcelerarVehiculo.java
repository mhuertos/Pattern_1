package nivel_3;

public class AcelerarVehiculo implements Command{
	
	private IVehicle vehicle;
	
	public AcelerarVehiculo(IVehicle v) {
		this.vehicle = v;
	}

	@Override
	public void execute() {
		vehicle.accelerar();
		
	}
	
	
}
