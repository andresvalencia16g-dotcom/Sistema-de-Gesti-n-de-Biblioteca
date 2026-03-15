public class Libro extends MaterialBibliografico {
    private String autor;
    private int paginas;

    public Libro(String titulo, String codigo, String autor, int paginas) {
        super(titulo, codigo);
        this.autor = autor;
        this.paginas = paginas;
    }

@Override
public double calcularMulta(int diasTotales) {
    int diasRetraso = diasTotales - 14;
    if (diasRetraso > 0) {
        return diasRetraso * 5000;
    }
    return 0;
}
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" | Tipo: Libro | Autor: " + autor);
    }
}