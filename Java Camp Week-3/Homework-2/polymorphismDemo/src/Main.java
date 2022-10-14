import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
  //      BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
  //      for (BaseLogger logger:loggers){
  //          logger.log("log mesajı");
  //      }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();


            }
        };
