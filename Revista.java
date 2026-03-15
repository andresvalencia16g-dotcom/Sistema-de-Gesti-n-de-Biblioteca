public class Revista extends MaterialBibliografico {
    private String periodicidad;
    private int edicion;
    public Revista(String titulo, String codigo, String periodicidad, int edicion) {
        super(titulo, codigo);
        this.periodicidad = periodicidad;
        this.edicion = edicion;
    }
@Override
public double calcularMulta(int diasTotales) {
    int diasRetraso = diasTotales - 7;
    if (diasRetraso > 0) {
        return diasRetraso * 3000;
    }
    return 0;
}
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" | Tipo: Revista | Edicion: " + edicion);
    }
}