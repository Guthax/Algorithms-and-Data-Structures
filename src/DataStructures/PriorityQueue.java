package DataStructures;

import java.util.ArrayList;

public class PriorityQueue {
    class Node {
        private int key;
        private int value;

        public Node(int k, int v, Node next)
        {
            key = k;
            value = v;
        }

        public int getKey()
        {
            return this.key;
        }

        public int getValue()
        {
            return  this.value;
        }
    }

    private ArrayList<Node> nodes;

    public PriorityQueue()
    {
        nodes = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return nodes.size() == 0;
    }

    public int getFirst()
    {
        if(!isEmpty()) {
            int index = 0;
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).getKey() < nodes.get(index).getKey()) {
                    index = i;
                }
            }
            int returnval = nodes.get(index).getValue();
            return returnval;
        }
        else
        {
            return -1;
        }
    }

    public int removeFirst()
    {
        if(!isEmpty()) {
            int index = 0;
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).getKey() < nodes.get(index).getKey()) {
                    index = i;
                }
            }
            int returnval = nodes.get(index).getValue();
            nodes.remove(index);
            return returnval;
        }
        else
        {
            return -1;
        }
    }


}
