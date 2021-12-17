package com.company;

public class Main {
public static String health="HP: ";
public static String damage="Damage: ";
public static String nameWeapon="Name of Weapon: ";
public static String typeWeapon="Type of Weapon: ";
    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss(1500, 50, "Shield");
        boss.weapon.setNameOfWeapon("Dragon Axe");
        boss.weapon.setTypeOfWeapon("Axe");
        System.out.println(health + boss.getHealth() + "\n" + damage + boss.getDamage() + "\n" + "Defence: " + boss.getDefence() + "\n"
                + nameWeapon + boss.weapon.getNameOfWeapon() + "\n" + typeWeapon + boss.weapon.getTypeOfWeapon());
        System.out.println("-----------------------------------------------------");
        Boss boss1 = new Boss(4000, 50, "Magic Shield");
        boss1.weapon.setNameOfWeapon("Dragon's spine");
        boss1.weapon.setTypeOfWeapon("Grimoire");
        System.out.println(boss1.printlinfo() + nameWeapon + boss1.weapon.getNameOfWeapon() + "\n" + typeWeapon + boss1.weapon.getTypeOfWeapon());

        System.out.println("-----------------------------------------------------");
        Skeleton skeleton = new Skeleton(6000, 1000, "Impenetrable", 100);
        skeleton.weapon.setNameOfWeapon("Heavenly Bow");
        skeleton.weapon.setTypeOfWeapon("Bow");
        System.out.println(skeleton.printlinfo()+"\n"+nameWeapon + skeleton.weapon.getNameOfWeapon() + "\n" + typeWeapon + skeleton.weapon.getTypeOfWeapon());
        System.out.println("-----------------------------------------------------");
        Skeleton skeleton1= new Skeleton(80000, 10000, "Unflappable",100000);
        skeleton1.weapon.setNameOfWeapon("Bow of God");
        skeleton1.weapon.setTypeOfWeapon("Bow");
        System.out.println(skeleton1.printlinfo()+"\n"+nameWeapon +skeleton1.weapon.getNameOfWeapon() + "\n" + typeWeapon + skeleton1.weapon.getTypeOfWeapon());


    }
}
