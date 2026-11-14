package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I1843037381664720286 implements Y17698807562857349923 {
    public static boolean f = true;
    public final S7974369370986781936 a;
    public final Object b = new Object();
    public K10289396531090871231 c;
    public boolean d;
    public final A13157021185409420888 e;

    public I1843037381664720286(S7974369370986781936 s7974369370986781936) {
        this.a = s7974369370986781936;
        A13157021185409420888 a13157021185409420888 = new A13157021185409420888();
        this.e = a13157021185409420888;
        if (s7974369370986781936.isAttachedToWindow()) {
            Context context = s7974369370986781936.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(a13157021185409420888);
                this.d = true;
            }
        }
        s7974369370986781936.addOnAttachStateChangeListener(new J10766838134493491179(this, (byte) 0));
    }

    @Override // dev.epro.r0.Y17698807562857349923
    public final void a(B9692660393722135472 b9692660393722135472) {
        synchronized (this.b) {
            if (!b9692660393722135472.s) {
                b9692660393722135472.s = true;
                b9692660393722135472.b();
            }
        }
    }

    @Override // dev.epro.r0.Y17698807562857349923
    public final B9692660393722135472 b() {
        Y257452374762370649 u14221849108151894556;
        Y257452374762370649 y257452374762370649;
        B9692660393722135472 b9692660393722135472;
        synchronized (this.b) {
            try {
                S7974369370986781936 s7974369370986781936 = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    s7974369370986781936.getUniqueDrawingId();
                }
                if (i >= 29) {
                    y257452374762370649 = new H17422069811191965643();
                } else {
                    if (f) {
                        try {
                            u14221849108151894556 = new C1383693151350319728(this.a, new G3509037795884611271(), new N16536369055082677148());
                        } catch (Throwable unused) {
                            f = false;
                            u14221849108151894556 = new U14221849108151894556(c(this.a));
                        }
                    } else {
                        u14221849108151894556 = new U14221849108151894556(c(this.a));
                    }
                    y257452374762370649 = u14221849108151894556;
                }
                b9692660393722135472 = new B9692660393722135472(y257452374762370649);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9692660393722135472;
    }

    public final I9570621155112813784 c(S7974369370986781936 s7974369370986781936) {
        K10289396531090871231 k10289396531090871231 = this.c;
        if (k10289396531090871231 != null) {
            return k10289396531090871231;
        }
        K10289396531090871231 k102893965310908712312 = new K10289396531090871231(s7974369370986781936.getContext());
        k102893965310908712312.setClipChildren(false);
        k102893965310908712312.setClipToPadding(false);
        k102893965310908712312.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        s7974369370986781936.addView(k102893965310908712312, -1);
        this.c = k102893965310908712312;
        return k102893965310908712312;
    }
}
