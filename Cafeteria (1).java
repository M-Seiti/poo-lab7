
public class Cafeteria {
    public static void main(String[] args) {
        PreparacaoBebida cafe = new Cafe();
        cafe.prepararReceita();

        System.out.println();

        PreparacaoBebida cappuccino = new Cappuccino();
        cappuccino.prepararReceita();

        System.out.println();

        PreparacaoBebida cha = new Cha();
        cha.prepararReceita();
    }
}
