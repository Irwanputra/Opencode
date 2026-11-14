package dev.epro.r0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N5230833122018532994 extends ViewGroup implements Q12881097977637718264, Y1249283782686518426, G13991919739136867102, S15634377979812012213 {
    public static final M14716691558468128220 A = new M14716691558468128220((byte) 23);
    public final P13832034982779129365 a;
    public final View b;
    public final Y633750919412282388 c;
    public B13729205492206812220 d;
    public boolean e;
    public B13729205492206812220 f;
    public B13729205492206812220 g;
    public I1722681268793429505 h;
    public F4096073349764486348 i;
    public R8540738700654750557 j;
    public F4096073349764486348 k;
    public I4293432593871965076 l;
    public F18341548724281518495 m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f388o;
    public N3121440022506799205 p;
    public F4096073349764486348 q;
    public final T1769843459973694375 r;
    public final T1769843459973694375 s;
    public F4096073349764486348 t;
    public final int[] u;
    public int v;
    public int w;
    public final T4688439319913777101 x;
    public boolean y;
    public final H11725168162114556860 z;

    public N5230833122018532994(Context context, N4308732927120516147 n4308732927120516147, int i, P13832034982779129365 p13832034982779129365, View view, Y633750919412282388 y633750919412282388) {
        super(context);
        this.a = p13832034982779129365;
        this.b = view;
        this.c = y633750919412282388;
        A4559761392562572984 a4559761392562572984 = B15311772965484989679.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, n4308732927120516147);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        E3889562084885881810 e3889562084885881810 = (E3889562084885881810) this;
        J15465836106018140777 j15465836106018140777 = new J15465836106018140777(e3889562084885881810, b);
        WeakHashMap weakHashMap = W10240872260424387225.a;
        Q12598757537405990809.a(this, j15465836106018140777);
        Q5747078841744593420.c(this, this);
        this.d = new G5865513469313204166((byte) 12);
        this.f = new G5865513469313204166((byte) 13);
        this.g = new G5865513469313204166((byte) 14);
        V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
        this.h = v10993962107938880611;
        this.j = Z1953481206310471956.e();
        this.n = new int[2];
        this.f388o = 0L;
        this.r = new T1769843459973694375(e3889562084885881810, b);
        byte b2 = 1;
        this.s = new T1769843459973694375(e3889562084885881810, b2);
        this.u = new int[2];
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = new T4688439319913777101();
        H11725168162114556860 h11725168162114556860 = new H11725168162114556860(3);
        h11725168162114556860.f262o = e3889562084885881810;
        I1722681268793429505 i1722681268793429505B = J11170665878571083300.b(C9869900372345142877.O(v10993962107938880611, Q13169198992966610970.a, p13832034982779129365), true, new M14716691558468128220((byte) 24));
        I17687524211334993649 i17687524211334993649 = new I17687524211334993649();
        i17687524211334993649.a = new K15228821986458594157(e3889562084885881810, (byte) 2);
        L13891208534469225493 l13891208534469225493 = new L13891208534469225493();
        L13891208534469225493 l138912085344692254932 = i17687524211334993649.b;
        if (l138912085344692254932 != null) {
            l138912085344692254932.b = null;
        }
        i17687524211334993649.b = l13891208534469225493;
        l13891208534469225493.b = i17687524211334993649;
        setOnRequestDisallowInterceptTouchEvent$ui(l13891208534469225493);
        I1722681268793429505 i1722681268793429505Q0 = O4077903568229246.H(Z1953481206310471956.E(i1722681268793429505B.Q0(i17687524211334993649), new C2148711509933735908(e3889562084885881810, h11725168162114556860, e3889562084885881810, (byte) 3)), new P7557951149941010979(e3889562084885881810, h11725168162114556860, b)).Q0(new J13574949786117738215(new K15228821986458594157(e3889562084885881810, (byte) 0)));
        h11725168162114556860.e0(this.h.Q0(i1722681268793429505Q0));
        this.i = new J7403353095371830496(h11725168162114556860, i1722681268793429505Q0, (byte) 6);
        h11725168162114556860.a0(this.j);
        this.k = new A6662317080022852970(h11725168162114556860, (byte) 11);
        h11725168162114556860.M = new P7557951149941010979(e3889562084885881810, h11725168162114556860, b2);
        h11725168162114556860.N = new K15228821986458594157(e3889562084885881810, (byte) 1);
        h11725168162114556860.d0(new P8538500188838604375(e3889562084885881810, h11725168162114556860));
        this.z = h11725168162114556860;
    }

    private final B4499109999593241705 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            P753981624812481271.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((S7974369370986781936) this.c).getSnapshotObserver();
    }

    public static Z1975157152518754667 j(Z1975157152518754667 z1975157152518754667, int i, int i2, int i3, int i4) {
        int i5 = z1975157152518754667.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = z1975157152518754667.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = z1975157152518754667.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = z1975157152518754667.d - i4;
        return Z1975157152518754667.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int l(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(W7808703833045379622.q(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final void m(E3889562084885881810 e3889562084885881810) {
        if (e3889562084885881810.e && e3889562084885881810.isAttachedToWindow() && e3889562084885881810.b.getParent() == e3889562084885881810) {
            B4499109999593241705 snapshotObserver = e3889562084885881810.getSnapshotObserver();
            snapshotObserver.a.d(e3889562084885881810, A, e3889562084885881810.d);
        }
    }

    @Override // dev.epro.r0.G13991919739136867102
    public final boolean L() {
        return isAttachedToWindow();
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void a(View view, View view2, int i, int i2) {
        T4688439319913777101 t4688439319913777101 = this.x;
        if (i2 == 1) {
            t4688439319913777101.b = i;
        } else {
            t4688439319913777101.a = i;
        }
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void b(View view, int i) {
        T4688439319913777101 t4688439319913777101 = this.x;
        if (i == 1) {
            t4688439319913777101.b = 0;
        } else {
            t4688439319913777101.a = 0;
        }
    }

    @Override // dev.epro.r0.Q12881097977637718264
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            P4333784458766463545 p4333784458766463545 = this.a.a;
            P4333784458766463545 p4333784458766463545I1 = p4333784458766463545 != null ? p4333784458766463545.i1() : null;
            long jC0 = p4333784458766463545I1 != null ? p4333784458766463545I1.c0(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = T18016951143603335921.Z(Float.intBitsToFloat((int) (jC0 >> 32))) * (-1);
            iArr[1] = T18016951143603335921.Z(Float.intBitsToFloat((int) (jC0 & 4294967295L))) * (-1);
        }
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void d(int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            P4333784458766463545 p4333784458766463545 = this.a.a;
            P4333784458766463545 p4333784458766463545I1 = p4333784458766463545 != null ? p4333784458766463545.i1() : null;
            long jG0 = p4333784458766463545I1 != null ? p4333784458766463545I1.G0(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = T18016951143603335921.Z(Float.intBitsToFloat((int) (jG0 >> 32))) * (-1);
            iArr[1] = T18016951143603335921.Z(Float.intBitsToFloat((int) (jG0 & 4294967295L))) * (-1);
        }
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            P4333784458766463545 p4333784458766463545 = this.a.a;
            P4333784458766463545 p4333784458766463545I1 = p4333784458766463545 != null ? p4333784458766463545.i1() : null;
            if (p4333784458766463545I1 != null) {
                p4333784458766463545I1.c0(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // dev.epro.r0.Y1249283782686518426
    public final void f() {
        this.g.invoke();
    }

    @Override // dev.epro.r0.Y1249283782686518426
    public final void g() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.u;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final R8540738700654750557 getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final H11725168162114556860 getLayoutNode() {
        return this.z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final I4293432593871965076 getLifecycleOwner() {
        return this.l;
    }

    public final I1722681268793429505 getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        T4688439319913777101 t4688439319913777101 = this.x;
        return t4688439319913777101.b | t4688439319913777101.a;
    }

    public final F4096073349764486348 getOnDensityChanged$ui() {
        return this.k;
    }

    public final F4096073349764486348 getOnModifierChanged$ui() {
        return this.i;
    }

    public final F4096073349764486348 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.t;
    }

    public final B13729205492206812220 getRelease() {
        return this.g;
    }

    public final B13729205492206812220 getReset() {
        return this.f;
    }

    public final F18341548724281518495 getSavedStateRegistryOwner() {
        return this.m;
    }

    public final B13729205492206812220 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    @Override // dev.epro.r0.S15634377979812012213
    public final N3121440022506799205 h(View view, N3121440022506799205 n3121440022506799205) {
        this.p = new N3121440022506799205(n3121440022506799205);
        return k(n3121440022506799205);
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final boolean i(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.y) {
            this.z.C();
            return null;
        }
        this.b.postOnAnimation(new S6873153560207725378(this.s, (byte) 4));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    public final N3121440022506799205 k(N3121440022506799205 n3121440022506799205) {
        J11937375245988738237 j11937375245988738237 = n3121440022506799205.a;
        Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(-1);
        Z1975157152518754667 z1975157152518754667 = Z1975157152518754667.e;
        if (!z1975157152518754667I.equals(z1975157152518754667) || !j11937375245988738237.j(-9).equals(z1975157152518754667) || j11937375245988738237.h() != null) {
            I16141028645763443416 i16141028645763443416 = (I16141028645763443416) this.z.F.d;
            if (i16141028645763443416.c0.n) {
                long jO = V1475975160983963926.O(i16141028645763443416.O(0L));
                int i = (int) (jO >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jO & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jN = V12319504402545346730.z(i16141028645763443416).N();
                int i3 = (int) (jN >> 32);
                int i4 = (int) (jN & 4294967295L);
                long j = i16141028645763443416.c;
                long jO2 = V1475975160983963926.O(i16141028645763443416.O((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jO2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jO2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return n3121440022506799205.a.r(i, i2, i5, i7);
                }
            }
        }
        return n3121440022506799205;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.y) {
            this.z.C();
        } else {
            this.b.postOnAnimation(new S6873153560207725378(this.s, (byte) 4));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.v = i;
        this.w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        R7033599853981556291.E(this.a.c(), null, null, new P12000499401830314897(z, this, T3224757362656795885.a(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        R7033599853981556291.E(this.a.c(), null, null, new H1843233428029030203((byte) 0, T3224757362656795885.a(f * (-1.0f), f2 * (-1.0f)), null, this), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        F4096073349764486348 f4096073349764486348 = this.q;
        if (f4096073349764486348 == null) {
            return true;
        }
        f4096073349764486348.invoke(rect != null ? new S6349823729575121924(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        F4096073349764486348 f4096073349764486348 = this.t;
        if (f4096073349764486348 != null) {
            f4096073349764486348.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(R8540738700654750557 r8540738700654750557) {
        if (r8540738700654750557 != this.j) {
            this.j = r8540738700654750557;
            F4096073349764486348 f4096073349764486348 = this.k;
            if (f4096073349764486348 != null) {
                f4096073349764486348.invoke(r8540738700654750557);
            }
        }
    }

    public final void setLifecycleOwner(I4293432593871965076 i4293432593871965076) {
        if (i4293432593871965076 != this.l) {
            this.l = i4293432593871965076;
            setTag(R.id.view_tree_lifecycle_owner, i4293432593871965076);
        }
    }

    public final void setModifier(I1722681268793429505 i1722681268793429505) {
        if (i1722681268793429505 != this.h) {
            this.h = i1722681268793429505;
            F4096073349764486348 f4096073349764486348 = this.i;
            if (f4096073349764486348 != null) {
                f4096073349764486348.invoke(i1722681268793429505);
            }
        }
    }

    public final void setOnDensityChanged$ui(F4096073349764486348 f4096073349764486348) {
        this.k = f4096073349764486348;
    }

    public final void setOnModifierChanged$ui(F4096073349764486348 f4096073349764486348) {
        this.i = f4096073349764486348;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(F4096073349764486348 f4096073349764486348) {
        this.t = f4096073349764486348;
    }

    public final void setRelease(B13729205492206812220 b13729205492206812220) {
        this.g = b13729205492206812220;
    }

    public final void setReset(B13729205492206812220 b13729205492206812220) {
        this.f = b13729205492206812220;
    }

    public final void setSavedStateRegistryOwner(F18341548724281518495 f18341548724281518495) {
        if (f18341548724281518495 != this.m) {
            this.m = f18341548724281518495;
            setTag(R.id.view_tree_saved_state_registry_owner, f18341548724281518495);
        }
    }

    public final void setUpdate(B13729205492206812220 b13729205492206812220) {
        this.d = b13729205492206812220;
        this.e = true;
        this.r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
