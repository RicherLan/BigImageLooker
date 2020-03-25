package lan.qxc.bigimagelooker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_display = this.findViewById(R.id.button_display);
        button_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BigImageLookerActivity.class);

                int pos = 1;
                ArrayList<String> imgPaths = new ArrayList<>();
                ArrayList<String> titles  = new ArrayList<>();


                intent.putExtra("pos",pos);
                intent.putStringArrayListExtra("imgPaths",imgPaths);
                intent.putStringArrayListExtra("titles",titles);

                startActivity(intent);

            }
        });


    }
}
