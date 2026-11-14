package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X180381098572639926 extends R7459884459278244289 {
    public final String c;
    public final List d;

    public X180381098572639926(String str, ArrayList arrayList, F16470721565862751885 f16470721565862751885, F16470721565862751885 f164707215658627518852) {
        super(f16470721565862751885, f164707215658627518852);
        this.c = str;
        if (arrayList == null || arrayList.size() == 2) {
            this.d = arrayList;
            return;
        }
        throw new M8821877208104636290("Two strings must be provided instead of " + arrayList.size());
    }

    @Override // dev.epro.r0.R7459884459278244289
    public final int a() {
        return 7;
    }
}
