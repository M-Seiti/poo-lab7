
public class Cafe extends PreparacaoBebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando o café");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite ao café");
    }
}
