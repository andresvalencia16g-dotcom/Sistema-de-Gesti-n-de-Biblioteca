# Sistema-de-Gesti-n-de-Biblioteca
Taller 3: Introducción a POO - TECNICAS DEL MODELADO

## ABSTRACCIÓN

La clase MaterialBibliografico utiliza este pilar de POOy obliga a las subclases a implementar su propia lógica de cálculo de multas, asegurando que cada material se comporte según sus reglas de negocio.
EJEMPLO:

    public abstract double calcularMulta(int diasRetraso);

## ENCAPSULAMIENTO
en la clase MaterialBibliografico utilizo ENCAPSULAMIENTO con sus respectivos métodos getters y setters
EJEMPLO:
 public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

## Herencia
La clave es la palabra reservada extends 
EJEMPLO:

public class Revista extends MaterialBibliografico {
    private String periodicidad;
    private int edicion;
    public Revista(String titulo, String codigo, String periodicidad, int edicion) {
        super(titulo, codigo);
        this.periodicidad = periodicidad;
        this.edicion = edicion;
    }

## POLIMORFISMO
Se ve en el Main, cuando se recorre la lista

ArrayList<MaterialBibliografico> lista = new ArrayList<>();
        int opcion = 0;

for (MaterialBibliografico m : lista) {
                    if (m.getCodigo().equals(buscar)) {
                        System.out.println("La multa es: $" + m.calcularMulta(dias));
                    }
                }


  ![App Screenshot](https://ibb.co/nMvvprpb)



![App Screenshot](https://ibb.co/nMvvprpb)
