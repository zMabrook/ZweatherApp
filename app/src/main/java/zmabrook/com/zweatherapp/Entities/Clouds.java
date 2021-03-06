package zmabrook.com.zweatherapp.Entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by zMabrook on 26/01/18.
 */

public class Clouds extends BaseEntity implements Parcelable {

    @SerializedName("all")
    @Expose
    private int all;
    public final static Parcelable.Creator<Clouds> CREATOR = new Creator<Clouds>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Clouds createFromParcel(Parcel in) {
            return new Clouds(in);
        }

        public Clouds[] newArray(int size) {
            return (new Clouds[size]);
        }

    };

    protected Clouds(Parcel in) {
        this.all = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Clouds() {
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(all);
    }

    public int describeContents() {
        return 0;
    }

}