package customRobot;
import com.mobilerobots.Aria.*;
import java.util.concurrent.CompletableFuture;

public interface iAction{
  public boolean fire();
  public void setRobot(Forrest robot);
}
