package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W7621125212597703960 {
    public static final W7621125212597703960 b = new W7621125212597703960(0);
    public static final W7621125212597703960 c = new W7621125212597703960(1);
    public static final W7621125212597703960 d = new W7621125212597703960(2);
    public final int a;

    public W7621125212597703960(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W7621125212597703960) {
            return this.a == ((W7621125212597703960) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return G6547577305291411977.s("TextDecoration[", P3521844374884164894.a(arrayList, ", ", null, 62), "]");
        }
        return "TextDecoration." + arrayList.get(0);
    }
}
