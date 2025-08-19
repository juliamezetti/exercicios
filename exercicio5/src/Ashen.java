public class Ashen{

    String nome;
    int vida;
    arma arma;

    void usarArma(){
        arma.resistencia -= 2;
    }

    void tomaDano(){
        vida -= 5;
    }

}
