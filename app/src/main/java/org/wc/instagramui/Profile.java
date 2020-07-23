package org.wc.instagramui;

import android.widget.ImageView;
import android.widget.TextView;

public class Profile {
    private int profilePic;
    private String profileTv;

    public Profile(int profilePic, String profileTv) {
        this.profilePic = profilePic;
        this.profileTv = profileTv;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getProfileTv() {
        return profileTv;
    }

    public void setProfileTv(String profileTv) {
        this.profileTv = profileTv;
    }
}
