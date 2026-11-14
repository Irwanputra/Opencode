package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16631908410500040363 extends K15572083692188606544 {
    public final H14305894327539119220 a;

    public I16631908410500040363() {
        J10770752472956524045 j10770752472956524045 = H14305894327539119220.i;
        this.a = new H14305894327539119220(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof I16631908410500040363) && ((I16631908410500040363) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void q(String str, K15572083692188606544 k15572083692188606544) {
        if (k15572083692188606544 == null) {
            k15572083692188606544 = Y12917327898100101934.a;
        }
        this.a.put(str, k15572083692188606544);
    }

    public final void r(String str, Boolean bool) {
        q(str, bool == null ? Y12917327898100101934.a : new D16457379462628768197(bool));
    }

    public final void s(String str, Number number) {
        q(str, new D16457379462628768197(number));
    }

    public final void t(String str, String str2) {
        q(str, str2 == null ? Y12917327898100101934.a : new D16457379462628768197(str2));
    }

    @Override // dev.epro.r0.K15572083692188606544
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final I16631908410500040363 a() {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        Iterator it = ((S11564727846197427291) this.a.entrySet()).iterator();
        while (((L622219180424329983) it).hasNext()) {
            S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
            i16631908410500040363.q((String) s8064361206571326475A.getKey(), ((K15572083692188606544) s8064361206571326475A.getValue()).a());
        }
        return i16631908410500040363;
    }

    public final S11564727846197427291 v() {
        return (S11564727846197427291) this.a.entrySet();
    }

    public final K15572083692188606544 w(String str) {
        return (K15572083692188606544) this.a.get(str);
    }

    public final P16422848101170923038 x(String str) {
        return (P16422848101170923038) this.a.get(str);
    }

    public final I16631908410500040363 y(String str) {
        return (I16631908410500040363) this.a.get(str);
    }

    public final boolean z() {
        return this.a.containsKey("ping_strategy");
    }
}
