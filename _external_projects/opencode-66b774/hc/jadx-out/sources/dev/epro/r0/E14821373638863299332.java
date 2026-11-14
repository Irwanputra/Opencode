package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E14821373638863299332 extends O11762812214053478134 implements Runnable {
    public final long e;

    public E14821373638863299332(long j, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029, k14749510448791472029.getContext());
        this.e = j;
    }

    @Override // dev.epro.r0.T8346709655775060714, dev.epro.r0.U4020053660465689583
    public final String U() {
        return super.U() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        J8045362843799184672.P(this.c);
        z(new P2480554073835519965("Timed out waiting for " + this.e + " ms", this));
    }
}
