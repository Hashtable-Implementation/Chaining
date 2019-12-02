package com.kamaldwip.coding.hashtable.collisions.chaining;

public class Main {

    public static void main(String[] args) {

        Employee kamal = new Employee("Kamaldwip","Chaudhury",585199);
        Employee kishore = new Employee("Kishore","Choudhury",687125);
        Employee prateek = new Employee("Prateek","Sahu",565312);
        Employee parag = new Employee("Parag","Roy",654123);
        Employee kaushik = new Employee("Kaushik","Talukdar",585192);
        Employee abhinav = new Employee("Abhinav","Borgohain",585162);

        ChainedHashtable cht = new ChainedHashtable();

        cht.put("Choudhury",kishore);
        cht.put("Chaudhury",kamal);
        cht.put("Sahu",prateek);
        cht.put("Roy",parag);
        cht.put("Talukdar",kaushik);
        cht.put("Borgohain",abhinav);

        cht.printHashtable();

        System.out.println("Retrieve value for Roy : "+cht.get("Roy"));

        System.out.println("Retrieve value for Chaudhury : "+cht.get("Chaudhury"));

        System.out.println("Retrieve value for Borgohain : "+cht.get("Borgohain"));

        cht.remove("Sahu");
        cht.remove("Chaudhury");

        cht.printHashtable();


    }
}
