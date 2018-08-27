package main;

public class Ruta{

    private String start;
    private String end;
    private int duration;

    public Ruta(){}

    public Ruta(String start, String end, int duration) {
        this.start = start;
        this.end = end;
        this.duration = duration;
    }

    public String travel(){
        return this.start + " - " + this.end + " | " + getDuration() + " Horas";
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}