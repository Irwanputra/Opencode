package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J18325703078859211263 extends X9848659370812859730 {
    public static final Parcelable.Creator<J18325703078859211263> CREATOR = new A16739659649845694970((byte) 29);
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;

    public J18325703078859211263(String str, int i, long j, boolean z) {
        this.d = str;
        this.e = i;
        this.f = j;
        this.g = z;
    }

    public final long b() {
        long j = this.f;
        return j == -1 ? this.e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J18325703078859211263) {
            J18325703078859211263 j18325703078859211263 = (J18325703078859211263) obj;
            if (V1475975160983963926.t(this.d, j18325703078859211263.d) && b() == j18325703078859211263.b() && this.g == j18325703078859211263.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Long.valueOf(b()), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(this);
        v10300877997588547986.b("name", this.d);
        v10300877997588547986.b("version", Long.valueOf(b()));
        v10300877997588547986.b("is_fully_rolled_out", Boolean.valueOf(this.g));
        return v10300877997588547986.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.v(parcel, this.d, 1);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e);
        long jB = b();
        C468629748621011703.z(parcel, 3, 8);
        parcel.writeLong(jB);
        C468629748621011703.z(parcel, 4, 4);
        parcel.writeInt(this.g ? 1 : 0);
        C468629748621011703.D(parcel, iA);
    }

    public J18325703078859211263(String str) {
        this(str, -1, 1L, false);
    }
}
