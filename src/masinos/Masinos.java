
package masinos;

public class Masinos {
     //nuvaziuotas kelias
    //kiekvieno ciklo metu visos masinos turi pavaziuoti nuo tarp 1 ir 1000 km random
    //lenktynes baigiasi kai bent viena nuvaziuoja 1000 km
    //kai baigias lenktynes masinos surusuojamos nuvaziuoto kelio mazejimo tvarka
    //toliausiai nuvaziavus, sarasas kiek kuri nuvaziavo kai yra pasiekta 1000km
    //nuvaziuoja kas 100km ir atspausdinam kiek nuvaziavo
    
    public static void main(String[] args) {
       int[] masinos = new int [8];
       boolean doRace = true;
       while(doRace){
        //cars moves 10km
        for(int i = 0; i < masinos.length; i++) {
            masinos[i] += Math.random() * 10 + 1;
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
       //rusiavimas
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
