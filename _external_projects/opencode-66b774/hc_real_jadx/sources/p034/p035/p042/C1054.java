package p034.p035.p042;

import androidx.core.app.NotificationCompat;
import java.io.Writer;

@Deprecated
/* renamed from: づざかべべ.〳ぜぞぜべっ.てぜきぽく.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1054 extends Writer {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f5502;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public StringBuilder f5503 = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);

    public C1054(String str) {
        this.f5502 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2387();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2387();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2387();
            } else {
                this.f5503.append(c);
            }
        }
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m2387() {
        if (this.f5503.length() > 0) {
            this.f5503.toString();
            StringBuilder sb = this.f5503;
            sb.delete(0, sb.length());
        }
    }
}
