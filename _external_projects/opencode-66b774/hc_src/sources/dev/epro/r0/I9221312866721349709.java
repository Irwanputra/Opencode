package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I9221312866721349709 extends Q4687907353276880766 implements Set, Collection, D14639766352081121636 {
    public static final I9221312866721349709 d;
    public final Object a;
    public final Object b;
    public final C560824835210562156 c;

    static {
        B14824868959299866349 b14824868959299866349 = B14824868959299866349.g;
        d = new I9221312866721349709(b14824868959299866349, b14824868959299866349, C560824835210562156.c);
    }

    public I9221312866721349709(Object obj, Object obj2, C560824835210562156 c560824835210562156) {
        this.a = obj;
        this.b = obj2;
        this.c = c560824835210562156;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.c.b;
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13932356399610645840(this.a, this.c);
    }
}
