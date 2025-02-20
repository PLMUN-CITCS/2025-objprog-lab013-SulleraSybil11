public class ParametersAndArguments {
    public static void main(String[] args) {  //Defining the main method

        int roomWidth = 10;
        int roomHeight = 15;   //Declaring a variable using int

        int area = calculateArea(roomWidth, roomHeight);  //Declaring a calculated area using int


 System.out.println("The calculated area is: " + area);  //Printing the variables

   
    }

public static int calculateArea(int width, int height) { 
        int area = width * height;  //Add the calculation variables so the given int will be calculated

        return area;  //And add the return
    

    }
}