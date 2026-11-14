package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class N5930730792661905599 extends A8269341136279542501 {
    public final F1048562484897106753 a;
    public final I2076339260272013590 b;
    public final L9852841107405549527 c;

    public N5930730792661905599(F1048562484897106753 f1048562484897106753, I2076339260272013590 i2076339260272013590, L9852841107405549527 l9852841107405549527) {
        this.a = f1048562484897106753;
        this.b = i2076339260272013590;
        this.c = l9852841107405549527;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new T9348890437393808020(this.a, this.b, this.c);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        T9348890437393808020 t9348890437393808020 = (T9348890437393808020) r15896830329318850690;
        if (t9348890437393808020.n) {
            t9348890437393808020.f514o.h();
            t9348890437393808020.f514o.k(t9348890437393808020);
        }
        F1048562484897106753 f1048562484897106753 = this.a;
        t9348890437393808020.f514o = f1048562484897106753;
        if (t9348890437393808020.n) {
            if (f1048562484897106753.a != null) {
                Y16081827717826519461.c("Expected textInputModifierNode to be null");
            }
            f1048562484897106753.a = t9348890437393808020;
        }
        t9348890437393808020.p = this.b;
        t9348890437393808020.q = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N5930730792661905599) {
            N5930730792661905599 n5930730792661905599 = (N5930730792661905599) obj;
            return S10823041268949770285.t(this.a, n5930730792661905599.a) && this.b == n5930730792661905599.b && this.c == n5930730792661905599.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
