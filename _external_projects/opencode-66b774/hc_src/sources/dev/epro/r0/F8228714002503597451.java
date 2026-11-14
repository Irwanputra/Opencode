package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F8228714002503597451 implements J1083986568308928281 {
    public Object a = J11102083402305026174.p;
    public H7219028874700587498 b;
    public final /* synthetic */ H17686692708284905246 c;

    public F8228714002503597451(H17686692708284905246 h17686692708284905246) {
        this.c = h17686692708284905246;
    }

    @Override // dev.epro.r0.J1083986568308928281
    public final void a(X17453750288186724334 x17453750288186724334, int i) {
        H7219028874700587498 h7219028874700587498 = this.b;
        if (h7219028874700587498 != null) {
            h7219028874700587498.a(x17453750288186724334, i);
        }
    }

    public final Object b(K14749510448791472029 k14749510448791472029) {
        E7893495821728651450 e7893495821728651450;
        Object obj = this.a;
        boolean z = true;
        if (obj == J11102083402305026174.p || obj == J11102083402305026174.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H17686692708284905246.f;
            H17686692708284905246 h17686692708284905246 = this.c;
            E7893495821728651450 e78934958217286514502 = (E7893495821728651450) atomicReferenceFieldUpdater.get(h17686692708284905246);
            while (true) {
                if (h17686692708284905246.z()) {
                    this.a = J11102083402305026174.l;
                    Throwable p = h17686692708284905246.p();
                    if (p != null) {
                        int i = I5890971570803031647.a;
                        throw p;
                    }
                    z = false;
                } else {
                    long andIncrement = H17686692708284905246.c.getAndIncrement(h17686692708284905246);
                    long j = J11102083402305026174.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (e78934958217286514502.d != j2) {
                        e7893495821728651450 = h17686692708284905246.j(j2, e78934958217286514502);
                        if (e7893495821728651450 == null) {
                            continue;
                        }
                    } else {
                        e7893495821728651450 = e78934958217286514502;
                    }
                    Object M = h17686692708284905246.M(e7893495821728651450, i2, andIncrement, null);
                    D14731132657808549702 d14731132657808549702 = J11102083402305026174.m;
                    if (M == d14731132657808549702) {
                        S10973172697741180971.m("unreachable");
                        return null;
                    }
                    D14731132657808549702 d147311326578085497022 = J11102083402305026174.f301o;
                    if (M == d147311326578085497022) {
                        if (andIncrement < h17686692708284905246.v()) {
                            e7893495821728651450.a();
                        }
                        e78934958217286514502 = e7893495821728651450;
                    } else {
                        if (M == J11102083402305026174.n) {
                            H17686692708284905246 h176866927082849052462 = this.c;
                            H7219028874700587498 H = V12319504402545346730.H(E18444280280170001567.H(k14749510448791472029));
                            try {
                                this.b = H;
                                Object M2 = h176866927082849052462.M(e7893495821728651450, i2, andIncrement, this);
                                if (M2 == d14731132657808549702) {
                                    a(e7893495821728651450, i2);
                                } else {
                                    if (M2 == d147311326578085497022) {
                                        if (andIncrement < h176866927082849052462.v()) {
                                            e7893495821728651450.a();
                                        }
                                        E7893495821728651450 e78934958217286514503 = (E7893495821728651450) H17686692708284905246.f.get(h176866927082849052462);
                                        while (true) {
                                            if (h176866927082849052462.z()) {
                                                H7219028874700587498 h7219028874700587498 = this.b;
                                                h7219028874700587498.getClass();
                                                this.b = null;
                                                this.a = J11102083402305026174.l;
                                                Throwable p2 = h17686692708284905246.p();
                                                if (p2 == null) {
                                                    h7219028874700587498.resumeWith(Boolean.FALSE);
                                                } else {
                                                    h7219028874700587498.resumeWith(new C10696704014433963524(p2));
                                                }
                                            } else {
                                                long andIncrement2 = H17686692708284905246.c.getAndIncrement(h176866927082849052462);
                                                long j3 = J11102083402305026174.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (e78934958217286514503.d != j4) {
                                                    E7893495821728651450 j5 = h176866927082849052462.j(j4, e78934958217286514503);
                                                    if (j5 != null) {
                                                        e78934958217286514503 = j5;
                                                    }
                                                }
                                                Object M3 = h176866927082849052462.M(e78934958217286514503, i3, andIncrement2, this);
                                                if (M3 == J11102083402305026174.m) {
                                                    a(e78934958217286514503, i3);
                                                    break;
                                                }
                                                if (M3 == J11102083402305026174.f301o) {
                                                    if (andIncrement2 < h176866927082849052462.v()) {
                                                        e78934958217286514503.a();
                                                    }
                                                } else {
                                                    if (M3 == J11102083402305026174.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    e78934958217286514503.a();
                                                    this.a = M3;
                                                    this.b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        e7893495821728651450.a();
                                        this.a = M2;
                                        this.b = null;
                                    }
                                    H.d(Boolean.TRUE, null);
                                }
                                return H.r();
                            } catch (Throwable th) {
                                H.B();
                                throw th;
                            }
                        }
                        e7893495821728651450.a();
                        this.a = M;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.a;
        D14731132657808549702 d14731132657808549702 = J11102083402305026174.p;
        if (obj == d14731132657808549702) {
            S10973172697741180971.m("`hasNext()` has not been invoked");
            return null;
        }
        this.a = d14731132657808549702;
        if (obj != J11102083402305026174.l) {
            return obj;
        }
        Throwable s = this.c.s();
        int i = I5890971570803031647.a;
        throw s;
    }
}
