import org.jgrapht.graph.DirectedWeightedMultigraph;

public class Metropolitana {

	public static void main(String[] args) {
		
		DirectedWeightedMultigraph<Stazione, Collegamento> metro = new DirectedWeightedMultigraph<Stazione, Collegamento>(Collegamento.class);

		metro.addVertex(new Stazione("A"));
		metro.addVertex(new Stazione("B"));
		metro.addVertex(new Stazione("C"));
		metro.addVertex(new Stazione("D"));
		
		Collegamento collegamento = metro.addEdge(new Stazione("A"), new Stazione("B"));
		collegamento.setLinea(1);
		
		collegamento = metro.addEdge(new Stazione("A"), new Stazione("B"));
		collegamento.setLinea(2);
		
		collegamento = new Collegamento(1);
		metro.addEdge(new Stazione("B"), new Stazione("C"), collegamento);
		
		collegamento = new Collegamento(2);
		metro.addEdge(new Stazione("B"), new Stazione("D"), collegamento);
		
		System.out.println("\nGrafo metropolitana\n");
		
		System.out.println(metro);
		
		System.out.println("\nLinea 1\n");
		
		for (Collegamento c : metro.edgeSet()){
			if (c.getLinea() == 1){
				System.out.format("stazione partenza: %s  \tstazione arrivo: %s\n", metro.getEdgeSource(c), metro.getEdgeTarget(c));
			}
		}
	}

}
