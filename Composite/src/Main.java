public class Main {
    public static void main(String[] args){
        //Gonna pretend to be launching a rocket ship as the operation

        //First section "Pre-steps"
        Step calculation = new Step("Calculation", 10);
        Step angle = new Step("Angle", 15);
        Composite presteps = new Composite("presteps");
        presteps.add(angle);
        presteps.add(calculation);

        //Second section "Launch"
        Step ignition = new Step("ignition", 17);
        Step burn = new Step("Burn", 30);
        Composite launch = new Composite("launch");
        launch.add(ignition);
        launch.add(burn);

        //Third section "Flight"
        Step troposphere = new Step("Troposphere", 50);
        Step stratosphere = new Step("Stratosphere", 40);
        Step mesosphere = new Step("Mesosphere", 30);
        Step thermosphere = new Step("Thermosphere", 20);
        Step exosphere = new Step("Exosphere", 10);
        Composite flight = new Composite("Flight");
        flight.add(troposphere);
        flight.add(stratosphere);
        flight.add(mesosphere);
        flight.add(thermosphere);
        flight.add(exosphere);

        //Finally one last component that contains it all
        Composite spaceflight = new Composite("Space Flight");
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
