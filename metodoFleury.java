import java.util.List;

public class metodoFleury {

  public String doMetodoFleury(Grafo grafo) {
    int quantidadeImpar = 0;
    int posicao = 0; // por padrão, caso o grafo nao possua nenhum vertice com GRAU IMPAR,
    // começaremos a iterar a partir do primeiro vértice
    int quantidadeTotal = 0;

    for (List<Integer> a : grafo.getListaAdj()) {
      if (a.size() % 2 != 0) {
        if (quantidadeImpar == 0) {
          posicao = quantidadeTotal; // extrai a posicao no array de vertices do PRIMEIRO vertice com GRAU IMPAR
        }
        quantidadeImpar++;
      }
      quantidadeTotal++;
    }

    if (quantidadeImpar > 2) {
      return "O grafo é não-eureliano";
    } else if (quantidadeImpar == 0) {
      mostraCaminho(grafo, posicao);
    } else {}
  }

  private void mostraCaminho(Grafo grafo, Integer u) {
    for (int i = 0; i < grafo.getListaAdj()[u].size(); i++) {
      Integer adj = grafo.getListaAdj()[u].get(i);
    }
  }

  private boolean naive(Grafo grafo, Integer u, Integer v) {
    /*
     * mesmo que a aresta seja uma ponte, ela devera ser atravessada eventualmente,
     * porem apenas apos todas as outras arestas "não pontes" terem sido atravessadas, e portanto removidas da lista
     * logo quando o número de adjacentes for 1, atravessaremos a ponte.
     */
    if (grafo.getListaAdj()[u].size() == 1) {
      return true;
    }

    boolean[] foiVisitado = new boolean[grafo.getVertices()];
    /*
     * o metodo naive funciona com base em testar o numero de vertices alcançaveis antes e depois da remoçao de uma aresta:
     * caso a aresta removida seja uma ponte, certamente o numero de vertices alcançaveis seria menor com a remoção da aresta, pois outro componente seria formado com a remoção da ponte
     * e, caso a aresta removida nao fosse uma ponte, o vertice poderia alcançar o mesmo numero de vertices que ele anteriormente alcançava, já que nenhum outro componente foi formado.
     */

  }

  //metodo que conta a quantidade de vertices que da para alcançar a partir de v
  private int contaArestas(Grafo grafo, Integer v, boolean[] foiVisitado){
     
        //marcar o vértice atual como visitado

        foiVisitado[v] = true;
        int count = 1;

       /* 
        * percorre todos os adjacentes de um vértice, checa se foi visitado, e se não foi, adiciona na contagem
        * e chama recursivamente 
        */

        for (int adj : grafo.getListaAdj()[v]) {
            if (!foiVisitado[adj]) {
                count = count + contaArestas(grafo, adj, foiVisitado);
            }
        }
        return count;
  }

}
