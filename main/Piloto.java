package main;

public class Piloto{

    private String name;
    private String route;
    private int flight_hours = 0;
    private static double salary = 0;
    private static double tax = .16;

    public Piloto(){}

    public Piloto(String name, String route, int flight_hours) {
        this.name = name;
        this.route = route;
        this.flight_hours = this.flight_hours + flight_hours;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getFlight_hours() {
        return this.flight_hours;
    }

    public void setFlight_hours(int flight_hours) {
        this.flight_hours = this.flight_hours + flight_hours;
    }

    public double getSalary() {

        double aux;

        if (flight_hours <= 100) {
            aux = 1000 * tax;
            salary = 1000 - aux;
        } else {
            if (flight_hours <= 200) {
                aux = 2500 * tax;
                salary = 2500 - aux;
            } else {
                //salary = 2500 * tax;
                //double aux = 2000 - .05;
                double tax16 = 2500 * 0.16;
                double tax5 = 2000 * 0.05;
                tax16 = 2500 - tax16;
                tax5 = 2000 - tax5;
                salary = tax16 + tax5;
            }
        }
        return salary;
    }

    /**public void setSalary(float salary) {
        this.salary = this.salary + salary;
    }**/

    @Override
    public String toString() {
        return name + " tiene un salario de USD $" + getSalary();
    }

}