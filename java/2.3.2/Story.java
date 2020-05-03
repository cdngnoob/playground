class Story {
    /* Folgende Ausgabe soll erzeugt werden:
    * Ich hab gerade nichts zu tun.
    * Das erledige ich gern für dich.
    * Das erledige ich gern für dich.
    * Ich lade meine Batterie.
    * Das erledige ich gern für dich.
    * Duke! Ich brauch Mal ne Pause... Frag mich später nochmal!
    * Das erledige ich gern für dich.
    * Das erledige ich gern für dich. */

    public static void main(String[] args) {
        Robot robin = new Robot();
        
        robin.hasTask = false;
        robin.batteryEmpty = false;
        robin.taskCounter = 0;
        
        // Robin hat keine Aufgabe und kann Duke daher nicht helfen
        robin.helpDuke();
        
        // Robin hat eine Aufgabe und hilft Duke 2 mal
        robin.hasTask = true;
        robin.helpDuke();
        robin.helpDuke();
        
        // Robins Batterie ist alle, er lädt sich auf
        robin.batteryEmpty = true;
        robin.helpDuke();
        
        // Robins Batterie ist wieder voll. Er hilft Duke noch ein paar mal und macht zwischendrin Pause
        robin.helpDuke();
        robin.helpDuke();
        robin.helpDuke();
        robin.helpDuke();
    }
}
