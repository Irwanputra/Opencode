package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O1721407113567964106 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ M10701816181309613444 b;

    public /* synthetic */ O1721407113567964106(M10701816181309613444 m10701816181309613444, byte b) {
        this.a = b;
        this.b = m10701816181309613444;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        M10701816181309613444 m10701816181309613444 = this.b;
        switch (b) {
            case 0:
                S9684361936304835821 s9684361936304835821 = m10701816181309613444.c;
                if (s9684361936304835821 != null) {
                    s9684361936304835821.setListSelectionHidden(true);
                    s9684361936304835821.requestLayout();
                    break;
                }
                break;
            default:
                S9684361936304835821 s96843619363048358212 = m10701816181309613444.c;
                if (s96843619363048358212 != null && s96843619363048358212.isAttachedToWindow() && m10701816181309613444.c.getCount() > m10701816181309613444.c.getChildCount() && m10701816181309613444.c.getChildCount() <= m10701816181309613444.m) {
                    m10701816181309613444.z.setInputMethodMode(2);
                    m10701816181309613444.e();
                    break;
                }
                break;
        }
    }
}
