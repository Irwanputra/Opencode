package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.C1546;
import p034.p086.p087.p088.InterfaceC1513;
import p034.p086.p090.C1566;
import p034.p086.p090.C1574;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public View[] f840;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int[] f841;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f842;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f843;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC1513 f844;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f845;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Context f846;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public HashMap<Integer, String> f847;

    public ConstraintHelper(Context context) {
        super(context);
        this.f841 = new int[32];
        this.f840 = null;
        this.f847 = new HashMap<>();
        this.f846 = context;
        mo252(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f841 = new int[32];
        this.f840 = null;
        this.f847 = new HashMap<>();
        this.f846 = context;
        mo252(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f841 = new int[32];
        this.f840 = null;
        this.f847 = new HashMap<>();
        this.f846 = context;
        mo252(attributeSet);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f841, this.f843);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f845;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f842;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f845 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f843 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m303(str.substring(i));
                return;
            } else {
                m303(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f842 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f843 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m299(str.substring(i));
                return;
            } else {
                m299(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f845 = null;
        this.f843 = 0;
        for (int i : iArr) {
            m304(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f845 == null) {
            m304(i);
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m298() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f843; i++) {
            View m315 = constraintLayout.m315(this.f841[i]);
            if (m315 != null) {
                m315.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m315.setTranslationZ(m315.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m299(String str) {
        if (str == null || str.length() == 0 || this.f846 == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f899)) {
                if (childAt.getId() == -1) {
                    childAt.getClass().getSimpleName();
                } else {
                    m304(childAt.getId());
                }
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int m300(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m312 = constraintLayout.m312(0, str);
            if (m312 instanceof Integer) {
                i = ((Integer) m312).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m306(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C1574.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f846.getResources().getIdentifier(str, "id", this.f846.getPackageName()) : i;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void m301() {
    }

    /* renamed from: ぉざぅち〻 */
    public void mo255(ConstraintLayout constraintLayout) {
    }

    /* renamed from: おぐぴう〸ず */
    public void mo256(ConstraintLayout constraintLayout) {
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m302(InterfaceC1513 interfaceC1513, SparseArray sparseArray) {
        interfaceC1513.mo3310();
        for (int i = 0; i < this.f843; i++) {
            interfaceC1513.mo3311((C1544) sparseArray.get(this.f841[i]));
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m303(String str) {
        if (str == null || str.length() == 0 || this.f846 == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m300 = m300(trim);
        if (m300 != 0) {
            this.f847.put(Integer.valueOf(m300), trim);
            m304(m300);
        }
    }

    /* renamed from: てぜきぽく */
    public void mo252(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f845 = string;
                    setIds(string);
                } else if (index == C1575.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f842 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m304(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f843 + 1;
        int[] iArr = this.f841;
        if (i2 > iArr.length) {
            this.f841 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f841;
        int i3 = this.f843;
        iArr2[i3] = i;
        this.f843 = i3 + 1;
    }

    /* renamed from: のぷのちつ */
    public void mo253(C1566.C1569 c1569, C1546 c1546, ConstraintLayout.LayoutParams layoutParams, SparseArray<C1544> sparseArray) {
        C1566.C1567 c1567 = c1569.f7427;
        int[] iArr = c1567.f7403;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c1567.f7352;
            if (str != null && str.length() > 0) {
                C1566.C1567 c15672 = c1569.f7427;
                String[] split = c15672.f7352.split(",");
                getContext();
                int[] iArr2 = new int[split.length];
                int i2 = 0;
                for (String str2 : split) {
                    int m300 = m300(str2.trim());
                    if (m300 != 0) {
                        iArr2[i2] = m300;
                        i2++;
                    }
                }
                if (i2 != split.length) {
                    iArr2 = Arrays.copyOf(iArr2, i2);
                }
                c15672.f7403 = iArr2;
            }
        }
        c1546.mo3310();
        if (c1569.f7427.f7403 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = c1569.f7427.f7403;
            if (i >= iArr3.length) {
                return;
            }
            C1544 c1544 = sparseArray.get(iArr3[i]);
            if (c1544 != null) {
                c1546.mo3311(c1544);
            }
            i++;
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m305() {
        if (this.f844 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f923 = (C1544) this.f844;
        }
    }

    /* renamed from: へぬ〴づぞ */
    public void mo254(C1544 c1544, boolean z) {
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int m306(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f846.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public View[] m307(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f840;
        if (viewArr == null || viewArr.length != this.f843) {
            this.f840 = new View[this.f843];
        }
        for (int i = 0; i < this.f843; i++) {
            this.f840[i] = constraintLayout.m315(this.f841[i]);
        }
        return this.f840;
    }
}
