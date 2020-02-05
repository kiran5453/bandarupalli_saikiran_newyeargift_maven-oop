package epam.new_year_gift;
class Chocolates {
	String name;
	String flavour;
	int cost;
	public void addChocolates(String n,String f,int c)
	{
		name=n;
		flavour=f;
		cost=c;
	}
	public int find_weight(Chocolates c[])
	{
		int wt=0;
		for(int i=0;i<c.length;i++)
		{
			wt+=c[i].cost;
		}
		return wt;
	}
	public void sort_chocolates(Chocolates ch_gft[])
	{
		for(int i=0;i<ch_gft.length-1;i++)
		{
			for(int j=0;j<ch_gft.length-i-1;j++)
			{
				if(ch_gft[j].cost>ch_gft[j+1].cost)
				{
					Chocolates tmp=ch_gft[j];
					ch_gft[j]=ch_gft[j+1];
					ch_gft[j+1]=tmp;
				}
			}
		}
	}
}
