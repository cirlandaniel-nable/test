import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

@Slf4j
public class Test {

    private static Logger logger = LoggerFactory.getLogger(Slf4j.class);
    private String orderstatus = "finished";
    private int errorcode = 404;
    private String user = "N-able";
    private Long transactionId = 123L;

    void myFunc0() {
        logger.info(String.format("Log <script> alert(1) </script> message info: user={%s}, transactionid={%d}", orderstatus, errorcode, user, transactionId));
    }

}
