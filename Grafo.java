import java.util.List;

public class Grafo {
  private Integer vertices;
  private List<Integer>[] listaAdj;

  public Grafo(Integer vertices) {
    this.vertices = vertices;
  }

  public Integer getVertices() {
    return vertices;
  }

  public void setVertices(Integer vertices) {
    this.vertices = vertices;
  }

  public List<Integer>[] getListaAdj() {
    return this.listaAdj;
  }

  public void setListaAdj(List<Integer>[] listaAdj) {
    this.listaAdj = listaAdj;
  }

  public void addAresta(Integer u, Integer v) {

    listaAdj[u].add(v);
    listaAdj[v].add(u);

  }

  public void removeAresta(Integer u, Integer v) {

    listaAdj[u].remove(v);
    listaAdj[v].remove(u);

  }

}
