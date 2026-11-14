package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dev.epro.r0.B10553407071691721287;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.X9848659370812859730;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class Scope extends X9848659370812859730 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new B10553407071691721287(0);
    public final int d;
    public final String e;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            S10973172697741180971.j("scopeUri must not be null or empty");
            throw null;
        }
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.e.equals(((Scope) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.v(parcel, this.e, 2);
        C468629748621011703.D(parcel, A);
    }
}
