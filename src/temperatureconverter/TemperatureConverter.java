
package temperatureconverter;

import java.util.Scanner;


public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        char inputType; //stores the temperature type of the initial value
        char outputType; //stores the temperature type that the inital vlaue should be converted to
        float inputValue; //store the temperature of the initail temperature to be convereted
        
        System.out.print("Input Type (F/C/K): ");
        inputType = reader.next().charAt(0); // requests temeperature type to be converted from user 
        
        System.out.print("Output Type (F/C/K): ");
        outputType = reader.next().charAt(0); //requests temperature type that the inital type should be converted to 
        
        System.out.print("Temperature: ");
        inputValue= reader.nextFloat(); //requests the temperature to be converted 
        
      
        switch(inputType) //calls respective funtions depending on the case (inital temperature type)
        {   
            case 'F':
                inputValue = fToC(inputValue);          //The functions in this first switch statement convert the temperature to Celsius first and then convert that 
                                                        //Celsius value to the requested temperature type (either Kelvin or Fahrenheit) in the second switch statement.
                break;
                
            case 'C':
                break;
            
            case 'K':
                inputValue = fToC(kToF(inputValue));
                break;
            
            default:
                System.exit(1);
        }
        
        switch(outputType)
        {
            case 'F':
                inputValue = kToF(cToK(inputValue));
             break;
             
            case 'C':
                break;
                
            case 'K':
                inputValue = cToK(inputValue);
                break;
            default:
                System.exit(1);
          
         }
        
        System.out.println(inputValue); //print out the converted temeperature 
        
    }
    
    //function to convert Fahrenheit to Celsius
    public static float fToC(float fVal)
    {
        return ((fVal-32.0f)*5.0f)/9.0f;
    }
    
    //function to convert Kelvin to Fahrenheit
    public static float kToF(float kVal)
    {
        return (((kVal-273.15f)*9.0f)/5.0f+32.0f);
    }
    
    //function to convert Celsius to Fahrenheit
    public static float cToK(float cVal)
    {
        return cVal+273.15f;
    }
   
}
