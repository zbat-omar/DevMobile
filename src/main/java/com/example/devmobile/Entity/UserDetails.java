package com.example.devmobile.Entity;

import javax.persistence.*;

@Entity
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_User;
    @Column(name = "Publicidentifier")
    private String Publicidentifier;
    @Column(name = "FullName")
    private String FullName;
    @Column(name = "Email")
    private String Email;
    @Column(name = "ProfileImageURL")
    private String ProfileImageURL;
    @Column(name = "HashedPassword")
    private String HashedPassword;

    public UserDetails(int id, String publicidentifier, String fullName, String email, String profileImageURL, String hashedPassword) {
        Id_User = id;
        Publicidentifier = publicidentifier;
        FullName = fullName;
        Email = email;
        ProfileImageURL = profileImageURL;
        HashedPassword = hashedPassword;
    }

    public UserDetails() {

    }

    public int getId() {
        return Id_User;
    }

    public void setId(int id) {
        Id_User = id;
    }

    public String getPublicidentifier() {
        return Publicidentifier;
    }

    public void setPublicidentifier(String publicidentifier) {
        Publicidentifier = publicidentifier;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getProfileImageURL() {
        return ProfileImageURL;
    }

    public void setProfileImageURL(String profileImageURL) {
        ProfileImageURL = profileImageURL;
    }

    public String getHashedPassword() {
        return HashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        HashedPassword = hashedPassword;
    }
}
