
    import java.awt.*;

    public class WhiteTiger extends Critter {

        private boolean test;

        //Same as Tiger - always infect if an enemy is in front,
        // otherwise if a wall is in front or to the right, then turn left, otherwise if a fellow Tiger is in front, then turn right, otherwise hop
        public Critter.Action getMove(CritterInfo info) {
            if (info.frontThreat() == true) {
                test = info.frontThreat();// The variable "test" to be used in the toString method to change
                //to TGR if it has infected, since it always infect other critter in front.
                return Critter.Action.INFECT;
            }
            else if (info.getFront() == Critter.Neighbor.WALL) {
                return Critter.Action.LEFT;
            }

            else if (info.getRight() == Critter.Neighbor.WALL) {
                return Critter.Action.LEFT;
            }
            else if (info.getFront() == Critter.Neighbor.SAME) {
                return Critter.Action.RIGHT;
            }

            else {
                return Critter.Action.HOP;
            }
        }
        public Color getColor() {

            return Color.WHITE;    }

        public String toString() { //Will use test variable to check if it has infected other critter

            if (test == true) {
                return "TGR";}

            else {
                return "tgr";
            }
        }
    }


