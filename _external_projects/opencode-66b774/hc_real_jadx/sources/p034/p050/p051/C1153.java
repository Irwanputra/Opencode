package p034.p050.p051;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p034.p050.C1288;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1153 extends ContextWrapper {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Resources.Theme f5692;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LayoutInflater f5693;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f5694;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Resources f5695;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Configuration f5696;

    public C1153() {
        super(null);
    }

    public C1153(Context context, int i) {
        super(context);
        this.f5694 = i;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources;
        if (this.f5695 == null) {
            Configuration configuration = this.f5696;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f5696);
                this.f5695 = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f5695 = resources;
        }
        return this.f5695;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5693 == null) {
            this.f5693 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5693;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f5692;
        if (theme != null) {
            return theme;
        }
        if (this.f5694 == 0) {
            this.f5694 = C1288.Theme_AppCompat_Light;
        }
        m2581();
        return this.f5692;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f5694 != i) {
            this.f5694 = i;
            m2581();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m2581() {
        if (this.f5692 == null) {
            this.f5692 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5692.setTo(theme);
            }
        }
        this.f5692.applyStyle(this.f5694, true);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2582(Configuration configuration) {
        if (this.f5695 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5696 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5696 = new Configuration(configuration);
    }
}
