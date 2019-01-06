import DataStructures.BinaryTree;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BTreeTests {

    @Test
    public void testBTreeElementConstructor()
    {

        BinaryTree<Integer> bTree = new BinaryTree<>(5);
        assertEquals(bTree.getElement().intValue(), 5);
        assertEquals(bTree.getLeft(), null);
        assertEquals(bTree.getRight(), null);
    }

    @Test
    public void testBTreeLeftChildConstructor()
    {

        BinaryTree<Integer> bTreeLeft = new BinaryTree<>(2);
        BinaryTree<Integer> bTree = new BinaryTree<Integer>(5, bTreeLeft, null);
        assertEquals(bTree.getElement().intValue(), 5);
        assertEquals(bTree.getLeft(), bTreeLeft);
        assertEquals(bTree.getRight(), null);
    }

    @Test
    public void testBTreeRightChildConstructor()
    {
        BinaryTree<Integer> bTreeRight = new BinaryTree<>(8);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, bTreeRight);
        assertEquals(bTree.getElement().intValue(), 5);
        assertEquals(bTree.getLeft(), null);
        assertEquals(bTree.getRight(), bTreeRight);
    }

    @Test
    public void testBTreeHasLeftChildTrue()
    {
        BinaryTree<Integer> bTreeLeft = new BinaryTree<>(2);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, bTreeLeft, null);
        assertTrue(bTree.hasLeft());
    }

    @Test
    public void testBTreeHasLeftChildFalse()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, null);
        assertFalse(bTree.hasLeft());
    }

    @Test
    public void testBTreeHasRightChildTrue()
    {
        BinaryTree<Integer> bTreeRight = new BinaryTree<>(8);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, bTreeRight);
        assertTrue(bTree.hasRight());
    }

    @Test
    public void testBTreeHasRightChildFalse()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, null);
        assertFalse(bTree.hasRight());
    }

    @Test
    public void testBTreeHeightZero()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, null);
        assertEquals(bTree.getHeight(), 0);
    }

    @Test
    public void testBTreeHeightOne()
    {
        BinaryTree<Integer> bTreeRight = new BinaryTree<>(8);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, bTreeRight);
        assertEquals(bTree.getHeight(), 1);
    }

    @Test
    public void testBTreeHeightTwo()
    {
        BinaryTree<Integer> bTreeLeft = new BinaryTree<>(2);
        BinaryTree<Integer> bTreeLeft2 = new BinaryTree<Integer>(3, bTreeLeft, null);
        BinaryTree<Integer> bTreeRight = new BinaryTree<>(8);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, bTreeLeft2, bTreeRight);
        assertEquals(bTree.getHeight(), 2);
    }

    @Test
    public void testBTreeHeightTen()
    {
        BinaryTree<Integer> bTreeLeft = new BinaryTree<>(2);
        BinaryTree<Integer> bTreeLeft2 = new BinaryTree<Integer>(3, bTreeLeft, null);
        BinaryTree<Integer> bTreeLeft3 = new BinaryTree<Integer>(3, bTreeLeft2, null);
        BinaryTree<Integer> bTreeLeft4 = new BinaryTree<Integer>(3, bTreeLeft3, null);
        BinaryTree<Integer> bTreeLeft5 = new BinaryTree<Integer>(3, bTreeLeft4, null);
        BinaryTree<Integer> bTreeLeft6 = new BinaryTree<Integer>(3, bTreeLeft5, null);
        BinaryTree<Integer> bTreeLeft7 = new BinaryTree<Integer>(3, bTreeLeft6, null);
        BinaryTree<Integer> bTreeLeft8 = new BinaryTree<Integer>(3, bTreeLeft7, null);
        BinaryTree<Integer> bTreeLeft9 = new BinaryTree<Integer>(3, bTreeLeft8, null);
        BinaryTree<Integer> bTreeLeft10 = new BinaryTree<Integer>(3, bTreeLeft9, null);

        BinaryTree<Integer> bTreeRight = new BinaryTree<>(8);
        BinaryTree<Integer> bTree = new BinaryTree<>(5, bTreeLeft10, bTreeRight);
        assertEquals(bTree.getHeight(), 10);
    }

    @Test
    public void testBTreeAmountOfNodes1()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, null);
        assertEquals(bTree.amountOfNodes(), 1);
    }

    @Test
    public void testBTreeAmountOfNodes2()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, new BinaryTree(3), null);
        assertEquals(bTree.amountOfNodes(), 2);
    }

    @Test
    public void testBTreeAmountOfNodes3()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, new BinaryTree(3), new BinaryTree(8));
        assertEquals(bTree.amountOfNodes(), 3);
    }

    @Test
    public void testBTreeAmountOfNodes4()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5,
                new BinaryTree(3, new BinaryTree(1), null),
                new BinaryTree(8, null,
                new BinaryTree(10, new BinaryTree(5), new BinaryTree(20))));
        assertEquals(bTree.amountOfNodes(), 7);
    }

    @Test
    public void testBTreeIsComplete1()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, null);
        assertTrue(bTree.isComplete());
    }

    @Test
    public void testBTreeIsComplete2()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5, null, new BinaryTree(8,null,null));
        assertFalse(bTree.isComplete());
    }

    @Test
    public void testBTreeIsComplete3()
    {
        BinaryTree<Integer> bTree = new BinaryTree<>(5,  new BinaryTree(3,null,null), new BinaryTree(8,null,null));
        assertTrue(bTree.isComplete());
    }



}
