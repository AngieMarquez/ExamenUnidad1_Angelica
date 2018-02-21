package com.example.angelica.examenunidad1_angelica;

import java.util.ArrayList;

/**
 * Created by Angie on 20/02/2018.
 */

public class Animales {
    private String tipoAnimal;
    private String animal;

    public Animales (String tipoAnimal, String animal){
        this.tipoAnimal = tipoAnimal;
        this.animal = animal;
    }

    public String getTipoAnimal(){ return tipoAnimal; }

    @Override
    public String toString() { return animal; }
    public static ArrayList<Animales> getAnimales(){
        ArrayList<Animales> animalesArrayList = new ArrayList<>();
        animalesArrayList.add(new Animales("Mamifero", "Leon"));
        animalesArrayList.add(new Animales("Reptil", "Cocodrilo"));

        return animalesArrayList;
    }

    public static ArrayList<Animales> getMamiferos() {
        ArrayList<Animales> animalesArrayList = new ArrayList<>();
        animalesArrayList.add(new Animales("Mamifero", "Leon"));
        animalesArrayList.add(new Animales("Mamifero", "Vaca"));
        animalesArrayList.add(new Animales("Mamifero", "Lobo"));
        animalesArrayList.add(new Animales("Mamifero", "Perro"));
        animalesArrayList.add(new Animales("Mamifero", "Gato"));
        animalesArrayList.add(new Animales("Mamifero", "Caballo"));
        animalesArrayList.add(new Animales("Mamifero", "Jirafa"));
        animalesArrayList.add(new Animales("Mamifero", "Ballena"));
        animalesArrayList.add(new Animales("Mamifero", "Canguro"));
        animalesArrayList.add(new Animales("Mamifero", "Panda"));
        return animalesArrayList;
    }
    public static ArrayList<Animales> getReptiles(){
        ArrayList<Animales> animalesArrayList = new ArrayList<>();
        animalesArrayList.add(new Animales("Reptiles","Boa"));
        animalesArrayList.add(new Animales("Reptiles","Tortuga"));
        animalesArrayList.add(new Animales("Reptiles","Cocodrilo"));
        animalesArrayList.add(new Animales("Reptiles","Iguana"));
        animalesArrayList.add(new Animales("Reptiles","Camaleon"));
        animalesArrayList.add(new Animales("Reptiles","Lagartija"));
        animalesArrayList.add(new Animales("Reptiles","Caiman"));
        animalesArrayList.add(new Animales("Reptiles","Pitón"));
        animalesArrayList.add(new Animales("Reptiles","Dragon de Komodo"));
        animalesArrayList.add(new Animales("Reptiles","Monstruo de Gila"));

        return animalesArrayList;

    }
}
