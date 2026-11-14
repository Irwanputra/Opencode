package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B2550074485188857304 implements Runnable {
    public final ArrayList a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public B2550074485188857304(List list, int i, Throwable th) {
        K5751602218013079365.x("initCallbacks cannot be null", list);
        this.a = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((N2001496495389762459) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((N2001496495389762459) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
