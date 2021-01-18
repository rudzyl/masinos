
package masinos;

public class Masinos {
    
    public static void main(String[] args) {
        Masina[] race = {
            //masinu masyvas
            new Masina("Pirma", 120),
            new Masina("Antra", 160),
            new Masina("Trecia", 180),
            new Masina("Ketvirta", 200),
            new SportineMasina("Porshe", 300),
            new SportineMasina("McLaren", 300)
        };
        
       //kas kiek km isspausdinti kuri masina pirmauja 
       int interm = 100;
       boolean doRace = true;
       while(doRace){
        //cars moves 10km
            for(int i = 0; i < race.length; i++) {
                // jei tai sportine masina 50% tikimybe kad pasikes spoilerio pozicija
                if(race[i] instanceof SportineMasina) {
                    if(Math.random()< 0.5) {
                        //ziurima kaip i sportine masina is masinu sarasa
                        ((SportineMasina)race[i]).spoilerioPozicija();
                    }
                }
                double sansas = Math.random();
                if (sansas < 0.3) {
                    race[i].stabdyk((int) (Math.random() * 5 + 1));
                } else if (sansas < 0.8) {
                    race[i].gazuok((int) (Math.random() * 10 + 1));
                }
                race[i].vaziuok();
            }
            //ar masina nuvaziavo ir kelinta masina pirmauja
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for(int i = 0; i < race.length; i++) {
                if(race[i].getKelias() > intermWinner) {
                    intermWinner = i;
                    intermWinnerKm = race[i].getKelias();
                }
                if(race[i].getKelias() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if(printInterm) {
                for(int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getKelias() + "\t");
                }
                System.out.println();
                System.out.println("Pirmauja:" + " " + race[intermWinner]);
            }
            //ar kuri nors masina pasieke finisa 
            for(int i = 0; i < race.length; i++) {
                if (race[i].getKelias() >= 1000) {
                    doRace = false;
                    break;
                }
            }
        } 
       //rusiavimas nuo didziausio iki maziausio
        for(int i = 0; i < race.length - 1; i++) {
            for(int j = i + 1; j < race.length; j++) {
                if(race[i].getKelias() < race[j].getKelias()) {
                        Masina tmp = race[i];
                        race[i] = race[j];
                        race[j] = tmp;
                    }
                }  
            }
        for(int i = 0; i < race.length; i++) {
            System.out.println(race[i]);
        }
    }
}
