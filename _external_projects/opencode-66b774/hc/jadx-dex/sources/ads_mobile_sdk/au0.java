package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class au0 implements java.lang.Cloneable {
    public final ads_mobile_sdk.cu0 a;
    public ads_mobile_sdk.cu0 b;

    public au0(ads_mobile_sdk.cu0 cu0Var) {
        this.a = cu0Var;
        if (cu0Var.j()) {
            dev.epro.r0.S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (ads_mobile_sdk.cu0) cu0Var.a(4, (ads_mobile_sdk.cu0) null);
    }

    public static void a(java.lang.Iterable iterable, dev.epro.r0.O6641393078261985068 o6641393078261985068) {
        byte[] bArr = ads_mobile_sdk.rb1.a;
        iterable.getClass();
        if (iterable instanceof dev.epro.r0.Y16198579552193879165) {
            o6641393078261985068.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size = ((java.util.Collection) iterable).size();
            if (o6641393078261985068 instanceof java.util.ArrayList) {
                ((java.util.ArrayList) o6641393078261985068).ensureCapacity(o6641393078261985068.size() + size);
            } else if (o6641393078261985068 instanceof ads_mobile_sdk.in2) {
                ads_mobile_sdk.in2 in2Var = (ads_mobile_sdk.in2) o6641393078261985068;
                int i = in2Var.c + size;
                java.lang.Object[] objArr = in2Var.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        in2Var.b = new java.lang.Object[java.lang.Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = dev.epro.r0.V16504496955554646429.a(length);
                        }
                        in2Var.b = java.util.Arrays.copyOf(in2Var.b, length);
                    }
                }
            }
        }
        int size2 = o6641393078261985068.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj : iterable) {
                if (obj == null) {
                    a(size2, o6641393078261985068);
                    throw null;
                }
                o6641393078261985068.add(obj);
            }
            return;
        }
        java.util.List list = (java.util.List) iterable;
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            java.lang.Object obj2 = list.get(i2);
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
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) this.a.a(4, (ads_mobile_sdk.cu0) null);
        ads_mobile_sdk.cu0 cu0Var2 = this.b;
        ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
        hn2Var.getClass();
        hn2Var.a(cu0Var.getClass()).a(cu0Var, cu0Var2);
        this.b = cu0Var;
    }

    public final java.lang.Object clone() {
        ads_mobile_sdk.au0 au0Var = (ads_mobile_sdk.au0) this.a.a(5, (ads_mobile_sdk.cu0) null);
        boolean zJ = this.b.j();
        ads_mobile_sdk.cu0 cu0Var = this.b;
        if (zJ) {
            cu0Var.k();
            cu0Var = this.b;
        }
        au0Var.b = cu0Var;
        return au0Var;
    }

    public final ads_mobile_sdk.cu0 a() {
        boolean zJ = this.b.j();
        ads_mobile_sdk.cu0 cu0Var = this.b;
        if (zJ) {
            cu0Var.k();
            cu0Var = this.b;
        }
        cu0Var.getClass();
        if (ads_mobile_sdk.cu0.m2a(cu0Var)) {
            return cu0Var;
        }
        throw new dev.epro.r0.B13173120941733133417();
    }

    public final void a(ads_mobile_sdk.cu0 cu0Var) {
        ads_mobile_sdk.cu0 cu0Var2 = this.a;
        if (cu0Var != null && !cu0Var2.getClass().isInstance(cu0Var)) {
            dev.epro.r0.S10973172697741180971.j("mergeFrom(MessageLite) can only merge messages of the same type.");
            return;
        }
        if (cu0Var2.equals(cu0Var)) {
            return;
        }
        b();
        ads_mobile_sdk.cu0 cu0Var3 = this.b;
        ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
        hn2Var.getClass();
        hn2Var.a(cu0Var3.getClass()).a(cu0Var3, cu0Var);
    }

    public static void a(int i, dev.epro.r0.O6641393078261985068 o6641393078261985068) {
        java.lang.String strO = dev.epro.r0.G6547577305291411977.o(o6641393078261985068.size() - i, "Element at index ", " is null.");
        for (int size = o6641393078261985068.size() - 1; size >= i; size--) {
            o6641393078261985068.remove(size);
        }
        throw new java.lang.NullPointerException(strO);
    }
}
