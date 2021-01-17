
package masinos;

public class Masina {
    
    private String pav;
    private int maxGreitis; //turis
    private int kelias; //kiekis
    private int greitis;
    
    public Masina(String pav, int maxGreitis) {
        this.pav = pav;
        this.maxGreitis = maxGreitis;
        this.kelias = 0;
        this.greitis = 0;
    }
    public String getPav() {
        return this.pav;
    }
    public void setPav(String pav) {
        this.pav = pav;
    }
    public int getMaxGreitis() {
        return this.maxGreitis;
    }
    public int getKelias() {
        return this.kelias;
    }
    public int getGreitis() {
        return this.greitis;
    }
    public void vaziuok(int kiek) {
        kelias += kiek;
    }
    public void gazuok(int kiek) {
        if(kiek <= maxGreitis) {
            kelias += kiek;
        }
        if(kiek > maxGreitis) {
            kelias += maxGreitis;
        } 
        if(kiek < 0) {
            kelias = 0;
        }
    }
    public void stabdyk(int kiek) {
        if(kiek <= 0) {
            return;
        }
    }
    /*
    matodas
    void gazuok(int kiek)+
    void stabdyk(int kiek)+
    void vaziuok() kai iskvieciamas metodas vaziuok pavaziuoja kelias padideja per tiek koks yra masinos greitis 
    jei greitis 25 nuvaziuos 25km+
    
    sakom if( Math.random > 0.3) stabdys
    if else (Math.random > tarp 0.3 ir 0.8 gazuos
    else nekeis greicio
    30% tikimybe kad stabdys per 1-5 tikimybe
    50% tikimybe kad gazuos per 1-10
    20% tikimybe kad nekeis greicio
    */
}
