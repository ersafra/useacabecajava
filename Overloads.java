

public class Overloads {
    String uniqueID;

    public int addNums(int a ,int b){
        return a + b;
    }
    public double addNums(double a , double b){
        return a + b;
    }
    public void setUniqueID(String theID){
        //um extenso codigo de validacao e entao
        uniqueID = theID;
    }
    public void setUniqueID(int ssNunber){
        String numString = "" + ssNunber;
        setUniqueID(numString);
    }
}
