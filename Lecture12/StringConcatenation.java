package Lecture12;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Anjana Raviteja";
        String lastName = "Anisetti";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName.length());

        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
