package Job;

public class Loader extends Job {
    public String nameJob;

    public Loader(String nameJob) {
        this.nameJob = nameJob;
    }

    @Override
    public String toString() {
        return nameJob;
    }
}