public class Tester{

    /*
     Minimum spanning tree:
        find lightests path that touches every nodes
            Do it by: 
                Find the lightest(smallest) edge touching an accessed node (first time just around staring node) and going to a new node
                    Add to binaryHeap of edges
                LOOP THIS: so -> Keep this up (so next time find lightest edge touching either first node or connected node)
                    Add to BinaryHeap of edges
     */


    public static void main(String[] args){

        int tests = 0;
        int testsPassed = 0;

        //create a node array
        tests++;
        Node[] nds1 = new Node[10];
        testsPassed++;

        //fill the node array
        tests++;
        Node n1 = new Node(12);
        nds1[1] = n1;
        Node n2 = new Node(209);
        nds1[2] = n2;
        Node n3 = new Node(3);
        nds1[3] = n3;
        Node n4 = new Node(545);
        nds1[4] = n4;
        Node n5 = new Node(134);
        nds1[5] = n5;
        Node n6 = new Node(34);
        nds1[6] = n6;
        Node n7 = new Node(144);
        nds1[7] = n7;
        Node n9 = new Node(78);
        nds1[9] = n9;
        testsPassed++;

        //create a graph with no edges
        tests++;
        Graph g1 = new Graph(nds1);
        testsPassed++;

        //insert edge
        tests++;
        g1.insertEdge(n1,n1);
        testsPassed++;
        System.out.println(g1);

        //insert edges
        tests++;
        g1.insertEdge(n3,n3);
        testsPassed++;
        System.out.println(g1);

        //insert edges
        tests++;
        g1.insertEdge(n1,n5);
        testsPassed++;
        System.out.println(g1);

        //insert edges
        tests++;
        g1.insertEdge(n4,n7);
        testsPassed++;
        System.out.println(g1);

        //insert edges
        tests++;
        g1.insertEdge(n9,n7);
        testsPassed++;
        System.out.println(g1);

         //insert edges
         tests++;
         g1.insertEdge(n2,n7);
         testsPassed++;
         System.out.println(g1);

        //test numNodesAdj
        tests++;
        Node[] nds2 = g1.nodeAdj(n1);
        for (int i = 0; i < nds2.length; i++) {
            System.out.println(nds2[i].getValue());
        }
        testsPassed++;
        
        System.out.println("Passed " + tests + "/" + testsPassed + " test cases");
    }
}