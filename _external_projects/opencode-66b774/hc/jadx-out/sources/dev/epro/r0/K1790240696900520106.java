package dev.epro.r0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K1790240696900520106 extends R15896830329318850690 implements O15099455688051794795, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f329o;
    public final E7853974395886365834 p;
    public final E7853974395886365834 q;

    /* JADX WARN: Type inference failed for: r0v0, types: [dev.epro.r0.E7853974395886365834] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dev.epro.r0.E7853974395886365834] */
    public K1790240696900520106() {
        final byte b = 0;
        this.p = new F4096073349764486348(this) { // from class: dev.epro.r0.E7853974395886365834
            public final /* synthetic */ K1790240696900520106 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj) {
                byte b2 = b;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                K1790240696900520106 k1790240696900520106 = this.b;
                A2536033623645142779 a2536033623645142779 = (A2536033623645142779) obj;
                switch (b2) {
                    case 0:
                        View viewI = O8620973563946607355.I(k1790240696900520106);
                        if (!viewI.isFocused() && !viewI.hasFocus()) {
                            Y10761909198794972532 focusOwner = ((S7974369370986781936) R7033599853981556291.S(k1790240696900520106)).getFocusOwner();
                            View viewY = O5354877807466160604.Y(k1790240696900520106);
                            Integer numC = U13290528641708548929.c(a2536033623645142779.a);
                            int[] iArr = new int[2];
                            viewY.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewI.getLocationOnScreen(iArr2);
                            J9638579967056948799 j9638579967056948799S = B11964701839924937722.s(((D10236220797215130727) focusOwner).c);
                            Rect rect = null;
                            S6349823729575121924 s6349823729575121924U = j9638579967056948799S != null ? B11964701839924937722.u(j9638579967056948799S) : null;
                            if (s6349823729575121924U != null) {
                                int i = (int) s6349823729575121924U.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) s6349823729575121924U.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) s6349823729575121924U.c) + i2) - i3, (((int) s6349823729575121924U.d) + i5) - i6);
                            }
                            if (!U13290528641708548929.b(viewI, numC, rect)) {
                                a2536033623645142779.b = true;
                            }
                        }
                        break;
                    default:
                        O8620973563946607355.I(k1790240696900520106);
                        break;
                }
                return o9245300239821758723;
            }
        };
        final byte b2 = 1;
        this.q = new F4096073349764486348(this) { // from class: dev.epro.r0.E7853974395886365834
            public final /* synthetic */ K1790240696900520106 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj) {
                byte b22 = b2;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                K1790240696900520106 k1790240696900520106 = this.b;
                A2536033623645142779 a2536033623645142779 = (A2536033623645142779) obj;
                switch (b22) {
                    case 0:
                        View viewI = O8620973563946607355.I(k1790240696900520106);
                        if (!viewI.isFocused() && !viewI.hasFocus()) {
                            Y10761909198794972532 focusOwner = ((S7974369370986781936) R7033599853981556291.S(k1790240696900520106)).getFocusOwner();
                            View viewY = O5354877807466160604.Y(k1790240696900520106);
                            Integer numC = U13290528641708548929.c(a2536033623645142779.a);
                            int[] iArr = new int[2];
                            viewY.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewI.getLocationOnScreen(iArr2);
                            J9638579967056948799 j9638579967056948799S = B11964701839924937722.s(((D10236220797215130727) focusOwner).c);
                            Rect rect = null;
                            S6349823729575121924 s6349823729575121924U = j9638579967056948799S != null ? B11964701839924937722.u(j9638579967056948799S) : null;
                            if (s6349823729575121924U != null) {
                                int i = (int) s6349823729575121924U.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) s6349823729575121924U.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) s6349823729575121924U.c) + i2) - i3, (((int) s6349823729575121924U.d) + i5) - i6);
                            }
                            if (!U13290528641708548929.b(viewI, numC, rect)) {
                                a2536033623645142779.b = true;
                            }
                        }
                        break;
                    default:
                        O8620973563946607355.I(k1790240696900520106);
                        break;
                }
                return o9245300239821758723;
            }
        };
    }

    @Override // dev.epro.r0.O15099455688051794795
    public final void N(C13258628320776285546 c13258628320776285546) {
        c13258628320776285546.c(false);
        c13258628320776285546.e(this.p);
        c13258628320776285546.d(this.q);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        ViewTreeObserver viewTreeObserver = O5354877807466160604.Y(this).getViewTreeObserver();
        this.f329o = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        ViewTreeObserver viewTreeObserver = this.f329o;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f329o = null;
        O5354877807466160604.Y(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final J9638579967056948799 h1() {
        boolean z;
        if (!this.a.n) {
            P753981624812481271.b("visitLocalDescendants called on an unattached node");
        }
        R15896830329318850690 r15896830329318850690 = this.a;
        if ((r15896830329318850690.d & 1024) != 0) {
            boolean z2 = false;
            for (R15896830329318850690 r158968303293188506902 = r15896830329318850690.f; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                if ((r158968303293188506902.c & 1024) != 0) {
                    R15896830329318850690 r15896830329318850690M = r158968303293188506902;
                    D389890677992184566 d389890677992184566 = null;
                    while (r15896830329318850690M != null) {
                        if (r15896830329318850690M instanceof J9638579967056948799) {
                            J9638579967056948799 j9638579967056948799 = (J9638579967056948799) r15896830329318850690M;
                            if (z2) {
                                return j9638579967056948799;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (r15896830329318850690M.c & 1024) != 0 && (r15896830329318850690M instanceof J2215566372910931965)) {
                            int i = 0;
                            for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r15896830329318850690M).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                if ((r158968303293188506903.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r15896830329318850690M = r158968303293188506903;
                                    } else {
                                        if (d389890677992184566 == null) {
                                            d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (r15896830329318850690M != null) {
                                            d389890677992184566.b(r15896830329318850690M);
                                            r15896830329318850690M = null;
                                        }
                                        d389890677992184566.b(r158968303293188506903);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        r15896830329318850690M = R7033599853981556291.M(d389890677992184566);
                    }
                }
            }
        }
        S10973172697741180971.m("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (R7033599853981556291.R(this).n == null) {
            return;
        }
        View viewI = O8620973563946607355.I(this);
        Y10761909198794972532 focusOwner = ((S7974369370986781936) R7033599853981556291.S(this)).getFocusOwner();
        Y633750919412282388 y633750919412282388S = R7033599853981556291.S(this);
        boolean z2 = true;
        if (view == null || view.equals(y633750919412282388S)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewI.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(y633750919412282388S)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewI.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            J9638579967056948799 j9638579967056948799H1 = h1();
            if (j9638579967056948799H1.m1().a()) {
                return;
            }
            V12319504402545346730.S(j9638579967056948799H1);
            return;
        }
        if (z && h1().m1().b()) {
            ((D10236220797215130727) focusOwner).c(8, false, false);
        }
    }
}
