package epam.new_year_gift;

public class New_Year_Gift extends Chocolates
{
	Chocolates ch_gft[];
	Sweets sw_gft[];
	int gft_wt=0;
	public void add(Sweets s[],Chocolates c[])
	{
		sw_gft=s;
		ch_gft=c;
	}
	public void find_weight()
	{
		for(int i=0;i<sw_gft.length;i++)
		{
			gft_wt+=sw_gft[i].cost;
		}
		gft_wt+=super.find_weight(ch_gft);
		System.out.println("Total Weight of Children's gift is:"+gft_wt);
	}
	public void find_candies()
	{
		System.out.println("Candies in the Children's Gift whose cost is less than 100 is:");
		for(int i=0;i<ch_gft.length;i++)
		{
			if(ch_gft[i].cost>=100)
			{
				break;
			}
			System.out.println("Name:"+ch_gft[i].name);
			System.out.println("Flavour:"+ch_gft[i].flavour);
			System.out.println("Cost:"+ch_gft[i].cost);
		}
	}
}
