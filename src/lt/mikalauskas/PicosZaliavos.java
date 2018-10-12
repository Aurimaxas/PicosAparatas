package lt.mikalauskas;

import java.util.ArrayList;
import java.util.List;

public class PicosZaliavos {

	public static final int NAUDOJIMU_SKAICIAUS_RIBA = 20;

	private static int padas;
	private static int desra;
	private static int kumpis;
	private static int vistiena;
	private static int pievagrybiai;
	private static int suris;
	private static int pomidorai;
	private static int padazas;
	private static List<Integer> produktai = new ArrayList<Integer>();

	public static List<Integer> produktuListas() {
		produktai.add(padas);
		produktai.add(desra);
		produktai.add(kumpis);
		produktai.add(vistiena);
		produktai.add(pievagrybiai);
		produktai.add(suris);
		produktai.add(pomidorai);
		produktai.add(padazas);

		return produktai;
	}

	public void papildytiPadu(int padas) {
		this.setPadas(padas);
	}

	public void papildytiDesros(int desra) {
		this.setDesra(desra);
	}

	public void papildytiKumpio(int kumpis) {
		this.setKumpis(kumpis);
	}

	public void papildytiVistienos(int vistiena) {
		this.setVistiena(vistiena);
	}

	public void papildytiPievagrybiu(int pievagrybiai) {
		this.setPievagrybiai(pievagrybiai);
	}

	public void papildytiSurio(int suris) {
		this.setSuris(suris);
	}

	public void papildytiPomidoru(int pomidorai) {
		this.setPomidorai(pomidorai);
	}

	public void papildytiPadazo(int padazas) {
		this.setPadazas(padazas);
	}

	public static String kopijaPadas() {
		String kopijaPadas = Integer.toString(padas);
		return kopijaPadas;
	}

	public static String kopijaDesra() {
		String kopijaDesra = Integer.toString(desra);
		return kopijaDesra;
	}

	public static String kopijaKumpis() {
		String kopijaKumpis = Integer.toString(kumpis);
		return kopijaKumpis;
	}

	public static String kopijaVistiena() {
		String kopijaVistiena = Integer.toString(vistiena);
		return kopijaVistiena;
	}

	public static String kopijaPievagrybiai() {
		String kopijaPievagrybiai = Integer.toString(pievagrybiai);
		return kopijaPievagrybiai;
	}

	public static String kopijaSuris() {
		String kopijaSuris = Integer.toString(suris);
		return kopijaSuris;
	}

	public static String kopijaPomidorai() {
		String kopijaPomidorai = Integer.toString(pomidorai);
		return kopijaPomidorai;
	}

	public static String kopijaPadazas() {
		String kopijaPadazas = Integer.toString(padazas);
		return kopijaPadazas;
	}

	public int getPadas() {
		return padas;
	}

	public void setPadas(int padas) {
		this.padas = padas;
	}

	public int getDesra() {
		return desra;
	}

	public void setDesra(int desra) {
		this.desra = desra;
	}

	public int getKumpis() {
		return kumpis;
	}

	public void setKumpis(int kumpis) {
		this.kumpis = kumpis;
	}

	public int getVistiena() {
		return vistiena;
	}

	public void setVistiena(int vistiena) {
		this.vistiena = vistiena;
	}

	public int getPievagrybiai() {
		return pievagrybiai;
	}

	public void setPievagrybiai(int pievagrybiai) {
		this.pievagrybiai = pievagrybiai;
	}

	public int getSuris() {
		return suris;
	}

	public void setSuris(int suris) {
		this.suris = suris;
	}

	public int getPomidorai() {
		return pomidorai;
	}

	public void setPomidorai(int pomidorai) {
		this.pomidorai = pomidorai;
	}

	public int getPadazas() {
		return padazas;
	}

	public void setPadazas(int padazas) {
		this.padazas = padazas;
	}

}
