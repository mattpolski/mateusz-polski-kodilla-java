package om.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int tasksCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateTasks(TasksToCheck tasksToCheck) {
        System.out.println("Mentor " + mentorName + " has new task to check from " + tasksToCheck.getName() + "\n" +
                " (total: " + tasksToCheck.getTasks().size() + " tasks to check)");
        tasksCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
