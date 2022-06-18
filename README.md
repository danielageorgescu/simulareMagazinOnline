# simulareMagazinOnline
simulare vanzare produse in magazin online
Sa se creeze un program prin care se simuleaza un sistem de vanzare al unor produse de pe un magazin online.
In contextul magazinului, se va defini un concept de produs. Ca si date ale acestui produs se cer urmatoarele.
Se defineste un nume al produsului, un pret si discount. (ATENTIE: pentru discount se va cere o verificare sa fie un numar intre 0 si 100 atunci cad va fi setat).
In metoda produs se va implementa o metoda care calculeaza pretul cu discountul aplicat.

In cadrul magazinului online exista 3 tipuri de produse: Imbracaminte, Ingrijire Personala si Electronice.
Se vor defini, aditional urmatoarele concepte pentru produse:
Imbracaminte: tipul de imbracaminte (pantaloni, bluza, acesoriu)
Ingrijire Persoanala: variabila ce determina daca produsul poate fi returnat sau nu 
----------------------(Anumite produse care sunt desfacute nu pot fi returnate de exemplu un aparat de ras)
Electronice: variabila ce determina voltajul.
----------------------Valorile permise pentru voltaj vor fi doar intre 220 si 240 (Dupa reglementarea europeana). In cazul in care se va introduce o alta valoare pentru voltaj, se va genera un mesaj de atentionare.


Dupa declararea corecta a claselor se cer urmatoarele. (Pentru aceasta creati o clasa separata "Main" unde veti scrie metoda main)

Se va citi de la tastatura datele unui produs de tip Imbracaminte.
1. In cazul in care produsul citit este de tip pantaloni, se va aplica un discount de 10% si se va afisa pretul final dupa discount.
2. In cazul in care produsul citit este de tip bluza, se va aplica un discount de 20% si se va afisa pretul final dupa discount.
3. In cazul in care produsul citit este de tip accesoriu, se va aplica un discount de 30% si se va afisa pretul final dupa discount.


Se va citi de la tastatura datele unui produs de tip Ingrijire Personala.
1. Daca produsul poate fi returnat nu se va aplica niciun discount
2. Daca produsul nu poate fi returnat se va aplica un discount de 20% in favoarea clientului.

Se va citi de la tastatura datele unui produs de tip Electronice.
1. In cazul in care voltajul introdus este altul decat cel cuprins intre 220 si 240 se va afisa un mesaj de eroare "Produsul nu poate fi folosit la o priza ce prevede reglementarile europene"

