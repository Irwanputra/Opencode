package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6070089955350435999 {
    public static final android.graphics.PorterDuff.Mode b = android.graphics.PorterDuff.Mode.SRC_IN;
    public static dev.epro.r0.D6070089955350435999 c;
    public dev.epro.r0.B5275173104802412095 a;

    public static synchronized dev.epro.r0.D6070089955350435999 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            dev.epro.r0.D6070089955350435999 d6070089955350435999 = new dev.epro.r0.D6070089955350435999();
            c = d6070089955350435999;
            d6070089955350435999.a = dev.epro.r0.B5275173104802412095.c();
            dev.epro.r0.B5275173104802412095 b5275173104802412095 = c.a;
            dev.epro.r0.B16853324304735504143 b16853324304735504143 = new dev.epro.r0.B16853324304735504143((byte) 1);
            synchronized (b5275173104802412095) {
                b5275173104802412095.e = b16853324304735504143;
            }
        }
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        return this.a.d(context, i);
    }
}
