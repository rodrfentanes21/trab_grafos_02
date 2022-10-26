import java.util.ArrayList;

public class Grafo {
  private Integer vertices;
  private ArrayList<Integer>[] listaAdj;
  private Integer quantAresta = 0;

  public Grafo(Integer vertices) {
    this.vertices = vertices;

    inicializaGrafo();
  }

  @SuppressWarnings("unchecked") private void inicializaGrafo() {
    listaAdj = new ArrayList[vertices];
    for (int i = 0; i < vertices; i++) {
      listaAdj[i] = new ArrayList<>();
    }
  }

  public Integer getQuantArestas(){
    return this.quantAresta;
  }

  public void setQuantArestas(Integer quantAresta){
    this.quantAresta = quantAresta;
  }

  public Integer getVertices() {
    return vertices;
  }

  public void setVertices(Integer vertices) {
    this.vertices = vertices;
  }

  public ArrayList<Integer>[] getListaAdj() {
    return this.listaAdj;
  }

  public void setListaAdj(ArrayList<Integer>[] listaAdj) {
    this.listaAdj = listaAdj;
  }

  public void addAresta(Integer u, Integer v) {
    listaAdj[u].add(v);
    listaAdj[v].add(u);
    quantAresta++;
  }

  public void removeAresta(Integer u, Integer v) {
    listaAdj[u].remove(v);
    listaAdj[v].remove(u);
  }
}
