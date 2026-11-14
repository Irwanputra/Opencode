package dev.epro.r0;

import android.content.Context;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G8478591149424363700 {
    public static final G8478591149424363700 b;
    public U9296548531947164180 a;

    static {
        G8478591149424363700 g8478591149424363700 = new G8478591149424363700();
        g8478591149424363700.a = null;
        b = g8478591149424363700;
    }

    public static U9296548531947164180 a(Context context) {
        U9296548531947164180 u9296548531947164180;
        G8478591149424363700 g8478591149424363700 = b;
        synchronized (g8478591149424363700) {
            try {
                u9296548531947164180 = g8478591149424363700.a;
                if (u9296548531947164180 == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    u9296548531947164180 = new U9296548531947164180(context, false);
                    g8478591149424363700.a = u9296548531947164180;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u9296548531947164180;
    }
}
