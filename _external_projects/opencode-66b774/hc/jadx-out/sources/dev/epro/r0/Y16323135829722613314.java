package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y16323135829722613314 extends Y14832840975702795122 {
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f584o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final I5811816837469502949 w;
    public final Q8205248782310272441 x;
    public static final int[] y = {R.attr.state_indeterminate};
    public static final int[] z = {R.attr.state_error};
    public static final int[][] A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public Y16323135829722613314(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        ColorStateList colorStateListR;
        int resourceId3;
        ColorStateList colorStateListR2;
        int resourceId4;
        int resourceId5;
        super(Q3181834110876746778.V(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]), attributeSet);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        Context context2 = getContext();
        I5811816837469502949 i5811816837469502949 = new I5811816837469502949(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = D17154507594675396172.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        i5811816837469502949.a = drawable;
        drawable.setCallback(i5811816837469502949.f);
        new O11248608044091861502(i5811816837469502949.a.getConstantState());
        this.w = i5811816837469502949;
        this.x = new Q8205248782310272441(this);
        Context context3 = getContext();
        this.l = getButtonDrawable();
        this.f584o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        Q13169198992966610970.M(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = Q9005017131391967988.h;
        Q13169198992966610970.N(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        this.m = (!typedArrayObtainStyledAttributes.hasValue(2) || (resourceId5 = typedArrayObtainStyledAttributes.getResourceId(2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(2) : M9216324016624295870.G(context3, resourceId5);
        if (this.l != null && S10823041268949770285.W(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId6 == B && resourceId7 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.l = M9216324016624295870.G(context3, R.drawable.mtrl_checkbox_button);
                this.n = true;
                if (this.m == null) {
                    this.m = M9216324016624295870.G(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        if ((!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId4 = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = B5998207562248239613.r(context3, resourceId4)) == null) && (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = B5998207562248239613.r(context3, resourceId)) == null)) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        }
        this.p = colorStateList;
        int i = typedArrayObtainStyledAttributes.getInt(4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.q = L12240044716294895599.l(i);
        this.h = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor((!typedArrayObtainStyledAttributes.hasValue(10) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(10, 0)) == 0 || (colorStateListR2 = B5998207562248239613.r(context3, resourceId3)) == null) ? (!typedArrayObtainStyledAttributes.hasValue(10) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, 0)) == 0 || (colorStateListR = B5998207562248239613.r(context3, resourceId2)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(10) : colorStateListR : colorStateListR2);
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iZ = E12775674050813925581.z(this, R.attr.colorControlActivated);
        int iZ2 = E12775674050813925581.z(this, R.attr.colorError);
        int iZ3 = E12775674050813925581.z(this, R.attr.colorSurface);
        int iZ4 = E12775674050813925581.z(this, R.attr.colorOnSurface);
        ColorStateList colorStateList2 = new ColorStateList(A, new int[]{E12775674050813925581.F(1.0f, iZ3, iZ2), E12775674050813925581.F(1.0f, iZ3, iZ), E12775674050813925581.F(0.54f, iZ3, iZ4), E12775674050813925581.F(0.38f, iZ3, iZ4), E12775674050813925581.F(0.38f, iZ3, iZ4)});
        this.g = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f584o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        G7019617308371076781 g7019617308371076781;
        Drawable drawableMutate = this.l;
        ColorStateList colorStateList3 = this.f584o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.l = drawableMutate;
        Drawable drawableMutate2 = this.m;
        ColorStateList colorStateList4 = this.p;
        PorterDuff.Mode mode = this.q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.m = drawableMutate2;
        if (this.n) {
            I5811816837469502949 i5811816837469502949 = this.w;
            if (i5811816837469502949 != null) {
                Q4631774043304096941 q4631774043304096941 = i5811816837469502949.b;
                Drawable drawable = i5811816837469502949.a;
                Q8205248782310272441 q8205248782310272441 = this.x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    F2536022593991472888 f2536022593991472888 = q8205248782310272441.a;
                    if (f2536022593991472888 == null) {
                        f2536022593991472888 = new F2536022593991472888(q8205248782310272441);
                        q8205248782310272441.a = f2536022593991472888;
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(f2536022593991472888);
                }
                ArrayList arrayList = i5811816837469502949.e;
                if (arrayList != null && q8205248782310272441 != null) {
                    arrayList.remove(q8205248782310272441);
                    if (i5811816837469502949.e.size() == 0 && (g7019617308371076781 = i5811816837469502949.d) != null) {
                        q4631774043304096941.b.removeListener(g7019617308371076781);
                        i5811816837469502949.d = null;
                    }
                }
                Drawable drawable2 = i5811816837469502949.a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    F2536022593991472888 f25360225939914728882 = q8205248782310272441.a;
                    if (f25360225939914728882 == null) {
                        f25360225939914728882 = new F2536022593991472888(q8205248782310272441);
                        q8205248782310272441.a = f25360225939914728882;
                    }
                    animatedVectorDrawable2.registerAnimationCallback(f25360225939914728882);
                } else if (q8205248782310272441 != null) {
                    ArrayList arrayList2 = i5811816837469502949.e;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        i5811816837469502949.e = arrayList2;
                    }
                    if (!arrayList2.contains(q8205248782310272441)) {
                        i5811816837469502949.e.add(q8205248782310272441);
                        G7019617308371076781 g70196173083710767812 = i5811816837469502949.d;
                        if (g70196173083710767812 == null) {
                            g70196173083710767812 = new G7019617308371076781(i5811816837469502949, (byte) 1);
                            i5811816837469502949.d = g70196173083710767812;
                        }
                        q4631774043304096941.b.addListener(g70196173083710767812);
                    }
                }
            }
            Drawable drawable3 = this.l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && i5811816837469502949 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, i5811816837469502949, false);
                ((AnimatedStateListDrawable) this.l).addTransition(R.id.indeterminate, R.id.unchecked, i5811816837469502949, false);
            }
        }
        Drawable drawable4 = this.l;
        if (drawable4 != null && (colorStateList2 = this.f584o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.m;
        if (drawable5 != null && (colorStateList = this.p) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.l;
        Drawable drawable7 = this.m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f584o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f584o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof K17628906008394984379)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        K17628906008394984379 k17628906008394984379 = (K17628906008394984379) parcelable;
        super.onRestoreInstanceState(k17628906008394984379.getSuperState());
        setCheckedState(k17628906008394984379.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        K17628906008394984379 k17628906008394984379 = new K17628906008394984379(super.onSaveInstanceState());
        k17628906008394984379.a = getCheckedState();
        return k17628906008394984379;
    }

    @Override // dev.epro.r0.Y14832840975702795122, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(M9216324016624295870.G(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(M9216324016624295870.G(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f584o == colorStateList) {
            return;
        }
        this.f584o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    Z3383101362411723454.s();
                    return;
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // dev.epro.r0.Y14832840975702795122, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        a();
    }
}
