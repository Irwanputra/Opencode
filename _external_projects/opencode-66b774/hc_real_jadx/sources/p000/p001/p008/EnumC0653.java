package p000.p001.p008;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public enum EnumC0653 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f4431;

    EnumC0653(int i) {
        this.f4431 = i;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static EnumC0653 m1871(int i) {
        EnumC0653[] values = values();
        for (int i2 = 0; i2 < 11; i2++) {
            EnumC0653 enumC0653 = values[i2];
            if (enumC0653.f4431 == i) {
                return enumC0653;
            }
        }
        return null;
    }
}
