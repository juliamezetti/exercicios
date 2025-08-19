public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 150;
        z2.vida = 300;

        System.out.println("z1 iniciou com vida = " + z1.vida);
        System.out.println("z2 iniciou com vida = " + z2.vida);

        z1 = z2;

        System.out.println("Agora z1 referencia o mesmo objeto de z2");
        System.out.println("Vida atual de z1: " + z1.vida);
        System.out.println("Vida atual de z2: " + z2.vida);
    }
}
