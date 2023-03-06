
/**
 * Deklariramo javni razred, ki razširja razred Steklenica
 * @name PivskaSteklenica.java
 * @authorORLOV ALEXANDER
 * 
 */
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca{

        // Vse lastnosti od nadrazreda se prenesejo
        // Deklariramo nove lastnosti
        private String znamka;
        private boolean jePovratna;
        private double temperatura;        // v stopnijah celzija
		private double stopnjaAlkohola;
        
        /**
         * Javni konstruktor ustvari nov objekt tipa PivskaSteklenica (predvidevamo, da ni povratna)
         * @param z - znamka
         * @param k - kapaciteta
         * @param s - stopnja Alkohola
         * @return nov objekt
         */
		public PivskaSteklenica(String z, int k, double s) {
        
                // Tukaj ne sme biti nič drugega
                
                // Pokličemo konstruktor nadrazreda - ustvarimo prazno steklenico
                super(k);
                
                // Napolnimo steklenico - pokličemo metodo, deklarirano v nadrazredu
                odpri();
                try {
                        napolni(k, "Pivo");
                }
                catch(Exception e) {
                        System.out.println("Napaka pri uvodnem polnjenju nove steklenice: " + e);
                }
                zapri();
                
                // Inicializiramo še ostale lastosti
                znamka = z;
                jePovratna = false;
                temperatura = 22.0;
				stopnjaAlkohola = s;
                
        }
        

       /**
        * Javna metoda, ki ohladi pivo za želeno temperaturo [st. C]
        * @param t - temperatura
        */
		public void ohladi(double t) {
        
                System.out.print("Hladim pivo " + znamka + " iz " + temperatura + " na ");
        
                // Znižamo temperaturo piva
                temperatura -= t;
                
                System.out.println(temperatura + " st. C.");
        
        }

        /**
         * Javna getter metoda, ki vrne znamko in količino
         * @return niz z znamko in količino vsebine
         */
		public String getZnamkaKolicina() {
        
                return znamka + ", " + getKolicinaVsebine() + " ml";
        
        }
		/**
		 * @return stopnjaAlkohola
		 */
		public double getStopnjaAlkohola(){
			return stopnjaAlkohola;
		}
}
