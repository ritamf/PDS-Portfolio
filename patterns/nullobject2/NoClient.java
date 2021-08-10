class NoClient extends Emp
{
    @Override
    public String getName() 
    {
        return "Not Available";
    }
  
    @Override
    public boolean isNull() 
    {
        return true;
    }
}