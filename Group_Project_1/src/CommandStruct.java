import java.util.ArrayList;


public class CommandStruct {
	
	private String command;	
	public ArrayList<Double> values = new ArrayList<Double>();
	
	CommandStruct(){
		command = null;
		
	}
	
	public String getCommand(){
		return command;
	}
	
	public void setCommand(String newCommand){
		command = newCommand;
	}
	
	public String printValues(){
		String theString = null;
		
		for (Double number : this.values){
			theString += " " + String.valueOf(number);
		}
		return theString;
	}

}
