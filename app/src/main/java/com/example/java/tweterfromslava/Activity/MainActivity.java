package com.example.java.tweterfromslava.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.java.tweterfromslava.POJO.Tweet;
import com.example.java.tweterfromslava.POJO.User;
import com.example.java.tweterfromslava.R;
import com.example.java.tweterfromslava.adapter.TweetAdapter;
import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    private ImageView userImageView;
    private TextView nameTextView;
    private TextView nickTextView;
    private TextView descriptionTextView;
    private TextView locationTextView;
    private TextView followingTextView;
    private TextView followerTextView;
    private RecyclerView tweetRecyclerView;
    private TweetAdapter tweetAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userImageView = findViewById(R.id.user_image_view);
        nameTextView = findViewById(R.id.user_name_text_view);
        nickTextView = findViewById(R.id.user_nick_text_view);
        descriptionTextView = findViewById(R.id.user_description_text_view);
        locationTextView = findViewById(R.id.user_location_text_view);
        followingTextView= findViewById(R.id.user_following_count_text_view);
        followerTextView = findViewById(R.id.user_followers_count_text_view);
        loadUserInfo();
        initRecyclerView();
        loadTweets();
    }

    private Collection<Tweet> getTweets() {
        return Arrays.asList(
                new Tweet(getUser(), 1L, "Thu Dec 13 07:31:08 +0000 2017", "Очень длинное описание твита 1",
                        4L, 4L, "https://www.w3schools.com/w3css/img_fjords.jpg"),
                new Tweet(getUser(), 2L, "Thu Dec 12 07:31:08 +0000 2017", "Очень длинное описание твита 2",
                        5L, 5L, "https://www.w3schools.com/w3images/lights.jpg"),
                new Tweet(getUser(), 3L, "Thu Dec 11 07:31:08 +0000 2017", "Очень длинное описание твита 3",
                        6L, 6L, "https://www.w3schools.com/css/img_mountains.jpg")
        );
    }

    private void loadTweets() {
        Collection<Tweet> tweets = getTweets();
        tweetAdapter.setItems(tweets);
    }

    private void initRecyclerView() {
        tweetRecyclerView = findViewById(R.id.tweets_recycler_view);
        tweetRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tweetAdapter = new TweetAdapter();
        tweetRecyclerView.setAdapter(tweetAdapter);
    }

    private void displayUserInfo(User user) {
        Picasso.with(this).load(user.getImageUrl()).into(userImageView);
        nameTextView.setText(user.getName());
        nickTextView.setText(user.getNick());
        descriptionTextView.setText(user.getDescription());
        locationTextView.setText(user.getLocation());
        String followingCount = String.valueOf(user.getFollowingCount());
        String followerCount = String.valueOf(user.getFollowerCount());
        followingTextView.setText(followingCount);
        followerTextView.setText(followerCount);

    }

    private void loadUserInfo() {
        User user = getUser();
        displayUserInfo(user);
    }

    private User getUser() {
        return new User(5454,"https://sun7-1.userapi.com/c635103/v635103498/3e94b/BdSvb8I_nKQ.jpg",
                "Slava Doroshenko", "@slavaDoroshenko", "Лучший маленький кодер сея Саратова", "Russia, Saratov", 42, 42);
    }
}
