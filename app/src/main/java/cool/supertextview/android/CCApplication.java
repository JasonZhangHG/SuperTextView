package cool.supertextview.android;

import android.app.Application;


public class CCApplication extends Application {

    private static CCApplication INSTANCE;

    public static CCApplication getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        } else {
            INSTANCE = new CCApplication();
            INSTANCE.onCreate();
            return INSTANCE;
        }
    }

    public CCApplication() {
        INSTANCE = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

}
