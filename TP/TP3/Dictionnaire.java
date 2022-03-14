package TP.TP3;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * La classe Dictionnaire permet de représenter le dictionnaire du scrabble, qui
 * vous sera
 * nécessaire pour vérifier que vos mots sont valides.
 * Ce dictionnaire implémente l'interface Serializable. Celle-ci sert simplement
 * à stocker le dictionnaire sur le disque
 * afin de le mettre à votre disposition. Le contenu du dictionnaire a été
 * généré pour vous et l'ensemble des mots sont
 * stockés dans l'ArrayList dictionnaire. Le dictionnaire est lu depuis un
 * fichier grâce à la méthode readFile appelée
 * dans la classe Scrabble
 * 
 * A vous de compléter cette classe pour implémenter les méthodes de l'interface
 * InterfaceDictionnaire
 * 
 * @author Thierry Delot
 *
 */
public class Dictionnaire implements Serializable, InterfaceDictionnaire {

	private static final long serialVersionUID = -5726816061186920548L;
	private ArrayList<String> dictionnaire; // ArrayList contenant les mots que vous pouvez utiliser pour former des
											// mots, ce dictionnaire est chargé automatiquement depuis un fichier dans
											// le constructeur

	public Dictionnaire() {
		dictionnaire = new ArrayList<String>();
		this.lireDictionnaire("newDico.txt");
	}

	public static Dictionnaire readFile(String file) throws Exception {

		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(file));
		System.out.println("fichier ouvert...");
		Dictionnaire d = (Dictionnaire) objIn.readObject();
		System.out.println(d);
		objIn.close();
		return d;
	}

	public static void saveFile(Dictionnaire o, String file) {
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file));
			objOut.writeObject(o);
			objOut.flush();
			objOut.close();
		} catch (Exception e) {

		}
	}

	public void lireDictionnaire(String fichier) {

		try {
			File f = new File(fichier);

			try (BufferedReader b = new BufferedReader(new FileReader(f))) {
				String readLine = "";

				while ((readLine = b.readLine()) != null) {
					System.out.println(readLine);
					dictionnaire.add(readLine);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean contientMot(String mot) {
		boolean contient = false;

		try {
			File f = new File("/home/arthur/cours/2eme année/java/TP/TP3/newdico.txt");

			BufferedReader b = new BufferedReader(new FileReader(f));

			
			String line = null;
			while ((line = b.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					if (st.nextToken().equals(mot)) {
						return contient = true;
					}
				}
			}

			b.close();
			return contient;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	public void afficherContenu() {

		for (int i = 0; i < dictionnaire.size(); i++) {
			System.out.println(dictionnaire.get(i));
		}

	}

	public void afficherContenu(char l) {

		try {
			File f = new File("newdico.txt");

			BufferedReader b = new BufferedReader(new FileReader(f));

			String readLine = "";

			while ((readLine = b.readLine()) != null) {
				char lettre = readLine.charAt(0);
				if (lettre == l) {
					System.out.println(readLine);

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int taille() {
		return dictionnaire.size();

	}

}
