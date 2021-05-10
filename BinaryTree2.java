package Rest_API;

import java.util.ArrayList;

public class BinaryTree2 {
	public static int v1,v2 = 7;
	public int k=0;
	
	private  TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data)
		{
			this.data = data;
		}
		
	}
	
	public void createBinaryTree()
	{
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		
		root = one;
		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		
		three.left = six;
		three.right = seven;
		
		six.left = eight;
		six.right = nine;
		
	}
	public void parent(TreeNode root,int p)
	{

	    if (root == null)
	        return;
	    
		 if (root.data == v1)
		    {
		 
		        // Print its parent
		        //System.out.print(p);
		        v1=p;
		    }
		    else
		    {
		 
		        // Recursive calls for the children
		        // of the current node
		        // Current node is now the new parent
		        parent(root.left, root.data);
		        parent(root.right, root.data);
		    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree2 bt = new BinaryTree2();
		bt.createBinaryTree();
		 ArrayList<Integer> value1 = new ArrayList<Integer>();
		 ArrayList<Integer> value2 = new ArrayList<Integer>();
		//bt.preOrder(bt.root);
		//bt.preOrder2(bt.root);
		v1=5;
		int i =0,j=0;
		do
		{
			bt.parent(bt.root, -1);
			value1.add(v1);
			i++;
			
		}while(v1!=1);
		v1=9;
		do
		{
			bt.parent(bt.root, -1);
			value2.add(v1);
			j++;
			
		}while(v1!=1);
		
			
		System.out.println(value1);
		System.out.println(value2);
		
		 
		for (int m = 0; m < i; m++)
	        {
	            for (int n = 0; n < j; n++)
	            {
	                if(value1.get(m)==value2.get(n))
	                {
	                 System.out.println(+value1.get(m));
	                 }
	            }
	        }
 
	}

}
