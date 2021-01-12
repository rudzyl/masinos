
package masinos;

public class Masinos {
     //nuvaziuotas kelias
    //kiekvieno ciklo metu visos masinos turi pavaziuoti nuo tarp 1 ir 10 km random
    //lenktynes baigiasi kai bent viena nuvaziuoja 1000 km
    //kai baigias lenktynes masinos surusuojamos nuvaziuoto kelio mazejimo tvarka
    //toliausiai nuvaziavus, sarasas kiek kuri nuvaziavo kai yra pasiekta 1000km
    //nuvaziuoja kas 100km ir atspausdinam kiek nuvaziavo
    
    public static void main(String[] args) {
       int[] masinos = new int [8];
       int pirmaujanti;
        for(int i = 0; i < masinos.length; i++) {
            masinos[i] = (int) (Math.random() * 1000 + 1);
            System.out.print(masinos[i] + " ");
        }
        for(int i =0; i < masinos.length - 1; i++) {
            for(int j = i+1; j < masinos.length; j++) {
                if(masinos[i] < masinos[j]) {
                    pirmaujanti = masinos[i];
                    masinos[i] = masinos[j];
                    masinos [j] = pirmaujanti;
                }
            }
        }
        System.out.println(" ");
        System.out.println("LAIMETOJA");
        for (int i=0; i < masinos.length; i++) {
            System.out.println(masinos[i] + " ");
        }
    }
    
}
