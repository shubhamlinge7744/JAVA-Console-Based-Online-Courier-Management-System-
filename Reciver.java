public class Reciver extends User
{
	public Reciver()
	{
		super("Unknown", "Unknown", "Unknown");
	}

	public Reciver(String name, String address, String mobile)
	{
		super(name, address, mobile);
	}

	public void showInfo()
	{
		System.out.println("Recivers info -");
		super.showInfo();
	}
}