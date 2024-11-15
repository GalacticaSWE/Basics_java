package defaultPackage;
public class Menu {

    public static void main(String[] args) {
        menuOutput menu = new menuOutput();
        ReadingAndStoringNumbers Task = new ReadingAndStoringNumbers();
        Task.FirstTask(); // Starting with first task

        String UserInput = "";
        while (!UserInput.contains("4")) {
            menu.MenuOutput();
            UserInput = IOScanner.StringInput();

            switch (UserInput) {
                case "1":
                    ReadingAndStoringNumbers Task2 = new ReadingAndStoringNumbers();
                    Task2.SecondTask();
                    continue;
                case "2":
                    ReadingAndStoringNumbers Task21 = new ReadingAndStoringNumbers();
                    Task21.GetTheSecondResult();
                    continue;
                case "3":
                	ReadingAndStoringNumbers Task3 = new ReadingAndStoringNumbers();
                    Task3.ThirdTask();
                    continue;
                case "4":
                    System.out.println("Thank you for using our grading system. Have a nice day!");
                    UserInput = "4";
                    break;
                default:
                    System.out.println("Error - Invalid value. Please type between 1 and 4");
                    continue;
            }
        }
    } // End of main method

} // End of Menu class
