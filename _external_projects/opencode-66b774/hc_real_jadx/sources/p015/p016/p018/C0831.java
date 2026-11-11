package p015.p016.p018;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0831 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f5157;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f5158;

    public C0831(int i, String str) {
        this.f5158 = i;
        this.f5157 = str;
    }

    public C0831(int i, String str, Object... objArr) {
        this.f5157 = String.format(str, objArr);
        this.f5158 = i;
    }

    public String toString() {
        return this.f5158 + ": " + this.f5157;
    }
}
