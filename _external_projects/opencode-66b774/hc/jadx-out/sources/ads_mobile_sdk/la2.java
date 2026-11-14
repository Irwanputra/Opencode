package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import dev.epro.r0.S10973172697741180971;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class la2 {
    public final String a;
    public final String c;
    public final String e;
    public final ii f;
    public final yy0 g;

    static {
        new UUID(0L, 0L).toString();
    }

    public la2(Context context, String str, String str2, String str3) {
        ii iiVar = ii.c;
        if (iiVar == null) {
            iiVar = new ii(context);
            ii.c = iiVar;
        }
        this.f = iiVar;
        this.g = yy0.a(context);
        this.a = str;
        str.concat("_3p");
        this.c = str2;
        str2.concat("_3p");
        this.e = str3;
    }

    public final wy0 a(long j) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            S10973172697741180971.m(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        ii iiVar = this.f;
        SharedPreferences sharedPreferences = (SharedPreferences) iiVar.b;
        SharedPreferences sharedPreferences2 = (SharedPreferences) iiVar.b;
        String str = this.c;
        long j2 = sharedPreferences.getLong(str, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                iiVar.a(str, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= j2 + j) {
                return a(UUID.randomUUID().toString());
            }
        }
        String string = sharedPreferences2.getString(this.a, null);
        return string == null ? a(UUID.randomUUID().toString()) : new wy0(sharedPreferences2.getLong(str, -1L), string);
    }

    public final wy0 a(String str) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            String str2 = this.c;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            ii iiVar = this.f;
            iiVar.a(str2, lValueOf);
            iiVar.a(this.a, (Object) str);
            return new wy0(jCurrentTimeMillis, str);
        }
        S10973172697741180971.m(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        return null;
    }
}
