package androidStudio.Harris.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuItemClicked(View view){
        switch (view.getId()){
            case R.id.techAnnounce:
                Intent techAnnounce = new Intent(MainActivity.this, TechAnnounce.class);
                startActivity(techAnnounce);
                break;
        }
    }
}
