package finalproject;

import java.util.ArrayList;

public class AdjacencyMatrix 
{
    ArrayList<ArrayList<String>> matrix;
    
    public AdjacencyMatrix()
    {
        matrix = new ArrayList<ArrayList<String>>();
    }
    
    public String getPosition(int row, int column)
    {
        return matrix.get(row).get(column);
    }
    
    public int getSize()
    {
        return matrix.size();
    }
    
    public void addRow(ArrayList row)
    {
        matrix.add(row);
    }
    
    public void printMatrix()
    {
        for (int i = 0; i < matrix.size(); i++ )
        {
            for (int j = 0; j < matrix.get(i).size(); j++ )
            {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }        
}
