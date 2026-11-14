package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A18160342896072195455 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ B14178846910827721115 c;

    public A18160342896072195455(B14178846910827721115 b14178846910827721115, int i) {
        this.c = b14178846910827721115;
        this.a = i;
    }

    public final void a(int i) {
        B14178846910827721115 b14178846910827721115 = this.c;
        T558270488962777544 t558270488962777544 = b14178846910827721115.c;
        if (t558270488962777544 == null) {
            return;
        }
        this.b.add(new X8133657484919231199(t558270488962777544, i, b14178846910827721115.b, null));
    }
}
