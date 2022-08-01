/**
 * @author Sravya Ravula
 * @version 1.0
 * @since  2022-08-05
 * class Calculator implements the interface Calculation. It contains methods to add, subtract, multiply, divide, get remainder,
 * get any power of a number and get any root of a number.
 * Handles PI and E (ignores case) as user inputs. Provides HELP feature to guide user.
 */
public class Calculator implements Calculation {

    /**
     * method add takes String input values from the user, converts them to double type, adds values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return returns Double addition result
     */
    @Override
    public Double add(String firstInputValue,String secondInputValue){
        //parses String input values to double type before addition
        Double add = Double.parseDouble(firstInputValue) + Double.parseDouble(secondInputValue);
        return add;
    }

    /**
     * method subtract takes String input values from the user, converts them to double type, subtracts values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double sresult after subtraction
     */
    @Override
    public Double subtract(String firstInputValue,String secondInputValue){
        //parses String input values to double type before subtracting
        Double subtract = Double.parseDouble(firstInputValue) - Double.parseDouble(secondInputValue);
        return subtract;
    }

    /**
     * method multiply takes String input values from the user, converts them to double type, multiplies values and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double result after multiplication
     */
    @Override
    public Double multiply(String firstInputValue,String secondInputValue){
        //parses String input values to double type before multiplication
        Double multiply = Double.parseDouble(firstInputValue) * Double.parseDouble(secondInputValue);
        return multiply;
    }

    /**
     * method divide takes String input values from the user, converts them to double type, divides first value by second value and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double result after division
     */
    @Override
    public Double divide(String firstInputValue,String secondInputValue){
        //parses String input values to double type before division
        Double divide = Double.parseDouble(firstInputValue) / Double.parseDouble(secondInputValue);
        return divide;
    }

    /**
     * method moduloDivision takes String input values from the user, converts them to double type, gets remainder value after division and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double remainder after division
     */
    @Override
    public Double moduloDivision(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculating the remainder value
        Double remainder = Double.parseDouble(firstInputValue) % Double.parseDouble(secondInputValue);
        return remainder;
    }

    /**
     * method raiseToPower takes String input values from the user, converts them to double type, raises to any power and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns Double value after raising to a power
     */
    @Override
    public Double raiseToPower(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculation. Uses Math class method.
        Double power = Math.pow(Double.parseDouble(firstInputValue),Double.parseDouble(secondInputValue));
        return power;
    }

    /**
     * method root takes String input values from the user, converts them to double type, calculates any root and returns double type output.
     * @param firstInputValue   first String input value entered
     * @param secondInputValue  second String input value entered
     * @return  returns long value after calculating the root
     */
    @Override
    public long root(String firstInputValue,String secondInputValue){
        //parses String input values to double type before calculation. Uses Math class method.
        long root = Math.round(Math.pow(Double.parseDouble(secondInputValue),1/Double.parseDouble(firstInputValue)));
        return root;
    }

    /**
     * method handleInputValues takes String input value from the user, if PI or E, ignores case, and assigns to Math constants.
     * else, calls confirmDouble method to validate input value.
     * @param inputValue    String input value entered
     * @return  assigns math class constants to String input, converts to String and returns value.
     */
     public String handleInputValues(String inputValue){
        Double handledInputValue = 0.0;
        if(inputValue.equalsIgnoreCase((MathNumbers.PI).toString())){
            handledInputValue = Math.PI;
            inputValue = handledInputValue.toString();
        }
        else if(inputValue.equalsIgnoreCase((MathNumbers.E).toString())){
            handledInputValue = Math.E;
            inputValue = handledInputValue.toString();
        }
        else {
            this.confirmDouble(inputValue);
        }
        return inputValue;
    }

    /**
     * method confirmDouble tests the String inputString to see if it is a valid
     * double number, if so it returns this double number as a String, if not, it
     * returns a null.
     * @param inputString -- a String entered via the Scanner to be tested via
     *                    Double.parseDouble() to see if it is a valid double number
     * @return String which is either a double value converted back to a String or null
     * if the passed-in String could not be converted to a String
     */
    public String confirmDouble (String inputString) {
        String doubleToStringReturnValue = "";
        try {
            double parseDoubleResult = Double.parseDouble(inputString);
            doubleToStringReturnValue = Double.toString(parseDoubleResult);
        } catch (NullPointerException e) {
            doubleToStringReturnValue = null;
        } catch (NumberFormatException e) {
            doubleToStringReturnValue = null;
        } catch (Exception e) { // Exception e -- should be the very last
            // it is the catch-all, and the most general
            doubleToStringReturnValue = null;
        }
        return doubleToStringReturnValue;
    }

     /**
     * method toString provides guidance to user on operators and features available for calculations using StringBuilder.
     * @return  returns built String value.
     */
    @Override
    public String toString() {
        //Used StringBuilder as this is not a multithreaded application. StringBuilder improves efficiency of code. Capacity of String
        //is automatically allocated as needed.
        StringBuilder displayHelp = new StringBuilder(2);
        displayHelp.append("Please enter operator/sign only from below options: " + "\n");
        displayHelp.append("Enter + to add, - to subtract, * to multiply, / to divide " + "\n");
        displayHelp.append("Enter % for modulo division, ^ to raise to any power, ~ for getting root" + "\n");
        displayHelp.append("You can also input PI or E in upper or lower case to calculate" + "\n");
        return displayHelp.toString();
    }
}
