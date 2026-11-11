package p015.p016.p020;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jasypt.digest.StandardStringDigester;
import p015.p016.p017.C0784;
import p015.p016.p018.C0800;
import p015.p016.p018.C0830;
import p015.p016.p020.AbstractC0974;
import p015.p016.p020.C0962;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0958 extends C0976 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C0960 f5271;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public EnumC0959 f5272;

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public enum EnumC0959 {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0960 implements Cloneable {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C0962.EnumC0964 f5281;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0962.EnumC0963 f5278 = C0962.EnumC0963.base;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ThreadLocal<CharsetEncoder> f5283 = new ThreadLocal<>();

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f5282 = true;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f5279 = 1;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public EnumC0961 f5277 = EnumC0961.html;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Charset f5280 = Charset.forName("UTF8");

        /* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public enum EnumC0961 {
            html,
            xml
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public CharsetEncoder m2271() {
            CharsetEncoder newEncoder = this.f5280.newEncoder();
            this.f5283.set(newEncoder);
            String name = newEncoder.charset().name();
            this.f5281 = name.equals(StandardStringDigester.DIGEST_CHARSET) ? C0962.EnumC0964.ascii : name.startsWith("UTF-") ? C0962.EnumC0964.utf : C0962.EnumC0964.fallback;
            return newEncoder;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C0960 clone() {
            try {
                C0960 c0960 = (C0960) super.clone();
                String name = this.f5280.name();
                c0960.getClass();
                c0960.f5280 = Charset.forName(name);
                c0960.f5278 = C0962.EnumC0963.valueOf(this.f5278.name());
                return c0960;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public C0958(String str) {
        super(C0800.m2169("#root", C0830.f5153), str, null);
        this.f5271 = new C0960();
        this.f5272 = EnumC0959.noQuirks;
    }

    @Override // p015.p016.p020.C0976, p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ */
    public String mo2252() {
        return "#document";
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String mo2268() {
        StringBuilder m2108 = C0784.m2108();
        for (AbstractC0974 abstractC0974 : this.f5316) {
            C1687.m3698(new AbstractC0974.C0975(m2108, abstractC0974.m2296()), abstractC0974);
        }
        boolean z = m2296().f5282;
        String sb = m2108.toString();
        return z ? sb.trim() : sb;
    }

    @Override // p015.p016.p020.C0976
    /* renamed from: ぷぞてのほき, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0958 mo2267() {
        C0958 c0958 = (C0958) super.mo2267();
        c0958.f5271 = this.f5271.clone();
        return c0958;
    }
}
