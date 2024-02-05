public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("H440", "NZXT", "1200w");
        Monitor theMonitor = new Monitor("Aw2518h", "AlienWare", 25, "1920x1080");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        theMonitor.drawPixelAt(8,2, "red");
//        thePC.getMonitor().drawPixelAt(12,9, "blue");
//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows OS");

        thePC.powerUp();

    }
}