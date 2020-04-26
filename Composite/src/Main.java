import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Gonna pretend to be launching a rocket ship as the operation

        //First section "Pre-steps"
        Part calculation = new Part("Calculation", 10);
        Part angle = new Part("Angle", 15);
        Assembly presteps = new Assembly("presteps");
        presteps.add(angle);
        presteps.add(calculation);

        //Second section "Launch"
        Part ignition = new Part("ignition", 17);
        Part burn = new Part("Burn", 30);
        Assembly launch = new Assembly("launch");
        launch.add(ignition);
        launch.add(burn);

        //Third section "Flight"
        Part troposphere = new Part("Troposphere", 50);
        Part stratosphere = new Part("Stratosphere", 40);
        Part mesosphere = new Part("Mesosphere", 30);
        Part thermosphere = new Part("Thermosphere", 20);
        Part exosphere = new Part("Exosphere", 10);
        Assembly flight = new Assembly("Flight");
        flight.add(troposphere);
        flight.add(stratosphere);
        flight.add(mesosphere);
        flight.add(thermosphere);
        flight.add(exosphere);

        //Finally one last component that contains it all
        Assembly spaceflight = new Assembly("Space Flight");
        spaceflight.add(presteps);
        spaceflight.add(launch);
        spaceflight.add(flight);

        System.out.println("Total Space Flight Time: "+ spaceflight.getTime());
        System.out.println("Pre-steps Time: "+ presteps.getTime());
        System.out.println("Launch Time: "+ launch.getTime());
        System.out.println("Flight Time: "+ flight.getTime());



        //

    }
}
