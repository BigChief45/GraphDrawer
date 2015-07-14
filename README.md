# GraphDrawer
Java application that draws a graph from an input text file containing an adjacency matrix. The application can also check whether the graph is bipartite or not.

##Open File
This function displays a file choosing window control that enables the user to select a text file as an input for the application. The text file should represent an adjacency matrix of a graph using one spaced characters in between the integers. The other buttons will not be available until an input file is selected. Once the input file is selected, the application will begin to construct the Graph object from the adjacency matrix, creating it's nodes and edges and storing them in

##Print Input
This function simply prints the adjacency matrix that was read from the input file into the console window.

##Draw Graph
This function will display a new window with a white background. A drawing algorithm will then be called to begin drawing the Graph based on the nodes and edges that were constructed.  This drawing algorithm uses random x and y coordinates to place the nodes. Because of this, some nodes and edges might overlap, meaning that this algorithm does not create a planar graph. However, since points are randomly chosen, planar graph drawings can occur.

##Check Bipartite
This function calls an algorithm that checks whether the graph is bipartite or not and returns a true or false value. If the graph is bipartite then it will call the drawing algorithm previously mentioned, this time however it will draw the graph in a bipartite fashion, meaning that it will separate and draw the two sets with no edges between the same set.
