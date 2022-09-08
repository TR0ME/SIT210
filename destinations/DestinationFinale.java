package destinations;

import information.Information;
import information.InformationNonConformeException;

public class DestinationFinale extends Destination<Boolean> {

	public DestinationFinale() {
		super();
		//this.informationRecue = null;
	}
	@Override
	public void recevoir(Information information) throws InformationNonConformeException {
		// TODO Auto-generated method stub
		System.out.println(information);
		this.informationRecue = information;
	}
	

}
