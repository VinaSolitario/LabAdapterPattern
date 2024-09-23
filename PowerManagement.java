public class PowerManagement {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        Refrigerator myRefrigerator = new Refrigerator();
        SmartphoneCharger mySmartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(myLaptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(myRefrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(mySmartphoneCharger);

        // Plugging devices into the power outlet
        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}