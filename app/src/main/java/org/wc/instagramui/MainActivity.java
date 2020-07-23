package org.wc.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContent = findViewById(R.id.rv_content);
        ContentAdapter adapter = new ContentAdapter();

        adapter.addItem(new Content("이름",R.drawable.propic1,R.drawable.postpic1,R.drawable.propic5,R.drawable.propic3,"1번 코멘트"));
        adapter.addItem(new Content("이름",R.drawable.propic2,R.drawable.postpic2,R.drawable.propic4,R.drawable.propic4,"2번 코멘트"));
        adapter.addItem(new Content("이름",R.drawable.propic3,R.drawable.postpic3,R.drawable.propic3,R.drawable.propic5,"3번 코멘트"));
        adapter.addItem(new Content("이름",R.drawable.propic4,R.drawable.postpic4,R.drawable.propic2,R.drawable.propic1,"4번 코멘트"));
        adapter.addItem(new Content("이름",R.drawable.propic5,R.drawable.postpic5,R.drawable.propic1,R.drawable.propic2,"5번 코멘트"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        rvContent.setAdapter(adapter);
    }
}