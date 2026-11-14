package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A4716120536771319554 extends android.webkit.WebView {
    public static final /* synthetic */ int d = 0;
    public final android.os.Handler a;
    public final dev.epro.r0.C4341747165502163559 b;
    public boolean c;

    public A4716120536771319554(dev.epro.r0.O6655543165492094776 o6655543165492094776, android.os.Handler handler, dev.epro.r0.C4341747165502163559 c4341747165502163559) {
        super(o6655543165492094776);
        this.c = false;
        this.a = handler;
        this.b = c4341747165502163559;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        this.a.post(new dev.epro.r0.I3863025946240164840(this, dev.epro.r0.G6547577305291411977.t(str, "(", str2, ");"), (byte) 24));
    }
}
