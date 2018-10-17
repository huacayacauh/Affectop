package Calcul;

import java.util.ArrayList;
import java.util.List;

public class Eleve extends MembreAmu{
	private Promotion promotion;
	private List<Option>  optionValidé;
	private String numEtudiant;

	public Eleve(String nom, String prenom, String adresseMail, Promotion promotion, List<Option> optionValidé,
			String numEtudiant) {
		super(nom, prenom, adresseMail);
		this.promotion = promotion;
		if(optionValidé==null)
			optionValidé=new ArrayList<>();
		this.optionValidé = optionValidé;
		this.numEtudiant = numEtudiant;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public List<Option> getOptionValidé() {
		return optionValidé;
	}

	public void setOptionValidé(List<Option> optionValidé) {
		this.optionValidé = optionValidé;
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
	public String toString() {
		return "["+numEtudiant+"] a validé"+optionValidé.toString();
	}
}
