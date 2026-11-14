package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class la2 {
    public final java.lang.String a;
    public final java.lang.String c;
    public final java.lang.String e;
    public final ads_mobile_sdk.ii f;
    public final ads_mobile_sdk.yy0 g;

    static {
        new java.util.UUID(0L, 0L).toString();
    }

    public la2(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ads_mobile_sdk.ii iiVar = ads_mobile_sdk.ii.c;
        if (iiVar == null) {
            iiVar = new ads_mobile_sdk.ii(context);
            ads_mobile_sdk.ii.c = iiVar;
        }
        this.f = iiVar;
        this.g = ads_mobile_sdk.yy0.a(context);
        this.a = str;
        str.concat("_3p");
        this.c = str2;
        str2.concat("_3p");
        this.e = str3;
    }

    public final ads_mobile_sdk.wy0 a(long j) throws java.io.IOException {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            dev.epro.r0.S10973172697741180971.m(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        ads_mobile_sdk.ii iiVar = this.f;
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) iiVar.b;
        android.content.SharedPreferences sharedPreferences2 = (android.content.SharedPreferences) iiVar.b;
        java.lang.String str = this.c;
        long j2 = sharedPreferences.getLong(str, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                iiVar.a(str, java.lang.Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= j2 + j) {
                return a(java.util.UUID.randomUUID().toString());
            }
        }
        java.lang.String string = sharedPreferences2.getString(this.a, null);
        return string == null ? a(java.util.UUID.randomUUID().toString()) : new ads_mobile_sdk.wy0(sharedPreferences2.getLong(str, -1L), string);
    }

    public final ads_mobile_sdk.wy0 a(java.lang.String str) throws java.io.IOException {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            java.lang.String str2 = this.c;
            java.lang.Long lValueOf = java.lang.Long.valueOf(jCurrentTimeMillis);
            ads_mobile_sdk.ii iiVar = this.f;
            iiVar.a(str2, lValueOf);
            iiVar.a(this.a, (java.lang.Object) str);
            return new ads_mobile_sdk.wy0(jCurrentTimeMillis, str);
        }
        dev.epro.r0.S10973172697741180971.m(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        return null;
    }
}
