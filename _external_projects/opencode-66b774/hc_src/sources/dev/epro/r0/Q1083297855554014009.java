package dev.epro.r0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q1083297855554014009 extends X9848659370812859730 {
    public static final Parcelable.Creator<Q1083297855554014009> CREATOR = new A16739659649845694970((byte) 26);
    public final int d;
    public final IBinder e;
    public final B6867906687934285025 f;
    public final boolean g;
    public final boolean h;

    public Q1083297855554014009(int i, IBinder iBinder, B6867906687934285025 b6867906687934285025, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.f = b6867906687934285025;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        Object t8731205310522354167;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1083297855554014009)) {
            return false;
        }
        Q1083297855554014009 q1083297855554014009 = (Q1083297855554014009) obj;
        if (!this.f.equals(q1083297855554014009.f)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            t8731205310522354167 = null;
        } else {
            int i = X9247881914193501773.j;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            t8731205310522354167 = queryLocalInterface instanceof W15728808418604800610 ? (W15728808418604800610) queryLocalInterface : new T8731205310522354167(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
        }
        IBinder iBinder2 = q1083297855554014009.e;
        if (iBinder2 != null) {
            int i2 = X9247881914193501773.j;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof W15728808418604800610 ? (W15728808418604800610) queryLocalInterface2 : new T8731205310522354167(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
        }
        return V1475975160983963926.t(t8731205310522354167, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        IBinder iBinder = this.e;
        if (iBinder != null) {
            int A2 = C468629748621011703.A(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            C468629748621011703.D(parcel, A2);
        }
        C468629748621011703.u(parcel, 3, this.f, i);
        C468629748621011703.z(parcel, 4, 4);
        parcel.writeInt(this.g ? 1 : 0);
        C468629748621011703.z(parcel, 5, 4);
        parcel.writeInt(this.h ? 1 : 0);
        C468629748621011703.D(parcel, A);
    }
}
