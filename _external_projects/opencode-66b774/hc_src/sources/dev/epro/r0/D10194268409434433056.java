package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D10194268409434433056 extends T3817383632789307090 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final D10194268409434433056 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X11083265167116078764 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        D10194268409434433056 d10194268409434433056 = new D10194268409434433056();
        DEFAULT_INSTANCE = d10194268409434433056;
        T3817383632789307090.j(D10194268409434433056.class, d10194268409434433056);
    }

    public static D10194268409434433056 n() {
        return DEFAULT_INSTANCE;
    }

    public static V13737223835321851697 v() {
        return (V13737223835321851697) ((Y11622804996820966392) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(B14593915613258039923 b14593915613258039923) {
        this.value_ = b14593915613258039923;
        this.valueCase_ = 6;
    }

    @Override // dev.epro.r0.T3817383632789307090
    public final Object c(int i) {
        X11083265167116078764 x11083265167116078764;
        switch (L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new J12688447796732847593(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", B14593915613258039923.class});
            case 3:
                return new D10194268409434433056();
            case 4:
                return new V13737223835321851697(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X11083265167116078764 x110832651671160787642 = PARSER;
                if (x110832651671160787642 != null) {
                    return x110832651671160787642;
                }
                synchronized (D10194268409434433056.class) {
                    try {
                        x11083265167116078764 = PARSER;
                        if (x11083265167116078764 == null) {
                            x11083265167116078764 = new Y16467866395019052000();
                            PARSER = x11083265167116078764;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x11083265167116078764;
            default:
                Z3383101362411723454.t();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final D8243293650800641817 m() {
        return this.valueCase_ == 8 ? (D8243293650800641817) this.value_ : D8243293650800641817.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final B14593915613258039923 t() {
        return this.valueCase_ == 6 ? (B14593915613258039923) this.value_ : B14593915613258039923.m();
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
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(D8243293650800641817 d8243293650800641817) {
        this.valueCase_ = 8;
        this.value_ = d8243293650800641817;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
