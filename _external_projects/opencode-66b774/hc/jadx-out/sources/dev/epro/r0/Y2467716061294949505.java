package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2467716061294949505 extends T6475866889761571877 {
    public final /* synthetic */ P11191550465322624469 e;
    public final /* synthetic */ Z17200250803442165189 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2467716061294949505(String str, P11191550465322624469 p11191550465322624469, Z17200250803442165189 z17200250803442165189) {
        super(str, true);
        this.e = p11191550465322624469;
        this.f = z17200250803442165189;
    }

    @Override // dev.epro.r0.T6475866889761571877
    public final long a() throws InterruptedException {
        J14476340649358081657 j14476340649358081657;
        P11191550465322624469 p11191550465322624469 = this.e;
        try {
            j14476340649358081657 = p11191550465322624469.g();
        } catch (Throwable th) {
            j14476340649358081657 = new J14476340649358081657(p11191550465322624469, th, 2);
        }
        Z17200250803442165189 z17200250803442165189 = this.f;
        if (!z17200250803442165189.d.contains(p11191550465322624469)) {
            return -1L;
        }
        z17200250803442165189.e.put(j14476340649358081657);
        return -1L;
    }
}
