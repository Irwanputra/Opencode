package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class T2881242016550624223 extends C14156295026078732729 {
    public static U16443665883761795894 A(U16443665883761795894 u16443665883761795894, int i) {
        if (i >= 0) {
            return i == 0 ? u16443665883761795894 : u16443665883761795894 instanceof G2906799666642890256 ? ((G2906799666642890256) u16443665883761795894).b(i) : new Y11282557324216517430(u16443665883761795894, i);
        }
        S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static E4880248942576735123 B(U16443665883761795894 u16443665883761795894) {
        return new E4880248942576735123(u16443665883761795894, false, new Y13361005827119333637((byte) 6));
    }

    public static Object C(U16443665883761795894 u16443665883761795894) {
        Iterator it = u16443665883761795894.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static U16443665883761795894 D(Object obj, F4096073349764486348 f4096073349764486348) {
        return obj == null ? W10854829702748386039.a : new B2664082256516729321(new N8306548196372912291(obj, (byte) 17), f4096073349764486348, (byte) 4);
    }

    public static String E(U16443665883761795894 u16443665883761795894, String str, F4096073349764486348 f4096073349764486348, int i) {
        if ((i & 32) != 0) {
            f4096073349764486348 = null;
        }
        u16443665883761795894.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : u16443665883761795894) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            B6030175592171028728.i(sb, obj, f4096073349764486348);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static B2664082256516729321 F(U16443665883761795894 u16443665883761795894, F4096073349764486348 f4096073349764486348) {
        u16443665883761795894.getClass();
        f4096073349764486348.getClass();
        return new B2664082256516729321(u16443665883761795894, f4096073349764486348, (byte) 3);
    }

    public static E4880248942576735123 G(U16443665883761795894 u16443665883761795894, F4096073349764486348 f4096073349764486348) {
        u16443665883761795894.getClass();
        f4096073349764486348.getClass();
        return B(new B2664082256516729321(u16443665883761795894, f4096073349764486348, (byte) 3));
    }

    public static List H(U16443665883761795894 u16443665883761795894) {
        u16443665883761795894.getClass();
        Iterator it = u16443665883761795894.iterator();
        if (!it.hasNext()) {
            return O2161699089510411363.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return K5751602218013079365.U(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList I(U16443665883761795894 u16443665883761795894) {
        ArrayList arrayList = new ArrayList();
        Iterator it = u16443665883761795894.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set J(U16443665883761795894 u16443665883761795894) {
        Iterator it = u16443665883761795894.iterator();
        if (!it.hasNext()) {
            return H15747516787109764287.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return T8598786036980488824.z(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static U16443665883761795894 y(Iterator it) {
        it.getClass();
        return new P5486592749040390593(new V11146580314972738611(it, (byte) 3));
    }

    public static B2664082256516729321 z(U16443665883761795894 u16443665883761795894) {
        return new B2664082256516729321((Object) u16443665883761795894, (F4096073349764486348) new Y13361005827119333637((byte) 7), (byte) 0);
    }
}
