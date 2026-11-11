package p034.p050.p053;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.どぇぞほだ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1241 extends ContextWrapper {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Object f6092 = new Object();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static ArrayList<WeakReference<C1241>> f6093;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Resources f6094;

    public C1241(Context context) {
        super(context);
        int i = C1202.f5946;
        this.f6094 = new C1228(this, context.getResources());
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Context m2865(Context context) {
        boolean z = false;
        if (!(context instanceof C1241) && !(context.getResources() instanceof C1228)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = C1202.f5946;
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (f6092) {
            ArrayList<WeakReference<C1241>> arrayList = f6093;
            if (arrayList == null) {
                f6093 = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C1241> weakReference = f6093.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f6093.remove(size);
                    }
                }
                for (int size2 = f6093.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C1241> weakReference2 = f6093.get(size2);
                    C1241 c1241 = weakReference2 != null ? weakReference2.get() : null;
                    if (c1241 != null && c1241.getBaseContext() == context) {
                        return c1241;
                    }
                }
            }
            C1241 c12412 = new C1241(context);
            f6093.add(new WeakReference<>(c12412));
            return c12412;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f6094.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f6094;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
    }
}
