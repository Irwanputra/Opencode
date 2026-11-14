package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class R15896830329318850690 implements R16749699847173633337 {
    public A2789795882633926065 b;
    public int c;
    public R15896830329318850690 e;
    public R15896830329318850690 f;
    public F9846267855282604745 g;
    public Y4989033692226475498 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public O9814524300768724052 m;
    public boolean n;
    public R15896830329318850690 a = this;
    public int d = -1;

    public final W5797197595347441198 V0() {
        A2789795882633926065 a2789795882633926065 = this.b;
        if (a2789795882633926065 != null) {
            return a2789795882633926065;
        }
        A2789795882633926065 a = O8620973563946607355.a(((S7974369370986781936) R7033599853981556291.S(this)).getCoroutineContext().plus(new R5692663580087387669((Q15035754882231748864) ((S7974369370986781936) R7033599853981556291.S(this)).getCoroutineContext().get(P2382941533350862833.p))));
        this.b = a;
        return a;
    }

    public boolean W0() {
        return !(this instanceof S6869171442060498809);
    }

    public void X0() {
        if (this.n) {
            P753981624812481271.b("node attached multiple times");
        }
        if (this.h == null) {
            P753981624812481271.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void Y0() {
        if (!this.n) {
            P753981624812481271.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            P753981624812481271.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            P753981624812481271.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        A2789795882633926065 a2789795882633926065 = this.b;
        if (a2789795882633926065 != null) {
            O8620973563946607355.s(a2789795882633926065, new D5264459092429484358("The Modifier.Node was detached", (byte) 2));
            this.b = null;
        }
    }

    public void c1() {
        if (!this.n) {
            P753981624812481271.b("reset() called on an unattached node");
        }
        b1();
    }

    public void d1() {
        if (!this.n) {
            P753981624812481271.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            P753981624812481271.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        Z0();
        this.l = true;
    }

    public void e1() {
        if (!this.n) {
            P753981624812481271.b("node detached multiple times");
        }
        if (this.h == null) {
            P753981624812481271.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            P753981624812481271.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        O9814524300768724052 o9814524300768724052 = this.m;
        if (o9814524300768724052 != null) {
            o9814524300768724052.invoke();
        }
        a1();
    }

    public void f1(R15896830329318850690 r15896830329318850690) {
        this.a = r15896830329318850690;
    }

    public void g1(Y4989033692226475498 y4989033692226475498) {
        this.h = y4989033692226475498;
    }

    public void Z0() {
    }

    public void a1() {
    }

    public void b1() {
    }
}
