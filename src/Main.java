
public class Main {
    public static void main(String[] args) {

        MagazinService magazinService = new MagazinService();
        magazinService.addPret("Lapte", 15);
        magazinService.addPret("Paine", 9);

        magazinService.vinde("Lapte");
        magazinService.vinde("Lapte");
        magazinService.vinde("Paine");

        magazinService.afisareTranzactii(); //
        magazinService.afiseazaRaportNrVanzariPerProdus(); //
        System.out.println(magazinService.sumatot());
//        magazinService.afisareSumaVanzariProdus("Lapte"); //
//        magazinService.afisareSumaVanzariProdus("Paine"); //
//        magazinService.afisareSumaVanzariProdus("Lapte"+"Paine");

    }
}