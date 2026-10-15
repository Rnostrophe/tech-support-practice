import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random generator;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        generator = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }
    
    private void fillResponses()
    {
        responses.add("That does not sound good...");
        responses.add("An ambulance is coming shortly");
        responses.add("Please elaborate");
        responses.add("Sorry, communication isn't clear, please repeat");
        responses.add("Dear god...");
        responses.add("Lord have mercy...");
        responses.add("You want pizza?");
        responses.add("Tell me more");
        responses.add("Help is on the way!");
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = generator.nextInt(responses.size());
        String response = responses.get(index);
        return "That sounds interesting. Tell me more...";
    }
}

