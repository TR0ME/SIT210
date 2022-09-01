package sources;

import destinations.DestinationInterface;
import information.Information;
import information.InformationNonConformeException;
import java.math.*;
import java.util.*;

public class SourceAleatoire extends Source {
	/**
	 * Création du constructeur pour un message random
	 * Taille du message comprise entre 0 et 1000
	 * définition de si symbole est un 0 ou un 1 en fonction du random de nb
	 */
	Random rand;
	
	public SourceAleatoire() {
		rand = new Random();
		informationGeneree = new Information<Boolean>();
		int nombre = genererInt(7,1000, rand);
		System.out.println(nombre);
		for (int i = 0; i < nombre; i++) {
			informationGeneree.add(genererbool(rand));
		}
	}
	public SourceAleatoire(int taille) {
		rand = new Random();
		informationGeneree = new Information<Boolean>();
		for (int i = 0; i < taille; i++) {
			informationGeneree.add(genererbool(rand));
		}
	}
	
	public SourceAleatoire(int nbBitsMess, Long seed) {
		rand = new Random(seed);
		
	}
	
	
	int genererInt(int borneInf, int borneSup, Random random){
		  
		   int nb;
		   nb = borneInf+random.nextInt(borneSup-borneInf);
		   return nb;
		}

	boolean genererbool(Random rand){
		   return rand.nextBoolean();
		}
}
