package ro.ctrln.clases;

public class PlanetUsage {

    public static void main(String[] args) {

        Planet mercury = new Planet();
        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());
        System.out.println(mercury.getNumbersOfMoons());

        mercury.setPlanetName("Mercur");
        mercury.setNumbersOfMoons((short) 3);
        mercury.setMass(330);
        mercury.setNumberOfOceans(5);

        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());
        System.out.println(mercury.getNumbersOfMoons());

        System.out.println(mercury);

        Planet venus = new Planet("Venus", 4, 488, (short) 20);
        System.out.println(venus);

        System.out.println("Mercury hashcode: " + mercury.hashCode());
        System.out.println("Venus hashcode: " + venus.hashCode());

        // ctrl /
//        mercury.setPlanetName(venus.getPlanetName());
//        mercury.setMass(venus.getMass());
//        mercury.setNumberOfOceans(venus.getNumberOfOceans());
//        mercury.setNumbersOfMoons(venus.getNumbersOfMoons());

        System.out.println("mercury.equals(venus): " + mercury.equals(venus));

        System.out.println("Mercury mass: " + mercury.computeMass(22));
        System.out.println("Venus mass: " + venus.computeMass(22));
    }
}
