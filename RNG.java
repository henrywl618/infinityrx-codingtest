import java.lang.*;

public class RNG {

    double seed;
    double a;
    double c;
    double m;

    RNG() {
        this.seed = System.currentTimeMillis();
        this.a = 134775813;
        this.c = 1;
        this.m = Math.pow(10,9);
    }

    public double generate(){
        /* 
        Linear congruential generator using the current time in milliseconds as the seed
        https://en.wikipedia.org/wiki/Linear_congruential_generator 
        https://www.cs.princeton.edu/courses/archive/spr03/cs126/assignments/cycle.html

        Generates random number between 0 and 1;
        */
        double num = (seed*a + c) % m;
        a = num;
        return num/Math.pow(10,9);
    }
}
