class Robot {

    // Die Hinweise (clue1 bis clue3) liegen hier als einzelne Zeichenketten vor
    String clue1 = "Boesewicht mag keine Papageien.";
    String clue2 = "Boesewicht kennt sich mit Computern aus.";
    String clue3 = "E-Mail des Boesewichts.";
    
    /* Duke haette die Hinweise lieber als Array. Weise sie daher bitte zu.
    / Lege hier dazu zuerst das Array an in der passenden Größe an. 
    / Wiederholung: Es gibt 2 Möglichkeiten dies zu tun.
    / Variante 1: String[] myArray = new String[numberOfElements];
    / Variante 2:   String[] myArray;
    /               myArray = new String[numberOfElements]
    */
    String[] clues = new String[3];
    
    // Speichere danach hier die Hinweise im Array ab, indem du sie den jeweiligen Positionen zuweist.
    // Die Reihenfolge ist hierbei wichtig.
    void saveClues(){
        clues[0] = clue1;
        clues[1] = clue2;
        clues[2] = clue3;
    }

}
