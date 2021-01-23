package ir.ac.shirazu.cse.shimadollahi.homegym;

public class CustomExercise {
    private static Exercise exercise;
    private static Integer repeat;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    private boolean done;

    public Exercise getExercise() {
        return exercise;
    }

    public CustomExercise(Exercise exercise, Integer repeat) {
        this.exercise = exercise;
        this.repeat = repeat;
        this.done=false;
    }

    public Integer getRepeat() {
        return repeat;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }
}
