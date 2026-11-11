package p107.p108.p109.p110.p121.p125.p126.p127;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.なぎぱいぢぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1950 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f8519;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f8520;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f8521;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public EnumC1951 f8522;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final InterfaceC1955 f8523;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f8524;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.なぎぱいぢぎ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1951 {
        f8525,
        f8526,
        f8528
    }

    public C1950(EnumC1951 enumC1951, String str, int i, String str2, String str3) {
        InterfaceC1955 c1952;
        this.f8522 = enumC1951;
        this.f8521 = str;
        this.f8519 = i;
        this.f8520 = str2;
        this.f8524 = str3;
        int ordinal = enumC1951.ordinal();
        if (ordinal == 0) {
            c1952 = new C1952(this);
        } else if (ordinal == 1) {
            c1952 = new C1953(this);
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            c1952 = new C1954(this);
        }
        this.f8523 = c1952;
    }
}
