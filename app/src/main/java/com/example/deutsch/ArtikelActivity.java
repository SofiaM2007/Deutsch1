package com.example.deutsch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ArtikelActivity extends AppCompatActivity {
    //1-der 2-die 3-das



    String wordsa1[] =  new String[] {
            "1Wochentag", "1Montag", "1Dienstag", "1Mittwoch", "1Freitag","1Samstag", "1Sonntag", "1Donnerstag", "1Frühling",
            "1Sommer", "1Herbst", "1Winter", "1Januar", "1Februar","1März", "1April", "1Mai", "1Juni",
            "1Juli", "1August", "1September", "1Oktober", "1November","1Dezember", "1Meter", "1Zentimeter", "1Quadratmeter",
            "3Prozent", "1Liter", "3Gramm", "3Kilogramm", "3Pfund","2Welt", "3Land", "2Stadt", "3Dorf",
            "2Straße", "1Platz", "1Ort", "1Anfang", "2Mitte","1Teil", "3Wetter", "1Grad", "2Sonne",
            "1Wind", "1Regen", "1See", "3Meer", "3Feuer","1Baum", "2Blume", "3Kind", "1Junge",
            "3Mädchen", "1Jugendliche", "1Erwachsene", "1Herr", "1Mann","2Frau", "2Dame", "1Mensch", "1Gruß",
            "2Bitte", "1Dank ", "2Frage", "2Entschuldigung", "2Antwort","2Hilfe", "3Telefon", "3Handy", "1Anruf",
            "1Anrufbeantworter", "3Glück", "2Tochter", "1Bruder", "2Familie","2Schwester", "2Ehefrau", "1Verwandte", "1Ehemann",
            "1Partner", "2Mutter", "2Großmutter", "1Vater", "1Großvater","2Oma", "1Opa", "1Sohn", "1Hund",
            "1Bekannte", "1Freund", "2Party", "2Disco", "2Hochzeit","2Einladung", "1Gast", "1Glückwunsch", "3Geschenk",
            "1Hunger ", "1Durst ", "1Appetit ", "3Essen", "3Frühstück","3Glas", "2Flasche", "2Bäckerei", "3Café",
            "3Restaurant", "2Speisekarte", "3Lebensmittel", "2Butter", "1Fisch","3Ei", "3Fleisch", "3Brot", "3Hähnchen",
            "3Brötchen", "1Schinken", "1Kuchen", "3Öl", "3Salz","1Reis", "3Obst ", "3Gemüse", "1Apfel",
            "2Kartoffel", "2Banane", "1Salat", "2Birne", "2Tomate","3Getränk", "1Saft", "1Tee", "3Wasser",
            "1Kaffee", "3Bier", "2Milch", "1Wein", "2Anzeige","2Miete", "2Wohnung", "3Apartment", "1Vermieter",
            "3Haus", "1Eingang", "2Dusche", "1Ausgang", "1Balkon","2Halle", "2Küche", "1Stock", "2Toilette",
            "1Aufzug", "2Treppe", "2Ecke", "1Raum", "3Zimmer","2Reparatur", "2Farbe", "1Anschluss", "3Bad",
            "1Schlüssel", "3Bett", "1Schrank", "3Sofa", "1Kühlschrank","1Tisch", "1Herd", "3Bild", "3Licht",
            "2Uhr", "3Hobby", "3Kino", "2Freizeit", "1Garten","3Buch", "2Zeitung", "3Lied", "1Film",
            "2Zigarette", "1Sport", "1Verein", "3Schwimmbad", "1Fußball","1Bogen", "1Laden", "3Geschäft", "1Kiosk",
            "2Kasse", "3Angebot", "1Prospekt", "2Tasche", "2Größe","2Jacke", "1Verkäufer", "2Kleidung", "1Schuh",
            "1Preis", "2Heimat", "1Ausländer", "2Reise", "3Hotel","3Reisebüro", "2Rezeption", "1Reiseführer", "3Doppelzimmer",
            "1Koffer", "3Einzelzimmer", "3Gepäck ", "2Halbpension ", "2Karte","2Abfahrt", "1Ausflug", "1Plan", "1Abflug",
            "2Eile ", "2Ankunft", "2Sehenswürdigkeit", "3Ausland ", "3Auto","3Fahrrad", "2Autobahn", "3Taxi", "1Lkw",
            "1Fahrer", "2Fahrkarte", "1Bus", "3Ticket", "2Haltestelle","2Bahn", "2S-Bahn", "2Straßenbahn", "1Zug",
            "1Bahnhof", "1Bahnsteig", "1Automat", "3Gleis", "3Flugzeug","2Maschine", "1Flughafen", "3Schild", "1Kopf",
            "1Arm", "2Hand", "3Bein", "1Fuß", "1Bauch","3Haar", "1Mund", "3Auge", "3Fieber",
            "1Blick", "1Arzt", "3Gewicht", "1Doktor", "3Leben","1Kindergarten", "2Hausaufgabe", "1Test", "2Prüfung",
            "1Bleistift", "2Schule", "1Kugelschreiber", "2Klasse", "3Papier","1Schüler","1Lehrer", "3Studium", "2Gruppe", "1Student",
            "2Lösung", "1Unterricht", "2Pause", "3Ergebnis", "3Thema","2Information", "3Beispiel", "1Fehler", "3Praktikum",
            "2Aufgabe", "1Kurs", "1Buchstabe", "2Sprache", "3Wort","2Aussage", "1Satz", "1Text", "1Beruf",
            "1Chef", "1Kollege", "2Arbeit", "1Kunde", "1Job","2Anrede", "2Ansage", "2Firma", "2Durchsage",
            "3Gespräch", "2Praxis", "3Problem", "2Hausfrau", "1Hausmann","1Schluss", "1Arbeitsplatz", "1Urlaub", "2Stelle",
            "2Führung", "1Computer", "3Internet ", "3Fax", "1Drucker","1Eintritt", "1Zoll", "1Termin", "2Polizei",
            "1Schalter", "1Ausweis", "1Pass", "2Nummer", "2Papiere ","2Anmeldung", "2Ordnung", "2Auskunft", "3Foto",
            "1Beamte", "3Formular", "1Geburtsort", "3Alter", "1Familienstand","1Name", "1Vorname", "1Familienname", "3Geburtsjahr",
            "2Unterschrift", "1Geburtstag", "2Bank", "3Konto", "2Bank","2Kreditkarte", "3Geld", "2Rechnung", "2Post",
            "2Postleitzahl", "1Brief", "2Briefmarke", "1Absender", "1Empfänger","2Vorwahl", "2Adresse"};

    String wordsa2[] =  new String[] {
            "2Hauptstadt,",  "1Park,",  "3Zentrum,",  "2Zentren",  "2Kirche,",  "3Schloss,",  "3Rathaus,",  "2Messe,",
            "1Zoo,",  "3Kaufhaus,",  "3Einkaufszentrum,",  "1Markt,",  "1Flohmarkt,",  "2Reihe,",  "2Kette,",
            "1Himmel,",  "3Gewitter,",  "2Wolke,",  "1Schnee",  "2Natur,",  "2Landschaft,",  "1Berg,",  "2Insel,",
            "1Fluss,",  "1Wald,",  "2Pflanze,",  "3Blatt,",  "2Rose,",  "2Ruhe",  "3Tier,",  "1Vogel,",  "2Katze,",
            "3Pferd,",  "3Schwein,", "1Motor,",  "1Wagen,",  "1Motorroller,",  "1Fuhrerschein,",  "2Garage,",  "1Unfall,",
            "2Werkstatt,",  "1Verkehr,",  "3Verkehrsmittel,",  "2Verspatung,",  "1Stadtplan,",  "1Fahrplan,",  "2Brucke,",
            "2Ampel,",  "3Ziel,",  "2Nahe", "1Tourist,",  "1Rucksack,",  "1Weg,",  "1Flug,",  "3Schiff,",  "2Unterkunft,",
            "1Strand,",  "2Jugendherberge,",  "1Rundgang,",  "2Fundsache,",  "1Umzug,",  "3Stockwerk,",  "3Erdgeschoss,",
            "3Wohnzimmer,",  "3Schlafzimmer,",  "1Keller,",  "2Heizung,",  "3Fenster,",  "2Lampe,",  "1Stuhl,",  "2Tur,",
            "1Nachbar,", "1Haushalt,",  "3Mittel,",  "2Reinigung,",  "2Seife,",  "2Wasche,",  "3Handtuch,",  "1Schirm,",
            "1Kalender,",  "3Ding,", "2Sache,",  "3Ding]",  "3Geschirr,",  "1Loffel,",  "3Messer,",  "2Gabel,",
            "2Tasse,",  "1Teller,",  "1Topf,",  "2Schere,",  "1Mull",  "3Mittagessen,",  "3Rezept,",  "3Gericht,",  "2Portion,",
            "3Stuck,",  "1Rest,",  "1Supermarkt,",  "3Mineralwasser,",  "3Rind",  "2Wurst,",  "1Kase,",  "2Bohne,",  "2Orange,",
            "2Zitrone,",  "1Hamburger,",  "2Nudeln",  "2Pizza,",  "2Süßigkeit,",  "1Zucker,",  "3Eis",  "2Schokolade,",
            "2Torte,",  "2Suppe,", "2Mode,",  "3T-Shirt,",  "2Bluse,",  "3Hemd,",  "3Kleid,",  "1Pullover,",  "2Hose,",
            "2Jeans,",  "1Rock,",  "1Anzug,",  "1Mantel,",  "1Stiefel,",  "2Mutze,",  "1Ring,",  "2Brille,",  "1Traum,",
            "1Stress,",  "2Ahnung,",  "2Angst,",  "2Lust,",  "2Person,",  "1Kontakt,",  "1Rentner,",  "1Besuch,",  "2Feier,",
            "3Fest,",  "2Feier",  "1Wunsch,",  "3Paar,",  "1Ehepartner,",  "2Luge,",  "3Interesse,",  "1Spaß",
            "2Musik,",  "3Radio",  "2Sendung,",  "2Gitarre,",  "3Klavier,",  "2Zeitschrift,",  "3Ratsel,",  "1Krimi,",
            "1Comic,",  "2Kamera,",  "1Fotoapparat,",  "1Spaziergang,",  "3Zelt,",  "3Spiel,",  "1Witz,",  "1Zirkus,",
            "1Club,",  "2Kultur,",  "2Kunst,",  "2Veranstaltung,",  "2Ausstellung,",  "3Festival,",  "3Museum,",  "2Museen",
            "3Theater,",  "1Titel,", "3Plakat,",  "3Poster,",  "1Fan,",  "1Star,",  "2Tour,",  "3Konzert,",  "3Krankenhaus,",
            "2Krankenkasse,",  "2Krankheit,",  "2Gesundheit",  "2Grippe,",  "1Schmerz,",  "2Sprechstunde,",  "2Apotheke,",
            "3Medikament,",  "2Tablette,",  "3Gesicht,",  "3Ohr,",  "1Zahn,",  "1Hals,",  "1Korper,",  "1Rucken,",  "1Magen,",
            "1Fuß,",  "2Creme,",  "2Kosmetik",  "3Parfum,",  "3Training,",  "2Mannschaft,",  "1Sportplatz,",  "1Ball,",
            "1Basketball",  "1Volleyball",  "3Tennis",  "1Ski,",  "2Nachricht,",  "1Artikel,",  "2Geschichte,",  "2Notiz,",
            "1Zettel,", "2Meinung,",  "2Idee,",  "3Gegenteil,",  "1Unterschied,",  "2Ausbildung,",  "2Universitat,",
            "3Stipendium,",  "2Stipendien",  "3Fach,",  "2Tafel,",  "3Heft,",  "1Stift,",  "2Kenntnisse,",  "2Ubersetzung,",
            "3Quiz,",  "2Note,",  "2Bibliothek,",  "2Cafeteria,",  "2Cafeterien",  "2Ferien",  "3Zeugnis,",  "2Bewerbung,",
            "2Erfahrung,",  "3Interview,",  "1Wettbewerb,",  "1Vertrag,",  "1Mitarbeiter,",  "1Babysitter,",  "2Baustelle,",
            "3Instrument,",  "3Buro,",  "3Team,",  "3Produkt,",  "3Projekt,",  "2Qualitat,",  "1Service,",  "1Tipp,",
            "1Workshop,",  "1Feierabend,",  "1Feiertag,",  "1Kredit,",  "3Taschengeld,",  "2Geldborse,",  "2Ermäßigung,",
            "3Paket,",  "2Postkarte,",  "2Situation,",  "2Erlaubnis,",  "1Apparat,",  "3Gerat,",  "1Fernseher,",  "1Laptop,",
            "3Tablet,",  "3Mobiltelefon,",  "3E-Book,",  "1Blog,",  "2Website,",  "2Webseite,",  "2Homepage,",  "3Programm,",
            "2Mailbox,",  "2E-Mail,",  "3Passwort,",  "1Link,",  "2Datei,",  "3Mal,",  "2Menge,",  "2Zahl,",  "2Band,",
            "3Band,",  "1Band,",  "3Gehalt,",  "1Gehalt,",  "2See,",  "1See,",  "1Bescheid,",  "1Vorschlag,"};


    String wordsb1[] =  new String[] {
            "3Baby,",  "1Babysitter,",  "2Band,",  "2Bar,",  "1Bikini,",  "1Blog,",  "3Camp,",  "2Castingshow,",  "1CD-Player,",
            "1Chat(room),",  "1Chip,",  "2City,",  "1Club,",  "1Computer,",  "3e-Bike,",  "3e-Book,",  "1Fan,",  "3Fax,",  "3Festival,",
            "2Fitness,",  "1Hamburger,",  "1Hit,",  "2Homepage,",  "3internet",  "1Jazz",  "1Job,",  "1Killer,",  "1laptop,",  "1link,",
            "2(D,",  "2Mailbox,",  "1Manager,",  "2Mobilbox,",  "3Mountainbike,",  "2Plattform,",  "3Poster,",  "3Puzzle,",  "2Show,",
            "3Smartphone,",  "1Snack,",  "2Software,",  "1Song,",  "1Spot,",  "3Steak,",  "1Swimmingpool,",  "3taxi,",  "3team,",
            "1terminal,",  "2tour,",  "1trend,",  "3t-Shirt,",  "1User,", "2Aufgabe,",  "1Antwortbogen,",  "2Anzeige,",  "2Anzeigen",
            "2Aussage,", "2Durchsage,",  "2einleitung,",  "2Folie,",  "3Hilfsmittel,",  "1Kommentar,",  "2losung,",
            "2richtige",  "1Moderator,",  "1radio-",  "2Moderatorin,",  "3Modul,",  "2Prasentation,",  "2Struktur",  "1Punkt,",
            "2ruckmeldung,",  "2ruckmeldung.",  "2Struktur,",  "2Struktur",  "1textaufbau", "2Krippe",  "2Grundschule",  "3Gymnasium",
            "2(Fach-)Hochschule,",  "2Volkshochschule", "1Deutsche,",  "2Deutsche,",  "1europaer,",  "2europaerin,",  "1Osterreicher,",
            "2Osterreicherin,",  "2Schweiz",  "1Schweizer,",  "2Schweizerin,",  "1Grieche,",  "2Griechin,",  "2turkei",  "1turke,",
            "2turkin,",  "2Ukraine",  "1Ukrainer",  "2Ukrainerin,",  "1Bund,",  "1Bundeskanzler,",  "2Bundeskanzlerin,",
            "1Bundesprasident,",  "2Bundesprasidentin,",  "1Burgermeister,",  "2Burgermeisterin,",  "2Demokratie,",  "2europaische",
            "2Gemeinde",  "1Minister,",  "2Ministerin,",  "3Parlament,",  "3europaische",  "2Partei,",  "2regierung,",  "1Staat,",
            "3Bundesland",  "1Bundestag",  "3Bundesland",  "1Nationalrat",  "1Ammann",  "2Ammannin,",  "1Bundesrat,",  "2Bundesratin,",
            "2Schweizerische",  "1Kanton",  "1Nationalrat",  "1regierungsrat,",  "2regierungsratin,",  "1Stadtprasident,",
            "2Stadtprasidentin,",  "1Standerat","1Affe,",  "1Bar,",  "2Biene,",  "1elefant,",  "2ente,",  "1Fisch,",  "2Fliege",
            "2Giraffe,",  "1Hase,",  "1Hund,",  "3insekt,",  "2Katze,",  "3Krokodil,",  "2Kuh,",  "1lowe,",  "2Maus,",  "2Mucke,",
            "3Pferd,",  "1Pinguin,",  "3Schaf,",  "2Schildkrote,",  "2Schlange,",  "3Schwein,",  "1Vogel,",  "1tag,",  "1Morgen,",
            "1Fruh",  "1Vormittag,",  "1Mittag,",  "1Nachmittag,",  "1Abend,",  "2Nacht,",  "1Nacht",  "2Mitternacht",
            "1Wochentag",  "3Wochenende,",  "1Montag",  "1Dienstag",  "1Mittwoch",  "1Donnerstag",  "1Freitag",  "1Samstag",
            "1Sonnabend",  "1Sonntag",  "2Sekunde,",  "2Minute,",  "2Stunde,",  "1tag,",  "2Woche,",  "1Monat,",  "3Jahr,",
            "3Jahrzehnt,",  "3Jahrhundert,",  "3Jahrtausend,", "2Abbildung,",  "3Abenteuer,",  "2Abfahrt,",  "1Abfall,",
            "1Abfalleimer,",  "3Abitur",  "3Abonnement,",  "1Abschluss,",  "1Abschnitt,",  "1Absender,",  "2Absenderin,",
            "2Absicht,",  "2Abteilung,",  "1Abwart,",  "2Abwartin,",  "2Adresse,",  "2Ahnung",  "2Aktion,",  "2Aktivitat,",
            "1Alarm,",  "1Alkohol",  "1Alltag",  "3Alphabet,",  "3Alter",  "3Altenheim,",  "3Altersheim,",  "2Alternative,",
            "2Ampel,",  "3Amt,",  "1Anbieter,",  "3Angebot,",  "2Anderung,",  "1Anfang,",  "2Angabe,-n",  "1Angehorige,",
            "2Angehorige,",  "2Angst,",  "2Ankunft",  "2Anlage,",  "2Anleitung,",  "2Anmeldung,",  "2Annonce,",  "2Anrede,",
            "1Anruf,",  "1Anrufbeantworter,",  "2Ansage,",  "1Anschluss,",  "1Anspruch,",  "1Angestellte,",  "2Angestellte,",
            "1Antrag,",  "2Antwort,",  "1Anwalt,",  "2Anwaltin,",  "2Anzeige,",  "1Anzug,",  "3Apartment,",  "1Apfel,",
            "2Apotheke,",  "1Apparat,",  "1Appetit",  "2Aprikose,",  "2Arbeit,",  "1Arbeiter,",  "2Arbeiterin,",
            "2Arbeitserlaubnis",  "2Arbeitslosigkeit",  "1Arbeitsplatz,",  "2Arbeitsstelle,", "1Architekt,",  "2Architektin,",
            "1Arger",  "1Arm,",  "2Art,",  "1Artikel,",  "1Arzt,",  "2Arztin,",  "3Asyl",  "1Atem",  "1Aufenthalt,",
            "2Aufforderung,",  "2Aufgabe,",  "2Aufnahme,",  "1Auftrag,",  "1Auftritt,",  "1Aufzug,",  "3Auge,",
            "1Augenblick,",  "2Ausbildung,",  "1Ausdruck,",  "1Ausdruck,",  "2Ausfahrt,",  "1Ausflug,",  "2Ausgabe,",
            "1Ausgang,",  "2Aushilfe,",  "2Auskunft,",  "3Ausland", "1Auslander,",  "2Auslanderin,",  "2Ausnahme,",
            "2Aussicht,",  "2Aussprache",  "2Ausstellung,",  "2Auswahl,",  "1Ausweis,",  "3Auto,",  "2Autobahn,",
            "1Automat,",  "1Autor,",  "2Autorin,",  "2Backerei,",  "3Bad,",  "2Badewanne,",  "2Bahn,",  "2Straßenbahn,",
            "2U-Bahn,",  "1Bahnhof,",  "1Bahnsteig,",  "1Balkon,",  "1Ball,",  "3Ballett,",  "2Banane,",  "2Bank,",  "2Bank,",
            "1Bancomat,",  "2Bankleitzahl,",  "2Bankomat-Karte,",  "3Bargeld",  "1Bart,",  "1Basketball,",  "2Batterie,",
            "1Bauch,",  "1Bau,",  "2Baustelle,",  "1Bauer,",  "1Baum,",  "1Beamte,",  "2Beamtin,",  "1Bedarf",  "2Bedeutung,",
            "2Bedienungsanleitung,",  "2Bedingung,",  "1Beginn",  "2Begrundung,",  "2Behorde,",  "3Beispiel,",  "1Beitrag,",
            "1Bekannte,",  "2Bekannte,",  "1Beleg,",  "3Benzin",  "2Beratung",  "1Bereich,",  "1Berg,",  "1Bericht,",  "1Beruf,",
            "2Beschaftigung",  "1Bescheid,",  "2Beschreibung", "2Besprechung,",  "2Besserung",  "2Bestatigung,",  "1Besuch,",
            "1Betrag,",  "1Betreuer,",  "2Betreuerin,",  "2Betreuung",  "1Betrieb,",  "1Betriebsrat,",
            "2Betriebsratin,",  "3Bett,",  "2Bevolkerung",  "2Bewegung,",  "1Beweis,",  "2Bewerbung,",
            "1Bewohner,",  "2Bewohnerin,",  "2Beziehung,",  "2Bibliothek,",  "3Bier",  "3Bild,",  "1Bildschirm,",
            "3Billett,",  "2Biologie",  "2Birne,",  "2Bitte,",  "3Blatt,",  "1Bleistift,",  "1Blick,",  "1Blitz,",
            "2Blume,",  "2Bluse,",  "3Blut",  "1Boden,",  "1Bogen,",  "2Bohne,",  "3Boot,",  "2Botschaft,",  "1Braten,",
            "2Breite,",  "2Bremse,",  "1Brief,",  "1Briefkasten,",  "2Briefmarke,",  "1Brieftrager,", "1Briefumschlag,",
            "2Brieftasche,",  "2Brille,",  "2Broschure,",  "3Brot,",  "3Brotchen,",  "3Brotli,",  "2Brucke,",  "1Bruder,",
            "2Brust",  "1Bub,",  "3Buch,",  "2Buchhandlung,",  "1Buchstabe,",  "2Buchse,",  "3Buffet,",  "2Buhne,",  "2Burg",
            "1Burger,",  "2Burgerin,",  "3Buro,",  "2Burste,",  "2Zahnburste,",  "1Bus,",  "2Butter",  "3Cafe,",
            "2Cafeteria,",  "2Chance,",  "1Chef,",  "2Chefin,",  "1Coiffeur,",  "2Coiffeuse,", "2Couch,",  "2Creme,",
            "1Cousin,",  "2Cousine,",  "2Dame,",  "2Datei,",  "3Datum,",  "2Daten",  "2Daten",  "2Decke,","1Doktor,",  "2Doktorin",
            "3Dokument",  "1Donner",  "2Dose,",  "1Dreck",  "2Droge",  "2Drogerie",  "1Drucker",  "2Durchsage",  "1Durchschnitt",
            "1Durst",  "2Dusche,",  "2Ecke,",  "2Ehe,",  "3Ei,",  "2Einbahnstraße,",  "1Einbrecher,",  "2Einbrecherin,",
            "1Einbruch,",  "1Eindruck,",  "2Einfahrt,",  "1Einfall,",  "1Einfluss,", "2Einfuhrung,",  "1Eingang,",  "1Einkauf,",
            "3Einkommen,",  "2Einladung,",  "2Einnahme,",  "2Einrichtung,",  "3Einschreiben,",  "1Eintritt",  "1Einwohner,",
            "2Einwohnerin,",  "2Einzahlung,",  "3Eis", "2Eisenbahn,", "2Eltern",  "1Empfang,",  "1Empfanger,",
            "2Empfehlung,",  "1Stra?e.",  "2Ferien",  "3Problem",  "3nicht",  "2Anderung",  "1Firma",  "2Einzahlung", "2einzigen",
            "3einzige",  "2Daten",  "2genaue",  "2Energie,",  "1Enkel,",  "2Enkelin,",  "2Entfernung,", "2Entlassung,", "2Entscheidung,",
            "2Entschuldigung,",  "2Enttauschung,",  "2Entwicklung,",  "2Erde",  "1Erdapfel,",  "3Erdgeschoss/",  "3Ereignis,",
            "2Erfahrung,",  "2Erfindung,",  "1Erfolg,",  "3Ergebnis,",  "2Erhohung,",  "2Erholung,",  "2Erinnerung,",  "2Erkaltung,",
            "2Erklarung,",  "2Erlaubnis",  "3Erlebnis,",  "2Erma?igung,",  "2Ernahrung",  "2Ernte,",  "2Eroffnung,",  "1Ersatz",
            "1Erwachsene,",  "2Erzahlung,",  "2Erziehung",  "3Essen,",  "1Essig",  "2Etage,",  "1Experte,",  "1Export,",  "2Fabrik,",
            "3Fach,",  "1Fachmann",  "2Fachfrau,",  "2Fachleute",  "2Fahigkeit,",  "2Fahre,",  "2Fahrbahn,",  "1Fahrer,",
            "2Fahrkarte,",  "1Fahrplan,",  "3Fahrrad,",  "3Fahrzeug,",  "1Faktor,",  "1Fall,",  "2Familie,",  "1Familienstand",
            "2Farbe,",  "3Faschierte",  "1Fasching,",  "2Fasnacht",  "1Fauteuil,",  "1Fehler,",  "2Feier,",  "1Feierabend",  "1Feiertag,",
            "3Feld,",  "3Fenster,",  "2Ferien",  "3Fest,",  "2Festplatte,",  "3Feuer",  "3Feuerzeug,",  "2Feuerwehr,",  "3Fieber",
            "2Figur,",  "1Film,",  "1Finger,",  "2Firma,",  "2Flache,",  "2Flasche,",  "1Fleck,",  "3Fleisch",  "1Fleischhauer,",
            "2Fleischhauerin,",  "2Flucht",  "1Flohmarkt,",  "2Flote,",  "1Flug,",  "1Flughafen,",  "3Flugzeug,",  "1Flur,",  "1Fluss,",
            "2Flussigkeit,",  "2Folge,",  "2Forderung,",  "2Forderung,",  "2Form,",  "3Formular,",  "2Forschung,",  "2Fortbildung,",
            "1Fortschritt,",  "2Fortsetzung,",  "3Forum,",  "3Foto,",  "1Fotoapparat,",  "1Fotograf,",  "2Fotografie,",  "2Frage,",
            "2Frau,",  "2Freiheit", "2Freude",  "1Freund,",  "2Freundschaft,",  "1Friede,",  "1Friseur,",  "2Friseurin,", "3Fruhstuck",
            "1Fuhrerausweis,",  "1Fuhrerschein,",  "2Fuhrung,",  "3Fundburo,",  "1Fuß,",  "1Fußball,",  "1Fußganger,",  "2Fußgangerin,",
            "2Fu?gangerzone,",  "2Gabel,",  "2Galerie,",  "1Gang,",  "2Garage,",  "2Garantie",  "2Garderobe,",  "1Garten,",
            "3Gas",  "1Gast,",  "3Gasthaus,",  "2Gaststatte,",  "3Gebaude,",  "3Geback",  "3Gebiet,",  "3Gebirge",  "2Gebrauchsanweisung,",
            "2Gebuhr,",  "2Geburt,",  "1Geburtstag,",  "3Gedicht,",  "2Geduld",  "2Gefahr,",  "3Gefangnis,",  "3Gefuhl,",
            "1Gegner,",  "2Gegend,",  "1Gegensatz,",  "1Gegenstand,",  "3Gegenteil,",  "3Gehalt,",  "3Geheimnis,",  "1Gehsteig",
            "2Geldborse",  "2Gelegenheit",  "2Gemeinschaft,",  "3Gemuse",  "2Generation,",  "3Gepack",  "3Gerat,",  "3Gericht,",
            "3Geschenk,",  "2Geschichte,",  "3Geschirr",  "3Geschlecht,",  "1Geschmack",  "2Geschwindigkeit,",  "2Geschwister",
            "2Gesellschaft,",  "3Gesetz,",  "3Gesicht,", "3Gesprach,",  "2Gesundheit",  "3Getrank,",  "2Gewalt,",  "2Gewerkschaft,",
            "3Gewicht,",  "1Gewinn,",  "3Gewissen",  "3Gewitter,",  "2Gewohnheit,",  "3Gewurz,",  "3Gift,",  "2Gitarre,",  "3Gleis,",
            "3Gluck",  "1Gluckwunsch,",  "3Gold",  "3Golfspiel",  "1Gott,",  "2Grafik,",  "3Gras",  "2Gratulation,",  "2Grenze,",
            "3Grundstuck,",  "2Gruppe,",  "1Gru?,",  "3Haar,",  "3Hackfleisch",  "1Hafen,",  "3Hahnchen",  "2Halbpension",
            "2Halfte,",  "2Halle,",  "3Hallenbad,",  "1Hals,",  "1Halt",  "2Haltestelle,",  "1Hammer,",  "2Hand,",
            "1Handwerker,",  "2Handwerkerin,",  "1Handel",  "1Handler,",  "2Handlerin,",  "3Handy,",  "1Hauptbahnhof,",
            "3Haus,",  "2Hausaufgabe,",  "2Hausfrau/der",  "1Haushalt,",  "1Hausmeister,",  "2Hausmeisterin,",
            "3Heft,",  "3Heim,",  "2Heimat",  "3Heimweh",  "2Heizung,",  "1Held,",  "2Heldin,",  "2Hilfe",  "3Hemd,",
            "3Hend(e)l,",  "2Herausforderung,",  "1Herd,",  "1Herr", "3Herz,",  "1Himmel",  "1Hinweise,",  "2Hitze",  "3Hobby,",
            "2Hohe",  "2Hochzeit,",  "1Hof,",  "1Bauernhof,",  "2Hoffnung,",  "3Holz",  "1Honig", "1Horer,",  "2Horerin,",
            "1Zuhorer",  "2Hose,",  "3Hotel,",  "1Hugel,",  "1Humor",  "1Hunger",  "1Husten",  "1Hut,",  "2Hutte,",  "2Idee,",
            "1Imbiss",  "1Import,",  "2Industrie,",  "2Infektion,",  "2Information,",  "1Ingenieur,",  "1Inhalt,",  "2Insel,",
            "3Inserat,",  "3Institut,",  "3Instrument,",  "2Integration,",  "2Intelligenz",  "1Intensivkurs,",  "3Interesse,",
            "3Interview,",  "2Jacke,",  "2Jause",  "1Journalist,",  "2Journalistin,",  "2Jugend",  "1Jugendliche,",  "2Jugendliche,",
            "2Jugendherberge,",  "1Junge",  "3Kabel,",  "2Kabine,",  "1Kaffee",  "3Kaffeehaus,",  "1Kakao,",  "1Kalender,",
            "2Kalte",  "2Kamera,",  "1Kampf,",  "1Kanal,",  "1Kandidat,",  "2Kanne,",  "2Kantine,",  "3Kapitel,", "1Karneval,",
            "2Karotte",  "2Karriere,",  "2Karte,",  "2Chipkarte,",  "2Fahrkarte",  "2Kartoffel,",  "1Kase",  "2Kasse,",
            "2Kassette,",  "1Kasten",  "1Kasten",  "1Katalog,",  "2Katastrophe,",  "1Keller,",  "2Kenntnisse",  "3Kennzeichen,",
            "2Kerze,",  "2Kette,",  "3Kind,",  "1Kindergarten,",  "2Kindheit",  "3Kino,",  "1Kiosk,",  "2Kirche,",  "2Kiste,",
            "3Kissen,",  "2Klasse,",  "2Klassenarbeit",  "3Kleid,",  "2Kleidung",  "1Klick,",  "3Klima",  "2Klimaanlage,", "2Klingel,",
            "2Klinik,",  "1Klo?",  "2Kneipe,",  "3Knie,",  "1Knochen,",  "1Knodel,",  "1Knopf,",  "1Koch,",  "2Kochin,",  "1Koffer,",
            "1Kollege,",  "2Kollegin,",  "2Kommunikation",  "1Kompromiss,",  "2Konferenz,",  "2Konfiture,",  "1Konflikt,",
            "1Konig,",  "2Konkurrenz", "3Konsulat,",  "1Konsum",  "1Kontakt,",  "3Konto,",  "3Girokonto,",  "2Kontrolle,",
            "3Konzert,",  "1Kopf,",  "2Kopie,",  "1Kopierer,",  "1Korper,",  "1Korridor",  "3Kostum,",  "2Kraft,",  "3Kraftfahrzeug,",
            "3Kraftwerk,",  "1Kranke,",  "2Kranke,",  "3Krankenhaus,",  "2Krankenkasse,",  "1Krankenpfleger,",  "2Krankenschwester,",
            "1Krankenwagen,",  "2Krankheit,",  "1Kredit,",  "2Kreditkarte,",  "1Kreis,",  "3Kreuz,",  "2Kreuzung,",  "1Krieg,",
            "1Krimi,",  "2Krise,",  "2Kritik,",  "2Kuche,",  "1Kuchen,",  "1Kugelschreiber,",  "1Kuli,",  "1Kuhlschrank",  "2Kultur,",
            "1Kunde,",  "2Kundin,",  "2Kundigung,",  "2Kunst,",  "1Kunstler,",  "2Kunstlerin,",  "1Kunststoff,",  "1Kurs,",
            "1Kursleiter,",  "2Kursleiter,",  "2Kurve,",  "1Kuss,",  "2Kuste,",  "3Kuvert,",  "1Laden,",  "2Lage",  "3Lager,",
            "2Lampe,",  "3Land,",  "2Landwirtschaft",  "2Landschaft,","2Landung,",  "2Lange",  "2Langeweile",  "1Larm",  "1Laster,",
            "3Laufwerk,",  "2Laune,",  "1Lautsprecher,",  "3Leben",  "1Lebenslauf,",  "2Lebensmittel",  "3Leder",
            "2Lehre",  "2Lehrstelle,",  "1Lehrer,",  "2Lehrerin,",  "1Lehrling,",  "2Leistung,",  "1Leiter,",  "2Leiterin,",
            "2Leitung,",  "2Leiter,",  "1Leser,",  "2Leserin,",  "3Lexikon,",  "1Lift",  "2Limonade,",  "2Linie,",  "2Liste,",
            "2Literatur",  "3Loch,",  "1Loffel,",  "1Lohn,",  "2Losung,",  "2Luft",  "2Luge,",  "2Lust",  "3Madchen,",  "3Magazin,",
            "1Magen,",  "2Mahlzeit,",  "2Mahnung,",  "3Mal,",  "1Maler,",  "2Malerin,",  "1Mangel,",  "1Mann,",  "2Mannschaft,",
            "1Mantel,",  "2Mappe,",  "3Marchen,",  "2Margarine",  "2Marille,",  "2Marke,",  "1Markt,",  "2Marmelade,",  "2Maschine,",
            "3Material",  "2Matura",  "2Mauer,",  "1Mechaniker,",  "2Mechanikerin,",  "2Medien",  "3Medikament,",  "2Medizin",
            "3Meer,",  "3Mehl",  "2Mehrheit,",  "2Mehrwertsteuer", "2Meinung,",  "2meisten",  "1Meister,",  "2Meldung,",  "2Menge,",
            "2Mensa,",  "1Mensch,",  "3Menu,",  "2Messe,",  "3Messer,",  "3Metall,",  "2Methode,",  "2Metropole,",  "1Metzger,",
            "2Miete,",  "1Mieter,",  "2Mieterin,",  "1Migrant,",  "2Migrantin,",  "2Migration",  "2Milch",  "2Minderheit,",
            "3Mineralwasser",  "1Mitarbeiter,",  "2Mitarbeiterin,",  "3Mitglied,",  "2Mitte",  "3Mittel,",  "3Mobel,",  "2Mobilitat,",
            "3Mobiltelefon,",  "2Mode,",  "3Modell,",  "2Moglichkeit,",  "2Mohre,",  "1Mond,",  "1Monitor,",  "1Motor,",
            "3Motorrad,",  "2Muhe",  "1Müll",  "2Müllabfuhr",  "2Mülltonne,",  "1Mund,",  "2Munze,",  "3Museum,",  "2Musik",
            "1Musiker,",  "2Musikerin,",  "1Muskel,",  "3Muesli/Musli,",  "1Mut",  "2Mutter,",  "1Nachbar,",  "2Nachbarin,",
            "2Nachfrage,",  "2Nachhilfe,",  "2Nachricht,",  "2Nachspeise,",  "1Nachwuchs",  "2Nadel,",  "1Nagel,",  "2Nähe",
            "3Nahrungsmittel,",  "1Name,",  "1Familienname,",  "1Vorname,",  "2Nase,",  "1Nebel,",  "1Neffe,",  "2Neuigkeit,",
            "2Nichte,",  "1Nichtraucher,",  "2Nichtraucherin,",  "1Notruf",  "2Note,",  "2Notiz,",  "2Nudel,",  "2Nummer,",  "1Ober",
            "3Ohr,",  "3Ol,",  "2Oma,",  "1Onkel,",  "1Opa,",  "2Oper,",  "2Operation,",  "3Opfer,",  "2Orange,",  "3Orchester,",
            "2Ordination,",  "2Ordination,",  "1Ordner,",  "2Ordnung",  "2Organisation,",  "3Original,",  "1Ort,",  "1Vorort,",
            "1Wohnort,",  "1Ozean,",  "3Paar,",  "3Paket,",  "2Panne,",  "3Papier,",  "1Paradeiser,",  "3Parfum,",  "1Park,",
            "2Partnerin,",  "2Party,",  "1Pass,",  "1Passagier,",  "2Passagierin,",  "1Patient,",  "2Patientin,",  "2Pause,",
            "3Pech",  "2Pension,",  "2Pension,",  "1Pensionist,",  "2Pensionistin,",  "1Perron,",  "2Person,",  "2Personalien",
            "1Personenstand",  "3Personal",  "2Pfanne,",  "1Pfeffer",  "2Pflanze,",  "3Pflaster,",  "2Pflaume,",  "1Pfleger,",
            "2Pflegerin,",  "2Pflicht,",  "2Phantasie/Fantasie,",  "3Picknick,",  "2Pille,",  "1Pilz,",  "2Pizza,",  "3Plakat,",
            "1Plan,",  "2Planung,",  "3Plastik",  "1Platz,","2Politik",  "1Politiker,",  "2Politikerin,",  "2Polizei",  "1Polizist,",
            "2Polizistin,",  "2Pommes",   "2Post",  "2Postleitzahl,",  "1Postler,", "3Praktikum,",  "1Praktikant,",  "2Praktikantin,",
            "2Prasentation,",  "2Praxis",  "2Praxis,",  "1Preis,", "2Presse",  "3Produkt,",  "2Produktion",  "1Professor,",
            "2Professorin,",  "1Profi,",  "1Profisportler,", "2Profisportlerin,",  "3Programm,",  "3Projekt,",  "1Prospekt,",  "1Protest,",
            "1Prozess,",  "2Prufung,", "3Publikum",  "1Pullover,",  "1Punkt,",  "2Puppe,",  "2Qualifikation,",  "2Qualitat,",  "3Quartier,",
            "3Quiz",  "1Rabatt,",  "3Rad,",  "3Rad,",  "1Radfahrer,",  "2Radfahrerin,",  "3Radio,",  "1(Schlag-)Rahm",  "1Rand,",
            "1Rasen,",  "1Rat",  "3Ratsel,",  "3Rathaus,",  "1Raucher,",  "2Raucherin,",  "1Raum,",  "2Reaktion,",  "2Realitat,",
            "2Recherche,",  "1Rechner,",  "2Rechnung,",  "3Recht,",  "2Rede,",  "3Referat,",  "2Reform,",  "3Regal,",  "2Regel,",
            "1Regen",  "2Region,",  "1Reifen,",  "2Reihe,","2Quittung,","2Reihenfolge,",  "2Reinigung,",  "1Reis",  "2Reise,",  "3Reiseburo,",
            "2Reklame,",  "1Rekord,",  "2Religion,",  "2Rente,","2Reparatur,",  "2Reportage,",  "1Reporter,",  "2Reporterin,",
            "2Reservierung,",  "1Respekt",  "1Rest,",  "3Restaurant,",  "3Rezept,",  "2Rezeption/Reception,",  "1Richter,",
            "2Richterin,",  "2Richtung,",  "3Rind,",  "1Ring,",  "3Risiko,",  "1Rock,",  "3(Back-)Rohr,",  "2Rolle,",  "1Roman,",
            "2Rose,",  "1Rucksack,",  "2Ruckkehr",  "1Rucken,",  "2Rucksicht,",  "3Ruebli,",  "2Rufnummer,",  "2Ruhe",  "2Runde,",
            "2Rundfahrt,",  "1Saal,",  "2Sache,",  "1Sack,",  "1Saft,", "1Sanger,",  "2Sangerin,",  "1Satz,",  "2Schachtel,",
            "1Schaden,",  "1Schalter,",  "1Schatten,",  "3Schaufenster,",  "1Schauspieler,",  "2Schauspielerin,",  "2Scheibe,",
            "2Scheidung,",  "1Schein,",  "2Schere,",  "3Schiff,",  "3Schild,",  "1Schinken,",  "1Schirm,",  "1Schlaf", "3Schloss,",
            "1Schluss",  "1Schlussel,",  "1Schmerz,",  "3Schmerzmittel,",  "1Schmuck",  "1Schmutz",  "1Schnee",  "3Schnitzel,",
            "1Schnupfen",  "2Schokolade",  "1Schrank",  "1Schreck(en)",  "3Schreiben,",  "2Schrift,",  "1Schriftsteller,",
            "2Schriftstellerin,",  "1Schritt,",  "1Schuh,",  "2Schuld",  "2Schulden",  "2Schule,",  "2Schularbeit",  "2Schulter,",
            "2Schussel,",  "1Schutz",  "3Schwammerl,", "2Sehenswurdigkeit,",  "2Seife,",  "2Seite,",  "1Sekretar,",  "2Sekretarin,",
            "3Semester,",  "3Seminar,",  "2Semmel,",  "1Sender,",  "2Sendung,",  "2Senioren",  "2Serie,",  "1Service",
            "1Serviceangestellte,",  "2Serviceangestellte,",  "1Sessel,",  "1Sessel,",  "2Sicherheit,",  "1Sieg,",  "1Sieger,",
            "2Siegerin,",  "1Sinn",  "2Situation,",  "1Sitz,",  "1Ski",  "2Socke,",  "3Sofa,",  "1Sohn,",  "2Sonne",  "2Sorge,",  "2Soße",
            "3Souvenir,",  "1Sozialarbeiter,",  "2Sozialarbeiterin,",  "1Spaß", "2Speisekarte,",  "1Speisewagen,",  "2Spezialistin,",
            "1Spiegel,",  "3Spiel,",  "1Spieler,",  "2Spielerin,",  "1Spielplatz,",  "3Spielzeug,",  "1Sport",  "2Sportart,",
            "1Sportler,",  "2Sportlerin,",  "2Sprache,",  "2Fremdsprache,",  "2Muttersprache,",  "2Zweitsprache,",  "2Sprechstunde,",
            "2Spritze,",  "2Spur,",  "3Stadion,",  "2Stadt,",  "1Stadtplan,",  "1Standpunkt,",  "1Star,",  "1Start,",  "2Station,",
            "2Statistik,",  "1Stau,",  "1Staub",  "2Steckdose,",  "1Stein,",  "2Stelle,",  "1Stempel,",  "1Stern,",  "2Steuer,",
            "1Steward,",  "2Stewardess,",  "1Stift,",  "1Stil,",  "1Stiefel,",  "2Stiege",  "2Stimme,",  "2Stimmung,",  "1Stock",
            "1Stoff,",  "2Storung,",  "2Strafe,",  "1Strafzettel,",  "1Strand,",  "2Stra?e,",  "2Straßenbahn,",  "3Streichholz,",
            "1Streik,",  "1Streit",  "1Stress",  "1Strom",  "1Strumpf,",  "3Stuck/-stuck,",  "2Studie,",  "1Student,",  "2Studentin,",
            "1Studierende,",  "2Studierende,",  "3Studium,",  "3Studio,",  "2Stufe,",  "1Stuhl,", "2Stunde,",  "1Sturm,",  "2Sucht,",
            "3Suchtmittel,",  "2Summe,",  "1Supermarkt,",  "2Suppe,",  "3Symbol,",  "3System,",  "2Szene,",  "2Tabelle,",  "2Tablette,",
            "2Tafel,",  "1Tagesablauf,",  "3Tal,",  "3Talent,",  "2Tankstelle,",  "2Tante,",  "1Tanz,",  "2Tasche,",  "3Taschengeld,",
            "3Taschentuch,",  "2Tasse,",  "2Tastatur,",  "2Taste,",  "2Tat,",  "1Tater,",  "2Taterin,",  "2Tatigkeit,",  "2Tatsache,",
            "2Technik,",  "2Technologie,",  "1Tee",  "3Teil,",  "1Teil,",  "2Teilzeit",  "2Teilnahme,",  "1Teilnehmer,",  "2Teilnehmerin,",
            "3Telefon,",  "1Teller,",  "2Temperatur,",  "3Tempo",  "3Tennis",  "1Teppich,",  "1Termin,",  "1Terminkalender,",  "2Terrasse,",
            "1Test,",  "1Text,",  "3Theater,",  "3Thema,",  "2Theorie,",  "2Therapie,",  "3Ticket,",  "3Tier,",  "3Haustier,",
            "1Tierpark,",  "1Tipp,",  "1Tisch,",  "1Titel,",  "2Tochter,",  "1Tod",  "2Toilette,",  "2Tomate,",  "3Tor,",  "2Torte,",
            "1Tote,",  "2Tote,",  "1Tourismus",  "1Tourist,",  "2Touristin,",  "2Tradition,",  "1Trainer,",  "2Trainerin,",
            "3Training,",  "3Tram,",  "2Trane,",  "1Transport,",  "1Traum,",  "1Treffpunkt,",  "2Trennung,",  "3Haustier,",
            "1Tierpark,",  "1Tipp,",  "1Tisch,",  "1Titel,",  "2Tochter,",  "1Tod",  "2Toilette,",  "2Tomate,",  "3Tor,",
            "2Torte,",  "1Tote,",  "2Tote,",  "1Tourismus",  "1Tourist,",  "2Touristin,",  "2traditionelle",  "2Krankenkasse.",
            "2Tranen.",  "2Mobel",  "1Transportß",  "1Stadt",  "1Familie",  "2Treppe,",  "3Treppenhaus,",  "3Trinkgeld,",
            "2Tropfen",  "3Trottoir,",  "3Tuch,",  "2Tur,",  "1Turm,",  "2Tute,",  "1Typ,",  "2U-Bahn,",  "2Übung",
            "2Ubernachtung,",  "2Uberraschung",  "2Uberschrift,",  "1Ubersetzer,",  "2Ubersetzerin,",  "2Ubersetzung,",
            "2Uberstunde,",  "2Uberweisung,",  "2Uberzeugung,",  "3Ufer,",  "2Uhr,",  "2Umfrage,",  "2Umgebung,",  "2Umleitung,",
            "1Umtausch,",  "2Umwelt",  "1Umweltschutz",  "2Umweltverschmutzung,",  "1Umzug,",  "1Unfall,",  "3Ungluck,",  "2Uniform,",
            "2Universitat,",  "2Unterhaltung,",  "2Unterkunft,",  "2Unterlagen",  "1Unternehmer,",  "2Unternehmerin,",  "1Unterricht",
            "1Unterschied,",  "2Unterstutzung,",  "2Untersuchung,",  "2Urkunde,",  "1Urlaub,",  "2Ursache,",  "3Urteil,",  "2Vase,",
            "1Vater,",  "3Velo,",  "2Verabredung,",  "1Abschied,",  "2Veranstaltung,", "2Verbindung,",  "1Verbrecher,",  "2Verbrecherin,",
            "1Verdacht",  "1Verein,",  "2Vergangenheit",  "1Vergleich,",  "3Vergnugen,",  "3Verhalten",  "3Verhaltnis,",  "1Verkaufer,",
            "2Verkauferin,",  "1Verkehr",  "3Verkehrsmittel,",  "1Verlag,",  "2Verletzung,",  "1Verlierer,",  "2Verliererin,",  "1Verlust,",
            "1Vermieter,",  "2Vermieterin,",  "2Vermietung,",  "2Vermittlung,",  "2Versammlung,",  "2Versichertenkarte,",  "2Verspatung,",
            "3Verstandnis",  "1Versuch,",  "1Vertrag,",  "3Vertrauen",  "1Vertreter,",  "2Vertreterin,",  "2Vertretung,",  "2Verwaltung,",
            "1Verwandte,",  "2Verwandte,",  "3Video,",  "3Viertel,",  "1Virus,",  "2Visitenkarte,",  "3Visum,",  "3Vitamin,",  "2Vollzeit",
            "2Voraussetzung,",  "2Vorbereitung,",  "1Vorort,",  "1Vorschlag,",  "2Vorschrift,",  "2Vorsicht",  "2Vorstellung,",
            "3Vorstellungsgesprach,",  "1Vorteil,",  "1Vortrag,",  "2Vorwahl,",  "1Vorwurf,",  "1Wagen,",  "2Wahl,",  "2Wahrheit,",
            "1Wald,",  "2Wand,",  "2Wanderung,",  "2Ware,",  "2Warme",  "2Wasche",  "3Waschmittel,",  "3Wasser",  "1Wecker,",  "1Weg,",
            "1Wein,",  "2Welt",  "2Werbung,",  "3Werk,",  "2Werkstatt,",  "3Werkzeug,",  "1Wert,",  "1Wettbewerb,",  "3Wetter",  "1Wetterbericht,",
            "2Wettervorhersage,",  "2Wiederholung,",  "2Wiese,",  "1Wind,",  "2Wirkung,",  "2Wirklichkeit",  "1Wirt,",  "2Wirtin,",
            "2Wirtschaft",  "3Wissen",  "2Wissenschaft,",  "1Wissenschaftler,",  "2Wissenschaftlerin,",  "1Witz,", "1Wohnort,",
            "1Wohnsitz,",  "2Wohnung,",  "3Wohnzimmer,",  "2Wolke,",  "2Wolle",  "3Wort,",  "3Wort,",  "3Worterbuch,",  "2Wunde,",
            "3Wunder,",  "1Wunsch,",  "2Wurst,",  "2Zahl,",  "2Anzahl,",  "2Zahlung,",  "1Zahn,",  "2Zahncreme/-pasta",  "2Zange,",
            "3Zeichen,",  "3Verkehrszeichen,",  "2Zeichnung,",  "2Zeile,",  "2Zeit",  "1Zeitpunkt,",  "2Zeitschrift,",  "2Zeitung,",
            "3Zelt,",  "3Zentrum,",  "3Zertifikat,",  "1Zettel,",  "3Zeug/-zeug",  "1Zeuge,",  "2Zeugin,",  "3Zeugnis,",  "3Ziel,",
            "2Zigarette,",  "3Zimmer,",  "2Zinsen",  "1Zirkus,",  "2Zitrone,",  "1Zivilstand",  "1Zoll,",  "2Zone,",  "1Zoo,",
            "1Zucker",  "1Zufall,",  "1Zugang,",  "1Zug,",  "3Zuhause",  "1Zuhorer,",  "2Zuhorerin,",  "2Zukunft",  "2Zunder",
            "3Zundholz,",  "1Zusammenhang,",  "1Zuschauer,",  "2Zuschauerin,",  "1Zuschlag,",  "1Zustand,",  "2Zustimmung,",
            "2Zutaten",  "1Zweck,",  "1Zweifel,",  "2Zwiebel,"
    };
    String wordsb2[] =  new String[] {
        "1Einzelkampfer,",  "2Einzelkampferin,",  "2Chefsekretarin,",  "1Ideen-",  "2Sozialform,",  "1Egoist,",
        "2Charaktersache",  "2Charakterbildung",  "1Kommilitone,",  "1Teamgeist",  "1Individualist,",  "2Anstrengung,",
        "3Hantieren",  "3Klischee,",  "2Informationsgesellschaft", "1Helfer,",  "2Not",  "1Verdienst",  "1Hochschulabsolvent,",
        "1Arbeitsmarkt",  "2Wirtschaftskrise,",  "2Probezeit",  "2Werbeagentur,",  "2Welt",  "1Riss,",  "2Kommunikationswissenschaften",
        "2Bundesagentur",  "3Anwachsen",  "1Akademiker,",  "2Krise,",  "2Exportnation,",  "2Hochleistungstechnologie",  "2Branche,",
        "1Hochschulabschluss,",  "3Phanomen,",  "3Gesundheitswesen",  "1Geringqualifizierte,",  "1Effekt,",  "1Arbeitgeber,",
        "1Anstieg",  "1Abschluss",  "2Fruhjahrsmudigkeit",  "1Kreislauf",  "2Beschwerde,",  "2Anpassungsphase,",  "1Wechsel,",
        "3Hormon,",  "1Lichteinfluss",  "2Aktivierung",  "2Steigerung",  "2Umstellung",  "3Bedurfnis,", "1Sonnenschein",  "2Ubergangszeit",
        "1Rhythmus",  "2Lichtverhaltnisse",  "3Gehirn",  "1Sauerstoff",  "3Immunsystem",  "1Fußmarsch,",  "1Schwung",  "3Organ,",
        "1Sensor,",  "2Ausstrahlung",  "2Massage,",  "2Wechseldusche,",  "2Durchblutung",  "1Blutdruck",  "2Antriebslosigkeit",
        "2Gereiztheit",  "2Niedergeschlagenheit",  "2Blutarmut",  "2Erkrankung",  "2Depression",  "3Erschopfungssyndrom",
        "2Veranstaltung,",  "2Mitfahrgelegenheit,",  "3Profil,",  "2Prozedur,",  "2Spur,",  "1Bestandteil,",  "1Zeitfresser,",
        "1Datenschutz",  "3Argument,",  "1Account,",  "1Selbstmord,",  "2Hausordnung",  "2Abreise",  "1Wertgegenstand,",
        "2Feuerverhutungsvorschriften",  "2Nachtruhe",  "2Mitgliedschaft",  "2Aufbewahrung",  "2Haftung",  "3Kuvert,",
        "3Schlie?fach,",  "2Lobby",  "2Nachbarschaft",  "3Gelande",  "2Etage,",  "2Anfrage,",  "2Anschrift",  "1Pool,",
        "2Expedition,",  "3Couchsurfing",  "1Schlafplatz,",  "2Ubernachtungsmoglichkeit,",  "2Matratze,",  "1Wohnzimmerboden",
        "1Beteiligte,",  "1Gastgeber,",  "1Backpacker,",  "1Horror",  "1Pauschaltourist,", "1Individualtourist,",  "1Tempel,",
        "2Bequemlichkeit",  "3Hostel,",  "3Dutzend,",  "1Luxus",  "1Flieger",  "2Fernreise,",  "1Klimawandel",  "2Menschen",
        "1Eingriff,",  "1Badeanzug,",  "1Siegel",  "2Entschleunigung",  "1Bauernhof,",  "1Verstand",  "1Hirnforscher,",
        "3Marketing",  "2Illusion,",  "3Vorgehen",  "3Etikett,",  "2Sorte,",  "2Emotion,",  "1Werbefachmann,",  "3Logo,",
        "2Produktklasse,",  "3Synonym,",  "2allgemeine",  "2Kernspintomographie",  "1Verfuhrer,",  "1Duft,",  "2Raritat,",
        "1Luxusartikel,",  "2Ehrung",  "2Salbung",  "2Oberschicht",  "2Korperpflege",  "1Gebrauch",  "2Essenz,",
        "2Destillation",  "2Parfumherstellung",  "1Aromastoff,",  "1Weihrauch",  "3Handelszentrum,",  "1Kaufmann,",
        "1Kartausermonch,",  "2Gabe,",  "2Rezeptur,",  "2Manufaktur,",  "1Firmensitz",  "2Zusammensetzung",  "2Geheimhaltung",
        "1Hauptbestandteil,",  "2Zitrusfrucht,",  "1Anteil,",  "1Alkohol",  "2Mischung",  "2Wirkung",  "1Modedesigner,",
        "1Parfumeur,",  "1Misserfolg,",  "2Kreation,",  "3Militar",  "1Geruch,",  "2Substanz,", "2Truppe,",  "1Demonstrant,",
        "2Flucht",  "3Empfinden",  "2Abwasserreinigungsanlage",  "1Veganismus",  "2Dokumentation,",  "2Toleranz",  "3Schlusselwort,",
        "1Stammtisch,",  "1Veganer,",  "3Miteinander",  "1Vegetarier,",  "3Umfeld",  "2Wahrscheinlichkeit",  "3Ubergewicht",
        "1Horizont",  "2Benutzungsordnung",  "3Inhaltsverzeichnis,",  "2Benutzungsregelung,",  "2Vorbestellung,",  "1Dienst,",
        "2Benutzungsberechtigung",  "1Ausschluss",  "2Benutzung",  "1Leihgegenstand,",  "1Benutzer,",  "2Entrichtung",
        "2Bereitstellung",  "2baulichen",  "2Ausstattung",  "1Gegenstand,",  "2Sorgfalt",  "1Betrieb",  "3Kunstwerk,",
        "2Satzung,",  "2Gebuhrensatzung",  "1Versto?,",  "2Veranderung",  "2Beschmutzung",  "2Beschadigung,",  "2Nutzung",
        "2Bindung,",  "2Bildung",  "3Bildungsniveau,",  "2Lebenszufriedenheit",  "2Vorstellung,",  "2Berufung",  "2Struktur,",
        "2Leere",  "2Lebenshaltungskosten",  "1Reichtum",  "2Einbildung",  "2Erfullung",  "1Kranfahrer,",  "2Abwechslung",  "1Einsatz,",
        "1Mitmensch,",  "2Umweltkatastrophe,",  "2Erwartung,",  "2Gewichtung",  "1Zusammenhalt",  "2Fursorge",  "2Verbundenheit",
        "3Verlassenwerden",  "2Weltelite",  "1Muskelaufbau",  "1Amateur,",  "3Aufputschmittel,",  "1Laufer,",  "3Schmerzmittel,",
        "1Freizeitsportler,",  "1Forscher,",  "1Ehrgeiz",  "1Sportmediziner,",  "1Medikamentenmissbrauch",  "1Wirkstoff,",
        "2Leistungssteigerung",  "2Herz-Kreislauf-Probleme",  "1Schlaganfall,",  "2Niere,",  "2Magenblutung,",  "2Denkleistung",
        "1Mediziner,",  "3Schonheitsideal,",  "2Weichen",  "1Einsatz",  "2Problematik",  "2Prokrastination",  "1Dachboden",
        "1Wohnblock,",  "1Vorsatz,",  "3Vorhaben,", "2Umsetzung",  "2Schatzung,",  "2Konsequenz,",  "3Netzwerk,",  "1zeitliche",
        "2Erledigung",  "2Prognose,",  "1Unsinn",  "1Marktanteil,",  "1Bruchteil,",  "3Lehrmaterial,",  "1Buchliebhaber,",
        "3Antiquariat,",  "1Roman,",  "1Druck",  "2Ressource,",  "1Mobilfunk",  "2Laufzeit",  "2Kundigung",  "3Datenvolumen",
        "2Rechnungsbegleichung",  "1Ubertragungsstandard",  "3Widerrufsrecht",  "1Tarifwechsel",  "2Sondergebuhr,",
        "1Abschluss,",  "1Nutzer,",  "2Bezahlart,",  "2Einzugsermachtigung",  "2EC-Karte",  "1Ablauf",  "3Vertragsverhaltnis",
        "2Gultigkeitsdauer",  "2Unsicherheit",  "2Selbstsicherheit",  "2Erbinformation,",  "2Zelle,",  "2Krebsform,",  "1Atemweg,",
        "1Mord,",  "2Anhebung",  "2Tabakwaren",  "2Freigabe",  "1Apotheker,",  "2Apothekerin,",  "2Wasserpfeife,",  "2E-Zigarette,",
        "3Rauchverbot,",  "3Privatauto,",  "2Uberlegung,",  "1Waldbrand,",  "3Zundholz,",  "1Zigarettenstummel,",  "1Funke,",
        "1Unterwuchs",  "2Auswirkung,",  "1Aschenbecher,",  "2Raucherentwohnung",  "3Nikotin",  "1Glimmstangel,",  "2Tatsache,",
        "2Entspannung",  "1Genuss",  "2Geselligkeit",  "1Geist,",  "1Einsatzbereich,",  "2Standardtherapie",  "2Angststorung,",
        "2kognitiven",  "2App,",  "2Start-",  "2Flugangst",  "1Betroffene,",  "3Ritual,",  "3Gluckshormon,",  "3Wohlfuhl-Gefuhl,",
        "1Aspekt,",  "1Muntermacher,",  "2Konzentration",  "2Gedachtnisleistung",  "2Gesundheitsgefahrdung",  "1Kopfhorer",
        "1Horschaden,",  "1Konsument,",  "2Lautstarke",  "1Bluthochdruck",  "2Schlafstorung,",  "1Clown,",  "1Spa?macher,",
        "2Atmung",  "2Behandlung,",  "2Visite,",  "3Seniorenheim,",  "2Einrichtung,",  "2Flexibilitat",  "2Sensibilitat",
        "2Eigenschaft,",  "3Improvisationstalent",  "2Verkleidung,",  "1Charakter,",  "1Abstand,",  "3Elend",  "2Interaktion",
        "2Belastung,",  "1Bankkaufmann,",  "1Pfarrer,",  "1Storenfried,",  "2Entlastung",  "3Einsatzgebiet,",  "3Krisengebiet,",
        "2Verbesserung",  "2Naturkatastrophe,",  "2Armut", "1Kaffeebecher,",  "3Chaos",  "3Privatleben",  "2Privatsache",  "2Unordnung",
        "1Karriereknick,",  "1Auftraggeber,",  "2Zumutung",  "2Vertretung",  "2Anmeldefrist,",  "2Befreiung",  "2Einstufungsberatung",
        "2Kompetenz,",  "2Abmeldung,",  "1Verwaltungskostenanteil,",  "2Ruckerstattung",  "2Gutschrift",  "1Nachweis,",  "2Bescheinigung,",
        "2Anwesenheitsliste,",  "2Pflege",  "1Kanarienvogel,",  "3Gen,",  "1Auslauf",  "2Leine",  "1Bach,",  "1Wanderweg,",
        "1Wahnsinn",  "2Haltung",  "3Lebewesen,",  "2Schildkrote,",  "1Papagei,",  "1Tierhalter,",  "1Kater,",  "3Tierheim,",
        "2Gesellschaft",  "1Besitzer,",  "2Einsamkeit",  "2Linderung",  "1Friseursalon,",  "3Versicherungsburo,",  "1Gassi-Dienst",
        "2Verhaltensweise,",  "3Aquarium,",  "1Lugner,",  "3Augenblinzeln",  "2Faulheit",  "1Feind,",  "3Zusammenleben",
        "1Scharfsinn",  "2Beobachtungsgabe",  "3Gedachtnis",  "1Puls",  "1Schwei?",  "1Schwindel",  "2Mimik",  "2Pupille,",
        "2Millisekunde,",  "1Schwindler,",  "2Tauschung,",  "3Verhor,",  "2Nervositat",  "1Ausloser,",  "2Stirn",  "2Redeweise",
        "1Schatz,",  "1Speicher,",  "1Sinn,",  "1Bummel",  "2Fachzeitschrift,",  "1Trodler,",  "1Altwarenhandler,",  "1Reiz,",
        "2Ausbeute",  "3Marktgasschen,",  "3Objekt,",  "2Haushaltsauflosung,",  "1Besitz",  "2Antiquitat,",  "2Epoche,",
        "1Neuling,",  "1Trodelmarkt,",  "3System,",  "1Fan,",  "2Wegwerfkultur",  "1Lifestyle",  "1Jager,",  "1Sammler,",
        "1Flohmarktganger,",  "3Motto",  "1Wurm,",  "3Schnappchen,",  "2Atmosphare",  "3bunte",  "2Grundung",  "2Online-Branche",
        "3Mobbing",  "1Klassenverband,",  "1Mobber,",  "1Außenstehende,",  "1Tatort,",  "3Cybermobbing",  "1Kommentar,",
        "1Ubergriff,",  "2Anfeindung,",  "2Traurigkeit",  "1Frust",  "2Vertrauensperson,",  "1Vertrauenslehrer,",  "1Klassenlehrer,",
        "2Schulgemeinschaft,", "3Unternehmen,",  "1Praktikant,",  "2Verschwiegenheit",  "2Vergutung",  "1Werktag,",  "2Vorgabe,",
        "2Studienrichtung,",  "3Diplomarbeitsthema,",  "2Ablaufe",  "1Ansprechpartner,",  "2Beendigung",  "2Ausubung",
        "2Arbeitsunfahigkeit",  "3Unwohlsein",  "1Fehltag,",  "3arztliche",  "2Angelegenheit,",  "1Rahmen",  "1Anlass,",
        "3Ausscheiden",  "3(Studenten)Wohnheim,",  "2Wohngemeinschaft,",  "2WG,",  "1Telefonanschluss,",  "3Einzelkind,",
        "3Badezimmer",  "2Waschmaschine,",  "1Mitbewohner,",  "2Einstellung,",  "1Gerauschpegel",  "1Zeitraum,",  "2Gemeinschaftsregel,",
        "3Waschbecken,",  "2Streitigkeit,",  "2Abrechnung,",  "2Nachzahlung,",  "2Lernphase,",  "1Krach",  "1Mietpreis,",  "2Tasche",
        "1Uni-Campus",  "2Chipkarte,",  "2Technologie",  "2Girokarte,",  "2Kreditkarte,",  "2Ecke",  "1Bezahlvorgang,",
        "2Sicherheitsbedenken",  "3Terminal,",  "1Kriminelle,",  "2Ubertragung,",  "2Zutrittskarte,",  "3Funksignal,",
        "2Funkwelle,",  "2Reichweite", "3Magnetfeld,",  "3Ablaufdatum",  "2Rolltreppe,",  "1Zahlencode",  "2Ruckseite",  "1Vorgang,",
        "1Optimismus",  "3Glas,",  "2Definition,",  "1Gemutszustand",  "1Pessimist,",  "2Befurchtung,",  "1Optimist,",  "3Schicksal,",
        "2Produktivitat",  "2Vergabe",  "2Fahigkeit,",  "2Fuhrungskraft,",  "2Fuhrungsetage,",  "2Strategie,",  "1Glaube",  "2Deponie,",
        "2Herstellung", "2Neuware,",  "1Schadstoff,",  "3Neugeborene,",  "2Vermarktung",  "2Markenkleidung",  "2Alltagskleidung",
        "3Kleidungsstuck,",  "2Lederhose,",  "2Masse,",  "2Einmaligkeit",  "1Suchbegriff,",  "3Umtauschrecht",  "2Lieferzeit,",
        "2Zahlungsmethode,",  "2Ermaßigung,",  "1Zoll,",  "2Altersgrenze",  "1Transportschaden,",  "2Dienstleistung,",  "1Elternteil,",
        "1Erziehungsberechtigte,",  "2Versendung",  "2Liefer",  "1Preisnachlass,",  "3Zustelldatum",  "2Zustellung",  "1Eingang",
        "2Krankenpflegerin,",  "3Arbeiterviertel,",  "2Hand",  "2Anonymitat",  "1freundschaftliche",  "3Mehrfamilienhaus,",
        "3Reihenhaus,",  "2Handschrift,",  "2Digitalisierung",  "1Umgang",  "2Schreibschrift",  "2Druckschrift",  "1Fokus",
        "2Grundschrift",  "2Erkenntnis,",  "2Neurowissenschaft",  "1Unterrichtsstoff",  "2Vorlesung,",  "3Skript,",  "2Individualitat",
        "2Privatschule,",  "2Schullandschaft",  "2Bildungseinrichtung,", "2Neugrundung,",  "1Schulpflichtige,",  "3Schulklima",  "2Lucke,",
        "1Schwerpunkt,",  "3Betreuungsangebot,",  "1Wandel",  "2Anforderung,",  "2Hausaufgabenbetreuung",  "2Ausrichtung,",
        "1Hochbegabte,",  "2Initiative,",  "1Erziehungsexperte,",  "3Stipendienprogramm,",  "3Element,",  "2Wandlung",  "3Image",
        "2Neugier",  "1Verkehr",  "1Unfallort",  "2Einsatzkrafte",  "1Wissensdurst",  "1Roboter,",  "1Nachbarplanet,",  "1Drang",
        "2Aufmerksamkeit",  "2Einmischung",  "3Argernis,",  "2Nebenwirkung,",  "2Skala",  "3lebenslange",  "2Info,",
        "1Brandschutzbeauftragte,",  "1Alarmplan,",  "2Risiko-Analyse,",  "2Stellung",  "1Brand,",  "2Vollmacht,",
        "2Fachkraft,",  "2Leitung",  "1Brandschutz",  "2Vorbildung",  "1Produktionsablauf,",  "2Praxis",  "2Macht",
        "2Weisungsbefugnis",  "3Alarm",  "2Wiederherstellung",  "1Standard,",  "3Mitentscheidungsrecht",  "2Maßnahme,",
        "3Vorschlagsrecht",  "2Investition,",  "1Lehrberuf,",  "2Schulpflicht",  "1Elektriker,",  "2Sicherheitsanlagentechnik",
        "1Lehrgang,",  "2Personlichkeit,",  "1Wohlstand",  "2Perspektive,",  "3Selbstvertrauen",  "1Aufstieg",  "2Zufriedenheit",
        "2Gestik", "2Korperhaltung",  "2Aussage,",  "3Vorstellungsgesprach,",  "1Vorgesetzte,",  "1Sprung,",  "2Leiter",
        "2Ausbreitung",  "1Fernkurs,",  "1Kursteilnehmer,",  "3Headset,",  "2Einheit,",  "2Lernplattform,",  "2Gehaltserhohung,",
        "2Chefsache,",  "2Ansicht,",  "2Arbeitskraft,",  "2Baufirma,",  "1Steuer",  "2Art",  "3Paradies",  "2Mullkippe,",
        "2Sudseeinsel,",  "1Plastikmull",  "1Pazifik",  "3Plastikteil,",  "2Mulldichte",  "2Zahnburste,",  "1Dominostein,",
        "3Ausmaß",  "2Zahlung",  "2Tonne,",  "2Oberflache,",  "1Strudel",  "2Schicht,",  "3Stuckchen,",  "3Plankton",  "2Koralleninsel,",
        "3Weltnaturerbe,",  "1Quadratkilometer,",  "2Meeresstromung,",  "2Wetterbedingungen",  "1Verbleib",  "2Haltbarkeit",  "3Okosystem,",
        "3Hilfswerk,",  "3Kriegswaisenkind,",  "2Uhr",  "1Grundsatz,",  "2Geborgenheit",  "1Unterstutzer,",  "1Drogenmissbrauch",
        "1Padagoge,",  "1Psychologe,",  "1Erzieher,",  "2Wohngruppe,",  "2medizinische",  "1Pluspunkt,",  "2Globalisierung",  "1Absolvent,",
        "2Ebene,",  "2Landessprache,", "1Sprachkurs,",  "1Praxis",  "1Studienort,",  "1Facebook-Post,",  "1Hohepunkt,",  "3Mittelmaß",
        "1Tiefpunkt,",  "2Doppelbelastung",  "3Gastland,",  "2Freiwilligenarbeit",  "3Mindestalter",  "3Einsatzfeld,",  "2Vorkenntnisse",
        "2Soft",  "2Erstattung",  "2Unkosten",  "2Anerkennung",  "3Ma?",  "2Teamfahigkeit",  "2Motivation",  "2Verlasslichkeit",
        "3Einfuhlungsvermogen",  "2Sozialkompetenz,",  "3ehrenamtliche",  "2Institution,",  "2Organisationsstruktur,",  "3Alterszentrum,",
        "2Jugendhilfe",  "2Begegnungsstatte,",  "2Stadtverwaltung",  "2Wertschatzung",  "2Publikation",  "2Erwahnung",  "3Dossier,",
        "2Betriebswirtschaftslehre",  "3Missverstandnis,",  "1Kulturschock,",  "1Umgang",  "1Dozent,",  "2Respektperson,",  "2Sitten",
        "3Nachbarland,",  "2Ablehnung",  "3ist",  "1Unmut",  "1Unwille(n)",  "2Falschheit",  "2Begru?ung",  "2Wange,",  "1Handedruck",
        "1Dienstleistungssektor",  "2Arbeitskultur",  "2Harmonie",  "2Logik",  "3Labor,",  "1Thriller,",  "2Spannung",  "2Begeisterung",
        "1Mitspieler,",  "2Ahnlichkeit,",  "2Vorlage,",  "3Szenario,",  "3Fluchtspiel,",  "1Schwierigkeitsgrad,",  "2Außenwelt",
        "2Altersbeschrankung,",  "3Brettspiel,",  "3Prinzip,", "2Qual,",  "1Griff",  "2Leber",  "1Ausweg",  "2Schmerzspirale",
        "2Warn",  "3Bucken",  "2Tortur,",  "2Schlaflosigkeit",  "2Appetitlosigkeit",  "2Erschopfung",  "2Isolation",  "1Therapeut,",
        "3Behandlungskonzept,",  "3Entwicklungsland,",  "3Nervensystem,",  "1Phantomschmerz,",  "2Amputation,",  "3Korperglied,",
        "3Verfahren",  "2Ambulanz,",  "2Verhaltenstherapie",  "3Entspannungstraining",  "3Stichwort",  "2Physiotherapie",
        "2Schmerzlinderung",  "1Teufelskreis",  "2Schmerzerfahrung",  "2Anspannung",  "2Verkrampfung",  "2Muskelentspannung",
        "2Meditation",  "3Biofeedback",  "2Hypnose",  "3Diktiergerat,",  "2Aufnahme,",  "3Erinnerungsvermogen",  "2Ruckblende,",
        "3Geschehnis,",  "3Aroma,",  "1Zimt",  "2Nelke,",  "2Bildung",  "2Identitat,",  "2Episode,",  "1Zahnarzttermin,",  "1Vorfall,",
        "2Erinnerungslucke,",  "2Demenz",  "2Prufungsordnung",  "3Rettungsschwimmen",  "1Ablauf",  "2Wiederholungsprufung,",
        "2Zertifizierung",  "2Regelung,",  "2Behinderung,",  "3Abzeichen,",  "2Einzelleistung,",  "1Ausbilder,",  "2Leistungen",
        "2Urkunde,",  "2ausstellende",  "2Durchfuhrung",  "3Gewasser,",  "2Sicherungsma?nahme,",  "2Sicherheitsgrunde",
        "3Streckentauchen",  "1Kopfsprung,",  "2Vorbedingung,",  "2Schulung,",  "1Gesundheitszustand", "2Zulassung",  "2arztliche",
        "2Bestimmung,",  "2Ausfuhrungsbestimmungen",  "3Bundel,",  "2Lieblingsspeise,",  "2Besinnung",  "2Vertrauenswelt,",  "2Wiege",
        "3Urvertrauen",  "2Gewissheit",  "1Au?enseiter,",  "3Lebensbedurfnis,",  "2Kindheit",  "1Nomade,",  "3Heimatgefuhl,",
        "2Wurzel,",  "3Nachhausekommen",  "3Mordsvergnugen",  "1Kriminalroman,",  "2Frage",  "1Kritiker,",  "3Kreuzwortratsel,",
        "2Unterhaltungsliteratur",  "1Detektiv,",  "2Kurzgeschichte,",  "1Doppelmord,",  "2Literaturgeschichte",  "3Verbrechen,",
        "1Ausgangspunkt,",  "1Fall,",  "2Handlung",  "1Hintergrund,",  "2Aufklarung",  "1Privatdetektiv,",  "2Suche",  "1Tater,",
        "1Ermittler,",  "1Verleger,",  "1Star,",  "2Sammlung,",  "2Unterart,",  "3Grundkonzept,",  "2Serienfigur,",  "3Thermometer,",
        "3Wohlbefinden",  "2Luftfeuchtigkeit",  "3subjektive",  "2Windstille",  "1Wetterdienst",  "2Wetterprognose,",  "1Durstloscher,",
        "3Koffein",  "1Krautertee,",  "1Fruchtetee,",  "2Nahrungsaufnahme",  "1prallen",  "2UV-Strahlen",  "1Lichtschutzfaktor,",
        "2Hitzewelle,",  "2Planungssunde,",  "1Stadtebau",  "2Abkuhlung",  "2Parkanlage,", "1Wortschatz",  "1Schreibstil",
        "2Erzahltechnik,",  "1Schreibfluss",  "2Erzahlfigur,",  "3Leid",  "2Lekture",  "1Gesprachspartner,",
        "3Bundesausbildungsforderungsgesetz",  "1Auszubildende,",  "2Fachschule,",  "3Abendgymnasium,",  "3Kolleg,",
        "2Akademie,",  "1Absatz,",  "1Zuschuss,",  "2Ausbildungsstatte,",  "1Forderungsbetrag,",  "3Darlehen",  "1Gesamtbetrag",
        "2Berufsfachschule,",  "2Fachoberschule,",  "2Abendhauptschule,",  "2Berufsaufbauschule,",  "2Abendrealschule,",
        "2Regelstudienzeit",  "2Forderung",  "2Forderungshochstdauer"
    };
    String wordsc1[] =  new String[] {
            "2Manie,",  "3Navigationssystem,",  "2Sucht,",  "2Albernheit,",  "2Beschleunigung,",  "2Glosse,",  "1Held,",
            "2Heldin,",  "2Hyperaktivitat,",  "2Kolumne,",  "2Nahrungsaufnahme",  "2Rastlosigkeit,",  "2Reduktion,",
            "2Suchmaschine,",  "2Segel",  "1Neid",  "2Prioritat,",  "3Schicksal,",  "2Solidaritat",  "3Bewusstsein",
            "2Einsicht,",  "1Misserfolg,",  "2Anspielung,",  "1Aufbruch",  "2Ballade,",  "1Knast",  "1Schiedsrichter,",
            "1Schwamm,",  "1Touch,",  "1Zahn",  "1Zeit",  "2Andeutung,",  "3Drama,",  "2Dramen",  "2Imagination,",  "2Miene,",
            "2Pointe,",  "2Schliche",  "1Angabe",  "1Angabe",  "2Ausstattung,",  "2Durchsage,",  "2Umgangsform,",  "2Verzogerung,",
            "2Betatigung,",  "1Einsatz,",  "2Facette,",  "3Flair",  "2Kreuzfahrt,",  "1Page,",  "1Lage",  "1Pike",  "3Attest,",
            "3Beistellbett,",  "3Bufett,",  "1Rucktritt,",  "2Suite,",  "1Kompromiss,",  "1Ansicht",  "3Verstandnis",  "3Schlagwort,",
            "1Bogen,",  "1Erzeuger,",  "1Kurpark,",  "3Panorama,",  "2Panoramen",  "3Schuhwerk",  "3Trio,",  "1Uberrest,",
            "2Probe",  "3Andenken,",  "2Eule,",  "3Kalkul,",  "3Souvenir,",  "3Synonym,",  "2Zuneigung,",  "1Impuls,",
            "2Internetplattform,",  "1Segeltorn,", "1Bauer,",  "2Eiszeit,",  "2Fahigkeit,",  "2Fertigkeit,",  "2Geschicklichkeit",
            "1Jager,",  "1Krieger,",  "3Mittelalter",  "1Ritter,",  "1Sammler,",  "1Siedler,",  "2Steinzeit",  "2Vorsicht",  "1Homo",
            "2Kapazitat,",  "2Merkfahigkeit",  "2Spezies,",  "2Verfugbarkeit",  "1Vorfahre,",  "3Wesen,",  "2Lerneinheit,",
            "1Reflex,",  "1Reiz,",  "2Rhetorik",  "3Symbol,",  "1Vorsprung",  "3ist",  "3Gehirn,",  "1Betriebsrat,",  "2Eignung",
            "2Empathie",  "2Antike",  "2Belehrung,",  "2Verfremdung,",  "2Fabel,",  "1Fuchs,",  "2Moral",  "2Requisite,",  "2Balance,",
            "2Berufung,",  "2Ambition,",  "3Labyrinth,",  "2Renaissance,",  "2Spitzenkraft,",  "1Universalist,",  "1Wert,",
            "3Risiko",  "2Schulter",  "3Betriebsklima",  "1Einwand,",  "2Honorierung,",  "3Mitspracherecht,",  "1Spaßfaktor,",
            "3Start-up-Unternehmen,",  "1Umgangston,",  "2Vertragssituation,",  "2Abgabe,",  "2Anzeige,",  "1Berufseinsteiger,",
            "3Gewerbe,",  "2Lohnsteuer,",  "2Migration,",  "1Minijobber,",  "2Sozialabgabe,",  "2Abrechnung,",  "1Abzug,",  "2Aushilfe,",
            "3Bruttoeinkommen,",  "3Entgelt",  "2Fachkraft,",  "1Freiberufler,",  "2Gehaltsabrechnung,",  "2Gehaltserhohung,",
            "1Gehaltszettel,",  "3Honorar,",  "2Kirchensteuer,",  "1Nettolohn,",  "2Pflegeversicherung,",  "1Posten,",  "3Repertoire,",
            "1Solidaritatszuschlag,",  "1Stundenlohn,",  "1Zuschlag,",  "2Attacke,",  "1Choleriker,",  "2Eventualitat,",  "3Memo,",
            "3Nervenwrack,",  "1Pedant,",  "2Selbstvermarktung",  "1Trainee,",  "1Versager,",  "2Zeitbombe,",  "2Schulter",  "2Lange",
            "3Expose,",  "1Haufen,",  "2Hierarchie,",  "2Unternehmenskultur,", "2Interpretation,",  "2Wirkung,",  "3Atelier,",
            "2Blockade,",  "3Portrat,",  "2Vitalitat",  "1Bildhauer,",  "2Leinwand,",  "1Mei?el,",  "1Rahmen,",  "2Skulptur,",
            "2Avantgarde,",  "2Installation,",  "2Kluft,",  "1Kurator,",  "2Performance,",  "1Tribut,",  "1Winkel,",  "1Zeitgeist",
            "2Besucher",  "1Nabel",  "1Welt",  "1offentliche",  "1Durchbruch,",  "2Epoche,",  "3Handout,",  "2Skizze,",  "3Urheberrecht,",
            "1Vorlaufer,",  "1Werdegang",  "3Zitat,",  "1Zyklus,",  "1Galerist,",  "3Lehramt",  "2Option,",  "1Raumausstatter,",
            "1Sponsor,",  "3Verfahren,",  "1Staub",  "3Unaussprechliche",  "2Akademie,",  "3Design,",  "2Fachrichtung,",
            "2Geografie",  "2Germanistik",  "3Ingenieurwesen",  "3Jus,",  "2Konstruktion,",  "2bildende",  "2Praferenz,",
            "3Prinzip,",  "2Prinzipien",  "2Sozialarbeit",  "2Sozialpadagogik",  "2Studienordnung,",  "2Bilanz,",  "2Eleganz",
            "1Enthusiasmus",  "1Feminismus",  "2Kompetenz,",  "2Konkurrenz",  "2Periode,",  "2Recherche,",  "2Resonanz,",  "1Sarkasmus",
            "1Volontar,",  "2Ausfuhrung,",  "2/der",  "2/der",  "3Geschlecht,",  "2Gleichstellung",  "2Orthografie,",  "2Publikation,",
            "1Schriftverkehr",  "2offentliche",  "1Ansprechpartner,",  "1Au?enhandel",  "1Austausch",  "2Belastung,",  "2Besonderheit,",
            "1Bezug,",  "1Mentor,",  "2Perspektive,",  "2/der",  "3Studium,",  "2Studien",  "3Bachelor-",  "1Uberblick",  "2Außerung,",
            "1Lernstoff,",  "2Mitschrift,",  "2Anekdote,",  "2Ansprache,",  "2Ausdrucksweise,",  "3Potenzial,",  "3Statement,",
            "1Abstand,",  "2Brustung,",  "2Sekundarliteratur,",  "3BAfoG",  "1ECTS-Punkt,",  "2Einschreibung,",  "3Stipendium,",
            "1Parasit,",  "1Schmarotzer,",  "1Tramper,",  "2Utopie,",  "1Bezirk,",  "2Mahnung,",  "2Pravention,",  "2Ratenzahlung,",
            "2Schuldenfalle,",  "2Wohlfahrt",  "2Auflage,",  "1Ausweg,",  "2/",  "1Betroffene,",  "1Glaubiger,",  "2Insolvenz,",
            "1Schuldner,",  "3Verfahren,",  "2Verfassung",  "1Boom",  "2Konjunktur,",  "1Landwirt,",  "1Mindestlohn,",  "2Prognose,",
            "2Quote,",  "3Wachstum",  "2Grundsicherung",  "2Bankleitzahl,",  "3Bargeld",  "2Behorde,",  "1Code,",  "1Dauerauftrag,",
            "2Lastschrift,",  "1Transfer,",  "2Wahrung,",  "1Zahlungsverkehr",  "2Ziffer,",  "3Budget,",  "1Kanton,",  "2Depression,",
            "2Empathie",  "2Individualitat,",  "2Psychosomatik",  "3Defizit,",  "1Gradmesser,",  "2Konstante,",  "1Parameter,",
            "2Resistenz,",  "2Vernunft",  "2Weisheit,",  "1Gefuhlsausbruch,",  "1Impuls,",  "3Selbstwertgefuhl,",  "2Anziehungskraft,",
            "1Ruckschluss,",  "3Temperament,",  "1Balken,",  "1Freiraum,",  "2Symptomatik",  "2Auffalligkeit,",  "2Ausdauer",
            "2Feigheit,",  "2Gewissenhaftigkeit",  "2Hypnose",  "1Mut",  "2Nachlassigkeit,",  "2Psyche,",  "2Psychoanalyse",
            "3Schuldgefuhl,",  "3Umfeld,",  "3Verhaltensmuster,",  "1Versprecher,",  "3Zeitalter,",  "2Kulissen",  "2Lage",
            "1Entwurf,",  "2Schiene,",  "2Vision,",  "3Abwasser,",  "1Feinstaub",  "1Kollektor,",  "2Kommune,",  "2Metropole,",
            "2Optik,",  "1Pionier,",  "1Smog",  "2Solarzelle,",  "3Treibhausgas,",  "2Unmenge,",  "2Urbanisierung,",  "1Zustrom,",
            "2Grundlage",  "1Bedingung,",  "3Beet,",  "1Dilettant,",  "2Diversitat",  "2Hektik",  "2Bevolkerungsdichte",
            "2Diskrepanz,",  "2Provinz,",  "2Siedlung,",  "2Sparkasse,",  "2Tristesse,",  "2Wanderschaft",  "1Aussteiger,",
            "1Eigenbedarf",  "3Glasfasernetz,",  "2Nutzflache,",  "2Schlosserwerkstatt,",  "2Schneiderei,",  "2Urkunde,",
            "1Vorstand,",  "2Ziege,",  "3bisher",  "2Linde,",  "1Blickkontakt,",  "2Jury,",  "1Kontrahent,",  "1Ausspruch,",
            "1Schmetterling,",  "2Erkenntnis,",  "2Fantasie,",  "2Frustration,",  "2Intensitat,",  "1Irrtum,",  "2Kreativitat",
            "1Literat,",  "2Manipulation,",  "2Naivitat",  "1Philosoph,",  "2Philosophie,",  "1Reichtum,",  "1Ruhm",
            "2Spekulation,",  "1Untergang,",  "1Verrat",  "1Zugang,",  "2Rede",  "2Auslegung,",  "1Gegenspieler,",
            "1Handlungsstrang,",  "2Identitat,",  "2Lekture,",  "2Lesart,",  "1Plot,",  "1Protagonist,",  "1Schauplatz,",
            "1Spannungsbogen,",  "2Belletristik",  "1Bestseller,",  "2Effizienz,",  "2Panik,",  "2Adaption,",  "2Bebilderung,",
            "2Dramaturgie,",  "2Einmischung,",  "1Einfall,",  "3Gedicht,",  "1Klang,",  "2Silbe,",  "1Vers,",  "2Inspiration,",
            "2Phase,",  "1Verlag,",  "1Vorzug,", "2Entscheidungsfindung,",  "2Intention,",  "3Regelwerk,",  "1Schock,",
            "3Statussymbol,",  "2Tagesordnung,",  "3Outfit,",  "3ist",  "2Etikette",  "2Hilfsbereitschaft",  "1Ranghohere,",
            "1Rangniedere,",  "2Hypothese,",  "3Forum,",  "2Foren",  "1Intellekt",  "2Irritation,",  "1Reibungspunkt,",
            "2Ablose,",  "2Rezension,",  "1Small",  "1Trainer,",  "2Hintertur",  "1Modellbau",  "1Atem",  "1Bruchteil,",
            "2Drohne,",  "1Finalist,",  "2Frequenz,",  "2Geste,",  "2Prothese,",  "3Unterfangen,",  "1Antrieb,",  "1Behalter,",
            "3Gut,",  "3Patent,",  "3Rauschgift,",  "1Scanner,",  "1Sprengstoff,",  "2Trefferquote,",  "1Eingriff,",  "2Evolution",
            "3Experimentierstadium,",  "2Experimentierstadien",  "2Erbsubstanz,",  "2Errungenschaft,",  "3Gen,", "1Android,",
            "2Mimik",  "3Modul,",  "1Proband,",  "1Raumfahrer,",  "1Roboter,",  "1Sensor,",  "3Reagenzglas,",  "2Norm,",  "1Rohstoff,"
    };
    String wordsc2[] =  new String[] {
            "1", "2"
    };


    Button derbutt;
    Button diebutt;
    Button dasbutt;

    TextView word;
    TextView sore;
    TextView wrong;
    TextView percent;
    SharedPreferences sPr;
    ConstraintLayout constraintlayout;

    A1 a1=new A1();
    A2 a2=new A2();
    B1 b1=new B1();
    B2 b2=new B2();
    C1 c1=new C1();
    C2 c2=new C2();
    MainActivity m = new MainActivity();
    ConstraintLayout viewL;


    // int points=getPoints();
    int points=0;
    int minuspoints = 0;
    int all=0;

    public char art;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        int backgroundColor;  //ContextCompat.getColor(R.color.textViewBackColor,  null);
      //  viewL = (ConstraintLayout) findViewById(R.id.constrainlayout);
        //viewL.setBackgroundColor(m.back);

      //  int backgroundColor = //resources.getColor(R.color.textViewBackColor,  null);


        viewL = (ConstraintLayout) findViewById(R.id.constrainlayout);

       // String a=SkyBlue;

        viewL.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.SkyBlue));

        word=findViewById(R.id.word);
        word.setText("Word");
        sore = findViewById(R.id.sore);
        sore.setText(points+"");
        wrong=findViewById(R.id.wrong);
        wrong.setText(minuspoints+"");
        percent = findViewById(R.id.percent);
       // constraintlayout=findViewById(R.id.constraintlayout);

        derbutt=findViewById(R.id.der);
        diebutt=findViewById(R.id.die);
        dasbutt=findViewById(R.id.das);

        points=getPoints();

        wortgeneration();

    }

    boolean flagpoints = true;

    public void ifder(View view) {
        if(art == '1'){
            points++;
            sore.setText(points+"");
            derbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            diebutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            dasbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            wortgeneration();

        }
        else{
           // Toast.makeText(ArtikelActivity.this, "False", Toast.LENGTH_SHORT).show();
            derbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.LightCoral));
            minuspoints++;
            flagpoints = false;
            wrong.setText(minuspoints+"");

        }
    }

    public void ifdie(View view) {
        if(art == '2'){
            points++;
            sore.setText(points+"");
            derbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            diebutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            dasbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            wortgeneration();
        }
        else{
           // Toast.makeText(ArtikelActivity.this, "False", Toast.LENGTH_SHORT).show();
            diebutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.LightCoral));
            minuspoints++;
            flagpoints = false;
            wrong.setText(minuspoints+"");

        }

    }

    public void ifdas(View view) {
        if(art == '3'){
            points++;
            sore.setText(points+"");
           // viewL.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));

            derbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            diebutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            dasbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.PowderBlue));
            wortgeneration();
        }
        else{
           // Toast.makeText(ArtikelActivity.this, "False", Toast.LENGTH_SHORT).show();
            dasbutt.setBackgroundColor(ContextCompat.getColor(ArtikelActivity.this, R.color.LightCoral));
            minuspoints++;
            flagpoints = false;
            wrong.setText(minuspoints+"");
        }
    }

    String wortnow;
    int per;
    double pointdobl=0;

    public void wortgeneration(){
        flagpoints = true;
        pointdobl=points;


        if(m.in_a1==true){
            int t = (int)(Math.random()*wordsa1.length);
            wortnow = wordsa1[t].substring(1);
            per = (int)((pointdobl/wordsa1.length)*100);
           // percent.setText(points + " " + wordsa1.length + " " + points/wordsa1.length);
            art= wordsa1[t].charAt(0);
        }
        else if(m.in_a2==true){
            int t = (int)(Math.random()*wordsa2.length);
            wortnow = wordsa2[t].substring(1);
            per = (int)((pointdobl/wordsa2.length)*100);
            art= wordsa2[t].charAt(0);
        }
        else if(m.in_b1==true){
            int t = (int)(Math.random()*wordsb1.length);
            wortnow = wordsb1[t].substring(1);
            per = (int)((pointdobl/wordsb1.length)*100);
            art= wordsb1[t].charAt(0);
        }
        else if(m.in_b2==true){
            int t = (int)(Math.random()*wordsb2.length);
            wortnow = wordsb2[t].substring(1);
            per = (int)((pointdobl/wordsb2.length)*100);
            art= wordsb2[t].charAt(0);
        }
        else if(m.in_c1==true){
            int t = (int)(Math.random()*wordsc1.length);
            wortnow = wordsc1[t].substring(1);
            per = (int)((pointdobl/wordsc1.length)*100);
            art= wordsc1[t].charAt(0);
        }
        else if(m.in_c2==true){
            int t = (int)(Math.random()*wordsc2.length);
            wortnow = wordsc2[t].substring(1);
            per = (int)((pointdobl/wordsc2.length)*100);
            art= wordsc2[t].charAt(0);
        }
        word.setText(wortnow+"");
        percent.setText(per+"%");
        savePoints();
    }

    public void savePoints(){
        sPr = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPr.edit();
        if(m.in_a1){
            ed.putInt("POINTS_A1", points);
        }
        else if(m.in_a2){
            ed.putInt("POINTS_A2", points);
        }
        else if(m.in_b1){
            ed.putInt("POINTS_B1", points);
        }
        else if(m.in_b2){
            ed.putInt("POINTS_B2", points);
        }
        else if(m.in_c1){
            ed.putInt("POINTS_C1", points);
        }
        else{
            ed.putInt("POINTS_C2", points);
        }
        ed.commit();

    }

    public int getPoints(){
        sPr = getPreferences(MODE_PRIVATE);
        if(m.in_a1){
            return sPr.getInt("POINTS_A1", 0);
        }
        else if(m.in_a2){
            return sPr.getInt("POINTS_A2", 0);
        }
        else if(m.in_b1){
            return sPr.getInt("POINTS_B1", 0);
        }
        else if(m.in_b2){
            return sPr.getInt("POINTS_B1", 0);
        }
        else if(m.in_c1){
            return sPr.getInt("POINTS_C1", 0);
        }
        return sPr.getInt("POINTS_C2", 0);
    }


    protected void onDestroy(){
        super.onDestroy();
        savePoints();
    }
}