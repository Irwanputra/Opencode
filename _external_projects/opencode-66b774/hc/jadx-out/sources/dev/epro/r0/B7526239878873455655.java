package dev.epro.r0;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B7526239878873455655 {
    public final String a;
    public final boolean b;

    public B7526239878873455655(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            S10973172697741180971.j("Given String is empty or null");
            throw null;
        }
        this.a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            S10973172697741180971.j("Given String is empty or null");
            throw null;
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B7526239878873455655)) {
            return false;
        }
        B7526239878873455655 b7526239878873455655 = (B7526239878873455655) obj;
        return V1475975160983963926.t(this.a, b7526239878873455655.a) && V1475975160983963926.t("com.google.android.gms", "com.google.android.gms") && V1475975160983963926.t(null, null) && this.b == b7526239878873455655.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        M18113111391818111737.v(null);
        throw null;
    }
}
