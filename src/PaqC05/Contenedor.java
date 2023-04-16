package PaqC05;

public class Contenedor {
    private int id;
    private int peso;
    private String pais;
    private boolean inspeccionado;
    private int prioridad;
    private String descripcion;
    private String empresaRemitente;
    private String empresaReceptora;

    public Contenedor (int id, int peso, String pais, boolean inspeccionado, int prioridad, String descripcion, String empresaRemitente, String empresaReceptora){
        this.id = id;
        this.peso = peso;
        this.pais = pais;
        this.inspeccionado = inspeccionado;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.empresaRemitente = empresaRemitente;
        this.empresaReceptora = empresaReceptora;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean getInspeccionado() {
        return inspeccionado;
    }
    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresaRemitente() {
        return empresaRemitente;
    }
    public void setEmpresaRemitente(String empresaRemitente) {
        this.empresaRemitente = empresaRemitente;
    }

    public String getEmpresaReceptora() {
        return empresaReceptora;
    }
    public void setEmpresaReceptora(String empresaReceptora) {
        this.empresaReceptora = empresaReceptora;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", peso=" + peso +
                ", pais='" + pais + '\'' +
                ", inspeccionado=" + inspeccionado +
                ", prioridad=" + prioridad +
                ", descripcion='" + descripcion + '\'' +
                ", empresaRemitente='" + empresaRemitente + '\'' +
                ", empresaReceptora='" + empresaReceptora + '\'' +
                '}';
    }

}
