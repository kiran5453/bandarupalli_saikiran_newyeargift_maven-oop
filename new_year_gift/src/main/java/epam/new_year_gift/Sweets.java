package epam.new_year_gift;

public class Sweets {
	String name;
	int quantity;
	int cost;
	public void addSweets(String n,int q,int c)
	{
		name=n;
		quantity=q;
		cost=c;
	}
	public int swt_wt(Sweets s[])
	{
		int wt=0;
		for(int i=0;i<s.length;i++)
		{
			wt+=s[i].cost;
		}
		return wt;
	}
}
