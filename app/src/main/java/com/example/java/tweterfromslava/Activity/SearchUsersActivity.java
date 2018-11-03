package com.example.java.tweterfromslava.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.java.tweterfromslava.POJO.User;
import com.example.java.tweterfromslava.R;
import com.example.java.tweterfromslava.adapter.UserAdapter;

import java.util.Arrays;
import java.util.Collection;


public class SearchUsersActivity extends AppCompatActivity {
    private RecyclerView usersRecyclerView;
    private UserAdapter usersAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_users);

        initRecyclerView();
        searchUsers();
    }

    private void searchUsers() {
        Collection<User> users = getUsers();
        usersAdapter.setItems(users);
    }
    private Collection<User> getUsers() {
        return Arrays.asList(
                new User(
                        929257819349700608L,
                        "http://i.imgur.com/DvpvklR.png",
                        "DevColibri",
                        "@devcolibri",
                        "Sample description",
                        "USA",
                        42,
                        42
                ),
                new User(
                        44196397L,
                        "https://pbs.twimg.com/profile_images/782474226020200448/zDo-gAo0_400x400.jpg",
                        "Elon Musk",
                        "@elonmusk",
                        "Hat Salesman",
                        "Boring",
                        14,
                        13
                )
        );
    }

    public void initRecyclerView() {
        usersRecyclerView = findViewById(R.id.user_recycler_view);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        usersAdapter = new UserAdapter();
        usersRecyclerView.setAdapter(usersAdapter);
    }
}
