package p107.p108.p109.p110.p118;

import p131.p225.p226.InterfaceC2700;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.おぐぴう〸ず.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1862 implements InterfaceC2700 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f8257;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f8258;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f8259;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final EnumC1863 f8260;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f8261;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.おぐぴう〸ず.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1863 {
        f8262,
        f8263
    }

    public C1862(String str, int i, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("N0fA7<Kg9O6nO4jJgmA7l@6j\u001d6hI6fIg<\u001bg9K3lMboLdk\u001cd9N3>\u001e1jLbjOdnJjgH")));
        }
        if (i < 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("J4iO0jNj;\u001b0lNcgHa9AjjK4i\u001e1jKd:\u001b`kH7:\u001d7k@bfL6<\u0019e9OfhK49Aah@7o\u001b0>\u0019")));
        }
        this.f8259 = str;
        this.f8257 = i;
        this.f8258 = str2;
        this.f8261 = str3;
        this.f8260 = (str4 == null || !str4.startsWith(Crypt.a(Crypt.xrc("A1:K1;O39MkkKk;\u0019`h\u001e3nO3=\u001bak@`:\u001dg")))) ? EnumC1863.f8263 : EnumC1863.f8262;
    }
}
