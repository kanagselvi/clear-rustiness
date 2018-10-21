import java.io.*;

class RemoveSpace {

	public static void main (String[] args) {
	    
	    char[] inputStr = new char[]{'I',' ','l',' ','o',' ','v',' ','e',' ','y',' ','o',' ','u',' ','!',' ','!'};
		
		removeSpace(inputStr);
		
		
	}
	
	public static void removeSpace(char[] inputStr){
	    
	    if(inputStr == null || inputStr.length > 0){
	        return;
	    }
	    
	    System.out.println(inputStr);
	    
	    for(int i = 0, nonSpacePosition = 0; i < inputStr.length; i++){
	        if(inputStr[i] != ' '){
	            inputStr[nonSpacePosition++] = inputStr[i];
	            inputStr[i] = ' ';
	        }
	    }
	    
	    System.out.println(inputStr);
	}
}
