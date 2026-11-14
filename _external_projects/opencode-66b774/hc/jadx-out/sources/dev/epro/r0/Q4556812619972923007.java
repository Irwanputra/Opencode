package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q4556812619972923007 extends CheckedTextView {
    public final C3036442763540539737 a;
    public final G6575252167976303972 b;
    public final L11832743611999248019 c;
    public S8418098248327900568 d;

    public Q4556812619972923007(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        X170853990943489827.a(this, getContext());
        L11832743611999248019 l11832743611999248019 = new L11832743611999248019(this);
        this.c = l11832743611999248019;
        l11832743611999248019.h(attributeSet, R.attr.checkedTextViewStyle);
        l11832743611999248019.b();
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.b = g6575252167976303972;
        g6575252167976303972.f(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new C3036442763540539737(this);
        Context context2 = getContext();
        int[] iArr = Y17304307076558258116.l;
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
        W10240872260424387225.i(this, getContext(), iArr, attributeSet, (TypedArray) i1632105416032993715T.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(M9216324016624295870.G(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(M9216324016624295870.G(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(M9216324016624295870.G(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(i1632105416032993715T.f(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(T11496100853119631009.b(typedArray.getInt(3, -1), null));
            }
            i1632105416032993715T.v();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            i1632105416032993715T.v();
            throw th;
        }
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
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        I3887072968740112330.F(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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
