import java.util.*;
public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);
        GuitarSpec customerChoice=new GuitarSpec("Stratocastor",Type.ACOUSTIC,7,Builder.FENDER,Wood.ALDER,Wood.ALDER);
        List matchingGuitars=inventory.search(customerChoice);
        if(!matchingGuitars.isEmpty()) {
            System.out.println("You might like these guitars");
            for(Iterator i=matchingGuitars.iterator();i.hasNext();) {
                Guitar guitar=(Guitar) i.next();
                GuitarSpec spec=guitar.getSpec();
                System.out.println("We have a "+ spec.getBuilder() + " " + spec.getModel() + " " +spec.getNumStrings()+ " String "+ spec.getType() + " guitar:\n" +spec.getBackWood() +  " back and sides, "  +spec.getTopWood() + " top.\nYou can have it for only $" +guitar.getPrice() + "!\n---------------------------------");
            }
        }
        else {
            System.out.println("Sorry we have nothing for you!");
        }
    }
    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("7001",100.0,new GuitarSpec("Stratocastor",Type.ACOUSTIC,5,Builder.FENDER,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("7002",150.0,new GuitarSpec("Stratocastor",Type.ACOUSTIC,6,Builder.FENDER,Wood.ALDER,Wood.ALDER));
        inventory.addGuitar("7003",200.0,new GuitarSpec("Stratocastor",Type.ACOUSTIC,7,Builder.FENDER,Wood.ALDER,Wood.ALDER));
    }
}
