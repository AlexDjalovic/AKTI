package AKTI;

public class KupoprodajniUgovor extends Akt {

	private Osoba kupac,prodavac;
	
	public KupoprodajniUgovor(Osoba kup,Osoba prod)  {
		
		if(kup==prod)
		
			try {
				throw new GIsteOsobe();
			} catch (GIsteOsobe e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.kupac=kup;
		this.prodavac=prod;
	}

	public Osoba getKupac() {
		return kupac;
	}

	public Osoba getProdavac() {
		return prodavac;
	}

	@Override
	public String naziv() {
		// TODO Auto-generated method stub
		return "KUPOPRODAJNI UGOVOR";
	}

	
	

}
