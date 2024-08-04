package Job;

public abstract class Job {
    public String nameWork;

    public Job(String nameWork) {
        this.nameWork = nameWork;
    }
    @Override
    public String toString() {
        return String.format("Название профессии: %s", nameWork);
    }
}
