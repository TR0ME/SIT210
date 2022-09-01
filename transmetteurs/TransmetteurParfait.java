package transmetteurs;

import java.util.LinkedList;
import information.*;
import information.Information;
import information.InformationNonConformeException;
import sources.SourceInterface;
import destinations.DestinationInterface;

public class TransmetteurParfait extends Transmetteur<Boolean, Boolean> {

	/**
	 * la liste des composants destination connectÃ©s
	 */

	public TransmetteurParfait() {
		super();
	}

	@Override
	public void recevoir(Information<Boolean> information) throws InformationNonConformeException {
		// TODO Auto-generated method stub
		if (information.nbElements() < 6)
			throw new InformationNonConformeException("Message de taille inférieure à 6 bits");
		this.informationRecue = information;
		this.emettre();
	}

	@Override
	public void emettre() throws InformationNonConformeException {
		// TODO Auto-generated method stub
		if (this.informationRecue.nbElements() < 6)
			throw new InformationNonConformeException("Message de taille inférieure à 6 bits");
		
		this.informationEmise = this.informationRecue;
		
		for (DestinationInterface<Boolean> destinationsConnectee : destinationsConnectees) {
			destinationsConnectee.recevoir(this.informationEmise);
		}
		// TODO faire en sorte que le signal soit bruité

	}

}
