
    import java.awt.*;

    public class Bear extends Critter {
        private Direction test; //For testing purpose
        private String bearchar="\\"; //Intial value for character

        public Bear(boolean direction) { }
        public Action getMove(CritterInfo info) {
            //Test var is to check if (info.getDirection() == Direction.NORTH/SOUTH/EAST/WEST - to determine the color of Bear
            test = info.getDirection();
            //System.out.println("Bear is facing " + test ); // to see direction bear is facing
            //	always infect if an enemy is in front, otherwise hop if possible, otherwise turn left
            if (info.frontThreat() == true) {
                return Critter.Action.INFECT;
            }
            else if (info.getFront() == Neighbor.EMPTY) {
                return Critter.Action.HOP;
            }

            else {
                return Action.LEFT;
            }
        }
        //Return color = White if Bear facing North or South Direction, return color = Black when facing Eat or West
        public Color getColor() {
            if (test == Direction.NORTH) {
                return Color.WHITE;}

            else if (test == Direction.SOUTH) {
                return Color.WHITE;}

            else {
                return Color.BLACK;
            }
        }
        //Check what is the character initial value which is set as \, then change it to / as requested. And then alternate the character.
        public String toString() {
            if (bearchar == "/") {
                bearchar = "\\";
            } else if (bearchar == "\\"){
                bearchar = "/";
            }

            return bearchar;

        }
    }

