package com.ak;

public class main {
    public static void main(String[] args) {
        DanceRob rob = new BalletDancingRobot();
        printer(rob);
        printer(new FolkDancingRobot());
        printer(new JazzDancingRobot());
    }

    private static void printer(DanceRob rob) {
        System.out.println("________________");
        System.out.println(rob.getDanceType1());
        System.out.println(rob.getDanceType2());
        System.out.println("________________");
    }
}
