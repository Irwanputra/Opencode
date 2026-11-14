package dev.epro.r0;

import dev.epro.httpcustom.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D4395455590194154524 extends O10944101174480148852 {
    public final V697849047308847220 j;
    public boolean k;

    public D4395455590194154524(MainActivity mainActivity) {
        super(mainActivity);
        this.j = V4416135141588678913.t(null);
    }

    @Override // dev.epro.r0.O10944101174480148852
    public final void a(int i, M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.b0(420213850);
        int i2 = (m3727281027331139839.h(this) ? 4 : 2) | i;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            L12639328004344855510 l12639328004344855510 = (L12639328004344855510) this.j.getValue();
            if (l12639328004344855510 == null) {
                m3727281027331139839.a0(-1238823553);
            } else {
                m3727281027331139839.a0(98585282);
                l12639328004344855510.invoke(m3727281027331139839, 0);
            }
            m3727281027331139839.q(false);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new K5271540294206541871(this, i, (byte) 9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return D4395455590194154524.class.getName();
    }

    @Override // dev.epro.r0.O10944101174480148852
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    public final void setContent(L12639328004344855510 l12639328004344855510) {
        this.k = true;
        this.j.setValue(l12639328004344855510);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
