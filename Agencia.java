import main.Piloto;
import main.Ruta;

public class Agencia{

    public static void main(String[] args) {

        Ruta r1 = new Ruta("Medellin", "Ciudad Bogotica", 2);
        Ruta r2 = new Ruta("Ciudad Bogotica", "Villa Chica", 80);
        Ruta r3 = new Ruta("Villa Chica", "Mordor", 160);

        Piloto ana = new Piloto("Ana", r1.travel(), r1.getDuration());
        Piloto diego = new Piloto("Diego", r1.travel(), r1.getDuration());
        Piloto carlos = new Piloto("Carlos", r3.travel(), r3.getDuration());

        System.out.println(ana.getRoute());
        System.out.println(ana.toString());
        System.out.println("----------------------\n");

        diego.setFlight_hours(r1.getDuration());
        diego.setFlight_hours(r2.getDuration() * 2);
        diego.setFlight_hours(r3.getDuration() * 2);
        System.out.println(r1.getStart() + " - " + r3.getEnd() + " | " + (diego.getFlight_hours() / 2) + " Horas");
        System.out.println(r3.getEnd() + " - " + r1.getStart() + " | " + (diego.getFlight_hours() / 2) + " Horas");
        System.out.println(diego.toString());
        System.out.println("----------------------\n");

        carlos.setFlight_hours(r2.getDuration());
        System.out.println(r3.getEnd() + " - " + r2.getStart() + " | " + carlos.getFlight_hours() + " Horas");
        System.out.println(diego.toString());




    }

}