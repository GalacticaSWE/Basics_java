package defaultPackage;
import java.util.*;
import java.util.stream.Collectors;


public class ReadingAndStoringNumbers {
    public static String Secondresult; 
    public static HashMap<String, Integer> ThirdTask = new HashMap<>();
    public static ArrayList<Integer> ListOfNumbers;

    public void FirstTask() {
        ReadingAndStoringNumbers checkTheInput = new ReadingAndStoringNumbers();
        checkTheInput.PrintTheOutput();
    }

    public Integer getValidScore(int student) {
        Integer userInput;
        while (true) {
            if (student == 1) {
                System.out.printf("Enter the score for the %dst student ", student);
            } else if (student == 2) {
                System.out.printf("Enter the score for the %dnd student ", student);
            } else if (student == 3) {
                System.out.printf("Enter the score for the %drd student ", student);
            } else {
                System.out.printf("Enter the score for the %dth student ", student);
            }

            userInput = IOScanner.IntegerInput(); 

            if (userInput >= 0 && userInput <= 100) {
                return userInput;
            } else {
                System.out.println("Error - Input out of bound. Score can only be between 0 and 100.");
            }
        }
    }

    public void PrintTheOutput() {
    	Secondresult = "";
        Integer student = 0;
        Integer maxStudents = 7;
        String result = "";
        while (student < maxStudents) {
            student++;

            Integer score = getValidScore(student);
            result += score + ", ";
        }
        result = result.substring(0, result.length() - 2);
        Secondresult = result;
        System.out.println("Thank you for your input.\nYour entered scores are:\n" + result);
    }

    public void SecondTask() {
        ReadingAndStoringNumbers checkTheInput = new ReadingAndStoringNumbers();
        checkTheInput.PrintTheSecondOutput();
    }

    public void PrintTheSecondOutput() {
    	Secondresult = "";
        Integer student = 0;
        Integer maxStudents = 7;
        String result2 = "";
        while (student < maxStudents) {
            student++;

            Integer score = getValidScore(student);
            result2 += score + ", ";
        }
        result2 = result2.substring(0, result2.length() - 2);
        Secondresult = result2;
    }

    public void GetTheSecondResult() {
        System.out.println("Your entered scores are:\n" + Secondresult);
        System.out.println(Secondresult.getClass().getName());
    }
    
    
    public void ThirdTask() {
    	
    	ReadingAndStoringNumbers checkTheInput = new ReadingAndStoringNumbers();
    	checkTheInput.ConvertTheResult();
    	ThirdTask.forEach((key,value) -> System.out.println("Key: "+key+",Value: "+value));
    	
    }
    
    public void ConvertTheResult() {
    	ThirdTask.clear();
    	List<Integer> numbers = Arrays.stream(Secondresult.split(",")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
    	ArrayList<Integer> ListOfNumbers = new ArrayList<>(numbers);
    	
    	for (int element = 0; element < ListOfNumbers.size();element++) {
    		int x = ListOfNumbers.get(element);
    		if (element == 0) {
    			ThirdTask.put("1st", x);
            } if (element == 1) {
            	ThirdTask.put("2nd", x);
            }  if (element == 2) {
            	ThirdTask.put("3rd", x);
            }  if (element == 3){
            	ThirdTask.put("4th", x);
            }  if (element == 4){
            	ThirdTask.put("5th", x);
            }  if (element == 5){
            	ThirdTask.put("6th", x);
            }  if (element == 6){
            	ThirdTask.put("7th", x);
            }
    	}
    	
    	int maxValue = Integer.MIN_VALUE;
    	String maxKey = "";
    	for (Map.Entry<String, Integer> entry : ThirdTask.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
    	System.out.printf("The highest score is %d and belongs to the %s student.\n", maxValue,maxKey);
    	
    	
    }
     
    	
    	
    
}
