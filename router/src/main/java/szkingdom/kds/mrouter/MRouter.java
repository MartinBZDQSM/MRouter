package szkingdom.kds.mrouter;

/**
 * author:hy 2017/12/29.
 * email: yuan.hu@inin88.com
 */
public class MRouter {
    private static final MRouter ourInstance = new MRouter();

    public static MRouter getInstance() {
        return ourInstance;
    }

    private MRouter() {
    }
}
