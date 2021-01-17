
package masinos;

public class SportineMasina extends Masina {

    private boolean spoileris;
//    SportineMasina
//    ji turi spoileri, jei true pakeltas false nuleistas
//    grazuok()jei metode jei spoileris nuleistas - gazuoja 2 kart greiciau
//    stabdyk()jei spoileris pakeltas - stabdo 2kartus greiciau
//    jei sportine tai 
//    Math.random > 0.5 spoilerio pozicija pasikei padarys nuleista arba pakels
//    50% tikimybe kad pasikeis spolerio pozicija
//    

    public SportineMasina(String pav, int maxGreitis) {
        super(pav, maxGreitis);
        this.spoileris = true;
    }
   public boolean getSpoileris() {
       return this.spoileris;
   }
   public boolean spoilerioPozicija(int kiek) {
       return true;
       
   }
}
