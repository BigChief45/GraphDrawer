package finalproject;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JFrame;
 
public class Bipartite extends JFrame
{
    
    public static boolean isBipartite(Graph G) 
    {
        /* Create the arraylist from the Graph's adjacency list */                
        AdjacencyMatrix m = G.getMatrix();
        boolean[][] adj = new boolean[G.getVerticesAmount()][G.getVerticesAmount()];
        
        
        for (int i = 0; i < G.getVerticesAmount(); i++ )
        {
            for (int k = 0; k < G.getVerticesAmount(); k++ )
            {
                if ( m.getPosition(i, k).equals("0") )
                    adj[i][k] = false;
                else if ( m.getPosition(i, k).equals("1") )
                    adj[i][k] = true;
            }
        }
        
        /* Color array that stores colors assigned to the vertices. The vertex
        number is used as an index in this array. The value '-1' indicates that
        no color is assigned to vertex i. The value '1' is used to indicate
        the first color and the value 2 indicates second color assigned. */
        int[] colors = new int[adj.length];
        
        /* Queue of vertex numbers for BFS traversal */
        Queue<Integer> q = new LinkedList<Integer>();
        colors[0] = 1; // Assign first node color
        q.add(0); // Add it to the queue
        
        /* Run while there are vertices in queue */
        while ( !q.isEmpty() ) 
        {
            /* Dequeue from queue */
            int t = q.poll();
            int expected;
                                    
            if (colors[t] == 1)
                /* If the color of the current vertex is the first color, then
                   the expected color should be the second color. */
                expected = 2;
            else
                /* If not, expect the first color */
                expected = 1;
            
            /* Iterate through the adjacency matrix for adjacent vertices */
            for (int i = 0; i < adj[t].length; i++) 
            {
                /* Check adjacent vertices */
                if ( adj[t][i] ) 
                {
                    if ( colors[i] != 0) 
                    {
                        /* If adjacent vertices are already colored, check
                        if its the expected color, if it is not, then the
                        graph is not bipartite. */
                        if ( colors[i] != expected)
                            return false;
                    } 
                    else 
                    {
                        /* If it IS the expected color, assign the expected
                        color to the color array */
                        colors[i] = expected;
                        q.add(i); // Add the adjacent vertex to the queue
                    }
                }
            }
        }

        return true;
    }
    
    public static int[] getColoredSet(Graph G)
    {
        /* Create the arraylist from the Graph's adjacency list */                
        AdjacencyMatrix m = G.getMatrix();
        boolean[][] adj = new boolean[G.getVerticesAmount()][G.getVerticesAmount()];
        
        
        for (int i = 0; i < G.getVerticesAmount(); i++ )
        {
            for (int k = 0; k < G.getVerticesAmount(); k++ )
            {
                if ( m.getPosition(i, k).equals("0") )
                    adj[i][k] = false;
                else if ( m.getPosition(i, k).equals("1") )
                    adj[i][k] = true;
            }
        }
        
        int[] colors = new int[adj.length];
        Queue<Integer> q = new LinkedList<Integer>();
        colors[0] = 1;
        q.add(0);
        
        while ( !q.isEmpty() ) 
        {
            int t = q.poll();
            int expected;
            
            if (colors[t] == 1)
                expected = 2;
            else
                expected = 1;
            
            for (int i = 0; i < adj[t].length; i++) 
            {
                if ( adj[t][i] ) 
                {
                    if ( colors[i] != 0) 
                    {
                        if ( colors[i] != expected)
                            return null;
                    } 
                    else 
                    {
                        colors[i] = expected;
                        q.add(i);
                    }
                }
            }
        }
        return colors;
    }
}