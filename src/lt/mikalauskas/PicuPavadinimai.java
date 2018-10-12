package lt.mikalauskas;

public class PicuPavadinimai {

	private String studentiskaPica;
	private String italiskaPica;
	private String vegetariskaPica;
	private String skaniojiPica;
	private String amerikietiskaPica;
	private String vistienosPica;
	private static String uzsakomaPica;
	private static double kaina;

	public String getStudentiskaPica() {
		return studentiskaPica;
	}

	public void setStudentiskaPica(String studentiskaPica) {
		this.studentiskaPica = studentiskaPica;
	}

	public String getItaliskaPica() {
		return italiskaPica;
	}

	public void setItaliskaPica(String italiskaPica) {
		this.italiskaPica = italiskaPica;
	}

	public String getVegetariskaPica() {
		return vegetariskaPica;
	}

	public void setVegetariskaPica(String vegetariskaPica) {
		this.vegetariskaPica = vegetariskaPica;
	}

	public String getSkaniojiPica() {
		return skaniojiPica;
	}

	public void setSkaniojiPica(String skaniojiPica) {
		this.skaniojiPica = skaniojiPica;
	}

	public String getAmerikietiskaPica() {
		return amerikietiskaPica;
	}

	public void setAmerikietiskaPica(String amerikietiskaPica) {
		this.amerikietiskaPica = amerikietiskaPica;
	}

	public String getVistienosPica() {
		return vistienosPica;
	}

	public void setVistienosPica(String vistienosPica) {
		this.vistienosPica = vistienosPica;
	}

	public String getUzsakomaPica() {
		return uzsakomaPica;
	}

	public void setUzsakomaPica(String uzsakomaPica) {
		this.uzsakomaPica = uzsakomaPica;
	}

	public String priskirtiPavadinimaStudentiskaPica() {
		this.setStudentiskaPica("STUDENTISKA");
		return studentiskaPica;
	}

	public String priskirtiPavadinimaItaliskaPica() {
		this.setItaliskaPica("ITALISKA");
		return italiskaPica;
	}

	public String priskirtiPavadinimaVegetariskaPica() {
		this.setVegetariskaPica("VEGETARISKA");
		return vegetariskaPica;
	}

	public String priskirtiPavadinimaSkaniojiPica() {
		this.setSkaniojiPica("SKANIOJI");
		return skaniojiPica;
	}

	public String priskirtiPavadinimaAmerikietiskaPica() {
		this.setAmerikietiskaPica("AMERIKIETISKA");
		return amerikietiskaPica;
	}

	public String priskirtiPavadinimaVistienosPica() {
		this.setVistienosPica("VISTIENOS");
		return vistienosPica;
	}

	public void priskirtiPavadinimaUzsakomaPica(String uzsakomaPica) {
		this.setUzsakomaPica(uzsakomaPica);
	}

	public double gautiKaina() {
		if (uzsakomaPica == "STUDENTISKA") {
			kaina = 5.99;
		} else if (uzsakomaPica == "ITALISKA") {
			kaina = 5.23;
		} else if (uzsakomaPica == "VEGETARISKA") {
			kaina = 5.05;
		} else if (uzsakomaPica == "SKANIOJI") {
			kaina = 5.64;
		} else if (uzsakomaPica == "AMERIKIETISKA") {
			kaina = 5.80;
		} else if (uzsakomaPica == "VISTIENOS") {
			kaina = 5.55;
		}
		return kaina;
	}

}
