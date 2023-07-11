package com.example.e7m5;

public class Presentador {
    private Modelo model;
    private ViewPresentador viewPresentador;

    public Presentador(ViewPresentador viewPresentador) {
        this.viewPresentador = viewPresentador;
        model = new Modelo();
    }

    public void evaluatePassword(String password){
        int passwordStrengthLevel = model.verifyPassword(password);

        if (passwordStrengthLevel==Modelo.WEAK){
            this.viewPresentador.showWeak();
            
        } else if (passwordStrengthLevel==Modelo.MEDIUM) {
            this.viewPresentador.showMedium();
            
        }else if (passwordStrengthLevel==Modelo.STRONG) {
            this.viewPresentador.showStrong();

        }else {
            this.viewPresentador.showError();

        }

    }
}
