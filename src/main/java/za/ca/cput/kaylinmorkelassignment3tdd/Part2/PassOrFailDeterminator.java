package za.ca.cput.kaylinmorkelassignment3tdd.Part2;

//Kaylin Morkel - 215062175

public class PassOrFailDeterminator
{
    String passOrFail(int percentage)
    {
        if(percentage < 50)
        {
            return "Fail";
        }
        else
        {
            return "Pass";
        }
    }
}
