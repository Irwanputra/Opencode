package ads_mobile_sdk;

import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.M665231115116566295;
import dev.epro.r0.Y2677586711477821327;
import dev.epro.r0.Z1085125311131623997;
import dev.epro.r0.Z115818233709597990;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qw2 {
    public static final Y2677586711477821327 b;
    public static final LinkedHashMap c;
    public static final qw2 d;
    public static final qw2 e;
    public static final qw2 f;
    public static final qw2 g;
    public static final qw2 h;
    public static final qw2 i;
    public static final qw2 j;
    public static final qw2 k;
    public static final qw2 l;
    public static final /* synthetic */ qw2[] m;
    public static final /* synthetic */ M665231115116566295 n;
    public final String a;

    static {
        byte b2 = 0;
        qw2 qw2Var = new qw2(0, "UNKNOWN", "");
        d = qw2Var;
        qw2 qw2Var2 = new qw2(1, "APP_OPEN", "app_open_ad");
        e = qw2Var2;
        qw2 qw2Var3 = new qw2(2, "BANNER", "banner");
        f = qw2Var3;
        qw2 qw2Var4 = new qw2(3, "ICON", "icon");
        g = qw2Var4;
        qw2 qw2Var5 = new qw2(4, "INTERSTITIAL", "interstitial");
        h = qw2Var5;
        qw2 qw2Var6 = new qw2(5, "NATIVE", "native");
        i = qw2Var6;
        qw2 qw2Var7 = new qw2(6, "REWARDED", "rewarded");
        j = qw2Var7;
        qw2 qw2Var8 = new qw2(7, "REWARDED_INTERSTITIAL", "rewarded_interstitial");
        k = qw2Var8;
        qw2 qw2Var9 = new qw2(8, "SWIPEABLE_INTERSTITIAL", "swipeable_interstitial");
        l = qw2Var9;
        qw2[] qw2VarArr = {qw2Var, qw2Var2, qw2Var3, qw2Var4, qw2Var5, qw2Var6, qw2Var7, qw2Var8, qw2Var9};
        m = qw2VarArr;
        M665231115116566295 m665231115116566295 = new M665231115116566295(qw2VarArr);
        n = m665231115116566295;
        b = new Y2677586711477821327((byte) 11);
        int iU0 = E4951175994894594588.u0(Z115818233709597990.k0(m665231115116566295, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU0 < 16 ? 16 : iU0);
        Z1085125311131623997 z1085125311131623997 = new Z1085125311131623997(m665231115116566295, b2);
        while (z1085125311131623997.hasNext()) {
            Object next = z1085125311131623997.next();
            linkedHashMap.put(((qw2) next).a, next);
        }
        c = linkedHashMap;
    }

    public qw2(int i2, String str, String str2) {
        this.a = str2;
    }

    public static qw2[] values() {
        return (qw2[]) m.clone();
    }
}
