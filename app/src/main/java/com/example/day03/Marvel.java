package com.example.day03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Marvel implements Parcelable {

    private String name;
    private String type;
    private int Age;

    public Marvel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    protected Marvel(Parcel in) {
        name = in.readString();
        type = in.readString();
        Age = in.readInt();
    }

    public static final Creator<Marvel> CREATOR = new Creator<Marvel>() {
        @Override
        public Marvel createFromParcel(Parcel in) {
            return new Marvel(in);
        }

        @Override
        public Marvel[] newArray(int size) {
            return new Marvel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(type);
        dest.writeInt(Age);
    }
}