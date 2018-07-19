package om.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdateTasks(){
        TasksToCheck javaTasks = new JavaGroup();
        TasksToCheck javaScriptTasks = new JavaScriptGroup();
        Mentor susyGold = new Mentor("Susy Gold");
        Mentor markDeveloper = new Mentor("Mark Developer");
        Task hibernate = new Task("Hibernate", "Alex Song");
        Task basics = new Task("Basics", "Todd Zarnecki");
        Task spirng = new Task("Spring", "Edd Jones");
        Task exceptions = new Task("Exceptions", "Jessica Black");
        javaTasks.registerMentor(susyGold);
        javaScriptTasks.registerMentor(markDeveloper);

        javaScriptTasks.addTask(basics);
        javaTasks.addTask(hibernate);
        javaTasks.addTask(spirng);
        javaScriptTasks.addTask(exceptions);

        Assert.assertEquals(2, susyGold.getTasksCount());
        Assert.assertEquals(2, markDeveloper.getTasksCount());
    }
}
