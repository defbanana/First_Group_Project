import java.util.ArrayList;

/**
 * A struct type to organize input received from the shapes.txt file.  
 * @author Jesse and Amanda.
 *
 */
public class CommandStruct {
	
	/**
	 * The shape object to create
	 */
	private String command;	
	
	/**
	 * Storage for all values associated with the object  
	 */
	public ArrayList<Double> values = new ArrayList<Double>();
	
	/**
	 * The constructor.  
	 *
	 */
	CommandStruct(){
		command = null;
		
	}
	
	/**
	 * Provide the shape object to create.  
	 * @return the object name
	 */
	public String getCommand(){
		return command;
	}
	
	/**
	 * Set the shape object to create.  
	 * @param the string of the object name
	 */
	public void setCommand(String newCommand){
		command = newCommand;
	}
	
	/**
	 * Generates a string containing the stored values 
	 * @return the string
	 */
	public String printValues(){
		String theString ="";
		
		for (Double number : this.values){
			theString += " " + String.valueOf(number);
		}
		return theString;
	}

}
