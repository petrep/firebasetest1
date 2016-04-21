package test.com.firebasetest1;

import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by liferay on 4/21/2016.
 */
public class DB_Connection_Test extends android.app.Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }


}
