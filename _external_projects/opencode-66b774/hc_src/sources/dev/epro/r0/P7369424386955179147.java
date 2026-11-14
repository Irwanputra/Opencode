package dev.epro.r0;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P7369424386955179147 implements F4096073349764486348 {
    public final /* synthetic */ String a;
    public final /* synthetic */ K2023750379864020554 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ W1972671267364756056 d;

    public P7369424386955179147(String str, K2023750379864020554 k2023750379864020554, boolean z, W1972671267364756056 w1972671267364756056) {
        this.a = str;
        this.b = k2023750379864020554;
        this.c = z;
        this.d = w1972671267364756056;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((Q16871679788547714558) obj).a;
        int K = D15445857918358799638.K(keyEvent);
        String str = this.a;
        if (K == 1 && (V1475975160983963926.E(keyEvent) || N6199192456012754706.a(S10823041268949770285.h(keyEvent.getKeyCode()), N6199192456012754706.q))) {
            boolean equals = str.equals("PrimaryEditable");
            K2023750379864020554 k2023750379864020554 = this.b;
            if (!equals) {
                k2023750379864020554.invoke();
            } else if (V1475975160983963926.E(keyEvent)) {
                k2023750379864020554.invoke();
                return Boolean.TRUE;
            }
        }
        boolean equals2 = str.equals("PrimaryEditable");
        W1972671267364756056 w1972671267364756056 = this.d;
        if (equals2 && this.c && (N6199192456012754706.a(S10823041268949770285.h(keyEvent.getKeyCode()), N6199192456012754706.p) || N6199192456012754706.a(S10823041268949770285.h(keyEvent.getKeyCode()), N6199192456012754706.e) || N6199192456012754706.a(S10823041268949770285.h(keyEvent.getKeyCode()), N6199192456012754706.d))) {
            Boolean bool = Boolean.TRUE;
            w1972671267364756056.setValue(bool);
            return bool;
        }
        Boolean bool2 = Boolean.FALSE;
        w1972671267364756056.setValue(bool2);
        return bool2;
    }
}
