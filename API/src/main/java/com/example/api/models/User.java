package com.example.api.models;

import com.google.firebase.auth.FirebaseUser;

public class User {
    String uid;
    String email;
    public User(FirebaseUser user) {
        this.uid = user.getUid();
        this.email = user.getEmail();
    }
}
