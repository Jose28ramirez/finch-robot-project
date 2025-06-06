package com.Joseanddeo;

import com.birdbrain.Finch;

public class PracticeFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        // ADD CODE HERE
        // first long stretch
        bird.setMove("F",113,60);
        // first long stretch
        bird.setTurn("L",90,100);
        bird.setMove("F",32,60);
        bird.setTurn("L",90,100);
        
        bird.setMove("F",35,60);
        bird.setTurn("R",90,100);
        bird.setMove("F",56,60);
        // turn it 92 degrees because it kept going off course
        bird.setTurn("R",92,100);
        //right before longest stretch 
        bird.setMove("F",118,45);
        bird.setTurn("R",90,100);
        bird.setMove("F",24,60);
        bird.setTurn("L",90,100);
        bird.setMove("F",21,60);
        bird.setTurn("R",90,100);
        //makes it back into last part
        bird.setMove("B",19,60);

        bird.stop();
        bird.disconnect();
    }
}
