package dev.epro.r0;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O10311700946806650263 extends O10944101174480148852 {
    public static final J12623741444539852712 D = new J12623741444539852712((byte) 8);
    public final V697849047308847220 A;
    public boolean B;
    public final int[] C;
    public B13729205492206812220 j;
    public R6081921892807856809 k;
    public String l;
    public final View m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J3301701597851028733 f393o;
    public final WindowManager p;
    public final WindowManager.LayoutParams q;
    public A13182230205880306765 r;
    public F10342546226345611902 s;
    public final V697849047308847220 t;
    public final V697849047308847220 u;
    public I11366018238968599357 v;
    public final B4739506393801054036 w;
    public final Rect x;
    public final O1149508413621311762 y;
    public J614522193061423954 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O10311700946806650263(B13729205492206812220 b13729205492206812220, R6081921892807856809 r6081921892807856809, String str, View view, R8540738700654750557 r8540738700654750557, A13182230205880306765 a13182230205880306765, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        byte b = 20;
        J3301701597851028733 p8215077639927470186 = i >= 30 ? new P8215077639927470186(b) : i >= 29 ? new F4129676524704143290(b) : new J3301701597851028733(b);
        this.j = b13729205492206812220;
        this.k = r6081921892807856809;
        this.l = str;
        this.m = view;
        this.n = z;
        this.f393o = p8215077639927470186;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.p = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        R6081921892807856809 r60819218928078568092 = this.k;
        boolean zB = W10645948712581465792.b(view);
        boolean z2 = r60819218928078568092.b;
        int i2 = r60819218928078568092.a;
        if (z2 && zB) {
            i2 |= 8192;
        } else if (z2 && !zB) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.k.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.q = layoutParams;
        this.r = a13182230205880306765;
        this.s = F10342546226345611902.a;
        this.t = V4416135141588678913.t(null);
        this.u = V4416135141588678913.t(null);
        this.w = Z3658309082448601011.b(new W2269277550458425547(this, (byte) 28));
        this.x = new Rect();
        this.y = new O1149508413621311762(new Q4448715364276398931(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, U8836654130139556418.m(view));
        setTag(R.id.view_tree_view_model_store_owner, E10717724117948616506.k(view));
        setTag(R.id.view_tree_saved_state_registry_owner, C468629748621011703.h(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(r8540738700654750557.K(8.0f));
        setOutlineProvider(new U6068910839918238195((byte) 2));
        this.A = V4416135141588678913.t(S10823041268949770285.b);
        this.C = new int[2];
    }

    private final L12639328004344855510 getContent() {
        return (L12639328004344855510) this.A.getValue();
    }

    private final I11366018238968599357 getDisplayBounds() {
        int i = this.k.a & 512;
        View view = this.m;
        Rect rect = this.x;
        J3301701597851028733 j3301701597851028733 = this.f393o;
        if (i == 0) {
            j3301701597851028733.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            j3301701597851028733.x(view, rect);
        }
        return new I11366018238968599357(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final B1029012102904255937 getParentLayoutCoordinates() {
        return (B1029012102904255937) this.u.getValue();
    }

    public static final boolean m(O10311700946806650263 o10311700946806650263) {
        B1029012102904255937 parentLayoutCoordinates = o10311700946806650263.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.C()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || o10311700946806650263.m20getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(L12639328004344855510 l12639328004344855510) {
        this.A.setValue(l12639328004344855510);
    }

    private final void setParentLayoutCoordinates(B1029012102904255937 b1029012102904255937) {
        this.u.setValue(b1029012102904255937);
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final void a(int i, M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.b0(-857613600);
        int i2 = (m3727281027331139839.h(this) ? 4 : 2) | i;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new Q15027034467569330017(this, i, (byte) 11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.k.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                B13729205492206812220 b13729205492206812220 = this.j;
                if (b13729205492206812220 != null) {
                    b13729205492206812220.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final void g(int i, int i2, int i3, int i4, boolean z) {
        super.g(i, i2, i3, i4, z);
        this.k.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.q;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f393o.getClass();
        this.p.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.q;
    }

    public final F10342546226345611902 getParentLayoutDirection() {
        return this.s;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final Q13254524308163418711 m20getPopupContentSizebOM6tXw() {
        return (Q13254524308163418711) this.t.getValue();
    }

    public final A13182230205880306765 getPositionProvider() {
        return this.r;
    }

    @Override // dev.epro.r0.O10944101174480148852
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.B;
    }

    public final String getTestTag() {
        return this.l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final void i(int i, int i2) {
        this.k.getClass();
        I11366018238968599357 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(Y5209789131793062978 y5209789131793062978, L12639328004344855510 l12639328004344855510) {
        setParentCompositionContext(y5209789131793062978);
        setContent(l12639328004344855510);
        this.B = true;
    }

    public final void o(B13729205492206812220 b13729205492206812220, R6081921892807856809 r6081921892807856809, String str, F10342546226345611902 f10342546226345611902) {
        int i;
        this.j = b13729205492206812220;
        this.l = str;
        if (!S10823041268949770285.t(this.k, r6081921892807856809)) {
            r6081921892807856809.getClass();
            this.k = r6081921892807856809;
            boolean zB = W10645948712581465792.b(this.m);
            boolean z = r6081921892807856809.b;
            int i2 = r6081921892807856809.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.q;
            layoutParams.flags = i2;
            this.f393o.getClass();
            this.p.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = f10342546226345611902.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                Z3383101362411723454.g();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // dev.epro.r0.O10944101174480148852, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.e();
        if (!this.k.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        J614522193061423954 j614522193061423954 = this.z;
        if (j614522193061423954 == null) {
            J614522193061423954 j6145221930614239542 = new J614522193061423954(this.j, (byte) 0);
            this.z = j6145221930614239542;
            j614522193061423954 = j6145221930614239542;
        }
        T3623367008917729099.l(this, j614522193061423954);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O1149508413621311762 o1149508413621311762 = this.y;
        L4980660535418402690 l4980660535418402690 = o1149508413621311762.h;
        if (l4980660535418402690 != null) {
            l4980660535418402690.d();
        }
        o1149508413621311762.a();
        if (Build.VERSION.SDK_INT >= 33) {
            T3623367008917729099.m(this, this.z);
        }
        this.z = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            B13729205492206812220 b13729205492206812220 = this.j;
            if (b13729205492206812220 != null) {
                b13729205492206812220.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            B13729205492206812220 b137292054922068122202 = this.j;
            if (b137292054922068122202 != null) {
                b137292054922068122202.invoke();
            }
        }
        return true;
    }

    public final void p() {
        B1029012102904255937 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.C()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jN = parentLayoutCoordinates.N();
            long jB = this.n ? parentLayoutCoordinates.b(0L) : parentLayoutCoordinates.j(0L);
            I11366018238968599357 i11366018238968599357K = C775827382551829194.k((((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L))))), jN);
            if (i11366018238968599357K.equals(this.v)) {
                return;
            }
            this.v = i11366018238968599357K;
            r();
        }
    }

    public final void q(B1029012102904255937 b1029012102904255937) {
        setParentLayoutCoordinates(b1029012102904255937);
        p();
    }

    public final void r() {
        Q13254524308163418711 q13254524308163418711M20getPopupContentSizebOM6tXw;
        final I11366018238968599357 i11366018238968599357 = this.v;
        if (i11366018238968599357 == null || (q13254524308163418711M20getPopupContentSizebOM6tXw = m20getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = q13254524308163418711M20getPopupContentSizebOM6tXw.a;
        I11366018238968599357 displayBounds = getDisplayBounds();
        final long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        final X4418276304150334445 x4418276304150334445 = new X4418276304150334445();
        x4418276304150334445.a = 0L;
        this.y.d(this, D, new B13729205492206812220() { // from class: dev.epro.r0.P14589850353218877945
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                O10311700946806650263 o10311700946806650263 = this;
                x4418276304150334445.a = o10311700946806650263.r.k(i11366018238968599357, jB, o10311700946806650263.s, j);
                return O9245300239821758723.a;
            }
        });
        long j2 = x4418276304150334445.a;
        WindowManager.LayoutParams layoutParams = this.q;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.k.e;
        J3301701597851028733 j3301701597851028733 = this.f393o;
        if (z) {
            j3301701597851028733.z(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        j3301701597851028733.getClass();
        this.p.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(F10342546226345611902 f10342546226345611902) {
        this.s = f10342546226345611902;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m21setPopupContentSizefhxjrPA(Q13254524308163418711 q13254524308163418711) {
        this.t.setValue(q13254524308163418711);
    }

    public final void setPositionProvider(A13182230205880306765 a13182230205880306765) {
        this.r = a13182230205880306765;
    }

    public final void setTestTag(String str) {
        this.l = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public O10944101174480148852 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
