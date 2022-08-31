package information;

public class InformationNonConformeException extends Exception {

    public InformationNonConformeException() {
	super();
    }
   
    public InformationNonConformeException(String motif) {
	super(motif);
    }
}
