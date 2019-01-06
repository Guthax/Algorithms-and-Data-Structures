package DataStructures;

public class BinaryTree<T> {
    private T element;
    private BinaryTree left;
    private BinaryTree right;


    public BinaryTree(T element) {
        this.element = element;
        left = null;
        right = null;
    }

    public BinaryTree(T element, BinaryTree left, BinaryTree right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public T getElement()
    {
        return this.element;
    }

    public int numOfChildren()
    {
        if(this.left == null && this.right == null)
        {
            return 0;
        }
        if(this.left != null && this.right == null || this.left == null && this.right != null)
        {
            return 1;
        }
        return 2;
    }

    public int getHeight()
    {
        int totalHeight = 0;
        if(this.left == null && this.right == null)
        {
            return 0;
        }
        else
        {
            totalHeight++;
            if(this.left != null && this.right == null)
            {
                totalHeight += this.left.getHeight();
            }
            else if(this.left == null && this.right != null)
            {
                totalHeight += this.right.getHeight();
            }
            else
            {
                totalHeight += this.left.getHeight() + this.right.getHeight();
            }
        }
        return totalHeight;
    }

    public int amountOfNodes()
    {
        int totalNodes = 1;
        if(this.left == null && this.right == null)
        {
            return totalNodes;
        }
        else if(this.left != null && this.right == null)
        {
            totalNodes += this.left.amountOfNodes();
        }
        else if(this.left == null &&  this.right != null)
        {
            totalNodes += this.right.amountOfNodes();
        }
        else
        {
            totalNodes += this.left.amountOfNodes() + this.right.amountOfNodes();
        }
        return totalNodes;


    }


    public boolean isComplete()
    {
        if(left == null && right == null)
        {
            return true;
        }
        int numberNodes = amountOfNodes();
        int index = 0;
        return isComplete(index, numberNodes);
    }

    public boolean isComplete(int index, int numberNodes)
    {
        if(left == null && right == null)
        {
            return true;
        }
        if(index + 1 > numberNodes)
        {
            return false;
        }

        boolean leftComplete = false;
        boolean rightComplete = false;
        if(left != null)
        {
            leftComplete = left.isComplete(index * 2 + 1, numberNodes);
        }
        if(right != null)
        {
            rightComplete = right.isComplete(index * 2 + 2, numberNodes);
        }
        return leftComplete && rightComplete;
    }



    public boolean isExternal()
    {
        if(this.left == null && this.right == null)
        {
            return true;
        }
        return false;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public boolean hasLeft()
    {
        return !(this.left == null);
    }

    public boolean hasRight()
    {

        return !(this.right == null);
    }

}
