
public class FizzBuzz {
    public String execute(Integer number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        return number.toString();
    }
}
