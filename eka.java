class Sovellus{
	private ArrayList<Asiakas> kayttajat;
	private ArrayList<Esiintyja> esiintyjat;
	private ArrayList<Varaus> varaukset;
	private Asiakas kayttaja;
	
}
class Varaus{
	private int id;
	private Tilaisuus tilaisuus;
	private Asiakas varaaja;
	private Esiintyja esiintyja;

}

class Asiakas{
	private int id;
	private String nimi;
	private String salasana;
	private String sahkoposti;
}

class Esiintyja{
	private int id;
	private String nimi;
	private double provisio;
	private String erikoistuminen 
	private String tilinumero
}

class Tilaisuus{
	private id;
	private String nimi;
	private String tyyppi;	
	private String paivamaara;
	private String aika;

}


