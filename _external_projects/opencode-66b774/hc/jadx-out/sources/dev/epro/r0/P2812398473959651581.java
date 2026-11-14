package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P2812398473959651581 implements Z4972949040470868463, G15142808377942141248 {
    public final G8001132634698687269 a;
    public final L12639328004344855510 b;
    public final A2789795882633926065 c;
    public X7175349259954592591 d;

    public P2812398473959651581(G8001132634698687269 g8001132634698687269, L12639328004344855510 l12639328004344855510) {
        this.a = g8001132634698687269;
        this.b = l12639328004344855510;
        this.c = O8620973563946607355.a(g8001132634698687269.plus(this));
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void a() {
        X7175349259954592591 x7175349259954592591 = this.d;
        if (x7175349259954592591 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            x7175349259954592591.c(cancellationException);
        }
        this.d = R7033599853981556291.E(this.c, null, null, this.b, 3);
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void d() {
        X7175349259954592591 x7175349259954592591 = this.d;
        if (x7175349259954592591 != null) {
            x7175349259954592591.A(new D15246555520110923840((byte) 1));
        }
        this.d = null;
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void f() {
        X7175349259954592591 x7175349259954592591 = this.d;
        if (x7175349259954592591 != null) {
            x7175349259954592591.A(new D15246555520110923840((byte) 1));
        }
        this.d = null;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return B14824868959299866349.e;
    }

    @Override // dev.epro.r0.G15142808377942141248
    public final void handleException(G8001132634698687269 g8001132634698687269, Throwable th) throws Throwable {
        W12685451225593881345 w12685451225593881345 = (W12685451225593881345) g8001132634698687269.get(W12685451225593881345.b);
        if (w12685451225593881345 != null) {
            O8620973563946607355.Z(th, new D16945471218061474327(w12685451225593881345, this, (byte) 24));
        }
        G15142808377942141248 g15142808377942141248 = (G15142808377942141248) this.a.get(B14824868959299866349.e);
        if (g15142808377942141248 == null) {
            throw th;
        }
        g15142808377942141248.handleException(g8001132634698687269, th);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }
}
