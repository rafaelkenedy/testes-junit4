import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import service.ClienteServiceTest;
import service.ContratoServiceTest;


@RunWith(Suite.class)
@SuiteClasses({ClienteServiceTest.class, ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTests {
}
