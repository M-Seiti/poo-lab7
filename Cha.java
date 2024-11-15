
public class Cha extends PreparacaoBebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando o chá");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando limão ao chá");
    }
}
