package transmetteurs;

import java.util.LinkedList;
import information.*;
import information.Information;
import information.InformationNonConformeException;
import sources.SourceInterface;
import destinations.DestinationInterface;

public class TransmetteurParfait<T> extends Transmetteur {

	/**
	 * la liste des composants destination connectÃ©s
	 */
	

	public TransmetteurParfait() {
		
	}

	@Override
	public void recevoir(Information information) throws InformationNonConformeException {
		// TODO Auto-generated method stub
		this.informationRecue = information;
		
	}

	@Override
	public void emettre() throws InformationNonConformeException {
		// TODO Auto-generated method stub
		this.informationEmise = this.informationRecue ;
		//TODO faire en sorte que le signal soit bruité
		
	}

	
}
