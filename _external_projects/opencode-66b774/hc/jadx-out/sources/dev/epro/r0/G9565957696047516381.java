package dev.epro.r0;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G9565957696047516381 extends R15896830329318850690 implements L8868179755883210313, T11401768751197276141, K4700587928988752109, D10205225622993155321, S16154245747709621665 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A6662317080022852970 f260o = new A6662317080022852970(this, (byte) 7);
    public final /* synthetic */ S7974369370986781936 p;

    public G9565957696047516381(S7974369370986781936 s7974369370986781936) {
        this.p = s7974369370986781936;
    }

    @Override // dev.epro.r0.L8868179755883210313
    public final Object C(Y4989033692226475498 y4989033692226475498, D16945471218061474327 d16945471218061474327, K14749510448791472029 k14749510448791472029) {
        long jO = y4989033692226475498.O(0L);
        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) d16945471218061474327.invoke();
        S6349823729575121924 s6349823729575121924K = s6349823729575121924 != null ? s6349823729575121924.k(jO) : null;
        if (s6349823729575121924K != null) {
            this.p.requestRectangleOnScreen(new Rect((int) s6349823729575121924K.a, (int) s6349823729575121924K.b, (int) s6349823729575121924K.c, (int) s6349823729575121924K.d), false);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        return i5164649337253478959.t(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, this.f260o, new Y17164194448930251553(z17471428274427141949D, (byte) 0));
    }

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean j0(KeyEvent keyEvent) {
        A2608878181351957686 a2608878181351957686;
        int[] iArr = U13290528641708548929.a;
        long J = D15445857918358799638.J(keyEvent);
        if (N6199192456012754706.a(J, N6199192456012754706.b)) {
            a2608878181351957686 = new A2608878181351957686(2);
        } else if (N6199192456012754706.a(J, N6199192456012754706.c)) {
            a2608878181351957686 = new A2608878181351957686(1);
        } else if (N6199192456012754706.a(J, N6199192456012754706.p)) {
            a2608878181351957686 = new A2608878181351957686(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            a2608878181351957686 = N6199192456012754706.a(J, N6199192456012754706.g) ? new A2608878181351957686(4) : N6199192456012754706.a(J, N6199192456012754706.f) ? new A2608878181351957686(3) : (N6199192456012754706.a(J, N6199192456012754706.d) || N6199192456012754706.a(J, N6199192456012754706.C)) ? new A2608878181351957686(5) : (N6199192456012754706.a(J, N6199192456012754706.e) || N6199192456012754706.a(J, N6199192456012754706.D)) ? new A2608878181351957686(6) : (N6199192456012754706.a(J, N6199192456012754706.h) || N6199192456012754706.a(J, N6199192456012754706.r) || N6199192456012754706.a(J, N6199192456012754706.E)) ? new A2608878181351957686(7) : (N6199192456012754706.a(J, N6199192456012754706.a) || N6199192456012754706.a(J, N6199192456012754706.u)) ? new A2608878181351957686(8) : null;
        }
        if (a2608878181351957686 != null) {
            int i = a2608878181351957686.a;
            if (D15445857918358799638.K(keyEvent) == 2) {
                S7974369370986781936 s7974369370986781936 = this.p;
                J9638579967056948799 j9638579967056948799G = ((D10236220797215130727) s7974369370986781936.getFocusOwner()).g();
                if (j9638579967056948799G != null && j9638579967056948799G.f321o && s7974369370986781936.x(i)) {
                    s7974369370986781936.getPlayNavigationSoundEffect$ui().invoke(a2608878181351957686, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolF = ((D10236220797215130727) s7974369370986781936.getFocusOwner()).f(i, s7974369370986781936.getEmbeddedViewFocusRect(), new A6662317080022852970(a2608878181351957686, (byte) 6));
                if (boolF == null) {
                    return true;
                }
                if (boolF.booleanValue()) {
                    s7974369370986781936.getPlayNavigationSoundEffect$ui().invoke(a2608878181351957686, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numC = U13290528641708548929.c(i);
                int iIntValue = numC != null ? numC.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = s7974369370986781936.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, s7974369370986781936.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(s7974369370986781936)) {
                    return ((D10236220797215130727) s7974369370986781936.getFocusOwner()).i(i);
                }
            }
        }
        return false;
    }

    @Override // dev.epro.r0.K4700587928988752109
    public final boolean p(KeyEvent keyEvent) {
        return false;
    }

    @Override // dev.epro.r0.S16154245747709621665
    public final Object u() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
    }
}
