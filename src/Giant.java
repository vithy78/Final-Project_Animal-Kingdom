
    import java.awt.*;

    public class Giant<Private> extends Critter{

        private static int count = 0;
        private static int count2 = 0;

        public Critter.Action getMove(CritterInfo info) {
            if (info.frontThreat() == true) {
                return Critter.Action.INFECT;
            }
            else if (info.getFront() == Neighbor.EMPTY) {
                return Critter.Action.HOP;
            }

            else {
                return Action.RIGHT;
            }
        }
        public Color getColor() {

            return Color.GRAY;    }

        public String toString() {
            //"fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves, then "fum" for 6 moves, then repeat. as requirement.
            count++;
            count2 = count/30; //There will be 30 characters generated by the Critter class for 1 move.
            //the variable count as the character count per step.
            //the variable count2 is the step counter that will be divided by 30.
            //System.out.println("critter count is " + count );
            //System.out.println("Step counter is  " + count2 );

            if (count2 ==24)//This is to reset the count back to zero.
            {
                count = 0;
            }

            if (count2<=6)//for first 6 steps character will be fee
            {
                return "fee";}

            if (count2<=12)//for step 7-12 character will be fie
            {
                return "fie";}

            if (count2<=18)//for step 13-18 character will be foe

            {
                return "foe";}

            else //for step 19-24 steps will be fum

            {
                return  "fum";
            }

        }
    }


