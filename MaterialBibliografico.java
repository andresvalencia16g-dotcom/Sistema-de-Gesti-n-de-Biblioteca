public abstract class MaterialBibliografico {
    private String titulo;
    private String codigo;

    public MaterialBibliografico(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public abstract double calcularMulta(int diasRetraso);

    public void mostrarInformacion() {
        System.out.print("Codigo: " + codigo + " | Titulo: " + titulo);
    }
}