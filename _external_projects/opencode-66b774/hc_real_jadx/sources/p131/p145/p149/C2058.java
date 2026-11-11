package p131.p145.p149;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2058 implements InterfaceC2062<Number> {
    @Override // p131.p145.p149.InterfaceC2062
    public Number evaluate(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(((number2.floatValue() - floatValue) * f) + floatValue);
    }
}
