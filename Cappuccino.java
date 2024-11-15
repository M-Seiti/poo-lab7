
public class Cappuccino extends PreparacaoBebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando o espresso para o cappuccino");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando leite vaporizado e espuma ao cappuccino");
    }
}
