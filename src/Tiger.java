
    import java.awt.*;

import java.util.Random;

    public class Tiger extends Critter{
        Color r;
        Color g;
        Color b;

        public Color randcolor;

        private static int count = 0;
        private static int count2 = 0;

        public Action getMove(CritterInfo info) {

            //always infect if an enemy is in front, otherwise if a wall is in front or to the right, then turn left,
            // otherwise if a fellow Tiger is in front, then turn right, otherwise hop

            if (info.frontThreat() == true) {
                return Action.INFECT;
            }
            else if (info.getFront() == Neighbor.WALL) {
                return Action.LEFT;
            }

            else if (info.getRight() == Neighbor.WALL) {
                return Action.LEFT;
            }
            else if (info.getFront() == Neighbor.SAME) {
                return Action.RIGHT;
            }
            else {
                return Action.HOP;
            }
        }

        public Color getColor() {

            return randomColor();// taken from randomColor method
        }
        public Color randomColor()//To randomize and pass it to getColor method
        {
            int r = (int) (Math.random()*3);

            if (r==0){
                randcolor = new Color(255,   0,   0);//Red color
            }

            if (r==1){
                randcolor = new Color(0,   255,   0);//Green color
            }

            else if (r==2)
            {
                randcolor = new Color(0,   0,   255);//Blue color
            }
            //System.out.println("Random number is " + r );
            //System.out.println("Color chosen  " + randcolor );
            return randcolor;//This randomized color value will be passed to the getColor method
        }
        public String toString() {
            return "TGR";
        }
    }


