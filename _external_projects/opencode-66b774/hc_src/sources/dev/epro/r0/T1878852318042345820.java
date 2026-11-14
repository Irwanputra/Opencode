package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T1878852318042345820 implements U13539487668147601899 {
    public final Context a;
    public Context b;
    public T8605657386197958581 c;
    public final LayoutInflater d;
    public C546526958440023066 e;
    public G184438488898427898 h;
    public D18165525574842162311 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f503o;
    public int p;
    public boolean q;
    public H10500197361170225543 s;
    public H10500197361170225543 t;
    public I3863025946240164840 u;
    public T432659191337924804 v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final H12843822278061842084 w = new H12843822278061842084((Object) this, (byte) 7);

    public T1878852318042345820(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void a(T8605657386197958581 t8605657386197958581, boolean z) {
        e();
        H10500197361170225543 h10500197361170225543 = this.t;
        if (h10500197361170225543 != null && h10500197361170225543.b()) {
            h10500197361170225543.i.dismiss();
        }
        C546526958440023066 c546526958440023066 = this.e;
        if (c546526958440023066 != null) {
            c546526958440023066.a(t8605657386197958581, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [dev.epro.r0.G16868612739316221327] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(I4217019646703278835 i4217019646703278835, View view, ViewGroup viewGroup) {
        View actionView = i4217019646703278835.getActionView();
        if (actionView == null || i4217019646703278835.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof G16868612739316221327 ? (G16868612739316221327) view : (G16868612739316221327) this.d.inflate(this.g, viewGroup, false);
            actionMenuItemView.a(i4217019646703278835);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            T432659191337924804 t432659191337924804 = this.v;
            if (t432659191337924804 == null) {
                t432659191337924804 = new T432659191337924804(this);
                this.v = t432659191337924804;
            }
            actionMenuItemView2.setPopupCallback(t432659191337924804);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(i4217019646703278835.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof F13271443510022614086)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.U13539487668147601899
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            T8605657386197958581 t8605657386197958581 = this.c;
            if (t8605657386197958581 != null) {
                t8605657386197958581.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    I4217019646703278835 i4217019646703278835 = (I4217019646703278835) l.get(i2);
                    if ((i4217019646703278835.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        I4217019646703278835 itemData = childAt instanceof G16868612739316221327 ? ((G16868612739316221327) childAt).getItemData() : null;
                        View b = b(i4217019646703278835, childAt, viewGroup);
                        if (i4217019646703278835 != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.h).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        T8605657386197958581 t86056573861979585812 = this.c;
        if (t86056573861979585812 != null) {
            t86056573861979585812.i();
            ArrayList arrayList2 = t86056573861979585812.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                M12354959812914331817 m12354959812914331817 = ((I4217019646703278835) arrayList2.get(i3)).A;
            }
        }
        T8605657386197958581 t86056573861979585813 = this.c;
        if (t86056573861979585813 != null) {
            t86056573861979585813.i();
            arrayList = t86056573861979585813.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((I4217019646703278835) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        D18165525574842162311 d18165525574842162311 = this.i;
        if (z) {
            if (d18165525574842162311 == null) {
                d18165525574842162311 = new D18165525574842162311(this, this.a);
                this.i = d18165525574842162311;
            }
            ViewGroup viewGroup3 = (ViewGroup) d18165525574842162311.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                D18165525574842162311 d181655255748421623112 = this.i;
                actionMenuView.getClass();
                F13271443510022614086 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(d181655255748421623112, i4);
            }
        } else if (d18165525574842162311 != null) {
            Object parent = d18165525574842162311.getParent();
            Object obj = this.h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void d(Context context, T8605657386197958581 t8605657386197958581) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = t8605657386197958581;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int i4 = this.n;
        if (this.l) {
            if (this.i == null) {
                D18165525574842162311 d18165525574842162311 = new D18165525574842162311(this, this.a);
                this.i = d18165525574842162311;
                if (this.k) {
                    d18165525574842162311.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f503o = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean e() {
        Object obj;
        I3863025946240164840 i3863025946240164840 = this.u;
        if (i3863025946240164840 != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(i3863025946240164840);
            this.u = null;
            return true;
        }
        H10500197361170225543 h10500197361170225543 = this.s;
        if (h10500197361170225543 == null) {
            return false;
        }
        if (h10500197361170225543.b()) {
            h10500197361170225543.i.dismiss();
        }
        return true;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final void f(C546526958440023066 c546526958440023066) {
        throw null;
    }

    public final boolean g() {
        H10500197361170225543 h10500197361170225543 = this.s;
        return h10500197361170225543 != null && h10500197361170225543.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.U13539487668147601899
    public final boolean h(Q7493219842314740732 q7493219842314740732) {
        boolean z;
        if (q7493219842314740732.hasVisibleItems()) {
            Q7493219842314740732 q74932198423147407322 = q7493219842314740732;
            while (true) {
                T8605657386197958581 t8605657386197958581 = q74932198423147407322.z;
                if (t8605657386197958581 == this.c) {
                    break;
                }
                q74932198423147407322 = (Q7493219842314740732) t8605657386197958581;
            }
            I4217019646703278835 i4217019646703278835 = q74932198423147407322.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof G16868612739316221327) && ((G16868612739316221327) childAt).getItemData() == i4217019646703278835) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = q7493219842314740732.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = q7493219842314740732.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                H10500197361170225543 h10500197361170225543 = new H10500197361170225543(this, this.b, q7493219842314740732, view);
                this.t = h10500197361170225543;
                h10500197361170225543.g = z;
                C14538084604686194039 c14538084604686194039 = h10500197361170225543.i;
                if (c14538084604686194039 != null) {
                    c14538084604686194039.o(z);
                }
                H10500197361170225543 h105001973611702255432 = this.t;
                if (!h105001973611702255432.b()) {
                    if (h105001973611702255432.e == null) {
                        S10973172697741180971.m("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    h105001973611702255432.d(0, 0, false, false);
                }
                C546526958440023066 c546526958440023066 = this.e;
                if (c546526958440023066 != null) {
                    c546526958440023066.b(q7493219842314740732);
                }
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean i() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        T1878852318042345820 t1878852318042345820 = this;
        T8605657386197958581 t8605657386197958581 = t1878852318042345820.c;
        if (t8605657386197958581 != null) {
            arrayList = t8605657386197958581.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = t1878852318042345820.p;
        int i4 = t1878852318042345820.f503o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) t1878852318042345820.h;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            I4217019646703278835 i4217019646703278835 = (I4217019646703278835) arrayList.get(i5);
            int i8 = i4217019646703278835.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (t1878852318042345820.q && i4217019646703278835.C) {
                i3 = 0;
            }
            i5++;
        }
        if (t1878852318042345820.l && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = t1878852318042345820.r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            I4217019646703278835 i42170196467032788352 = (I4217019646703278835) arrayList.get(i10);
            int i12 = i42170196467032788352.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = i42170196467032788352.b;
            if (z3) {
                View b = t1878852318042345820.b(i42170196467032788352, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                i42170196467032788352.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = t1878852318042345820.b(i42170196467032788352, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        I4217019646703278835 i42170196467032788353 = (I4217019646703278835) arrayList.get(i14);
                        if (i42170196467032788353.b == i13) {
                            if ((i42170196467032788353.x & 32) == 32) {
                                i9++;
                            }
                            i42170196467032788353.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                i42170196467032788352.f(z5);
            } else {
                i42170196467032788352.f(false);
                i10++;
                i2 = 2;
                t1878852318042345820 = this;
                z = true;
            }
            i10++;
            i2 = 2;
            t1878852318042345820 = this;
            z = true;
        }
        return z;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean j(I4217019646703278835 i4217019646703278835) {
        return false;
    }

    @Override // dev.epro.r0.U13539487668147601899
    public final boolean k(I4217019646703278835 i4217019646703278835) {
        return false;
    }

    public final boolean l() {
        T8605657386197958581 t8605657386197958581;
        boolean z = false;
        if (this.l && !g() && (t8605657386197958581 = this.c) != null && this.h != null && this.u == null) {
            t8605657386197958581.i();
            if (!t8605657386197958581.j.isEmpty()) {
                I3863025946240164840 i3863025946240164840 = new I3863025946240164840((Object) this, (Object) new H10500197361170225543(this, this.b, this.c, this.i), z, (byte) 1);
                this.u = i3863025946240164840;
                ((View) this.h).post(i3863025946240164840);
                return true;
            }
        }
        return false;
    }
}
