package nivel_3;

public class FrenarVehiculo implements Command{
	
	private IVehicle vehiculo;
	
	public FrenarVehiculo(IVehicle v) {
		this.vehiculo = v;
	}

	@Override
	public void execute() {
		vehiculo.frenar();
		
	}
	
	

}
