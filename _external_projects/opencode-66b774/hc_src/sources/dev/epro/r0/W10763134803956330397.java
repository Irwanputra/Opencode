package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W10763134803956330397 extends T12670249092619324354 {
    public List p;

    public W10763134803956330397(N7756202525712935399 n7756202525712935399) {
        super(n7756202525712935399, true, true);
        List arrayList;
        if (n7756202525712935399.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = n7756202525712935399.size();
            U15853425786981391261.y(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < n7756202525712935399.size(); i++) {
            arrayList.add(null);
        }
        this.p = arrayList;
        u();
    }

    @Override // dev.epro.r0.T12670249092619324354
    public final void p(int i, Object obj) {
        List list = this.p;
        if (list != null) {
            list.set(i, new W9561850075664382009(obj));
        }
    }

    @Override // dev.epro.r0.T12670249092619324354
    public final void s() {
        List<W9561850075664382009> list = this.p;
        if (list != null) {
            int size = list.size();
            U15853425786981391261.y(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (W9561850075664382009 w9561850075664382009 : list) {
                arrayList.add(w9561850075664382009 != null ? w9561850075664382009.a : null);
            }
            k(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // dev.epro.r0.T12670249092619324354
    public final void v(int i) {
        if (i == 0) {
            throw null;
        }
        this.l = null;
        this.p = null;
    }
}
