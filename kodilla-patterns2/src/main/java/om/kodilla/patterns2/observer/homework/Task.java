package om.kodilla.patterns2.observer.homework;

public class Task {
    private final String taskTopic;
    private final String studentName;

    public Task(String taskTopic, String studentName) {
        this.taskTopic = taskTopic;
        this.studentName = studentName;
    }

    public String getTaskTopic() {
        return taskTopic;
    }

    public String getStudentName() {
        return studentName;
    }
}
