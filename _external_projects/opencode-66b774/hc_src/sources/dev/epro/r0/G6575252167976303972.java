package dev.epro.r0;

import ads_mobile_sdk.a21;
import ads_mobile_sdk.cw0;
import ads_mobile_sdk.ww2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G6575252167976303972 implements K4548097313143615345 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public G6575252167976303972(byte b) {
        switch (b) {
            case 4:
                this.b = new D9734197463427655843[32];
                this.c = new float[32];
                this.d = new byte[32];
                E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
                this.e = new E13273723708836014930();
                this.f = new E13273723708836014930();
                break;
            default:
                this.a = -1;
                this.c = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(dev.epro.r0.R4833348786910499294 r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G6575252167976303972.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((L11462694090053902638) this.d) != null) {
                L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.f;
                if (l11462694090053902638 == null) {
                    l11462694090053902638 = new L11462694090053902638();
                    this.f = l11462694090053902638;
                }
                l11462694090053902638.c = null;
                l11462694090053902638.b = false;
                l11462694090053902638.d = null;
                l11462694090053902638.a = false;
                WeakHashMap weakHashMap = W10240872260424387225.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    l11462694090053902638.b = true;
                    l11462694090053902638.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    l11462694090053902638.a = true;
                    l11462694090053902638.d = backgroundTintMode;
                }
                if (l11462694090053902638.b || l11462694090053902638.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = D6070089955350435999.b;
                    B5275173104802412095.i(background, l11462694090053902638, drawableState);
                    return;
                }
            }
            L11462694090053902638 l114626940900539026382 = (L11462694090053902638) this.e;
            if (l114626940900539026382 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = D6070089955350435999.b;
                B5275173104802412095.i(background, l114626940900539026382, drawableState2);
            } else {
                L11462694090053902638 l114626940900539026383 = (L11462694090053902638) this.d;
                if (l114626940900539026383 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = D6070089955350435999.b;
                    B5275173104802412095.i(background, l114626940900539026383, drawableState3);
                }
            }
        }
    }

    public ColorStateList c() {
        L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.e;
        if (l11462694090053902638 != null) {
            return (ColorStateList) l11462694090053902638.c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // dev.epro.r0.K4548097313143615345
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(dev.epro.r0.R4833348786910499294 r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G6575252167976303972.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public PorterDuff.Mode e() {
        L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.e;
        if (l11462694090053902638 != null) {
            return (PorterDuff.Mode) l11462694090053902638.d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i) {
        ColorStateList g;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = Y17304307076558258116.y;
        I1632105416032993715 t = I1632105416032993715.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) t.c;
        View view2 = (View) this.b;
        W10240872260424387225.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) t.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                D6070089955350435999 d6070089955350435999 = (D6070089955350435999) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (d6070089955350435999) {
                    g = d6070089955350435999.a.g(context2, i2);
                }
                if (g != null) {
                    k(g);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(t.f(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(T11496100853119631009.b(typedArray.getInt(2, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public W6610499404761400913 g(String str) {
        F17673720950005104351 f17673720950005104351;
        str.getClass();
        O12494175665883759871 o12494175665883759871 = (O12494175665883759871) this.f;
        if (o12494175665883759871 == null || (f17673720950005104351 = (F17673720950005104351) o12494175665883759871.getValue()) == null) {
            return null;
        }
        int i = V7801742040189616406.e;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d = f17673720950005104351.d(parse, (LinkedHashMap) this.d);
        if (d == null) {
            return null;
        }
        return new W6610499404761400913((V7801742040189616406) this.b, d, f17673720950005104351.l, f17673720950005104351.b(parse), false);
    }

    public void h() {
        this.a = -1;
        k(null);
        b();
    }

    public void i(int i) {
        ColorStateList colorStateList;
        this.a = i;
        D6070089955350435999 d6070089955350435999 = (D6070089955350435999) this.c;
        if (d6070089955350435999 != null) {
            Context context = ((View) this.b).getContext();
            synchronized (d6070089955350435999) {
                colorStateList = d6070089955350435999.a.g(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        b();
    }

    public void j(D9734197463427655843 d9734197463427655843) {
        int J0 = O5378677881740157249.J0(d9734197463427655843, (D9734197463427655843[]) this.b);
        if (J0 >= 0) {
            D9734197463427655843[] d9734197463427655843Arr = (D9734197463427655843[]) this.b;
            int i = J0 + 1;
            O5378677881740157249.n0(J0, i, this.a, d9734197463427655843Arr, d9734197463427655843Arr);
            D9734197463427655843[] d9734197463427655843Arr2 = (D9734197463427655843[]) this.b;
            int i2 = this.a;
            d9734197463427655843Arr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, J0, i2 - i);
            byte[] bArr = (byte[]) this.d;
            O5378677881740157249.o0(J0, i, bArr, this.a, bArr);
            this.a--;
        }
    }

    public void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.d;
            if (l11462694090053902638 == null) {
                l11462694090053902638 = new L11462694090053902638();
                this.d = l11462694090053902638;
            }
            l11462694090053902638.c = colorStateList;
            l11462694090053902638.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void l(ColorStateList colorStateList) {
        L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.e;
        if (l11462694090053902638 == null) {
            l11462694090053902638 = new L11462694090053902638();
            this.e = l11462694090053902638;
        }
        l11462694090053902638.c = colorStateList;
        l11462694090053902638.b = true;
        b();
    }

    public void m(PorterDuff.Mode mode) {
        L11462694090053902638 l11462694090053902638 = (L11462694090053902638) this.e;
        if (l11462694090053902638 == null) {
            l11462694090053902638 = new L11462694090053902638();
            this.e = l11462694090053902638;
        }
        l11462694090053902638.d = mode;
        l11462694090053902638.a = true;
        b();
    }

    public G6575252167976303972(View view) {
        this.a = -1;
        this.b = view;
        this.c = D6070089955350435999.a();
    }

    public a21 a() {
        int i = this.a;
        if (i >= 0) {
            return new a21(i, (String) this.b, (LinkedHashMap) this.c, (ww2) this.d, (A18119328133183277592) this.e, (String) this.f);
        }
        Z3383101362411723454.j(G6547577305291411977.n(i, "Invalid status code: "));
        return null;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a, reason: collision with other method in class */
    public cw0 mo19a() {
        return cw0.NATIVE_AD;
    }

    public void a(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new H9390398899829886498((String) entry.getKey(), R9411874267597469228.J0((List) entry.getValue(), ", ", null, null, 0, null, 62)));
            }
            linkedHashMap = new LinkedHashMap(E4951175994894594588.y0(arrayList));
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.c = linkedHashMap;
    }
}
