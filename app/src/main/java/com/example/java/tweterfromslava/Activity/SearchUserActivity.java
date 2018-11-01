package com.example.java.tweterfromslava.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.java.tweterfromslava.POJO.Tweet;
import com.example.java.tweterfromslava.POJO.User;
import com.example.java.tweterfromslava.R;
import com.example.java.tweterfromslava.adapter.TweetAdapter;
import com.example.java.tweterfromslava.adapter.UserAdapter;

import java.util.Arrays;
import java.util.Collection;

public class SearchUserActivity extends AppCompatActivity {

    private RecyclerView searchUsersRecyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_users);

        initRecyclerView();
        searchUsers();
    }

    private void initRecyclerView() {
        searchUsersRecyclerView = findViewById(R.id.user_recycler_view);
        searchUsersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter = new UserAdapter();
        searchUsersRecyclerView.setAdapter(userAdapter);
    }

    private Collection<User> getUser() {
        return Arrays.asList(
                new User(14578645345686557L, "https://sun7-1.userapi.com/c635103/v635103498/3e94b/BdSvb8I_nKQ.jpg", "Slava Doroshenko", "@slavaDoroshenko", "Ia Samyu Kr",
                        "Russia, Saratov", 14, 54)
        );
    }

    public void searchUsers() {
        Collection<User> user = getUser();
        userAdapter.setItems(user);
    }


}