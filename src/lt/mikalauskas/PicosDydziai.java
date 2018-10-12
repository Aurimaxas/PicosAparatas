package lt.mikalauskas;

public class PicosDydziai {

	private String mazaPica;
	private String vidutinePica;
	private String didelePica;
	private static String uzsakomaPica;

	public String getMazaPica() {
		return mazaPica;
	}

	public void setMazaPica(String mazaPica) {
		this.mazaPica = mazaPica;
	}

	public String getVidutinePica() {
		return vidutinePica;
	}

	public void setVidutinePica(String vidutinePica) {
		this.vidutinePica = vidutinePica;
	}

	public String getDidelePica() {
		return didelePica;
	}

	public void setDidelePica(String didelePica) {
		this.didelePica = didelePica;
	}

	public static String getUzsakomaPica() {
		return uzsakomaPica;
	}

	public static void setUzsakomaPica(String uzsakomaPica) {
		PicosDydziai.uzsakomaPica = uzsakomaPica;
	}

	public String priskirtiPavadinimaMazaPica() {
		this.setMazaPica("SMALL");
		return mazaPica;
	}

	public String priskirtiPavadinimaVidutinePica() {
		this.setVidutinePica("MEDIUM");
		return vidutinePica;
	}

	public String priskirtiPavadinimaDidelePica() {
		this.setDidelePica("LARGE");
		return didelePica;
	}

	public void priskirtiPavadinimaUzsakomaPica(String uzsakomaPica) {
		this.setUzsakomaPica(uzsakomaPica);
	}

}
