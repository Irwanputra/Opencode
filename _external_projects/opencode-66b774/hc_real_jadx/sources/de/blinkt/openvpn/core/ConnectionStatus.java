package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum ConnectionStatus implements Parcelable {
    f3662,
    f3665,
    f3669,
    f3666,
    f3668,
    f3663,
    f3661,
    f3670,
    f3664,
    f3671;

    public static final Parcelable.Creator<ConnectionStatus> CREATOR = new Parcelable.Creator<ConnectionStatus>() { // from class: de.blinkt.openvpn.core.ConnectionStatus.げつ〴ぬぐ
        @Override // android.os.Parcelable.Creator
        public ConnectionStatus createFromParcel(Parcel parcel) {
            return ConnectionStatus.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public ConnectionStatus[] newArray(int i) {
            return new ConnectionStatus[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
