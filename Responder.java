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
    private HashMap<String,String> responseMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responseMap = new HashMap();
        fillResponses();
    }
    
    private void fillResponses()
    {
        responseMap.put("I'm hurt", "That does not sound good...");
        responseMap.put("I'm hurt", "An ambulance is coming shortly");
        responseMap.put("Help", "Please elaborate");
        responseMap.put("Smoke", "Sorry, communication isn't clear, please repeat");
        responseMap.put("Someone's dead", "Dear god...");
        responseMap.put("Someone's dead", "Lord have mercy...");
        responseMap.put("Help", "Tell me more");
        responseMap.put("Smoke", "Help is on the way!");
        responseMap.put("Smoke", "You should call 911");
    }
    private String pickDefaultResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String response = responseMap.get(input);
        /*for (String word : words)
        {
            response = responseMap.get(word);
        }*/
        if (response == null){
            pickDefaultResponse();
        }
        return response;
    }
}

