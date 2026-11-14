package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class V16233589191250258052 {
    public static final V15499216873564893116 a = new V15499216873564893116(new E8496491261769853844((byte) 0));
    public static final int b = -100;
    public static J10695037395247619504 c = null;
    public static J10695037395247619504 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final K4498948325030944807 g = new K4498948325030944807(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean a(Context context) {
        if (e == null) {
            try {
                int i2 = R17765596430948773055.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) R17765596430948773055.class), 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void d(L9687083612725928934 l9687083612725928934) {
        synchronized (h) {
            try {
                K4498948325030944807 k4498948325030944807 = g;
                k4498948325030944807.getClass();
                L7502288025406801017 l7502288025406801017 = new L7502288025406801017(k4498948325030944807);
                while (l7502288025406801017.hasNext()) {
                    V16233589191250258052 v16233589191250258052 = (V16233589191250258052) ((WeakReference) l7502288025406801017.next()).get();
                    if (v16233589191250258052 == l9687083612725928934 || v16233589191250258052 == null) {
                        l7502288025406801017.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract boolean e(int i2);

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
