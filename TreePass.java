package treepass;
import java.util.Scanner;
class Node {
   char info;
   Node lLink;
   Node rLink;
}


public class TreePass {

    static Node root;
    static char ch;

    static Scanner input = new Scanner(System.in);

    static Node enter(Node p)
    {
        ch = input.next().charAt(0);
	
        if (ch != '.')
	{
            p = new Node();
            p.info = ch;
            System.out.print("...left of (" + p.info + ")  ");
            p.lLink = enter(p.lLink);
            System.out.print("...right of (" + p.info + ")  ");
            p.rLink = enter(p.rLink);
	}
        else
	{
            p = null;
	}
        return p;
    }

    static void preOrder(Node p)
    {
        if ( p != null)
	{
            System.out.print(p.info);
            preOrder(p.lLink);
            preOrder(p.rLink);
	}
        else
	{
            System.out.print('.');
	}
    }

    static void inOrder(Node p)
    {
        if ( p != null)
	{
            inOrder(p.lLink);
            System.out.print(p.info);
            inOrder(p.rLink);
	}
        else
	{
            System.out.print('.');
	}
    }

    static void postOrder(Node p)
    {
        if ( p != null)
	{
            postOrder(p.lLink);
            postOrder(p.rLink);
            System.out.print(p.info );
	}
        else
	{
            System.out.print('.');
	}
    }

    public static void main(String[] args) {
        
        System.out.println("enter information of tree: ");
    	System.out.print("...root?   ");
		root = enter(root);
		System.out.println();

        System.out.println(">>>preOrder:  ");
		preOrder(root);
        System.out.println();
		System.out.println();
        System.out.println();

        System.out.println(">>>inOrder:  ");
        inOrder(root);
		System.out.println();
        System.out.println();
		System.out.println();

        System.out.println(">>>postOrder:  ");
		postOrder(root);
        System.out.println();
		System.out.println();
        System.out.println();

    }

}
