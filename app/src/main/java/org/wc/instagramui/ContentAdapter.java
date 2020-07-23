package org.wc.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyViewHolder>{

    private static final String TAG = "ContentAdapter";

    private List<Content> items = new ArrayList<>();

    public void addItem(Content content){
        items.add(content);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_content,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Content content = items.get(position);
        holder.setItem(content);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //내부 클래스
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView myProfileText;
        private ImageView myProfilePic;

        private ImageView postPic;

        private ImageView linkPic;

        private ImageView commentPic;
        private TextView commentText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myProfileText = itemView.findViewById(R.id.content_my_profile_text);
            myProfilePic = itemView.findViewById(R.id.content_my_profile_pic);

            postPic = itemView.findViewById(R.id.content_post_pic);

            linkPic = itemView.findViewById(R.id.content_link_pic);

            commentPic = itemView.findViewById(R.id.content_comment_pic);
            commentText = itemView.findViewById(R.id.content_comment_text);
        }

        public void setItem(Content content){
            myProfileText.setText(content.getMyProfileText());
            myProfilePic.setImageResource(content.getMyProfilePic());

            postPic.setImageResource(content.getPostPic());

            linkPic.setImageResource(content.getLinkPic());

            commentPic.setImageResource(content.getCommentPic());
            commentText.setText(content.getCommentText());
        }
    }
}
