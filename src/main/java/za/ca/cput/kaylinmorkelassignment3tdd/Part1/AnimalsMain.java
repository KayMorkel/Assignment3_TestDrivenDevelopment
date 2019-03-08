package za.ca.cput.kaylinmorkelassignment3tdd.Part1;

//Kaylin Morkel - 215062175

public class AnimalsMain
{
    private String name;
    private String type;

    public AnimalsMain(){

    }
    public AnimalsMain(String nm, String ty)
    {
        name = nm;
        type = ty;
    }

    public void setName(String nm)
    {
        name = nm;
    }
    public void setType(String ty)
    {
        type = ty;
    }
    public String getName(){
        return  name;
    }
    public String getType(){ return  type; }
    public String toString()
    {
        return name + " " + type;
    }


}
