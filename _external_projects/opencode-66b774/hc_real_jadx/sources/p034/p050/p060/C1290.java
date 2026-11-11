package p034.p050.p060;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p034.p050.p057.p058.C1284;
import p034.p050.p060.C1306;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1290 implements DrawerLayout.InterfaceC0165 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final DrawerLayout f6257;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f6258;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1284 f6259;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1293 f6260;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f6262;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f6263 = true;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f6261 = true;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6256 = false;

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1291 {
        /* renamed from: てぜきぽく */
        InterfaceC1293 mo78();
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1292 implements InterfaceC1293 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1306.C1307 f6264;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Activity f6265;

        public C1292(Activity activity) {
            this.f6265 = activity;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo2953() {
            ActionBar actionBar = this.f6265.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Drawable mo2954() {
            if (Build.VERSION.SDK_INT < 18) {
                TypedArray obtainStyledAttributes = this.f6265.obtainStyledAttributes(C1306.f6311);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                return drawable;
            }
            ActionBar actionBar = this.f6265.getActionBar();
            TypedArray obtainStyledAttributes2 = (actionBar != null ? actionBar.getThemedContext() : this.f6265).obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable2 = obtainStyledAttributes2.getDrawable(0);
            obtainStyledAttributes2.recycle();
            return drawable2;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo2955(Drawable drawable, int i) {
            ActionBar actionBar = this.f6265.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(drawable);
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                actionBar.setDisplayShowHomeEnabled(true);
                Activity activity = this.f6265;
                C1306.C1307 c1307 = new C1306.C1307(activity);
                if (c1307.f6314 != null) {
                    try {
                        ActionBar actionBar2 = activity.getActionBar();
                        c1307.f6314.invoke(actionBar2, drawable);
                        c1307.f6312.invoke(actionBar2, Integer.valueOf(i));
                    } catch (Exception unused) {
                    }
                } else {
                    ImageView imageView = c1307.f6313;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }
                this.f6264 = c1307;
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Context mo2956() {
            ActionBar actionBar = this.f6265.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f6265;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo2957(int i) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18) {
                ActionBar actionBar = this.f6265.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            C1306.C1307 c1307 = this.f6264;
            Activity activity = this.f6265;
            if (c1307 == null) {
                c1307 = new C1306.C1307(activity);
            }
            if (c1307.f6314 != null) {
                try {
                    ActionBar actionBar2 = activity.getActionBar();
                    c1307.f6312.invoke(actionBar2, Integer.valueOf(i));
                    if (i2 <= 19) {
                        actionBar2.setSubtitle(actionBar2.getSubtitle());
                    }
                } catch (Exception unused) {
                }
            }
            this.f6264 = c1307;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1293 {
        /* renamed from: 〺つふすそ */
        boolean mo2953();

        /* renamed from: くし〴〺ぅ */
        Drawable mo2954();

        /* renamed from: げつ〴ぬぐ */
        void mo2955(Drawable drawable, int i);

        /* renamed from: づざかべべ */
        Context mo2956();

        /* renamed from: びぐびあび */
        void mo2957(int i);
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〺つふすそ$びぐびあび, reason: contains not printable characters */
    public static class C1294 implements InterfaceC1293 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Drawable f6266;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final CharSequence f6267;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Toolbar f6268;

        public C1294(Toolbar toolbar) {
            this.f6268 = toolbar;
            this.f6266 = toolbar.getNavigationIcon();
            this.f6267 = toolbar.getNavigationContentDescription();
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: 〺つふすそ */
        public boolean mo2953() {
            return true;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: くし〴〺ぅ */
        public Drawable mo2954() {
            return this.f6266;
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: げつ〴ぬぐ */
        public void mo2955(Drawable drawable, int i) {
            this.f6268.setNavigationIcon(drawable);
            Toolbar toolbar = this.f6268;
            if (i == 0) {
                toolbar.setNavigationContentDescription(this.f6267);
            } else {
                toolbar.setNavigationContentDescription(i);
            }
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: づざかべべ */
        public Context mo2956() {
            return this.f6268.getContext();
        }

        @Override // p034.p050.p060.C1290.InterfaceC1293
        /* renamed from: びぐびあび */
        public void mo2957(int i) {
            if (i == 0) {
                this.f6268.setNavigationContentDescription(this.f6267);
            } else {
                this.f6268.setNavigationContentDescription(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1290(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        if (toolbar != null) {
            this.f6260 = new C1294(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1308(this));
        } else if (activity instanceof InterfaceC1291) {
            this.f6260 = ((InterfaceC1291) activity).mo78();
        } else {
            this.f6260 = new C1292(activity);
        }
        this.f6257 = drawerLayout;
        this.f6262 = i;
        this.f6258 = i2;
        this.f6259 = new C1284(this.f6260.mo2956());
        this.f6260.mo2954();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0165
    /* renamed from: 〺つふすそ */
    public void mo471(View view, float f) {
        if (this.f6263) {
            m2951(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m2951(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0165
    /* renamed from: くし〴〺ぅ */
    public void mo472(View view) {
        m2951(1.0f);
        if (this.f6261) {
            this.f6260.mo2957(this.f6258);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0165
    /* renamed from: げつ〴ぬぐ */
    public void mo473(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r0.f6252 = r1;
        r0.invalidateSelf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
    
        if (r0.f6252 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.f6252 != true) goto L11;
     */
    /* renamed from: づざかべべ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2951(float r4) {
        /*
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Le
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.びぐびあび r0 = r3.f6259
            r1 = 1
            boolean r2 = r0.f6252
            if (r2 == r1) goto L1f
            goto L1a
        Le:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L1f
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.びぐびあび r0 = r3.f6259
            r1 = 0
            boolean r2 = r0.f6252
            if (r2 == 0) goto L1f
        L1a:
            r0.f6252 = r1
            r0.invalidateSelf()
        L1f:
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.びぐびあび r0 = r3.f6259
            float r1 = r0.f6245
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L2c
            r0.f6245 = r4
            r0.invalidateSelf()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.C1290.m2951(float):void");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2952() {
        m2951(this.f6257.m454(8388611) ? 1.0f : 0.0f);
        if (this.f6261) {
            C1284 c1284 = this.f6259;
            int i = this.f6257.m454(8388611) ? this.f6258 : this.f6262;
            if (!this.f6256 && !this.f6260.mo2953()) {
                this.f6256 = true;
            }
            this.f6260.mo2955(c1284, i);
        }
    }
}
