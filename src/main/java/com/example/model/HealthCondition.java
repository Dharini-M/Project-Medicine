package com.example.model;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HealthCondition {
    Cart cart=new Cart();
    Scanner s=new Scanner(System.in);
    HashMap<String,Integer> map1=new HashMap<>();
    ArrayList<String> list=new ArrayList<>();
    HashMap<String,Integer> map=new HashMap<>();
    int quantity;
    int select;
    public void main(){
        System.out.println("select your choice:\n 1. Cold And Cough 2. Stomach Care 3. Eye Care 4. cart");
        int select=s.nextInt();
        switch (select) {
            case 1:
                coldAndCough();
                break;
            case 4:
                System.out.println(cart.getMap());
        }
    }
    public void coldAndCough(){
        list.add("Vicks Action 500");
        list.add("Paraceptamol");
        list.add("Citrizine");
        map.put("Vicks Action 500",5);
        map.put("Paraceptamol",2);
        map.put("Citrizine",1);
        System.out.println("1. Vicks Action 500 2. Paraceptamol 3. Citrizine 4. Back 5. Exit");
        System.out.println("Enter your Choice");
        select=s.nextInt();
        if(select!=4 && select!=5) {
            System.out.println("Enter the quantity");
            quantity=s.nextInt();
        }
        methodOverload();
        System.out.println("good bye");
    }

    private void methodOverload() {
        do {
            if(select==5){
                break;
            }
            switch (select) {
                case 1:
                    map1.put(list.get(select-1),quantity*(map.get(list.get(select-1))));
                    cart.setMap(map1);
                    main();
                    break;
                case 2:
                    map1.put(list.get(select-1),quantity*(map.get(list.get(select-1))));
                    cart.setMap(map1);
                    main();
                    break;
                case 3:
                    map1.put(list.get(select-1),quantity*(map.get(list.get(select-1))));
                    cart.setMap(map1);
                    main();
                    break;
                case 4:
                    main();
                    break;
                default:
                    System.out.println("invalid option!");
                    main();
                    break;
            }
        }while (select!=5);
    }
}
