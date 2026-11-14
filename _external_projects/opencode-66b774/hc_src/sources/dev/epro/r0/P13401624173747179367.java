package dev.epro.r0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P13401624173747179367 implements V4446577237959483780 {
    public final S790996689653940400 a;
    public final int b;
    public final X16868335726098211378 c;
    public final S14095860472553357893 d;
    public final List e;

    public P13401624173747179367(S790996689653940400 s790996689653940400, int i, X16868335726098211378 x16868335726098211378, S14095860472553357893 s14095860472553357893, List list) {
        this.a = s790996689653940400;
        this.b = i;
        this.c = x16868335726098211378;
        this.d = s14095860472553357893;
        this.e = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + P15002231639878788228.c(field) + " and " + P15002231639878788228.c(field2) + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
    }

    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Class cls = k11898134656129953686.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new E8559058671246919439((byte) 2);
        }
        P1789376955961125859.h(this.e);
        return P15002231639878788228.a.r(cls) ? new O3977088153682268708(cls, c(f14240031463097426304, k11898134656129953686, cls, true)) : new Z1941590870035028809(this.a.d(k11898134656129953686, true), c(f14240031463097426304, k11898134656129953686, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.R11530267699218145783 c(dev.epro.r0.F14240031463097426304 r30, dev.epro.r0.K11898134656129953686 r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P13401624173747179367.c(dev.epro.r0.F14240031463097426304, dev.epro.r0.K11898134656129953686, java.lang.Class, boolean):dev.epro.r0.R11530267699218145783");
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        X16868335726098211378 x16868335726098211378 = this.c;
        x16868335726098211378.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || x16868335726098211378.b(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? x16868335726098211378.a : x16868335726098211378.b;
            z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    Z3383101362411723454.s();
                    return false;
                }
            }
        }
        return !z2;
    }
}
