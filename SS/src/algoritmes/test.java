package algoritmes;

public class test {
	public static void main(String[] args) {
	    int eervorige;
	    int vorige;
	    int nieuwe;
	    eervorige = 1; // het eerste element uit de rij
	    vorige = 1; // het tweede element uit de rij
	    System.out.println(1);
	    System.out.println(1);
	    while (true)
	    {
	      nieuwe = eervorige+vorige; 
	      // het volgende getal in de rij is de som van het 
	      // eervorige en het vorige getal uit de rij
	      System.out.println(nieuwe); // dat afdrukken
	      eervorige = vorige;  // en `doorschuiven'
	      vorige = nieuwe;
	    }
	  }
	}
