package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F13711604687869105489 implements Appendable {
    public final B3798966058357121240 a;
    public final C8612968177090877106 b;
    public final I18162204724392517348 c;
    public boolean d;
    public W8455343525638953052 e;
    public long f;
    public F12478849263529740365 g;
    public D389890677992184566 h;
    public H9390398899829886498 i;

    public F13711604687869105489(C8185053590072587931 c8185053590072587931, W8455343525638953052 w8455343525638953052, B3798966058357121240 b3798966058357121240, int i) {
        D389890677992184566 d389890677992184566 = null;
        w8455343525638953052 = (i & 2) != 0 ? null : w8455343525638953052;
        this.a = (i & 8) != 0 ? null : b3798966058357121240;
        C8612968177090877106 c8612968177090877106 = new C8612968177090877106();
        c8612968177090877106.a = c8185053590072587931;
        c8612968177090877106.c = -1;
        c8612968177090877106.d = -1;
        this.b = c8612968177090877106;
        O18396636586660755082 o18396636586660755082 = c8185053590072587931.b;
        List list = c8185053590072587931.a;
        this.c = o18396636586660755082 != null ? new I18162204724392517348(o18396636586660755082.a, true) : null;
        this.e = w8455343525638953052 != null ? new W8455343525638953052(w8455343525638953052) : null;
        this.f = c8185053590072587931.d;
        this.g = c8185053590072587931.e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            F14378331124810887321[] f14378331124810887321Arr = new F14378331124810887321[size];
            for (int i2 = 0; i2 < size; i2++) {
                f14378331124810887321Arr[i2] = (F14378331124810887321) list.get(i2);
            }
            d389890677992184566 = new D389890677992184566(size, f14378331124810887321Arr);
        }
        this.h = d389890677992184566;
    }

    public static void d(F13711604687869105489 f13711604687869105489, int i, int i2, CharSequence charSequence, int i3, boolean z, int i4) {
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        C8612968177090877106 c8612968177090877106 = f13711604687869105489.b;
        if (i > i2) {
            Y16081827717826519461.a("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 < 0) {
            Y16081827717826519461.a("Expected textStart=0 <= textEnd=" + i3);
        }
        int q = W7808703833045379622.q(i, 0, c8612968177090877106.length());
        int q2 = W7808703833045379622.q(i2, 0, c8612968177090877106.length());
        int q3 = W7808703833045379622.q(0, 0, charSequence.length());
        int q4 = W7808703833045379622.q(i3, 0, charSequence.length());
        f13711604687869105489.b(z, q, q2, q4 - q3);
        f13711604687869105489.b.a(q, q2, charSequence, q3, q4);
        f13711604687869105489.f(null);
        f13711604687869105489.i = null;
    }

    public static C8185053590072587931 h(F13711604687869105489 f13711604687869105489, long j, F12478849263529740365 f12478849263529740365, int i) {
        List list;
        if ((i & 1) != 0) {
            j = f13711604687869105489.f;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f12478849263529740365 = f13711604687869105489.g;
        }
        F12478849263529740365 f124788492635297403652 = f12478849263529740365;
        D389890677992184566 d389890677992184566 = f13711604687869105489.h;
        if (d389890677992184566 != null) {
            List f = d389890677992184566.f();
            if (!((K7217096618580727896) f).isEmpty()) {
                list = f;
                return new C8185053590072587931(f13711604687869105489.b.toString(), j2, f124788492635297403652, null, list, null, O14838623545224379975.m(f13711604687869105489), 8);
            }
        }
        list = null;
        return new C8185053590072587931(f13711604687869105489.b.toString(), j2, f124788492635297403652, null, list, null, O14838623545224379975.m(f13711604687869105489), 8);
    }

    public final W8455343525638953052 a() {
        W8455343525638953052 w8455343525638953052 = this.e;
        if (w8455343525638953052 != null) {
            return w8455343525638953052;
        }
        W8455343525638953052 w84553435256389530522 = new W8455343525638953052((W8455343525638953052) null);
        this.e = w84553435256389530522;
        return w84553435256389530522;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            C8612968177090877106 c8612968177090877106 = this.b;
            b(false, c8612968177090877106.length(), c8612968177090877106.length(), charSequence.length());
            c8612968177090877106.a(c8612968177090877106.length(), c8612968177090877106.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F13711604687869105489.b(boolean, int, int, int):void");
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        d(this, i, i2, charSequence, charSequence.length(), false, 32);
    }

    public final void e(int i, int i2, List list) {
        C8612968177090877106 c8612968177090877106 = this.b;
        if (i < 0 || i > c8612968177090877106.length()) {
            W4415201450379021245.a(E12098517352909843120.l("start (", i, c8612968177090877106.length(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c8612968177090877106.length()) {
            W4415201450379021245.a(E12098517352909843120.l("end (", i2, c8612968177090877106.length(), ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            S10973172697741180971.j(E12098517352909843120.l("Do not set reversed or empty range: ", i, i2, " > "));
            return;
        }
        f(new F12478849263529740365(T1335862270807194835.d(i, i2)));
        D389890677992184566 d389890677992184566 = this.h;
        if (d389890677992184566 != null) {
            d389890677992184566.i();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.h == null) {
            this.h = new D389890677992184566(0, new F14378331124810887321[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i3);
            D389890677992184566 d3898906779921845662 = this.h;
            if (d3898906779921845662 != null) {
                d3898906779921845662.b(F14378331124810887321.a(f14378331124810887321, null, f14378331124810887321.b + i, f14378331124810887321.c + i, 9));
            }
        }
    }

    public final void f(F12478849263529740365 f12478849263529740365) {
        if (f12478849263529740365 != null && !F12478849263529740365.d(f12478849263529740365.a)) {
            this.g = f12478849263529740365;
            return;
        }
        this.g = null;
        D389890677992184566 d389890677992184566 = this.h;
        if (d389890677992184566 != null) {
            d389890677992184566.i();
        }
    }

    public final void g(long j) {
        long d = T1335862270807194835.d(0, this.b.length());
        if (!F12478849263529740365.a(d, j)) {
            Y16081827717826519461.a("Expected " + F12478849263529740365.i(j) + " to be in " + F12478849263529740365.i(d));
        }
        this.f = j;
        this.i = null;
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        C8612968177090877106 c8612968177090877106 = this.b;
        b(false, c8612968177090877106.length(), c8612968177090877106.length(), 1);
        c8612968177090877106.a(c8612968177090877106.length(), c8612968177090877106.length(), r6, 0, String.valueOf(c).length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            C8612968177090877106 c8612968177090877106 = this.b;
            b(false, c8612968177090877106.length(), c8612968177090877106.length(), i2 - i);
            c8612968177090877106.a(c8612968177090877106.length(), c8612968177090877106.length(), r6, 0, charSequence.subSequence(i, i2).length());
        }
        return this;
    }
}
