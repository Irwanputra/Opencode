package dev.epro.r0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G1840519957725232630 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(E4135271276212975889 e4135271276212975889) {
        e4135271276212975889.getClass();
        String y = B11964701839924937722.y(e4135271276212975889.getClass());
        if (y.length() <= 0) {
            S10973172697741180971.j("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        E4135271276212975889 e41352712762129758892 = (E4135271276212975889) linkedHashMap.get(y);
        if (S10823041268949770285.t(e41352712762129758892, e4135271276212975889)) {
            return;
        }
        if (e41352712762129758892 != null && e41352712762129758892.b) {
            D11988991656201568495.s("Navigator ", e4135271276212975889, " is replacing an already attached ", e41352712762129758892);
        } else if (e4135271276212975889.b) {
            D11988991656201568495.m("Navigator ", e4135271276212975889, " is already attached to another NavController");
        }
    }

    public final E4135271276212975889 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            S10973172697741180971.j("navigator name cannot be an empty string");
            return null;
        }
        E4135271276212975889 e4135271276212975889 = (E4135271276212975889) this.a.get(str);
        if (e4135271276212975889 != null) {
            return e4135271276212975889;
        }
        S10973172697741180971.m(G6547577305291411977.s("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
