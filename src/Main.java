//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
}

class Phone {
    private String model;private double charge;

    public Phone(String model, double charge) {
        this.model = model;
        this.charge = charge;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        if (charge>100) this.charge = 100;
        if (charge<0) this.charge=0;
        if(charge>=0&&charge<=100) this.charge = charge;
    }
    public static void callin (double charge){
        if(charge>=2)
            System.out.println("Бип-бип");
    }
    public static double chargin (double charge, double chaTime) {
        if (charge < 100) charge += chaTime;
        if (charge > 100) charge = 100;
    return charge;
    }
}