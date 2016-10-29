import java.util.ArrayList;
import java.util.Vector;

public class Data {
	private ArrayList<Vector<String>> Source;

	public Data(ArrayList<Vector<String>> source) {
		super();
		Parseur Ini = new Parseur();

		Source = Parseur.Parsing().getSource();
	}

	public ArrayList<Vector<String>> getSource() {
		return Source;
	}

	public void setSource(ArrayList<Vector<String>> source) {
		Source = source;
	}

}