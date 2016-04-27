import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {
  private String mDescription;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private static ArrayList<Task> instantFood = new ArrayList<Task>();
  private int mId;

  public Task(String description) {
    mDescription = description;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    mId = instantFood.size();
    instantFood.add(this);
  }


  public static Task find(int id) {
    try {
      return instantFood.get(id);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
      return null;
    }
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public void completedTask(){
    mCompleted = true;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static ArrayList<Task> all() {
    return instantFood;
  }

  public static void clear() {
    instantFood.clear();
  }

  public int getId() {
    return mId;
  }
}
