package lt.mikalauskas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {

		PicosZaliavos pz = new PicosZaliavos();
		pz.papildytiPadu(5);
		pz.papildytiDesros(8);
		pz.papildytiKumpio(6);
		pz.papildytiVistienos(12);
		pz.papildytiPievagrybiu(10);
		pz.papildytiSurio(7);
		pz.papildytiPomidoru(8);
		pz.papildytiPadazo(14);

		PicosDydziai pd = new PicosDydziai();
		pd.priskirtiPavadinimaMazaPica();
		pd.priskirtiPavadinimaVidutinePica();
		pd.priskirtiPavadinimaDidelePica();

		PicuPavadinimai pp = new PicuPavadinimai();
		pp.priskirtiPavadinimaStudentiskaPica();
		pp.priskirtiPavadinimaItaliskaPica();
		pp.priskirtiPavadinimaVegetariskaPica();
		pp.priskirtiPavadinimaSkaniojiPica();
		pp.priskirtiPavadinimaAmerikietiskaPica();
		pp.priskirtiPavadinimaVistienosPica();

		PicuRecepturos pr = new PicuRecepturos();
		pr.studentiskaPriskirtiReceptura();
		pr.italiskaPriskirtiReceptura();
		pr.vegetariskaPriskirtiReceptura();
		pr.skaniojiPriskirtiReceptura();
		pr.amerikietiskaPriskirtiReceptura();
		pr.vistienosPriskirtiReceptura();

		EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
		ep.ekranas();

	}

}
