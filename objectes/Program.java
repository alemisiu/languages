public class Program {

    public static void main(String[] args) {
        
        new OkretWojenny("aaa","aaa", 1, 17);

        new OkretWojenny("destrukcja");


        new OkretWojenny("Bisamark");

        new OkretWojenny("lodz podwodna","u boot", 1,1);


        
        new OkretWojenny("lotniskowiec","chuurchila",1,5);

        var okret1 = new OkretWojenny();
        okret1.setNazwaOkretu("wolny niszczyciel");

        var klasaOkret1 = okret1.getKlasaOkretu();
    }
    
}
