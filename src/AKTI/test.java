package AKTI;

public class test {

	public static void main(String[] args) {
		Sud s=new Sud("prvi opstinki");
		Osoba m=new Osoba("marko");
		Osoba z=new Osoba("zoran");
		Osoba a=new Osoba("aca");
		
		int brojL1=s.prikaziBrojNovoKreiranogVlasnickogList(z);
		int brojKU=s.idkpugovor(m, z);
		System.out.println(brojL1);//id mu je 1,tako smo stavili jer se prvi kreira
	/*	try {
			s.pravljenjeDuplikataVlasnickogListaZa(z,brojL1).postajeNeVazeci();
		} catch (GnemaPravo e) {
			e.printStackTrace();
		}*/
		int brojL2=s.prikaziBrojNovoKreiranogVlasnickogList(m);//marko postaje vlasnik u vlbr.3
		try {
			System.out.println(s.pravljenjeDuplikataUgovoraZadate(z, brojKU));
			System.out.println(s.pravljenjeDuplikataUgovoraZadate(m, brojKU));
			System.out.println(s.pravljenjeDuplikataVlasnickogListaZa(z, brojL1));
			System.out.println(s.pravljenjeDuplikataVlasnickogListaZa(m, brojL2));
		} catch (GnemaPravo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		VlasnickiList vl=new VlasnickiList(new Osoba("aca"));
		System.out.println(vl);
		KupoprodajniUgovor kk=new KupoprodajniUgovor(m, m);
	System.out.println(kk);
		
	}
}
