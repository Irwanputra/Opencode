package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D4395455590194154524 extends dev.epro.r0.O10944101174480148852 {
    public final dev.epro.r0.V697849047308847220 j;
    public boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public D4395455590194154524(dev.epro.httpcustom.MainActivity mainActivity) {
        super(mainActivity);
        this.j = dev.epro.r0.V4416135141588678913.t((java.lang.Object) null);
    }

    public final void a(int i, dev.epro.r0.M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.b0(420213850);
        int i2 = (m3727281027331139839.h(this) ? 4 : 2) | i;
        if (m3727281027331139839.R(i2 & 1, (i2 & 3) != 2)) {
            dev.epro.r0.L12639328004344855510 l12639328004344855510 = (dev.epro.r0.L12639328004344855510) this.j.getValue();
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
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.K5271540294206541871(this, i, (byte) 9);
        }
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return dev.epro.r0.D4395455590194154524.class.getName();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContent(dev.epro.r0.L12639328004344855510 l12639328004344855510) {
        this.k = true;
        this.j.setValue(l12639328004344855510);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
