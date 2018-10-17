package Calcul;

import java.util.List;

public class Choix {
	private List<Option> options;
	private List<Eleve> eleves;

	public Choix(List<Option> options, List<Eleve> eleves) {
		this.options = options;
		this.eleves = eleves;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

}
