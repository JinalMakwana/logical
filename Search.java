package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

 class Graph {
     Map<String, LinkedHashSet<String>> map = new HashMap();
    public void addEdge(String node1, String node2) {
        LinkedHashSet<String> adjacent = map.get(node1);
        if(adjacent==null) {
            adjacent = new LinkedHashSet();
            map.put(node1, adjacent);
        }
        adjacent.add(node2);
    }

    public void addTwoWayVertex(String node1, String node2) {
        addEdge(node1, node2);
        addEdge(node2, node1);
    }

    public boolean isConnected(String node1, String node2) {
        Set adjacent = map.get(node1);
        if(adjacent==null) {
            return false;
        }
        return adjacent.contains(node2);
    }

    public LinkedList<String> adjacentNodes(String last) {
        LinkedHashSet<String> adjacent = map.get(last);
        if(adjacent==null) {
            return new LinkedList();
        }
        return new LinkedList<String>(adjacent);
    }
 }

//======================================================


public class Search {

     String START;
     String END;

  public  Search(String s, String e)
    {
       START = s;
      END = e;
   
    }
   
    
   public String test() throws Exception
    {
         read r = new read();
         read1 r1=new read1();
        Hashtable h = r.readfirst();
        ArrayList<bean> a1 = r1.readsecond();
         Graph graph = new Graph();
                
                for (int t = 0; t < a1.size(); t++) {
            for (int y = 0; y < a1.size(); y++) {
                
                    String from = a1.get(y).getFromcity();
                   // int fromi=(int)h.get(from);
                    String to =  a1.get(y).getTocity();
                    if(from.equals(to))
                    {
                        continue;
                    }
                    else
                    {
                       graph.addEdge(from, to); 
                    }
                    

                }
            }
                LinkedList<String> visited = new LinkedList();
                visited.add(START);
                String s1=depthFirst(graph, visited);
                
        
        return s1;
    }

    String depthFirst(Graph graph, LinkedList<String> visited) {
        LinkedList<String> nodes = graph.adjacentNodes(visited.getLast());
        // examine adjacent nodes
        String result="";
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            }
            if (node.equals(END)) {
                visited.add(node);
                result=result+printPath(visited);
                visited.removeLast();
                break;
            }
        }
       // StringTokenizer stk = new StringTokenizer(result);
      
        result=result+"@";
        for (String node : nodes) {
            if (visited.contains(node) || node.equals(END)) {
                continue;
            }
            visited.addLast(node);
           result=result+ depthFirst(graph, visited);
            visited.removeLast();
        }
       return result; 
    }

     String printPath(LinkedList<String> visited) {
        String r="";
        for (String node : visited) {
            r=r+node+" ";
           
        }
       // System.out.println();
       //r=r+"@";
       return r;
    }
}

