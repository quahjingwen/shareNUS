package com.example.quahjingwen.sharenus;

/**
 * Created by AndroidJSon.com on 6/10/2017.
 */


public class ImageUploadInfo {

    public String imageName;

    public String imageURL;

    public String eFaculty;
    public String eCourse;
    public String eModuleCode;
    public String eDescription;
    public String eUsername;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String username, String name, String faculty, String course, String modulecode, String description, String url) {

        this.eUsername = username;
        this.imageName = name;
        this.imageURL= url;
        this.eFaculty = faculty;
        this.eCourse = course;
        this.eModuleCode = modulecode;
        this.eDescription = description;
    }

    public String getUsername() {return eUsername; }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String geteFaculty() { return eFaculty;}

    public String geteCourse() { return eCourse;}

    public String geteModuleCode() {return eModuleCode;}

    public String geteDescription() {return eDescription;}

}