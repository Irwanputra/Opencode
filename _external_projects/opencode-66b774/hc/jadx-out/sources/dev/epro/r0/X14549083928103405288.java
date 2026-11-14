package dev.epro.r0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X14549083928103405288 extends X9848659370812859730 {
    public static final Parcelable.Creator<X14549083928103405288> CREATOR = new A16739659649845694970((byte) 25);
    public final int d;
    public final Account e;
    public final int f;
    public final GoogleSignInAccount g;

    public X14549083928103405288(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.d = i;
        this.e = account;
        this.f = i2;
        this.g = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.u(parcel, 2, this.e, i);
        C468629748621011703.z(parcel, 3, 4);
        parcel.writeInt(this.f);
        C468629748621011703.u(parcel, 4, this.g, i);
        C468629748621011703.D(parcel, iA);
    }
}
