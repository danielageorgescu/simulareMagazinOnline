package com.itfactory;

import com.itfactory.Produs.Imbracaminte.Accesoriu;
import com.itfactory.Produs.Imbracaminte.Bluza;
import com.itfactory.Produs.Imbracaminte.Imbracaminte;
import com.itfactory.Produs.Imbracaminte.Pantaloni;
import com.itfactory.Produs.IngrijirePersonala.IngrijirePersonala;
import com.itfactory.Produs.IngrijirePersonala.Nereturnabil;
import com.itfactory.Produs.IngrijirePersonala.Returnabil;
import com.itfactory.Produs.Produs;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti una dintre optiunile de mai jos: "+
                "\n 1. Imbracaminte"+
                "\n 2. Produse de ingrijire personala"+
                "\n 3. Electronice");

        int x = Integer.parseInt(scanner.nextLine());
        if (x==1 || x==2 || x==3){
            switch (x)
            {
                case 1: // Imbracaminte
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Alegeti una dintre optiunile de mai jos: "+
                            "\n 1. Pantaloni"+
                            "\n 2. Bluza"+
                            "\n 3. Accesorii");
                    int y = Integer.parseInt(scanner.nextLine());

                    if (y==1 || y==2 || y==3) {
                        switch (y) {
                            case 1: //Pantaloni
                                Imbracaminte pantaloni = new Pantaloni(300) ;
                                System.out.println(pantaloni.pretFinalImbracaminte(300));
                                break;
                            case 2: //Bluza
                                Imbracaminte bluza = new Bluza(250);
                                System.out.println(bluza.pretFinalImbracaminte(250));
                                break;
                            case 3: //Accesorii
                                Imbracaminte accesoriu = new Accesoriu(50);
                                System.out.println(accesoriu.pretFinalImbracaminte(50));
                                break;
                        }
                    }
              case 2:// Produse de ingrijire personala
                  // nereturnabile: perie par, ondulator, placa, epilator, aparat tuns, aparat ras
                  // returnabile: cantar corporal, uscator
                  Scanner scanner2 = new Scanner(System.in);
                  System.out.println("Alegeti una dintre optiunile de mai jos: "+
                          "\n 1. Perie par"+
                          "\n 2. Ondulator"+
                          "\n 3. Placa"+
                          "\n 4. Epilator"+
                          "\n 5. Aparat de tuns"+
                          "\n 6. Aparat de ras"+
                          "\n 7. Uscator de par"+
                          "\n 8. Cantar corporal");
                  int z = Integer.parseInt(scanner2.nextLine());

                  if (z== 7|| z ==8){
                      IngrijirePersonala reuturnabil = new Returnabil(100);
                      System.out.println(reuturnabil.pretFinalIngrijire(100));
                  } else if (z==1||z==2||z==3||z==4||z==5||z==6){
                      IngrijirePersonala nereturnabil = new Nereturnabil(100);
                      System.out.println(nereturnabil.pretFinalIngrijire(100));
                  } else{
                      System.out.println("Mai incercati o data.");
                  }
                   break;
                case 3://Electronice
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Alegeti voltajul dintre optiunile de mai jos: "+
                            "\n 1. 200-240"+
                            "\n 2. Altul");
                    int r = Integer.parseInt(scanner3.nextLine());
                    if(r==1){
                        System.out.println("Voltaj conform cu reglementarile europene aflate in vigoare");
                    } else if (r ==2){
                        System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");
                    } else{
                        System.out.println("Mai incercati o data.");
                    }
                break;
            }
        }
   }
}
