package p131.p161.p162.p193.p205.p208;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;
import p034.p095.C1687;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2503 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f9847;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f9848;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f9849;

    public C2503(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f9849 = str;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f9847 = str2;
        this.f9848 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2503)) {
            return false;
        }
        C2503 c2503 = (C2503) obj;
        return C1687.m3694(this.f9849, c2503.f9849) && C1687.m3694(this.f9847, c2503.f9847) && C1687.m3694(null, null) && this.f9848 == c2503.f9848;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9849, this.f9847, null, Integer.valueOf(this.f9848)});
    }

    public final String toString() {
        String str = this.f9849;
        str.getClass();
        return str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Intent m4521() {
        return this.f9849 != null ? new Intent(this.f9849).setPackage(this.f9847) : new Intent().setComponent(null);
    }
}
