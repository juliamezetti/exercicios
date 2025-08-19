public class Main{

    public static void main(String args[]){
        Motor ashen1 = new Motor();
        Motor ashen2 = new Motor();

        ashen1.vida = 90;
        ashen2.vida = 85;

        arma arma1 = new arma();
        arma arma2 = new arma();

        arma1.descricao = "Artorias Greatsword";
        arma2.descricao = "Twinblades";

        arma1.resistencia = 100;
        arma2.resistencia = 90;

        ashen1.arma = arma1;
        ashen2.arma = arma2;

        System.out.println("Vida do Ashen1: " + ashen1.vida);

        ashen1.tomaDano();

        System.out.println("Vida do Ashen1 apos tomar dano: " + ashen1.vida);

        System.out.println("Info da Arma do Ashen2");
        ashen2.arma.mostrarInfo();
        ashen2.usarArma();
        System.out.println("Usou a Arma");
        System.out.println("Nova Info");
        ashen2.arma.mostrarInfo();
    }
}