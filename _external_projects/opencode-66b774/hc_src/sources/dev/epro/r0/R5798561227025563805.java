package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R5798561227025563805 implements N235339945877347053 {
    public long a = 9205357640488583168L;
    public long b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ A15234621907337682254 d;

    public R5798561227025563805(boolean z, A15234621907337682254 a15234621907337682254) {
        this.c = z;
        this.d = a15234621907337682254;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void a() {
        A15234621907337682254 a15234621907337682254 = this.d;
        a15234621907337682254.p(true);
        a15234621907337682254.p.setValue(null);
        a15234621907337682254.q.setValue(null);
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void b(long j, S6976414540931251790 s6976414540931251790) {
        A15234621907337682254 a15234621907337682254 = this.d;
        if (a15234621907337682254.h() == null) {
            return;
        }
        V5656221289452463152 i = a15234621907337682254.i();
        i.getClass();
        boolean z = this.c;
        Object e = a15234621907337682254.a.c.e((z ? i.a : i.b).c);
        if (e == null) {
            Y16081827717826519461.d("SelectionRegistrar should contain the current selection's selectableIds");
            Z3383101362411723454.n();
            return;
        }
        U5234994727412699525 u5234994727412699525 = (U5234994727412699525) e;
        B1029012102904255937 c = u5234994727412699525.c();
        if (c == null) {
            Y16081827717826519461.d("Current selectable should have layout coordinates.");
            Z3383101362411723454.n();
            return;
        }
        long a = u5234994727412699525.a(i, z);
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            return;
        }
        this.a = a15234621907337682254.m().r(c, S11671697357523908420.a(a));
        this.b = 0L;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void c() {
        V5656221289452463152 i;
        B1029012102904255937 c;
        boolean z = this.c;
        A15234621907337682254 a15234621907337682254 = this.d;
        if ((z ? (L2216691091636065972) a15234621907337682254.n.getValue() : (L2216691091636065972) a15234621907337682254.f155o.getValue()) == null || (i = a15234621907337682254.i()) == null) {
            return;
        }
        U5234994727412699525 e = a15234621907337682254.e(z ? i.a : i.b);
        if (e == null || (c = e.c()) == null) {
            return;
        }
        long a = e.a(i, z);
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            return;
        }
        a15234621907337682254.q.setValue(new L2216691091636065972(a15234621907337682254.m().r(c, S11671697357523908420.a(a))));
        a15234621907337682254.p.setValue(z ? V8323072410254082725.b : V8323072410254082725.c);
        a15234621907337682254.p(false);
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void d(long j) {
        A15234621907337682254 a15234621907337682254 = this.d;
        if (a15234621907337682254.h() == null) {
            return;
        }
        long f = L2216691091636065972.f(this.b, j);
        this.b = f;
        long f2 = L2216691091636065972.f(this.a, f);
        if (a15234621907337682254.s(f2, this.a, this.c, B14824868959299866349.r)) {
            this.a = f2;
            this.b = 0L;
        }
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onCancel() {
        A15234621907337682254 a15234621907337682254 = this.d;
        a15234621907337682254.p(true);
        a15234621907337682254.p.setValue(null);
        a15234621907337682254.q.setValue(null);
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onStop() {
        A15234621907337682254 a15234621907337682254 = this.d;
        a15234621907337682254.p(true);
        a15234621907337682254.p.setValue(null);
        a15234621907337682254.q.setValue(null);
    }
}
