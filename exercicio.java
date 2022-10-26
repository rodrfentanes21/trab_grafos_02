public class exercicio {

  public static void main(String[] args) {
    Grafo grafo = new Grafo(6);
    metodoFleury fleury = new metodoFleury();
    grafo.addAresta(0, 1); // TODO FUTURO FOR
    grafo.addAresta(0, 2);
    grafo.addAresta(1, 2);
    grafo.addAresta(2, 3);
    grafo.addAresta(3, 4);
    grafo.addAresta(3, 5);
    grafo.addAresta(4, 5);
    System.out.println("------------------------");
    System.out.print(fleury.doMetodoFleury(grafo));
    System.out.println("\n------------------------");
  }
}
