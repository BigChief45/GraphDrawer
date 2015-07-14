package finalproject;

public class Edge 
{
    private Vertex vertex1;
    private Vertex vertex2;
    
    public Edge(Vertex a, Vertex b)
    {
        vertex1 = a;
        vertex2 = b;
    }
    
    public void setA(Vertex vertex)
    {
        vertex1 = vertex;
    }
    
    public Vertex getA()
    {
        return vertex1;
    }
    
    public void setB(Vertex vertex)
    {
        vertex2 = vertex;
    }
    
    public Vertex getB()
    {
        return vertex2;
    }
}
