
package masinos;

public class Masina {
    
    //private 
    public String pav;
    //private 
    public int maxGreitis; //turis
    //private 
    public int kelias; //kiekis
    //private 
    public int greitis;
    
    public Masina(String pav, int maxGreitis) {
        this.pav = pav;
        this.maxGreitis = maxGreitis; //negali virsyti maxGreitis 
        this.kelias = 0;
        this.greitis = 0;//neigiamas greitis buti negali
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
        kelias -= kiek;
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
    jei sportine tai 
    Math.random > 0.5 spoilerio pozicija pasikei padarys nuleista arba pakels
    50% tikimybe kad pasikeis spolerio pozicija
    */
    /*
    SportineMasina
    ji turi spoileri, jei true pakeltas false nuleistas
    grazuok()jei metode jei spoileris nuleistas - gazuoja 2 kart greiciau
    stabdyk()jei spoileris pakeltas - stabdo 2kartus greiciau
    
    
    */
}
