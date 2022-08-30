import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailExample {
    private static Pattern pattern;
    private Matcher matcher1;
    private static final String Email_Regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(Email_Regex);
    }

    public boolean validate(String regex){
        matcher1 = pattern.matcher(regex);
        return matcher1.matches();
    }
}
