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

                String path = "/uploadfile/dongtai_ic/2.jpg /uploadfile/dongtai_ic/4.jpg /uploadfile/dongtai_ic/5.jpg " +
                        "/uploadfile/dongtai_ic/6.jpg /uploadfile/dongtai_ic/7.jpg /uploadfile/dongtai_ic/8.jpg " +
                        "/uploadfile/dongtai_ic/9.jpg /uploadfile/dongtai_ic/10.jpg /uploadfile/dongtai_ic/11.jpg ";

                String[] ss = path.split(" ");
                for(String s: ss){
                    String url = "http://192.168.43.7:8989"+ File.separator+s;
                    imgPaths.add(url);
                    titles.add(s.substring(s.lastIndexOf("/")));
                }

                intent.putExtra("pos",pos);
                intent.putStringArrayListExtra("imgPaths",imgPaths);
                intent.putStringArrayListExtra("titles",titles);

                startActivity(intent);

            }
        });


    }
}
