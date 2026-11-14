package ads_mobile_sdk;

import dev.epro.r0.B13173120941733133417;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.Y16198579552193879165;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class au0 implements Cloneable {
    public final cu0 a;
    public cu0 b;

    public au0(cu0 cu0Var) {
        this.a = cu0Var;
        if (cu0Var.j()) {
            S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (cu0) cu0Var.a(4, (cu0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Iterable iterable, O6641393078261985068 o6641393078261985068) {
        byte[] bArr = rb1.a;
        iterable.getClass();
        if (iterable instanceof Y16198579552193879165) {
            o6641393078261985068.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (o6641393078261985068 instanceof ArrayList) {
                ((ArrayList) o6641393078261985068).ensureCapacity(o6641393078261985068.size() + size);
            } else if (o6641393078261985068 instanceof in2) {
                in2 in2Var = (in2) o6641393078261985068;
                int i = in2Var.c + size;
                Object[] objArr = in2Var.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        in2Var.b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = V16504496955554646429.a(length);
                        }
                        in2Var.b = Arrays.copyOf(in2Var.b, length);
                    }
                }
            }
        }
        int size2 = o6641393078261985068.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, o6641393078261985068);
                    throw null;
                }
                o6641393078261985068.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                a(size2, o6641393078261985068);
                throw null;
            }
            o6641393078261985068.add(obj2);
        }
    }

    public final void b() {
        if (this.b.j()) {
            return;
        }
        cu0 cu0Var = (cu0) this.a.a(4, (cu0) null);
        cu0 cu0Var2 = this.b;
        hn2 hn2Var = hn2.c;
        hn2Var.getClass();
        hn2Var.a(cu0Var.getClass()).a(cu0Var, cu0Var2);
        this.b = cu0Var;
    }

    public final Object clone() {
        au0 au0Var = (au0) this.a.a(5, (cu0) null);
        boolean j = this.b.j();
        cu0 cu0Var = this.b;
        if (j) {
            cu0Var.k();
            cu0Var = this.b;
        }
        au0Var.b = cu0Var;
        return au0Var;
    }

    public final cu0 a() {
        boolean j = this.b.j();
        cu0 cu0Var = this.b;
        if (j) {
            cu0Var.k();
            cu0Var = this.b;
        }
        cu0Var.getClass();
        if (cu0.m1a(cu0Var)) {
            return cu0Var;
        }
        throw new B13173120941733133417();
    }

    public final void a(cu0 cu0Var) {
        cu0 cu0Var2 = this.a;
        if (cu0Var != null && !cu0Var2.getClass().isInstance(cu0Var)) {
            S10973172697741180971.j("mergeFrom(MessageLite) can only merge messages of the same type.");
            return;
        }
        if (cu0Var2.equals(cu0Var)) {
            return;
        }
        b();
        cu0 cu0Var3 = this.b;
        hn2 hn2Var = hn2.c;
        hn2Var.getClass();
        hn2Var.a(cu0Var3.getClass()).a(cu0Var3, cu0Var);
    }

    public static void a(int i, O6641393078261985068 o6641393078261985068) {
        String o2 = G6547577305291411977.o(o6641393078261985068.size() - i, "Element at index ", " is null.");
        for (int size = o6641393078261985068.size() - 1; size >= i; size--) {
            o6641393078261985068.remove(size);
        }
        throw new NullPointerException(o2);
    }
}
