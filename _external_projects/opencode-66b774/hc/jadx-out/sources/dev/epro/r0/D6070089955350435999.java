package dev.epro.r0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D6070089955350435999 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static D6070089955350435999 c;
    public B5275173104802412095 a;

    public static synchronized D6070089955350435999 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            D6070089955350435999 d6070089955350435999 = new D6070089955350435999();
            c = d6070089955350435999;
            d6070089955350435999.a = B5275173104802412095.c();
            B5275173104802412095 b5275173104802412095 = c.a;
            B16853324304735504143 b16853324304735504143 = new B16853324304735504143((byte) 1);
            synchronized (b5275173104802412095) {
                b5275173104802412095.e = b16853324304735504143;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
