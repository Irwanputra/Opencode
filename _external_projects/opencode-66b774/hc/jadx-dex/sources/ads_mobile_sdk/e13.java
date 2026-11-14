package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class e13 implements java.lang.Runnable {
    public final dev.epro.r0.M17133811648581684718 a;

    public e13() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (java.lang.Exception e) {
            dev.epro.r0.M17133811648581684718 m17133811648581684718 = this.a;
            if (m17133811648581684718 != null) {
                m17133811648581684718.a(e);
            }
        }
    }

    public e13(dev.epro.r0.M17133811648581684718 m17133811648581684718) {
        this.a = m17133811648581684718;
    }
}
