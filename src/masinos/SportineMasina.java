
package masinos;

public class SportineMasina extends Masina {

    private boolean spoileris;
//    SportineMasina
//    ji turi spoileri, jei true pakeltas false nuleistas
//    grazuok()jei metode jei spoileris nuleistas - gazuoja 2 kart greiciau
//    stabdyk()jei spoileris pakeltas - stabdo 2kartus greiciau
//    Math.random > 0.5 spoilerio pozicija pasikei padarys nuleista arba pakels
//    50% tikimybe kad pasikeis spolerio pozicija
//    

    public SportineMasina(String pav, int maxGreitis) {
        super(pav, maxGreitis);
        this.spoileris = false;
    }
   public boolean getSpoileris() {
       return this.spoileris;
   }
   public void spoilerioPozicija() {
       this.spoileris = !this.spoileris; //keiciama reiksme
   }
   public void gazuok(int kiek) {
       if(!this.spoileris) {
           super.gazuok(kiek * 2);
       } else {
           super.gazuok(kiek);
       }
   }
   public void stabdyk(int kiek) {
       if(this.spoileris) {
           super.stabdyk(kiek * 2);
       } else {
           super.stabdyk(kiek);
       }
   }
   public String toString() {
       return "sportine" + super.toString();
   }
}
