/**
 * @author Sravya Ravula
 * @version 1.0
 * @since 2022-08-05
 * This is an interface for a Calculator that allows addition, subtraction, multiplication, division,
 * getting remainder after division, raising to a power and finding any root of a value.
 */
public interface Calculation {

    public abstract Double add (String firstInputValue,String secondInputValue);
    public abstract Double subtract (String firstInputValue,String secondInputValue);
    public abstract Double multiply (String firstInputValue,String secondInputValue);
    public abstract Double divide (String firstInputValue,String secondInputValue);
    public abstract Double moduloDivision (String firstInputValue,String secondInputValue);
    public abstract Double raiseToPower (String firstInputValue,String secondInputValue);
    public abstract long root (String firstInputValue,String secondInputValue);
}
