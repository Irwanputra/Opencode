package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E14821373638863299332 extends dev.epro.r0.O11762812214053478134 implements java.lang.Runnable {
    public final long e;

    public E14821373638863299332(long j, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029, k14749510448791472029.getContext());
        this.e = j;
    }

    public final java.lang.String U() {
        return super/*dev.epro.r0.T8346709655775060714*/.U() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        dev.epro.r0.J8045362843799184672.P(((dev.epro.r0.T8346709655775060714) this).c);
        z(new dev.epro.r0.P2480554073835519965("Timed out waiting for " + this.e + " ms", this));
    }
}
