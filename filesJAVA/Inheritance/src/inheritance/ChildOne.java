package inheritance;

public class ChildOne extends ParentClass
{

	public void smoke()
	{
	System.out.println("I do not smoke");
	System.out.println("My eye color is "+super.eyeColor);
	super.smoke();
	}
	
	public ChildOne()
	{
		super();
		System.out.println("I am a Child One's Constructor");
	}
}
