fun main() {

    //TODO: Aufgabe 1 - Eure eigene Videothek

    //TODO: Aufgabe 2 - Den Bestand erfassen
    // Erstelle hierfür eine MutableList, die Werte des Datentyps String enthält. Befüllen kannst
    // du diese mit 3 deiner liebsten Filme.
    // Eine weitere MutableList erstellen, welche aus Double Werten besteht.
    // Für eure 3 Filme, 3 verschiedene
    // Preise wählen (bleibt hierbei z.B. zwischen 5,00€ und 20,00€)

    var lieblingsFilme: MutableList<String> = mutableListOf(
        "Der Grinch",
        "Eine Weihnachtsgeschichte",
        "Harry Potter und der Gefangene von Askaban")

    var filmPreise: MutableList<Double> = mutableListOf(
        7.50,
        10.00,
        9.99)

    // TODO: Aufgabe 3 - Den Kunden begrüßen
    //  Kunden begrüßen
    //  Kunden gesamtes Sortiment (erst Liste der Namen, dann Liste der dazugehörigen Preise) nennen

    println("Herzlich Willkommen bei Majas Filmpalast! Aktuell haben wir ${lieblingsFilme.size} Filme im Angebot!")
    println(lieblingsFilme)
    var index = lieblingsFilme.indexOf("Der Grinch")
    var indexPreis = filmPreise.indexOf(7.5) // println(indexPreis)

    var index2 = lieblingsFilme.indexOf("Eine Weihnachtsgeschichte")
    var indexPreis2 = filmPreise.indexOf(10.0) // println(indexPreis2)

    var index3 = lieblingsFilme.indexOf("Harry Potter und der Gefangene von Askaban")
    var indexPreis3 = filmPreise.indexOf(9.99) // println(indexPreis3)

    println("${lieblingsFilme[index]} kostet ${filmPreise[indexPreis]}€.")
    println("${lieblingsFilme[index2]} kostet ${filmPreise[indexPreis2]}€.")
    println("${lieblingsFilme[index3]} kostet ${filmPreise[indexPreis3]}€.")

    // TODO: Aufgabe 4 - Den Kunden bedienen
    //  Kunden den günstigsten Film mit dem entsprechenden Preis nennen
    //  Kunden gefragt werden, welcher der Filme (aus dem ganzen Sortiment) ihn zum Kauf interessiert

    var guenstigsterFilm = filmPreise.indexOf(filmPreise.min())
    var guenstigsterFilmPreis = filmPreise[guenstigsterFilm]
    var guenstigsterFilmName = lieblingsFilme[guenstigsterFilm]

    // var guenstigsterFilmName = lieblingsFilme.elementAt(filmPreise.indexOf(guenstigsterFilmPreis))
    //var guenstigsterFilmName = filmPreise.indexOf(guenstigsterFilmPreis)
    /*  var guenstigsterFilmName = filmPreise.elementAt(filmPreise.indexOf(guenstigsterFilmPreis)) */
    /* var guenstigsterFilmPreis = filmPreise.indexOf(filmPreise.min())
    var guenstigsterFilmName = filmPreise[guenstigsterFilmPreis] */
    // println(filmPreise.min())


    println("Aktuell kostet unser günstigster Film ${guenstigsterFilmName}  ${guenstigsterFilmPreis}€.") // TODO: AUSGEBEN WIE DER FILM HEIßT


    println("Guten Tag, für welchen Film interessieren Sie sich?")

    println("Bitte nennen Sie mir Ihr Wunschprodukt!")
    var kundenWunsch = readln()!!
    var kundenWunschindex = kundenWunsch.indexOf(kundenWunsch)
    var kundenWunschPreis = filmPreise[kundenWunschindex]
    var kundenPreis = lieblingsFilme.find {it.toString() == kundenWunsch }
    println("Sie haben ${kundenWunsch} gewählt. Dieser Film kostet ${kundenWunschPreis}.")


    // TODO: Aufgabe 5 - Den Kauf abwickeln

    var anfangsBudget: Double = 50.00
    var endBudget = anfangsBudget - kundenWunschPreis

    println("Sie haben den Film ${kundenWunsch} gekauft und Ihr neues Budget beträgt jetzt ${endBudget}€!")

    lieblingsFilme.removeAt(kundenWunschindex)
    filmPreise.removeAt(kundenWunschindex)
    println("Aktuelles Sortiment nach Entfernung von ${kundenWunsch}: Filme: ${lieblingsFilme} Preise: ${filmPreise}.")
    println("Anzahl der Filme im Angebot ${lieblingsFilme.size} mit ihren dazugehörigen Preisen ${filmPreise.size}.")

    // TODO: Aufgabe 6 - Erweiterung des Sortiments

    lieblingsFilme.add(0,"The Batman")
    filmPreise.add(0,19.99)

    println("Herzlich Willkommen bei Majas Filmpalast! Aktuell haben wir ${lieblingsFilme.size} Filme im Angebot!")

    println("${lieblingsFilme[0]} kostet ${filmPreise[0]}€, ${lieblingsFilme[1]} kostet ${filmPreise[1]}€ und" +
            " ${lieblingsFilme[2]} kostet ${filmPreise[2]}€")

    println("Bitte nennen Sie mir Ihr Wunschprodukt!")
    var wunsch = readln()!!
    var wunschindex = wunsch.indexOf(wunsch)

    var wunschpreis = filmPreise[wunschindex]

    var preis = lieblingsFilme.find {it.toString() == wunsch }
    println("Sie haben ${wunsch} gewählt. Dieser Film kostet ${wunschpreis}.")

    var neuesBudget = anfangsBudget - wunschpreis

    println("Sie haben den Film ${wunsch} gekauft und Ihr neues Budget beträgt jetzt ${neuesBudget}€!")

    lieblingsFilme.removeAt(wunschindex)
    filmPreise.removeAt(wunschindex)

    println("Aktuelles Sortiment nach Entfernung von ${wunsch}: Filme: ${lieblingsFilme} Preise: ${filmPreise}.")

    // TODO: Aufgabe 7 - System überarbeiten

    var neueProduktListe = mutableMapOf<String,Double>(
        "Der Grinch" to 7.50,
        "Eine Weihnachtsgeschichte" to 10.00,
        "Harry Potter und der Gefangene von Askaban" to 9.99,
        "The Batman" to 19.99)

    // TODO: Aufgabe 8 - Ist der Film im Sortiment?

    println("Nach welchem Film suchen Sie?")
    var gesuchterFilm = readln()!!

    //var gesuchterFilmPreis = filmPreise[gesuchterFilmIndex]
    var gesuchterFilmPreis = neueProduktListe[gesuchterFilm]
    var kunde3Budget= anfangsBudget - gesuchterFilmPreis!!


    println("Wir haben den Film ${gesuchterFilm} aktuell auf Lager: ${neueProduktListe.containsKey(gesuchterFilm)}." +
            " Er kostet aktuell ${neueProduktListe.get(gesuchterFilm)}")


    println("Sie haben den Film ${gesuchterFilm} gekauft und Ihr neues Budget beträgt jetzt ${kunde3Budget}€!")


    neueProduktListe.remove(gesuchterFilm,gesuchterFilmPreis)

    println("Aktuelles Sortiment nach Entfernung von ${gesuchterFilm}: ${neueProduktListe}.")

    //TODO: Aufgabe 9 - Überblick verschaffen

    println("Alle Filmnamen: ${neueProduktListe.keys}!")
    println("Alle Filmpreise: ${neueProduktListe.values}!")
}

