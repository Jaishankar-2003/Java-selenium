import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logtest
{
    private static final Logger logger = LogManager.getLogger(logtest.class);
    public static void main(String[] args)
    {
        logger.trace("TRACE log");
        logger.debug("DEBUG log");
        logger.info("✅ INFO log");
        logger.warn("⚠ WARN log");
        logger.error("❌ ERROR log");
        logger.fatal("💀 FATAL log");
    }
}
