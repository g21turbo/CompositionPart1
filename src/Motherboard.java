public class Motherboard extends Product{


    private int ramSlots;
    private int cardSLots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSLots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSLots = cardSLots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

}
