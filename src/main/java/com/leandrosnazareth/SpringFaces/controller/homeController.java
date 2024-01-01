package com.leandrosnazareth.SpringFaces.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class homeController {

    public String goToHome() {
        System.out.println("Entrei goToIndex: ");
        return "home.xhtml?faces-redirect=true";
    }
}
