package finalproject;

import java.util.ArrayList;
import java.util.Stack;

public class Graph
{
    ArrayList<Vertex> vertices;
    ArrayList<Edge> edges;
    AdjacencyMatrix adj_matrix;
    
    
    public Graph()
    {
        // Initialize a blank graph
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        adj_matrix = new AdjacencyMatrix();
        
    }
    
    public Graph(AdjacencyMatrix matrix)
    {
        // Initialize a graph from an Adjacency Matrix
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        adj_matrix = matrix;
        
        // Create the vertices
        for (int i = 0; i < adj_matrix.getSize(); i++)
        {
            addVertex(new Vertex(vertices.size()));            
        }
                
        // Create and assign the Edges
        for (int i = 0; i < adj_matrix.getSize(); i++ )
        {
            for (int k = 0; k < adj_matrix.getSize(); k++ )
            {                
                if ( Integer.parseInt(adj_matrix.getPosition(i, k)) == 1 )
                {
                    // Create new edge                    
                    addEdge(new Edge(getVertex(i), getVertex(k)));
                }
            }
        }
    }
    
    public void addVertex(Vertex vertex)
    {
        vertices.add(vertex);
    }
    
    public void addEdge(Edge edge)
    {
        edges.add(edge);
    }
    
    public AdjacencyMatrix getMatrix()
    {
        return adj_matrix;
    }
    
    public ArrayList<Vertex> getVertices()
    {
        return vertices;
    }
    
    public ArrayList<Edge> getEdges()
    {
        return edges;
    }
    
    public int getVerticesAmount()
    {
        return vertices.size();
    }
    
    public Vertex getVertex(int position)
    {
        return vertices.get(position);
    }
    
}