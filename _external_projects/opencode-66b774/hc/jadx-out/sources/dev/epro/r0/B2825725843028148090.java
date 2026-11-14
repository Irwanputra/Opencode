package dev.epro.r0;

import android.os.IBinder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B2825725843028148090 {
    public final String a;
    public final String b;
    public final Map c;
    public final IBinder d;

    public B2825725843028148090(String str, String str2, Map map, IBinder iBinder) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B2825725843028148090)) {
            return false;
        }
        B2825725843028148090 b2825725843028148090 = (B2825725843028148090) obj;
        if (!this.a.equals(b2825725843028148090.a) || !this.b.equals(b2825725843028148090.b) || !this.c.equals(b2825725843028148090.c)) {
            return false;
        }
        IBinder iBinder = b2825725843028148090.d;
        IBinder iBinder2 = this.d;
        return iBinder2 == null ? iBinder == null : iBinder2.equals(iBinder);
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        IBinder iBinder = this.d;
        return (iBinder == null ? 0 : iBinder.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.c.toString();
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.a);
        sb.append(", referrer=");
        G6547577305291411977.B(sb, this.b, ", extraQueryParams=", string, ", windowToken=");
        return G6547577305291411977.u(sb, strValueOf, "}");
    }
}
