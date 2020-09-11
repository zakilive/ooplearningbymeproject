package com.zakilive.ooplearningbyme;

public class PrintHomoSapiensDetails {

    public static void main (String[] args){

        Homosapiens man;
        man = new Homosapiens();

        Homosapiens women;
        women=new Homosapiens();


        man.age=27;
        man.sex="Male";
        man.continent="Asia";
        man.eye_color="Black";
        man.hair_color="Black";
        man.name="Zaki";
        man.Speak();

        System.out.println("\n");


        women.age=23;
        women.sex="Female";
        women.continent="Europe";
        women.eye_color="Blue";
        women.hair_color="Blonde";
        women.name="Unknown";
        women.Speak();

    }

}
