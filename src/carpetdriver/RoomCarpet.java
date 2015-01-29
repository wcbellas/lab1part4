package carpetdriver;


public class RoomCarpet {
    RoomDimension theDimensions;
    
    int getCost(){
        return theDimensions.getArea()*8;
    }
}
