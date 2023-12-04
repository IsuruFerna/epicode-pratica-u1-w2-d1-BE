package es3;

public class Banca {
    public static void main(String[] args) throws BancaException {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        conto1.preleva(1750.5);
//        conto1.preleva(100750.5);

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.preleva(2000);
        conto2.stampaSaldo();

//        esempio
//        ContoOnLine conto3 = new ContoOnLine("Bob", 3000.0, 500);
//        try{
//            conto3.preleva(2000);
//            conto3.stampaSaldo();
//        } catch (BancaException e) {
//            System.out.println("Errore durante il prelievo: " + e);
//            e.printStackTrace();
//        }

    }
}
