package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Boss fallenAngel = new Boss();
        fallenAngel.setHealth(1000);
        fallenAngel.setDamage(100);
        fallenAngel.setPower("Телепатия");
        fallenAngel.setName("Lucifer");
        fallenAngel.weapon.setType("копье");

        System.out.println(fallenAngel.getName() + " - " + fallenAngel.getHealth() + "hp " + fallenAngel.getDamage()+"dd способность -"+fallenAngel.getPower() + ". Оружие -"+fallenAngel.weapon.getType());
        System.out.println(fallenAngel.printInfo());

        Skeleton skelet_1 = new Skeleton();
        skelet_1.setStrlely(15);
        skelet_1.setDamage(20);
        skelet_1.setHealth(120);
        skelet_1.setName("Скелет-Стив");
        skelet_1.setPower("Бессмертие");
        skelet_1.weapon.setType("Лук");

        Skeleton skelet_2 = new Skeleton();
        skelet_2.setStrlely(12);
        skelet_2.setDamage(25);
        skelet_2.setHealth(135);
        skelet_2.setName("Скелет-Роджер");
        skelet_2.setPower("неуязвимость");
        skelet_2.weapon.setType("Лук");

        System.out.println(skelet_1.printInfo());
        System.out.println(skelet_2.printInfo());



    }
}
