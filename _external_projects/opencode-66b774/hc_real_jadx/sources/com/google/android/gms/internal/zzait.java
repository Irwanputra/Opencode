package com.google.android.gms.internal;

import java.util.Arrays;
import p034.p095.C1687;
import p131.p161.p162.p193.p205.p208.C2492;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzait {
    public final int count;
    public final String name;
    private double zzdcd;
    private double zzdce;
    public final double zzdcf;

    public zzait(String str, double d, double d2, double d3, int i) {
        this.name = str;
        this.zzdce = d;
        this.zzdcd = d2;
        this.zzdcf = d3;
        this.count = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzait)) {
            return false;
        }
        zzait zzaitVar = (zzait) obj;
        return C1687.m3694(this.name, zzaitVar.name) && this.zzdcd == zzaitVar.zzdcd && this.zzdce == zzaitVar.zzdce && this.count == zzaitVar.count && Double.compare(this.zzdcf, zzaitVar.zzdcf) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, Double.valueOf(this.zzdcd), Double.valueOf(this.zzdce), Double.valueOf(this.zzdcf), Integer.valueOf(this.count)});
    }

    public final String toString() {
        C2492 c2492 = new C2492(this, null);
        c2492.m4518("name", this.name);
        c2492.m4518("minBound", Double.valueOf(this.zzdce));
        c2492.m4518("maxBound", Double.valueOf(this.zzdcd));
        c2492.m4518("percent", Double.valueOf(this.zzdcf));
        c2492.m4518("count", Integer.valueOf(this.count));
        return c2492.toString();
    }
}
