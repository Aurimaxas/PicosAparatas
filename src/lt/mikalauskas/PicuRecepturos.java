package lt.mikalauskas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PicuRecepturos {

	public static final double SMALL_PICOS_KOEFICIENTAS = 0.7;
	public static final double MEDIUM_PICOS_KOEFICIENTAS = 1.0;
	public static final double LARGE_PICOS_KOEFICIENTAS = 1.3;

	private static List<Integer> studentiskaPicaReceptura = new ArrayList<Integer>();
	private static List<Integer> italiskaPicaReceptura = new ArrayList<Integer>();
	private static List<Integer> vegetariskaPicaReceptura = new ArrayList<Integer>();
	private static List<Integer> skaniojiPicaReceptura = new ArrayList<Integer>();
	private static List<Integer> amarikietiskaPicaReceptura = new ArrayList<Integer>();
	private static List<Integer> vistienosPicaReceptura = new ArrayList<Integer>();
	public static List<Integer> uzsakomaPicaReceptura = new ArrayList<Integer>();
	private static double koeficientasUzsakomaiPicai;

	public static List<Integer> studentiskaPriskirtiReceptura() {
		studentiskaPicaReceptura.add(1);// padai
		studentiskaPicaReceptura.add(0);// desra
		studentiskaPicaReceptura.add(3);// kumpis
		studentiskaPicaReceptura.add(0);// vistiena
		studentiskaPicaReceptura.add(5);// pievagrybiai
		studentiskaPicaReceptura.add(3);// suris
		studentiskaPicaReceptura.add(0);// pomidorai
		studentiskaPicaReceptura.add(2);// padazas

		return studentiskaPicaReceptura;
	}

	public static List<Integer> italiskaPriskirtiReceptura() {
		italiskaPicaReceptura.add(1);// padai
		italiskaPicaReceptura.add(4);// desra
		italiskaPicaReceptura.add(0);// kumpis
		italiskaPicaReceptura.add(0);// vistiena
		italiskaPicaReceptura.add(2);// pievagrybiai
		italiskaPicaReceptura.add(5);// suris
		italiskaPicaReceptura.add(3);// pomidorai
		italiskaPicaReceptura.add(3);// padazas

		return italiskaPicaReceptura;
	}

	public static List<Integer> vegetariskaPriskirtiReceptura() {
		vegetariskaPicaReceptura.add(1);// padai
		vegetariskaPicaReceptura.add(0);// desra
		vegetariskaPicaReceptura.add(0);// kumpis
		vegetariskaPicaReceptura.add(0);// vistiena
		vegetariskaPicaReceptura.add(6);// pievagrybiai
		vegetariskaPicaReceptura.add(4);// suris
		vegetariskaPicaReceptura.add(4);// pomidorai
		vegetariskaPicaReceptura.add(2);// padazas

		return vegetariskaPicaReceptura;
	}

	public static List<Integer> skaniojiPriskirtiReceptura() {
		skaniojiPicaReceptura.add(1);// padai
		skaniojiPicaReceptura.add(4);// desra
		skaniojiPicaReceptura.add(0);// kumpis
		skaniojiPicaReceptura.add(0);// vistiena
		skaniojiPicaReceptura.add(2);// pievagrybiai
		skaniojiPicaReceptura.add(3);// suris
		skaniojiPicaReceptura.add(5);// pomidorai
		skaniojiPicaReceptura.add(3);// padazas

		return skaniojiPicaReceptura;
	}

	public static List<Integer> amerikietiskaPriskirtiReceptura() {
		amarikietiskaPicaReceptura.add(1);// padai
		amarikietiskaPicaReceptura.add(2);// desra
		amarikietiskaPicaReceptura.add(4);// kumpis
		amarikietiskaPicaReceptura.add(0);// vistiena
		amarikietiskaPicaReceptura.add(2);// pievagrybiai
		amarikietiskaPicaReceptura.add(4);// suris
		amarikietiskaPicaReceptura.add(0);// pomidorai
		amarikietiskaPicaReceptura.add(2);// padazas

		return amarikietiskaPicaReceptura;
	}

	public static List<Integer> vistienosPriskirtiReceptura() {
		vistienosPicaReceptura.add(1);// padai
		vistienosPicaReceptura.add(0);// desra
		vistienosPicaReceptura.add(0);// kumpis
		vistienosPicaReceptura.add(6);// vistiena
		vistienosPicaReceptura.add(5);// pievagrybiai
		vistienosPicaReceptura.add(4);// suris
		vistienosPicaReceptura.add(0);// pomidorai
		vistienosPicaReceptura.add(3);// padazas

		return vistienosPicaReceptura;
	}

	public static List<Integer> uzsakomaiPicaiPriskirtiReceptura(String uzsakomaPica) {
		if (uzsakomaPica == "STUDENTISKA") {
			uzsakomaPicaReceptura = studentiskaPicaReceptura;
			return uzsakomaPicaReceptura;
		}
		if (uzsakomaPica == "ITALISKA") {
			uzsakomaPicaReceptura = italiskaPicaReceptura;
			return uzsakomaPicaReceptura;
		}
		if (uzsakomaPica == "VEGETARISKA") {
			uzsakomaPicaReceptura = vegetariskaPicaReceptura;
			return uzsakomaPicaReceptura;
		}
		if (uzsakomaPica == "SKANIOJI") {
			uzsakomaPicaReceptura = skaniojiPicaReceptura;
			return uzsakomaPicaReceptura;
		}
		if (uzsakomaPica == "AMERIKIETISKA") {
			uzsakomaPicaReceptura = amarikietiskaPicaReceptura;
			return uzsakomaPicaReceptura;
		}
		if (uzsakomaPica == "VISTIENOS") {
			uzsakomaPicaReceptura = vistienosPicaReceptura;
			return uzsakomaPicaReceptura;
		}

		return vistienosPicaReceptura;
	}

	public void priskirtiKoeficientaUzsakomaiPicai(String uzsakomaPica) {
		if (uzsakomaPica == "SMALL") {
			this.koeficientasUzsakomaiPicai = SMALL_PICOS_KOEFICIENTAS;
		} else if (uzsakomaPica == "MEDIUM") {
			this.koeficientasUzsakomaiPicai = MEDIUM_PICOS_KOEFICIENTAS;
		} else if (uzsakomaPica == "LARGE") {
			this.koeficientasUzsakomaiPicai = LARGE_PICOS_KOEFICIENTAS;
		}

	}

	public static double getKoeficientasUzsakomaiPicai() {
		return koeficientasUzsakomaiPicai;
	}

	public static void setKoeficientasUzsakomaiPicai(double koeficientasUzsakomaiPicai) {
		PicuRecepturos.koeficientasUzsakomaiPicai = koeficientasUzsakomaiPicai;
	}

}
