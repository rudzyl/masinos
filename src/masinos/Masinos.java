
package masinos;

public class Masinos {
    
    public static void main(String[] args) {
        Masina m1 = new Masina("Pirma", 140);
        Masina m2 = new Masina("Antra", 160);
        Masina m3 = new Masina("Trecia", 180);
        Masina m4 = new Masina("Ketvirta", 200);
        Masina[] race = {m1, m2, m3, m4};
//            new SportineMasina("spr1", 300)
//            new SportineMasina("spr2",300)
        
       //int[] masinos = new int [8];//objektai masinos negali but int 
       //milestone kas 100km issausdina 
       int interm = 100;
       boolean doRace = true;
       while(doRace){
        //cars moves 10km
            for(int i = 0; i < race.length; i++) {
                race[i] += Math.random() * 10 + 1;
            }
            //isspausdinimas kas 100km kiek kuri nuvaziavo
            boolean printInterm = false;
            for(int i = 0; i < race.length; i++) {
                if(masinos[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if(printInterm) {
                for(int i = 0; i < race.length; i++) {
                    System.out.print(masinos[i] + "\t");
                }
                System.out.println();
            }
            //ar nuline pasieke 1000km? visas tikrina 
            for(int i = 0; i < race.length; i++) {
                if (masinos[i] >= 1000) {
                    System.out.println("Laimejo " + (i+1)+" masina");
                    doRace = false;
                    break;
                }
            }
        } 
       //rusiavimas nuo didziausio iki maziausio
        for(int i = 0; i < race.length - 1; i++) { //reik pakeist
            for(int j = i+1; j < race.length; j++) {
                if(masinos[i] < masinos[j]) {
                        int pirmaujanti = masinos[i];
                        masinos[i] = masinos[j];
                        masinos [j] = pirmaujanti;
                    }
                }  
            }
        for(int i = 0; i < race.length; i++) {
            System.out.println(masinos[i]);
        }
    }
}
