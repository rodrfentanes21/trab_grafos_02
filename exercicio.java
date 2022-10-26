import java.util.Random;

public class exercicio {

  public static void main(String[] args) {
    Random rnd = new Random();
    int numvert = 100000; // PARA ALTERAR O NUMERO DE VERTICES DO GRAFO, ALTERAR ESTA VARIAVEL;
    Grafo grafo = new Grafo(numvert);
    metodoFleury fleury = new metodoFleury();

    for (int i = 0; i < grafo.getVertices(); i++) {
      Integer numeroAleatorio = rnd.nextInt(numvert);
      if (numeroAleatorio == i || grafo.getListaAdj()[i].size() >= 2) {
        continue;
      } else {
        grafo.addAresta(i, numeroAleatorio);
      }
    }

    System.out.println("------------------------");
    System.out.print(fleury.doMetodoFleury(grafo));
    System.out.println("\n------------------------");
  }
}