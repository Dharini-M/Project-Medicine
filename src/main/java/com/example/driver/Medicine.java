package com.example.driver;

import com.example.model.HealthCondition;

import java.util.Scanner;

public class Medicine {
    public static void main(String args[]){
        try {
            HealthCondition healthCondition = new HealthCondition();
            Scanner s = new Scanner(System.in);
            System.out.println("1. Health Condition");
            int select = s.nextInt();
            switch (select) {
                case 1:
                    healthCondition.main();
            }
        }
        catch (Exception arthmaticexception){
            System.out.println(arthmaticexception);
        }
    }
}

