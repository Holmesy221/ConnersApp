package holmes.holmesy.connersapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import holmes.holmesy.connersapp.Adapter.PageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        PageAdapter pageAdapter = new PageAdapter(this,getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(pageAdapter);

      TabLayout tabLayout = findViewById(R.id.tabs);
      tabLayout.setupWithViewPager(viewPager);

    }
}
