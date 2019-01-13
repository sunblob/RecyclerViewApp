package recyclerview.me.recyclerviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import recyclerview.me.recyclerviewapp.Adapters.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        mImageUrls.add("https://cs6.pikabu.ru/post_img/2017/09/08/5/1504854748122584152.jpg");
        mNames.add("Kek1");

        mImageUrls.add("https://memepedia.ru/wp-content/uploads/2018/06/unnamed-768x768.jpg");
        mNames.add("Киборг");

        mImageUrls.add("https://sun1-6.userapi.com/c543104/v543104848/3cd6a/f0w5tMe9iMo.jpg");
        mNames.add("Словенин");

        mImageUrls.add("https://cdn.discordapp.com/emojis/428586380709330944.png?v=1");
        mNames.add("Степа");

        mImageUrls.add("https://cdn.discordapp.com/emojis/356733238351233024.png?v=1");
        mNames.add("ой ой");

        mImageUrls.add("https://pp.userapi.com/c845120/v845120603/15d0da/TgaO1DguD9o.jpg");
        mNames.add("присаживайся");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
