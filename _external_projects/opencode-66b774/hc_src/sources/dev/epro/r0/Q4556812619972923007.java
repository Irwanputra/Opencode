package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q4556812619972923007 extends CheckedTextView {
    public final C3036442763540539737 a;
    public final G6575252167976303972 b;
    public final L11832743611999248019 c;
    public S8418098248327900568 d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:3:0x0049, B:5:0x0050, B:8:0x0056, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:3:0x0049, B:5:0x0050, B:8:0x0056, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q4556812619972923007(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r5 = 2130968779(0x7f0400cb, float:1.7546221E38)
            r7.<init>(r8, r9, r5)
            android.content.Context r8 = r7.getContext()
            dev.epro.r0.X170853990943489827.a(r7, r8)
            dev.epro.r0.L11832743611999248019 r8 = new dev.epro.r0.L11832743611999248019
            r8.<init>(r7)
            r7.c = r8
            r8.h(r9, r5)
            r8.b()
            dev.epro.r0.G6575252167976303972 r8 = new dev.epro.r0.G6575252167976303972
            r8.<init>(r7)
            r7.b = r8
            r8.f(r9, r5)
            dev.epro.r0.C3036442763540539737 r8 = new dev.epro.r0.C3036442763540539737
            r8.<init>(r7)
            r7.a = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = dev.epro.r0.Y17304307076558258116.l
            dev.epro.r0.I1632105416032993715 r8 = dev.epro.r0.I1632105416032993715.t(r8, r9, r2, r5)
            java.lang.Object r0 = r8.c
            r6 = r0
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r8.c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r7
            r3 = r9
            dev.epro.r0.W10240872260424387225.i(r0, r1, r2, r3, r4, r5)
            r7 = 1
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            r1 = 0
            if (r9 == 0) goto L65
            int r7 = r6.getResourceId(r7, r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L65
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            android.graphics.drawable.Drawable r7 = dev.epro.r0.M9216324016624295870.G(r9, r7)     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L62 android.content.res.Resources.NotFoundException -> L65
            goto L7c
        L62:
            r0 = move-exception
            r7 = r0
            goto La9
        L65:
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L7c
            int r7 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L7c
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L62
            android.graphics.drawable.Drawable r7 = dev.epro.r0.M9216324016624295870.G(r9, r7)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L62
        L7c:
            r7 = 2
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L8a
            android.content.res.ColorStateList r7 = r8.f(r7)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkTintList(r7)     // Catch: java.lang.Throwable -> L62
        L8a:
            r7 = 3
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L9e
            r9 = -1
            int r7 = r6.getInt(r7, r9)     // Catch: java.lang.Throwable -> L62
            r9 = 0
            android.graphics.PorterDuff$Mode r7 = dev.epro.r0.T11496100853119631009.b(r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.setCheckMarkTintMode(r7)     // Catch: java.lang.Throwable -> L62
        L9e:
            r8.v()
            dev.epro.r0.S8418098248327900568 r7 = r0.getEmojiTextViewHelper()
            r7.a(r3, r5)
            return
        La9:
            r8.v()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q4556812619972923007.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private S8418098248327900568 getEmojiTextViewHelper() {
        S8418098248327900568 s8418098248327900568 = this.d;
        if (s8418098248327900568 != null) {
            return s8418098248327900568;
        }
        S8418098248327900568 s84180982483279005682 = new S8418098248327900568(this);
        this.d = s84180982483279005682;
        return s84180982483279005682;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            c3036442763540539737.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return M17147082063200071302.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            return c3036442763540539737.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            return c3036442763540539737.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.g();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        I3887072968740112330.F(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            if (c3036442763540539737.e) {
                c3036442763540539737.e = false;
            } else {
                c3036442763540539737.e = true;
                c3036442763540539737.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(M17147082063200071302.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        G6575252167976303972 g6575252167976303972 = this.b;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            c3036442763540539737.a = colorStateList;
            c3036442763540539737.c = true;
            c3036442763540539737.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3036442763540539737 c3036442763540539737 = this.a;
        if (c3036442763540539737 != null) {
            c3036442763540539737.b = mode;
            c3036442763540539737.d = true;
            c3036442763540539737.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        L11832743611999248019 l11832743611999248019 = this.c;
        l11832743611999248019.m(colorStateList);
        l11832743611999248019.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        L11832743611999248019 l11832743611999248019 = this.c;
        l11832743611999248019.n(mode);
        l11832743611999248019.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        L11832743611999248019 l11832743611999248019 = this.c;
        if (l11832743611999248019 != null) {
            l11832743611999248019.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(M9216324016624295870.G(getContext(), i));
    }
}
