package lan.qxc.bigimagelooker;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.List;

public class BigImageLookerActivity extends AppCompatActivity {

    private ViewPager vp_bigiamge;
    private BigImagePagerAdapter adapter;

    private int pos;
    private List<String> imgPaths;
    private List<String> titles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigiamge_looker);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);
        imgPaths = intent.getStringArrayListExtra("imgPaths");
        titles = intent.getStringArrayListExtra("titles");



        initView();
        initEvent();

    }

    private void initView(){
        vp_bigiamge = this.findViewById(R.id.vp_bigiamge);

        adapter = new BigImagePagerAdapter(this,imgPaths,titles);
        vp_bigiamge.setAdapter(adapter);

        vp_bigiamge.setCurrentItem(pos, true);


    }

    private void initEvent(){

    }

}
