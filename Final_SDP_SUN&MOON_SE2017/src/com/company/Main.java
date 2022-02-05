package com.company;

import com.company.adapter.*;
import com.company.decorator.*;
import com.company.language.*;
import com.company.observer.*;
import com.company.observer.Observer;
import com.company.state.*;
import com.company.strategy.*;
import com.company.template.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Language language =null;
        Action state = new Action();
        System.out.println("Welcome to Online school \"Global Study Center's\"!");

        System.out.println("----------------------------------------");
        state.changeState();
        System.out.printf("State: %s\n", state.getState());
        System.out.println("----------------------------------------");

        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. Math");
        System.out.print("Your input: ");
        Scanner scanner = new Scanner(System.in);
        int ans = scanner.nextInt();
        switch (ans) {
            case 1 -> {
                language = new English();
                level();
                int answ = scanner.nextInt();
                switch (answ) {
                    case 1 -> language = new A1_level(language);
                    case 2 -> language = new A2_level(new A1_level(language));
                    case 3 -> language = new B1_level(new A2_level(new A1_level(language)));
                    case 4 -> language = new B2_level(new B1_level(new A2_level(new A1_level(language))));
                    case 5 -> language = new C1_level(new B2_level(new B1_level(new A2_level(new A1_level(language)))));
                    case 6 -> language = new C2_level(new C1_level(new B2_level(new B1_level(new A2_level(new A1_level(language))))));
                    default -> {
                        System.out.println("Bad input. Try from the beginning again!");
                        return;
                    }
                }
            }
            case 2 -> {
                language = new Spanish();
                level();
                int answ = scanner.nextInt();
                switch (answ) {
                    case 1 -> language = new A1_level(language);
                    case 2 -> language = new A2_level(new A1_level(language));
                    case 3 -> language = new B1_level(new A2_level(new A1_level(language)));
                    case 4 -> language = new B2_level(new B1_level(new A2_level(new A1_level(language))));
                    case 5 -> language = new C1_level(new B2_level(new B1_level(new A2_level(new A1_level(language)))));
                    case 6 -> language = new C2_level(new C1_level(new B2_level(new B1_level(new A2_level(new A1_level(language))))));
                    default -> {
                        System.out.println("Bad input. Try from the beginning again!");
                        return;
                    }
                }
            }
            case 3 -> {
                language=new MathLanguageAdapter();
            }
            default -> {
                System.out.println("Bad input. Try from the beginning again!");
                return;
            }
        }
        System.out.println("----------------------------------------");
        state.changeState();
        System.out.printf("State: %s\n", state.getState());
        System.out.println("----------------------------------------");

        ScheduleTemplate scheduleTemplate=null;
        System.out.println("Choose schedule: ");
        System.out.println("1. Monday,Wednesday and Friday morning");
        System.out.println("2. Tuesday,Thursday and Saturday morning");
        System.out.println("3. Monday,Wednesday and Friday evening");
        System.out.println("4. Tuesday,Thursday and Saturday evening");
        System.out.print("Your input: ");
        int answe = scanner.nextInt();
        switch (answe) {
            case 1 -> {
                scheduleTemplate = new MWF_morning();
            }
            case 2 -> {
                scheduleTemplate = new TTS_morning();
            }
            case 3 -> {
                scheduleTemplate = new MWF_evening();
            }
            case 4 -> {
                scheduleTemplate = new TTS_evening();
            }

            default -> {
                System.out.println("Bad input. Try from the beginning again!");
                return;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Your course: "+ language.getLanguageName());
        System.out.println("Level:"+language.getLanguageLevel());
        System.out.println(language.getLanguageLevelDescription());
        System.out.println("Schedule:"+scheduleTemplate.schedule());
        System.out.println("Total cost: "+ language.getCost());

        System.out.println("----------------------------------------");
        state.changeState();
        System.out.printf("State: %s\n", state.getState());
        System.out.println("----------------------------------------");

        PayStrategy payStrategy=null;
        System.out.println("Choose payment: ");
        System.out.println("1. Kaspi Bank");
        System.out.println("2. Another Bank");
        System.out.print("Your input: ");
        int answ = scanner.nextInt();
        switch (answ) {
            case 1 -> {
                System.out.print("Your phone number: ");
                String phoneNumber = scanner.next();
                payStrategy = new KaspiCard(phoneNumber);
            }
            case 2 -> {
                System.out.print("Your Name in Card: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.print("Your Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Your cvv: ");
                String cvv = scanner.nextLine();
                System.out.print("Expiry Date of your Card: ");
                String dateOfExpiry = scanner.nextLine();
                payStrategy = new AnotherBank(name,cardNumber,cvv,dateOfExpiry);
            }

            default -> {
                System.out.println("Bad input. Try from the beginning again!");
                return;
            }
        }
        System.out.println("----------------------------------------");
        payStrategy.pay(language);

        System.out.println("----------------------------------------");
        state.changeState();
        System.out.printf("State: %s\n", state.getState());
        System.out.println("----------------------------------------");


        state.changeState();
        System.out.printf("State: %s\n", state.getState());
        System.out.println("----------------------------------------");

        System.out.println("Online school \"Global Study Center's\" teachers!");
        System.out.println("Sending notification about new student:\n");
        Observer firstSubject=language;
        Lesson lesson = new Lesson();
        lesson.addObserver(firstSubject);
        lesson.notifyObserver(scheduleTemplate);
    }
    public static void level(){
        System.out.println("Choose level: ");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. B1");
        System.out.println("4. B2");
        System.out.println("5. C1");
        System.out.println("6. C2");
        System.out.print("Your input: ");
    }
}

