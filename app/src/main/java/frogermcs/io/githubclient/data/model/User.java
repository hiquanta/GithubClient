package frogermcs.io.githubclient.data.model;


import android.os.Parcel;
import android.os.Parcelable;


public class User implements Parcelable{

    protected User(Parcel in) {
        this.login = in.readString();
        this.id = in.readLong();
        this.url = in.readString();
        this.email = in.readString();
    }
    public User() {
    }
    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    public String login;
    public long id;
    public String url;
    public String email;
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.login);
        dest.writeLong(this.id);
        dest.writeString(this.url);
        dest.writeString(this.email);
    }
}
