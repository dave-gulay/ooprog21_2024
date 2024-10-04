import java.util.Scanner;

public class BloodData {
    
    private String bloodType;
    private String rhFactor;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = "A";  
        this.rhFactor = "-";   
    }

    public void inputBloodInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter blood type: ");
        this.bloodType = scanner.nextLine();

        System.out.print("Enter your Rh factor: ");
        this.rhFactor = scanner.nextLine();
    }

        public void displayBloodInfo() {
        System.out.println("Your blood type is: " + this.bloodType);
        System.out.println("Your Rh factor is: " + this.rhFactor);
    }
}