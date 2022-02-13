package HM_1;

public class Course {

    private int runDist;
    private int jumpHeight;
    private int crowlDist;

    public Course(int runDist, int jumpHeight, int crowlDist) {
        this.runDist = runDist;
        this.jumpHeight = jumpHeight;
        this.crowlDist = crowlDist;
    }

    int getRunDist() {
        return this.runDist;
    }

    int getJumpHeight() {
        return this.jumpHeight;
    }

    int getCrowlDist() {
        return this.crowlDist;
    }

}
