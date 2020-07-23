package org.wc.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvContent;
    private RecyclerView rvProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContent = findViewById(R.id.rv_content);
        ContentAdapter contentAdapter = new ContentAdapter();

        contentAdapter.addItem(new Content("이름",R.drawable.propic1,R.drawable.postpic1,R.drawable.propic5,R.drawable.propic3,"1번 코멘트"));
        contentAdapter.addItem(new Content("이름",R.drawable.propic2,R.drawable.postpic2,R.drawable.propic4,R.drawable.propic4,"2번 코멘트"));
        contentAdapter.addItem(new Content("이름",R.drawable.propic3,R.drawable.postpic3,R.drawable.propic3,R.drawable.propic5,"3번 코멘트"));
        contentAdapter.addItem(new Content("이름",R.drawable.propic4,R.drawable.postpic4,R.drawable.propic2,R.drawable.propic1,"4번 코멘트"));
        contentAdapter.addItem(new Content("이름",R.drawable.propic5,R.drawable.postpic5,R.drawable.propic1,R.drawable.propic2,"5번 코멘트"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        rvContent.setAdapter(contentAdapter);


        ////////////
        rvProfile = findViewById(R.id.rv_profile);
        ProfileAdapter profileAdapter = new ProfileAdapter();

        profileAdapter.addItem(new Profile(R.drawable.propic1,"이름1"));
        profileAdapter.addItem(new Profile(R.drawable.propic2,"이름2"));
        profileAdapter.addItem(new Profile(R.drawable.propic3,"이름3"));
        profileAdapter.addItem(new Profile(R.drawable.propic4,"이름4"));
        profileAdapter.addItem(new Profile(R.drawable.propic5,"이름5"));
        profileAdapter.addItem(new Profile(R.drawable.propic1,"이름6"));
        profileAdapter.addItem(new Profile(R.drawable.propic2,"이름7"));
        profileAdapter.addItem(new Profile(R.drawable.propic3,"이름8"));
        profileAdapter.addItem(new Profile(R.drawable.propic4,"이름9"));
        profileAdapter.addItem(new Profile(R.drawable.propic5,"이름10"));

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(this);
        horizontalLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rvProfile.setLayoutManager(horizontalLayoutManager);
        rvProfile.setAdapter(profileAdapter);
    }
}