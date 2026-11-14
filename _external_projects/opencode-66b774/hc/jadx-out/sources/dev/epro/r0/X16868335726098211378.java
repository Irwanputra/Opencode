package dev.epro.r0;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X16868335726098211378 implements V4446577237959483780, Cloneable {
    public static final X16868335726098211378 c = new X16868335726098211378();
    public final List a;
    public final List b;

    public X16868335726098211378() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Class cls = k11898134656129953686.a;
        boolean zB = b(cls, true);
        boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new I15409426604577049247(this, zB2, zB, f14240031463097426304, k11898134656129953686);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.a : this.b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        Z3383101362411723454.s();
        return false;
    }

    public final Object clone() {
        try {
            return (X16868335726098211378) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
