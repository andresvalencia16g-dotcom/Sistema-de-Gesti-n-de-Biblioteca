public class Pelicula extends MaterialBibliografico {
    private String director;
    private int duracion;
    public Pelicula(String titulo, String codigo, String director, int duracion) {
        super(titulo, codigo);
        this.director = director;
        this.duracion = duracion;
    }
@Override
public double calcularMulta(int diasTotales) {
    int diasRetraso = diasTotales - 3;   
    if (diasRetraso > 0) {
        return diasRetraso * 10000;
    }
    return 0;
}
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" | Tipo: Pelicula | Director: " + director);
    }
}