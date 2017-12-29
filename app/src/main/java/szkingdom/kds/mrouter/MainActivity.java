package szkingdom.kds.mrouter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import szkingdom.kds.annotation.Router;

@Router()
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s ="asdasd";
    }
}
