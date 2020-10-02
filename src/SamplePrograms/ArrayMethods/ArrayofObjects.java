
package SamplePrograms.ArrayMethods;


public class ArrayofObjects {

    
    public static void main(String[] args) {
        Room myRooms[] = new Room[5];
        String RoomNames[] = {Kitchen,Den,Washroom,Bedroom,Playroom};
        
        for (int i = 0; i < myRooms.length; i++) {
            myRooms[i] = new Room(
                        RoomNames[i]
                        (int)Math.random() * 20 + 10),
                        (int)Math.random() * 20 + 10)
                    );
        }
    }
    
}
