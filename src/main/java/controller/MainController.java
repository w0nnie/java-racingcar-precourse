package controller;

import service.Play;

public class MainController {
    Play play = new Play();

    public void run(){
        play.inputCars();
    }
}
