
package masinos;

public class Masinos {
    
    public static void main(String[] args) {
       int[] masinos = new int [8];
       //milestone kas 100km issausdina 
       int interm = 100;
       boolean doRace = true;
       while(doRace){
        //cars moves 10km
            for(int i = 0; i < masinos.length; i++) {
                masinos[i] += Math.random() * 10 + 1;
            }
            //isspausdinimas kas 100km kiek kuri nuvaziavo
            boolean printInterm = false;
            for(int i = 0; i < masinos.length; i++) {
                if(masinos[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if(printInterm) {
                for(int i = 0; i < masinos.length; i++) {
                    System.out.print(masinos[i] + "\t");
                }
                System.out.println();
            }
            //ar nuline pasieke 1000km? visas tikrina 
            for(int i = 0; i < masinos.length; i++) {
                if (masinos[i] >= 1000) {
                    System.out.println("Laimejo " + (i+1)+" masina");
                    doRace = false;
                    break;
                }
            }
        } 
       //rusiavimas nuo didziausio iki maziausio
        for(int i = 0; i < masinos.length - 1; i++) {
            for(int j = i+1; j < masinos.length; j++) {
                if(masinos[i] < masinos[j]) {
                        int pirmaujanti = masinos[i];
                        masinos[i] = masinos[j];
                        masinos [j] = pirmaujanti;
                    }
                }  
            }
        for(int i = 0; i < masinos.length; i++) {
            System.out.println(masinos[i]);
        }
    }
}
