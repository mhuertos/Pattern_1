package nivel_3;

public class App {

	public static void main(String[] args) {
		Command arranca_bici = new ArrancarVehiculo(new Bicicleta());
		arranca_bici.execute();
		Command accelera_bici = new AcelerarVehiculo(new Bicicleta());
		accelera_bici.execute();
		Command frena_bici = new FrenarVehiculo(new Bicicleta());
		frena_bici.execute();
		
		//////////////////////////////////////////////////////////////
		
		Command arranca_avio = new ArrancarVehiculo(new Avio());
		arranca_avio.execute();
		Command accelera_avio = new AcelerarVehiculo(new Avio());
		accelera_avio.execute();
		Command frena_avio = new FrenarVehiculo(new Avio());
		frena_avio.execute();
	}

}
