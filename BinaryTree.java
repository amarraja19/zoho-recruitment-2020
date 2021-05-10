public class BinaryTree 
{
	public static int v1 = 3; // value for child node 
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
	/*public void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}*/
	
	/*public void preOrder2(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		if((root.data == v1)||(root.data == v2))
		{
			k = k +1;
			System.out.println("value of k:"+k+"\n node value:"+root.data);
			//return;
		}	
		
		preOrder2(root.left);
		preOrder2(root.right);
		if(k==2)
		{
			
			System.out.print(root.data+" ");
			System.exit(0);
		}
		
		
	}*/
	
	public void parent(TreeNode root,int p)
	{

	    if (root == null)
	        return;
	    
		 if (root.data == v1)
		    {
		        System.out.print(p);
		    }
		    else
		    {
		        parent(root.left, root.data);
		        parent(root.right, root.data);
		    }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		//bt.preOrder(bt.root);
		//bt.preOrder2(bt.root);
		bt.parent(bt.root, -1);
		
 
	}

}
