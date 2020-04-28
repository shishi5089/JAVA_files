package inheritance;

public class MainClass 
{
	public static void main(String[]args)
	{
	ParentClass parent=new ParentClass();
	System.out.println(parent.complexion);
	System.out.println(parent.hair);
	System.out.println(parent.height);
	parent.smoke();
	System.out.println(parent.eyeColor);
	System.out.println("************************");
	
	ChildOne child=new ChildOne();
	System.out.println("I am a child I inherited skin color"+child.complexion);
	System.out.println("I am a child I inherited hair color "+child.hair);
	System.out.println("I am a child I inherited height "+child.height);
	child.smoke();
	System.out.println(child.eyeColor);
	
	ChildTwo child1=new ChildTwo();
	System.out.println("I am the second child and I inherited skin color "+child1.complexion);
	System.out.println("I am the second child and I inherited hair color "+child1.hair);
	System.out.println("I am the second child and I inherited skin height "+child1.height);
	}
}
