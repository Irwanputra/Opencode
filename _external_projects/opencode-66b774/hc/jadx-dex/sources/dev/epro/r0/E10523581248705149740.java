package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E10523581248705149740 {
    public static final dev.epro.r0.O11472352839632764090 a = new dev.epro.r0.O11472352839632764090((dev.epro.r0.H3043063065558747866) null, 0, false, 0.0f, new dev.epro.r0.R18365156199913595457((byte) 1), 0.0f, false, dev.epro.r0.O8620973563946607355.a(dev.epro.r0.I3826119971291161142.a), dev.epro.r0.Z1953481206310471956.e(), dev.epro.r0.O15160157444238005800.b(0, 0, 0, 0, 15), 0, dev.epro.r0.O2161699089510411363.a, 0, 0, 0, dev.epro.r0.R7000310675073492254.a, 0, 0);

    public static final dev.epro.r0.E17523205116624666034 a(final int i, int i2, dev.epro.r0.M3727281027331139839 m3727281027331139839) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = dev.epro.r0.E17523205116624666034.y;
        boolean zD = m3727281027331139839.d(i) | m3727281027331139839.d(0);
        java.lang.Object objM = m3727281027331139839.M();
        if (zD || objM == dev.epro.r0.O9023047933786425027.a) {
            final byte b = 2;
            objM = new dev.epro.r0.B13729205492206812220(i, b) { // from class: dev.epro.r0.B4776885242902739993
                public final /* synthetic */ byte a;
                public final /* synthetic */ int b;

                static {
                    o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(43);
                }

                private native void senfknhutcwf(int i3, byte b2);

                @Override // dev.epro.r0.B13729205492206812220
                public final native java.lang.Object invoke();

                {
                    this.a = b;
                    this.b = i;
                    senfknhutcwf(i, b);
                }
            };
            m3727281027331139839.k0(objM);
        }
        return (dev.epro.r0.E17523205116624666034) dev.epro.r0.C468629748621011703.m(objArr, v10300877997588547986, (dev.epro.r0.B13729205492206812220) objM, m3727281027331139839, 0);
    }
}
