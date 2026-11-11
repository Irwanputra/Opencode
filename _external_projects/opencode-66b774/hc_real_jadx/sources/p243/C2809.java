package p243;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2809 implements InterfaceC2823 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2819 f10477 = new C2819();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2822 f10478;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10479;

    public C2809(InterfaceC2822 interfaceC2822) {
        if (interfaceC2822 == null) {
            throw new NullPointerException("sink == null");
        }
        this.f10478 = interfaceC2822;
    }

    @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10479) {
            return;
        }
        Throwable th = null;
        try {
            C2819 c2819 = this.f10477;
            long j = c2819.f10501;
            if (j > 0) {
                this.f10478.mo1765(c2819, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f10478.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f10479 = true;
        if (th == null) {
            return;
        }
        Charset charset = C2808.f10476;
        throw th;
    }

    @Override // p243.InterfaceC2823, p243.InterfaceC2822, java.io.Flushable
    public void flush() {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        C2819 c2819 = this.f10477;
        long j = c2819.f10501;
        if (j > 0) {
            this.f10478.mo1765(c2819, j);
        }
        this.f10478.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10479;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("buffer(");
        m4207.append(this.f10478);
        m4207.append(")");
        return m4207.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        int write = this.f10477.write(byteBuffer);
        mo4889();
        return write;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InterfaceC2823 mo4882(int i) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4926(i);
        mo4889();
        return this;
    }

    @Override // p243.InterfaceC2822
    /* renamed from: 〺つふすそ */
    public C2803 mo1764() {
        return this.f10478.mo1764();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC2823 mo4883(int i) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4929(i);
        mo4889();
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public InterfaceC2823 mo4884(long j) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.mo4884(j);
        return mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public InterfaceC2823 mo4885(String str) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4916(str);
        return mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public InterfaceC2823 mo4886(byte[] bArr) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4924(bArr);
        return mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC2823 mo4887(byte[] bArr, int i, int i2) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4923(bArr, i, i2);
        return mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2819 mo4888() {
        return this.f10477;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public InterfaceC2823 mo4889() {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        C2819 c2819 = this.f10477;
        long j = c2819.f10501;
        if (j == 0) {
            j = 0;
        } else {
            C2825 c2825 = c2819.f10500.f10513;
            if (c2825.f10514 < 8192 && c2825.f10516) {
                j -= r6 - c2825.f10512;
            }
        }
        if (j > 0) {
            this.f10478.mo1765(c2819, j);
        }
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public InterfaceC2823 mo4890(C2801 c2801) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4910(c2801);
        return mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC2823 mo4891(long j) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.mo4891(j);
        return mo4889();
    }

    @Override // p243.InterfaceC2822
    /* renamed from: びぐびあび */
    public void mo1765(C2819 c2819, long j) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.mo1765(c2819, j);
        mo4889();
    }

    @Override // p243.InterfaceC2823
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public InterfaceC2823 mo4892(int i) {
        if (this.f10479) {
            throw new IllegalStateException("closed");
        }
        this.f10477.m4927(i);
        mo4889();
        return this;
    }
}
