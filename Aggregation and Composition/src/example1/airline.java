package example1;

public class airline {

	String airlineName;
	pilot p;
	
	airline(String airlineName , pilot p)
	{
		this.airlineName = airlineName;
		this.p = p;
	}
	
	void activity()
	{
		System.out.println(airlineName + " Doing Some Activity");
		p.fly();
	}
}
