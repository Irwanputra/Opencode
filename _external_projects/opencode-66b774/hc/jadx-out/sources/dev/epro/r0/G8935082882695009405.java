package dev.epro.r0;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G8935082882695009405 {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public G8935082882695009405(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public boolean b() {
        HashSet hashSet = T8933584449735867254.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
