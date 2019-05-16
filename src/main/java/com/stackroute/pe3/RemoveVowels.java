public class RemoveVowels {
    public String[] vowelsRemove(String[] instruments) {


        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aAEeiIOouU]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }

    public String nullPointerException(String s) {

        String prasanna="";
        if (s == "") {
            prasanna = "input string cannot be null";

        }

        return prasanna;
    }



    public String numericalValues(String s){
        String prasanna="";
        if (!s.matches("[a-zA-Z_]+")) {

            prasanna = "input string should have only characters";

        }

        return prasanna;

    }
}