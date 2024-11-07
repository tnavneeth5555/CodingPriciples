
public class Dry {
    //example for non dry principle - WET
    public boolean validate_email_format_1(String email){
        String  permanentemail = "abc@nomail.com";
        if  (permanentemail.equals(email) ){
            return true;
        }
        return false;
    }

    public boolean validate_email_format_2(String email){
        String  permanentemail = "efg@nomail.com";
        if  (permanentemail.equals(email) ){
            return true;
        }
        return false;
    }

    //Example for Dry Principle - DRY
    public boolean validate_email_format(String email){
        String  permanentemail1 = "abc@nomail.com";
        String  permanentemail2 = "efg@nomail.com";
        if  (permanentemail1.equals(email) || permanentemail2.equals(email) ){
            return true;
        }
        return false;
    }

    /*
    "Don't Repeat Yourself" (DRY) is a software development principle that encourages developers to avoid duplicating
    code in a system. The main idea behind DRY is to reduce redundancy and promote efficiency by ensuring that a
    particular piece of knowledge or logic exists in only one place within a codebase.

    opposite to DRY wet PRINCIPLE STANDS FOR "WRITE EVERYTHING TWICE" - Don not do this
     */
    public static void main(String[] args) {
        Dry dry = new Dry();
        //If it is implemented as non dry principle we need to call both methods - WET
        dry.validate_email_format_1("abc@nomail.com");
        dry.validate_email_format_2("abc@nomail.com");

        //If it is implemented with dry principle we need to call only one methods - DRY
        dry.validate_email_format("abc@nomail.com");
    }
}
