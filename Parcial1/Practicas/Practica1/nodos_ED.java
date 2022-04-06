public class nodos_ED
{
	String num;
	nodos_ED sig;
	public nodos_ED() 
	{
		sig=null;
	}
	public String getNum() 
	{
		return num;
	}
	public void setNum(String it) 
	{
		num = it;
	}
	public nodos_ED getSig() 
	{
		return sig;
	}
	public void setSig(nodos_ED it) 
	{
		sig = it;
	}
}