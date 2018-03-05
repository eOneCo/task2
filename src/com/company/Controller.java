package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        view.printRequest1();
        model.setMinNumber(scanner.nextInt());
        view.printRequest2();
        model.setMaxNumber(scanner.nextInt());
        model.rand();
        do {
            do {
                view.printRequest3();
                model.setNumber(scanner.nextInt());
                if (!model.isOnInterval()) {
                    view.notInInterval();
                }
            } while (!model.isOnInterval());

            if (model.compare()) {
                view.youWin();
            } else {
                view.printError();
                if (model.isHigher()) {
                    view.wrongHigher();
                    model.setMinNumber(model.getNumber());
                } else {
                    view.wrongLower();
                    model.setMaxNumber(model.getNumber());
                }
            }
        } while (!model.compare());

    }
}