package sources;

import destinations.DestinationInterface;
import information.Information;
import information.InformationNonConformeException;

public class SourceFixe extends Source<Boolean> {


	public SourceFixe() {
		informationGeneree = new Information<Boolean>();
		informationGeneree.add(true);
		informationGeneree.add(false);
		informationGeneree.add(true);
		informationGeneree.add(true);
		informationGeneree.add(false);
		informationGeneree.add(true);

	}

	public SourceFixe(boolean[] message) {
		informationGeneree = new Information<Boolean>();
		for (int i = 0; i < message.length; i++) {
			informationGeneree.add(message[i]);
		}
		//nbElements = message.length;
	}
	
	public SourceFixe(String message) {
		informationGeneree = new Information<Boolean>();
		//char chare;
		for(char bits : message.toCharArray()) {
			if(bits == '1') {
				this.informationGeneree.add(true);
			}else {
				this.informationGeneree.add(false);
			}
		}
		/*for(int i = 0; i< message.length(); i++) {
			chare = message.charAt(i);
			if(Character.toString(chare).matches("1")) {
				informationGeneree.add(true);
			}else {
				informationGeneree.add(false);
			}
		}*/
		
	}
	
	
	

}
