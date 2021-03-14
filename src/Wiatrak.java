public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak() {
        on = true;
        speed = FAST;
        radius = 3;
        color = "CZERWONY";
    }

    public Wiatrak(boolean on, int speed, int radius, String color) {
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public void Informacje() {
        String wlaczony;
        String szybkosc = null;
        if (on) {
            wlaczony = "Włączony";
        } else {
            wlaczony = "Wyłączony";
        }

        if (speed == SLOW) {
            szybkosc = "Wolny";
        } else if (speed == MEDIUM) {
            szybkosc = "Średni";
        } else if (speed == FAST) {
            szybkosc = "Szybki";
        }

        if (on) {
            String info = "Wiatrak jest " + wlaczony + ", porusza się w trybie " + szybkosc + ", jego średnica wynosi " + radius * 2 + " cm i ma kolor " + color;
            System.out.println(info);
        }
        else
        {
            String info = "Wiatrak jest " + wlaczony + " ma kolor " + color + ", a jego śednica wynosi " + radius * 2 + " cm.";
            System.out.println(info);
        }
    }
}
