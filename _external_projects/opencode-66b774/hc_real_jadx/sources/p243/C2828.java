package p243;

import java.io.OutputStream;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2828 implements InterfaceC2822 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2803 f10520;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ OutputStream f10521;

    public C2828(C2803 c2803, OutputStream outputStream) {
        this.f10520 = c2803;
        this.f10521 = outputStream;
    }

    @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10521.close();
    }

    @Override // p243.InterfaceC2822, java.io.Flushable
    public void flush() {
        this.f10521.flush();
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("sink(");
        m4207.append(this.f10521);
        m4207.append(")");
        return m4207.toString();
    }

    @Override // p243.InterfaceC2822
    /* renamed from: 〺つふすそ */
    public C2803 mo1764() {
        return this.f10520;
    }

    @Override // p243.InterfaceC2822
    /* renamed from: びぐびあび */
    public void mo1765(C2819 c2819, long j) {
        C2808.m4880(c2819.f10501, 0L, j);
        while (j > 0) {
            this.f10520.mo4861();
            C2825 c2825 = c2819.f10500;
            int min = (int) Math.min(j, c2825.f10514 - c2825.f10512);
            this.f10521.write(c2825.f10515, c2825.f10512, min);
            int i = c2825.f10512 + min;
            c2825.f10512 = i;
            long j2 = min;
            j -= j2;
            c2819.f10501 -= j2;
            if (i == c2825.f10514) {
                c2819.f10500 = c2825.m4936();
                C2815.m4902(c2825);
            }
        }
    }
}
