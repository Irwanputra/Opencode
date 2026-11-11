package p131.p161.p211;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぇ〳〲〺すっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class EnumC2527 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final EnumC2527 f9869;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final EnumC2527 f9870;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2527[] f9871;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぇ〳〲〺すっ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum C2529 extends EnumC2527 {
        public C2529(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        C2529 c2529 = new C2529("DEFAULT", 0);
        f9869 = c2529;
        EnumC2527 enumC2527 = new EnumC2527("STRING", 1) { // from class: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぇ〳〲〺すっ.〺つふすそ
        };
        f9870 = enumC2527;
        f9871 = new EnumC2527[]{c2529, enumC2527};
    }

    public EnumC2527(String str, int i, C2529 c2529) {
    }

    public static EnumC2527 valueOf(String str) {
        return (EnumC2527) Enum.valueOf(EnumC2527.class, str);
    }

    public static EnumC2527[] values() {
        return (EnumC2527[]) f9871.clone();
    }
}
