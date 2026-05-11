# Sistem za upravljanje klinikom (Java OOP)

Ovaj projekat predstavlja praktičnu primenu osnovnih principa objektno-orijentisanog programiranja u Javi, urađen kao deo provere znanja.

## Korišćeni koncepti
U okviru projekta demonstrirani su sledeći koncepti:
* **Enkapsulacija** - Privatna polja sa geterima i seterima.
* **Nasleđivanje (Inheritance)** - Specijalizovane klase doktora (Pedijatar, Onkolog, Hirurg) koje nasleđuju baznu klasu `Doktor`.
* **Polimorfizam** - Nadjačavanje (*Override*) metoda i korišćenje `instanceof` operatora.
* **Interfejsi** - Implementacija finansijskog sistema kroz `KlinikaFinansije`.
* **Obrada izuzetaka** - Upotreba `try-catch` bloka za sigurnost aplikacije.

## Struktura Projekta
- `Pacijent`: Sadrži osnovne podatke i logiku za izračunavanje godina.
- `Doktor`: Bazna klasa sa metodama za zaradu i pretragu.
- `Pedijatar/Onkolog/Hirurg`: Specifične implementacije logike čišćenja liste pacijenata.
- `Klinika`: Agregacija doktora koja upravlja finansijama i pretragom po tipu.

## Kako pokrenuti
Potrebno je imati instaliran JDK (verzija 8 ili novija). Pokrenuti `Main.java` klasu za demonstraciju funkcionalnosti.
