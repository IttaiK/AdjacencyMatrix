public class Graph {

    public Node[] nodes;
    public int[][] edges;

    public Graph(Node[] _nodes){
        nodes = _nodes;
        edges = new int[nodes.length][nodes.length];
    }

    public void insertEdge(Node a, Node b){
        edges[findNodeIdx(a)][findNodeIdx(b)] = 1;
    }

    public int findNodeIdx(Node a){
        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i] == a) return i;
        }
        throw new RuntimeException("Node at the end of new edge does not exist");
    }

    public Node[] nodeAdj(Node a){
        int numNodesAdj = 0;
        for(int i = 0; i < edges.length; i++) {
            if(edges[findNodeIdx(a)][i] == 1) numNodesAdj++;
        }
        Node[] out = new Node[numNodesAdj];
        int idx = 0;
        for(int i = 0; i < edges.length; i++) {
            if(edges[findNodeIdx(a)][i] == 1){
                out[idx] = nodes[i];
                idx++;
            }
        }
        return out;
    }

    public String toString(){
        String out = "";
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                out += edges[i][j] + " ";
            }
            out += "\n";
        }
        return out;
    }

}
