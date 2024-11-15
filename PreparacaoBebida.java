
public abstract class PreparacaoBebida {

    public final void prepararReceita() {
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
    }

    
    private void aquecerAgua() {
        System.out.println("Aquecendo a água");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando na xícara");
    }


    protected abstract void prepararBebida();
    protected abstract void adicionarCondimentos();
}
