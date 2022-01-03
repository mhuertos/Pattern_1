package nivel_3;

public class ArrancarVehiculo implements Command{
	
	private IVehicle vehicle;
	
	public ArrancarVehiculo(IVehicle v) {
		this.vehicle = v;
	}

	@Override
	public void execute() {
		vehicle.arrancar();
		
	}
	
	
}
