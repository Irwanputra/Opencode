package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P16422848101170923038 extends K15572083692188606544 implements Iterable {
    public final ArrayList a;

    public P16422848101170923038() {
        this.a = new ArrayList();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final K15572083692188606544 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return new P16422848101170923038();
        }
        P16422848101170923038 p16422848101170923038 = new P16422848101170923038(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p16422848101170923038.q(((K15572083692188606544) obj).a());
        }
        return p16422848101170923038;
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final boolean b() {
        return s().b();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final double c() {
        return s().c();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof P16422848101170923038) && ((P16422848101170923038) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final float i() {
        return s().i();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final int j() {
        return s().j();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final long n() {
        return s().n();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final Number o() {
        return s().o();
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final String p() {
        return s().p();
    }

    public final void q(K15572083692188606544 k15572083692188606544) {
        if (k15572083692188606544 == null) {
            k15572083692188606544 = Y12917327898100101934.a;
        }
        this.a.add(k15572083692188606544);
    }

    public final void r(String str) {
        this.a.add(str == null ? Y12917327898100101934.a : new D16457379462628768197(str));
    }

    public final K15572083692188606544 s() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return (K15572083692188606544) arrayList.get(0);
        }
        S10973172697741180971.m(G6547577305291411977.n(size, "Array must have size 1, but has size "));
        return null;
    }

    public final int size() {
        return this.a.size();
    }

    public P16422848101170923038(int i) {
        this.a = new ArrayList(i);
    }
}
