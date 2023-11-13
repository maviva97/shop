
import javax.swing.plaf.PanelUI;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class MagazinService {
    private Set<String> produse = new TreeSet<>();

    private Map<String, Integer> nrVanzariPerProdus = new TreeMap<>();

    private Map<String, Integer> preturi = new TreeMap<>();

    List<String> tranzactie = new ArrayList<>();
    private Integer cos;

    public void vinde(String produs) {
        if(produse.contains(produs)) {
            Integer nrVanzari = nrVanzariPerProdus.get(produs);
            if (nrVanzari == null) {
                nrVanzari = 0;
            }
            nrVanzari++;
            nrVanzariPerProdus.put(produs, nrVanzari);
            tranzactie.add(produs);
        } else {
            System.out.println("Produsul nu exista");
        }
    }

    public void afiseazaRaportNrVanzariPerProdus() {
        for (Map.Entry<String, Integer> entry  : nrVanzariPerProdus.entrySet()) {
            System.out.print("Produsul: " + entry.getKey());
            System.out.println(" Vanzari: " + entry.getValue());
        }
    }

    public void afisareTranzactii() {
        for (String produs: tranzactie) {
            System.out.print("Produs: " + produs);
            System.out.println(" Pret: " + preturi.get(produs));
        }
    }

    public void addPret(String produs, Integer pret) {
        produse.add(produs);
        preturi.put(produs, pret);
        System.out.println(preturi);
    }

    public int afisareSumaVanzariProdus(String produs) {
        int sumaVanzari = 0;
        for (String produsVandut : tranzactie) {
            if (produs.equals(produsVandut)) {
                sumaVanzari = sumaVanzari + preturi.get(produs);
            }
        }  System.out.println("Produsul " + produs + " suma: " + sumaVanzari);
        return sumaVanzari;

    }
    public int sumatot (){
        int sum=0;
        for (Map.Entry<String, Integer> entry  : nrVanzariPerProdus.entrySet()) {
            String key = entry.getKey();
            sum=sum+preturi.get(key)* entry.getValue() ;
        }
        return sum;
    }

}
