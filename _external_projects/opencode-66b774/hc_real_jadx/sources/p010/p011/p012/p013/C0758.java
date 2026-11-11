package p010.p011.p012.p013;

import java.util.UUID;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0758 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0758 f4891;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f4892;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f4893;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final UUID f4894;

    public C0758(UUID uuid) {
        this.f4894 = uuid;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0758 m2055(UUID uuid) {
        C0758 c0758 = f4891;
        if (c0758 == null || !c0758.f4894.equals(uuid)) {
            f4891 = new C0758(uuid);
        }
        return f4891;
    }
}
