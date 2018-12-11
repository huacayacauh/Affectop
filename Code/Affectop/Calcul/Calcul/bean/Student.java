package calcul;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * La classe représentant un étudiant 
 * @author VALLET Mat
 */

public class Student {
	public int numEtu;
	/** 
	 * le mail de l'étudiant
	 */
	public String mail;
	/**
	 * les options ou l'étudiant a été accepté
	 */
	public Option [] affected;
	/**
	 * la liste des preferences del'étudiant par ordre decroissant d'interet pour chaques jours 
	 */
	public ArrayList<LinkedList<Option>> preferences;
	
	/**
	 * le constructeur de la classe student
	 * @param mail le mail de l'étudiant
	 * @param preferences les prefereces de l'etudiants par jours
	 * @return un etudiant
	 */
	public Student(String mail,ArrayList<LinkedList<Option>> preferences,int nbDays, int numEtu) {
		this.mail = mail;
		this.preferences = preferences;
		this.affected = new Option[nbDays];
		this.numEtu = numEtu;
	}

	public Student(String mail,ArrayList<LinkedList<Option>> preferences,int nbDays) {
		this.mail = mail;
		this.preferences = preferences;
		this.affected = new Option[nbDays];
		this.numEtu = 0;
	}

	
	public String toString() {
		return mail+" "+preferences+" ";
	}
	/**
	 * Donne la satisfaction de l'étudiant définie par
	 * s = somme pour tous les jours de l'indice de l'option affectée ce jour là 
	 * @return la satisfaction
	 */
	public int getSatisfaction() {
		int satis = 0;
		for(int d = 0 ; d < affected.length; d ++) {
			satis += preferences.get(d).size();
			satis -= preferences.get(d).indexOf(affected[d]);
		}
		return satis * satis;
	}
	
	LinkedList<Option> getPreferences(int d) {
		return this.preferences.get(d);
	}
	
	/**
	 * @param opt
	 * @return true if the student is affected to this option
	 */
	public boolean isAffectedTo(Option opt) {
		return affected[opt.day] == opt;
	}
	
	/**
	 * remove all affected option from this student
	 */
	public void clearAffected() {
		for(int d = 0; d < affected.length; d++)
			affected[d] = null;
	}

}
