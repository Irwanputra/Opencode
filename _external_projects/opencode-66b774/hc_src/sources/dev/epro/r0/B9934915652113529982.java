package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B9934915652113529982 {
    public final W13734796219485846113 a;
    public final List b;
    public final ArrayList c;
    public final ArrayList d = new ArrayList();
    public boolean e;

    static {
        B14824868959299866349.o("WorkContinuationImpl");
    }

    public B9934915652113529982(W13734796219485846113 w13734796219485846113, List list) {
        this.a = w13734796219485846113;
        this.b = list;
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((M10089736868580320414) list.get(i)).a.toString();
            uuid.getClass();
            this.c.add(uuid);
            this.d.add(uuid);
        }
    }

    public static HashSet a(B9934915652113529982 b9934915652113529982) {
        HashSet hashSet = new HashSet();
        b9934915652113529982.getClass();
        return hashSet;
    }
}
