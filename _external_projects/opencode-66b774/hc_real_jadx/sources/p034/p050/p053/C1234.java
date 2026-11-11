package p034.p050.p053;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p035.p043.C1067;
import p034.p050.C1264;
import p034.p050.C1265;
import p034.p050.p053.C1242;
import p034.p050.p057.p058.C1274;
import p034.p050.p059.C1287;
import p034.p074.p075.p076.C1462;
import p034.p074.p075.p076.C1466;
import p034.p080.C1493;
import p034.p080.C1504;
import p034.p080.C1505;
import p034.p080.C1506;
import p034.p080.C1507;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1234 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final PorterDuff.Mode f6082 = PorterDuff.Mode.SRC_IN;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final C1236 f6083 = new C1236(6);

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static C1234 f6084;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1493<String, InterfaceC1240> f6085;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public InterfaceC1238 f6086;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1507<String> f6087;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public WeakHashMap<Context, C1507<ColorStateList>> f6088;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TypedValue f6089;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f6090;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final WeakHashMap<Context, C1504<WeakReference<Drawable.ConstantState>>> f6091 = new WeakHashMap<>(0);

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$〺つふすそ, reason: contains not printable characters */
    public static class C1235 implements InterfaceC1240 {
        @Override // p034.p050.p053.C1234.InterfaceC1240
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Drawable mo2864(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C1462 c1462 = new C1462(context, null, null);
                c1462.inflate(resources, xmlPullParser, attributeSet, theme);
                return c1462;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1236 extends C1505<Integer, PorterDuffColorFilter> {
        public C1236(int i) {
            super(i);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1237 implements InterfaceC1240 {
        @Override // p034.p050.p053.C1234.InterfaceC1240
        /* renamed from: げつ〴ぬぐ */
        public Drawable mo2864(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1274.m2941(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC1238 {
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1239 implements InterfaceC1240 {
        @Override // p034.p050.p053.C1234.InterfaceC1240
        /* renamed from: げつ〴ぬぐ */
        public Drawable mo2864(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1466.m3200(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC1240 {
        /* renamed from: げつ〴ぬぐ */
        Drawable mo2864(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m2852(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m3286;
        synchronized (C1234.class) {
            C1236 c1236 = f6083;
            c1236.getClass();
            int i2 = (i + 31) * 31;
            m3286 = c1236.m3286(Integer.valueOf(mode.hashCode() + i2));
            if (m3286 == null) {
                m3286 = new PorterDuffColorFilter(i, mode);
                c1236.getClass();
                c1236.m3284(Integer.valueOf(mode.hashCode() + i2), m3286);
            }
        }
        return m3286;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static synchronized C1234 m2853() {
        C1234 c1234;
        synchronized (C1234.class) {
            if (f6084 == null) {
                C1234 c12342 = new C1234();
                f6084 = c12342;
                if (Build.VERSION.SDK_INT < 24) {
                    c12342.m2858("vector", new C1239());
                    c12342.m2858("animated-vector", new C1235());
                    c12342.m2858("animated-selector", new C1237());
                }
            }
            c1234 = f6084;
        }
        return c1234;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final synchronized boolean m2854(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1504<WeakReference<Drawable.ConstantState>> c1504 = this.f6091.get(context);
            if (c1504 == null) {
                c1504 = new C1504<>();
                this.f6091.put(context, c1504);
            }
            c1504.m3277(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public synchronized Drawable m2855(Context context, int i, boolean z) {
        Drawable m2856;
        if (!this.f6090) {
            boolean z2 = true;
            this.f6090 = true;
            Drawable m2861 = m2861(context, C1287.abc_vector_test);
            if (m2861 != null) {
                if (!(m2861 instanceof C1466) && !"android.graphics.drawable.VectorDrawable".equals(m2861.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f6090 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        m2856 = m2856(context, i);
        if (m2856 == null) {
            m2856 = m2857(context, i);
        }
        if (m2856 == null) {
            m2856 = C1067.m2406(context, i);
        }
        if (m2856 != null) {
            m2856 = m2863(context, i, z, m2856);
        }
        if (m2856 != null) {
            C1210.m2694(m2856);
        }
        return m2856;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Drawable m2856(Context context, int i) {
        int next;
        C1493<String, InterfaceC1240> c1493 = this.f6085;
        if (c1493 == null || c1493.isEmpty()) {
            return null;
        }
        C1507<String> c1507 = this.f6087;
        if (c1507 != null) {
            String m3299 = c1507.m3299(i, null);
            if ("appcompat_skip_skip".equals(m3299) || (m3299 != null && this.f6085.getOrDefault(m3299, null) == null)) {
                return null;
            }
        } else {
            this.f6087 = new C1507<>(10);
        }
        if (this.f6089 == null) {
            this.f6089 = new TypedValue();
        }
        TypedValue typedValue = this.f6089;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m2859 = m2859(context, j);
        if (m2859 != null) {
            return m2859;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f6087.m3298(i, name);
                InterfaceC1240 interfaceC1240 = this.f6085.get(name);
                if (interfaceC1240 != null) {
                    m2859 = interfaceC1240.mo2864(context, xml, asAttributeSet, context.getTheme());
                }
                if (m2859 != null) {
                    m2859.setChangingConfigurations(typedValue.changingConfigurations);
                    m2854(context, j, m2859);
                }
            } catch (Exception unused) {
            }
        }
        if (m2859 == null) {
            this.f6087.m3298(i, "appcompat_skip_skip");
        }
        return m2859;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Drawable m2857(Context context, int i) {
        if (this.f6089 == null) {
            this.f6089 = new TypedValue();
        }
        TypedValue typedValue = this.f6089;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m2859 = m2859(context, j);
        if (m2859 != null) {
            return m2859;
        }
        InterfaceC1238 interfaceC1238 = this.f6086;
        LayerDrawable layerDrawable = null;
        if (interfaceC1238 != null) {
            if (i == C1265.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{m2861(context, C1265.abc_cab_background_internal_bg), m2861(context, C1265.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            m2854(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2858(String str, InterfaceC1240 interfaceC1240) {
        if (this.f6085 == null) {
            this.f6085 = new C1493<>();
        }
        this.f6085.put(str, interfaceC1240);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final synchronized Drawable m2859(Context context, long j) {
        C1504<WeakReference<Drawable.ConstantState>> c1504 = this.f6091.get(context);
        if (c1504 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m3281 = c1504.m3281(j, null);
        if (m3281 != null) {
            Drawable.ConstantState constantState = m3281.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m3287 = C1506.m3287(c1504.f6941, c1504.f6942, j);
            if (m3287 >= 0) {
                Object[] objArr = c1504.f6943;
                Object obj = objArr[m3287];
                Object obj2 = C1504.f6939;
                if (obj != obj2) {
                    objArr[m3287] = obj2;
                    c1504.f6940 = true;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2860(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            づざかべべ.〺つふすそ.ぉざぅち〻.でどあくず$づざかべべ r0 = r7.f6086
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            づざかべべ.〺つふすそ.ぉざぅち〻.なぎぱいぢぎ$げつ〴ぬぐ r0 = (p034.p050.p053.C1242.C1243) r0
            r0.getClass()
            android.graphics.PorterDuff$Mode r3 = p034.p050.p053.C1242.f6095
            int[] r4 = r0.f6100
            boolean r4 = r0.m2874(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1c
            int r5 = p034.p050.C1264.colorControlNormal
            goto L45
        L1c:
            int[] r4 = r0.f6099
            boolean r4 = r0.m2874(r4, r9)
            if (r4 == 0) goto L27
            int r5 = p034.p050.C1264.colorControlActivated
            goto L45
        L27:
            int[] r4 = r0.f6103
            boolean r0 = r0.m2874(r4, r9)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L45
        L32:
            int r0 = p034.p050.C1265.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L41
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L47
        L41:
            int r0 = p034.p050.C1265.abc_dialog_material_background
            if (r9 != r0) goto L49
        L45:
            r9 = r5
            r0 = -1
        L47:
            r4 = 1
            goto L4c
        L49:
            r9 = 0
            r0 = -1
            r4 = 0
        L4c:
            if (r4 == 0) goto L6a
            boolean r4 = p034.p050.p053.C1210.m2696(r10)
            if (r4 == 0) goto L58
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L58:
            int r8 = p034.p050.p053.C1252.m2891(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = p034.p050.p053.C1242.m2866(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L68
            r10.setAlpha(r0)
        L68:
            r8 = 1
            goto L6b
        L6a:
            r8 = 0
        L6b:
            if (r8 == 0) goto L6e
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1234.m2860(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public synchronized Drawable m2861(Context context, int i) {
        return m2855(context, i, false);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public synchronized ColorStateList m2862(Context context, int i) {
        ColorStateList m3299;
        C1507<ColorStateList> c1507;
        WeakHashMap<Context, C1507<ColorStateList>> weakHashMap = this.f6088;
        ColorStateList colorStateList = null;
        m3299 = (weakHashMap == null || (c1507 = weakHashMap.get(context)) == null) ? null : c1507.m3299(i, null);
        if (m3299 == null) {
            InterfaceC1238 interfaceC1238 = this.f6086;
            if (interfaceC1238 != null) {
                colorStateList = ((C1242.C1243) interfaceC1238).m2873(context, i);
            }
            if (colorStateList != null) {
                if (this.f6088 == null) {
                    this.f6088 = new WeakHashMap<>();
                }
                C1507<ColorStateList> c15072 = this.f6088.get(context);
                if (c15072 == null) {
                    c15072 = new C1507<>(10);
                    this.f6088.put(context, c15072);
                }
                c15072.m3298(i, colorStateList);
            }
            m3299 = colorStateList;
        }
        return m3299;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Drawable m2863(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m2862 = m2862(context, i);
        PorterDuff.Mode mode = null;
        if (m2862 != null) {
            if (C1210.m2696(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m4758 = C2786.m4758(drawable);
            C2786.m4788(m4758, m2862);
            InterfaceC1238 interfaceC1238 = this.f6086;
            if (interfaceC1238 != null) {
                if (i == C1265.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return m4758;
            }
            C2786.m4802(m4758, mode);
            return m4758;
        }
        InterfaceC1238 interfaceC12382 = this.f6086;
        if (interfaceC12382 != null) {
            C1242.C1243 c1243 = (C1242.C1243) interfaceC12382;
            c1243.getClass();
            boolean z2 = true;
            if (i == C1265.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i2 = C1264.colorControlNormal;
                int m2891 = C1252.m2891(context, i2);
                PorterDuff.Mode mode2 = C1242.f6095;
                c1243.m2875(findDrawableByLayerId, m2891, mode2);
                c1243.m2875(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C1252.m2891(context, i2), mode2);
                c1243.m2875(layerDrawable.findDrawableByLayerId(R.id.progress), C1252.m2891(context, C1264.colorControlActivated), mode2);
            } else if (i == C1265.abc_ratingbar_material || i == C1265.abc_ratingbar_indicator_material || i == C1265.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int m2890 = C1252.m2890(context, C1264.colorControlNormal);
                PorterDuff.Mode mode3 = C1242.f6095;
                c1243.m2875(findDrawableByLayerId2, m2890, mode3);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i3 = C1264.colorControlActivated;
                c1243.m2875(findDrawableByLayerId3, C1252.m2891(context, i3), mode3);
                c1243.m2875(layerDrawable2.findDrawableByLayerId(R.id.progress), C1252.m2891(context, i3), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m2860(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }
}
