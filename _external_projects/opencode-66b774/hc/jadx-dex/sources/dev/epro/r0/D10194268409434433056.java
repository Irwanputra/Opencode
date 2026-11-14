package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10194268409434433056 extends dev.epro.r0.T3817383632789307090 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final dev.epro.r0.D10194268409434433056 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile dev.epro.r0.X11083265167116078764 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        dev.epro.r0.D10194268409434433056 d10194268409434433056 = new dev.epro.r0.D10194268409434433056();
        DEFAULT_INSTANCE = d10194268409434433056;
        dev.epro.r0.T3817383632789307090.j(dev.epro.r0.D10194268409434433056.class, d10194268409434433056);
    }

    public static dev.epro.r0.D10194268409434433056 n() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.V13737223835321851697 v() {
        return (dev.epro.r0.Y11622804996820966392) DEFAULT_INSTANCE.c(5);
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = java.lang.Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = java.lang.Long.valueOf(j);
    }

    public final void C(java.lang.String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(dev.epro.r0.B14593915613258039923 b14593915613258039923) {
        this.value_ = b14593915613258039923;
        this.valueCase_ = 6;
    }

    public final java.lang.Object c(int i) {
        dev.epro.r0.Y16467866395019052000 y16467866395019052000;
        switch (dev.epro.r0.L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dev.epro.r0.J12688447796732847593(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", dev.epro.r0.B14593915613258039923.class});
            case 3:
                return new dev.epro.r0.D10194268409434433056();
            case 4:
                return new dev.epro.r0.V13737223835321851697(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                dev.epro.r0.X11083265167116078764 x11083265167116078764 = PARSER;
                if (x11083265167116078764 != null) {
                    return x11083265167116078764;
                }
                synchronized (dev.epro.r0.D10194268409434433056.class) {
                    try {
                        y16467866395019052000 = PARSER;
                        if (y16467866395019052000 == null) {
                            y16467866395019052000 = new dev.epro.r0.Y16467866395019052000();
                            PARSER = y16467866395019052000;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return y16467866395019052000;
            default:
                dev.epro.r0.Z3383101362411723454.t();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final dev.epro.r0.D8243293650800641817 m() {
        return this.valueCase_ == 8 ? (dev.epro.r0.D8243293650800641817) this.value_ : dev.epro.r0.D8243293650800641817.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((java.lang.Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    public final java.lang.String s() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    public final dev.epro.r0.B14593915613258039923 t() {
        return this.valueCase_ == 6 ? (dev.epro.r0.B14593915613258039923) this.value_ : dev.epro.r0.B14593915613258039923.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = java.lang.Boolean.valueOf(z);
    }

    public final void x(dev.epro.r0.D8243293650800641817 d8243293650800641817) {
        this.valueCase_ = 8;
        this.value_ = d8243293650800641817;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = java.lang.Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = java.lang.Float.valueOf(f);
    }
}
