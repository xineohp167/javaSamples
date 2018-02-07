public class Ngon {

    public static void main(String[] args) {
        int N = 5;
        double angle = 360.0 / N;
        double step  = Math.sin(Math.toRadians(angle/2.0));   // sin(pi/N)
        Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
        for (int i = 0; i < N; i++) {
            turtle.goForward(step);
            turtle.turnLeft(angle);
        }

    }
}
