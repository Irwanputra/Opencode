package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H9807528374655572032 {
    public final int a;
    public final W8455343525638953052 b;
    public final Q7290242871485078968 c;
    public final String d;

    public H9807528374655572032(W8455343525638953052 w8455343525638953052, Q7290242871485078968 q7290242871485078968, String str) {
        this.b = w8455343525638953052;
        this.c = q7290242871485078968;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{w8455343525638953052, q7290242871485078968, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H9807528374655572032)) {
            return false;
        }
        H9807528374655572032 h9807528374655572032 = (H9807528374655572032) obj;
        return V1475975160983963926.t(this.b, h9807528374655572032.b) && V1475975160983963926.t(this.c, h9807528374655572032.c) && V1475975160983963926.t(this.d, h9807528374655572032.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
