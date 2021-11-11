package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Boss fallenAngel = new Boss();
        fallenAngel.setHealth(1000);
        fallenAngel.setDamage(100);
        fallenAngel.setPower("Бессмертие");
        fallenAngel.setName("Lucifer");
        fallenAngel.weapon.setType("копье");

        System.out.println(fallenAngel.getName() + " - " + fallenAngel.getHealth() + "hp " + fallenAngel.getDamage()+"dd способность -"+fallenAngel.getPower() + ". Оружие -"+fallenAngel.weapon.getType());


    }
}
