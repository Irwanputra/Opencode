package p034.p035.p040;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Comparator;
import p034.p035.p038.C1019;
import p034.p035.p040.C1032;
import p034.p080.C1493;
import p034.p080.C1505;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1027 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1505<String, Typeface> f5428 = new C1505<>(16);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final C1032 f5426 = new C1032("fonts", 10, 10000);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Object f5427 = new Object();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C1493<String, ArrayList<C1032.InterfaceC1034<C1031>>> f5430 = new C1493<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Comparator<byte[]> f5429 = new C1030();

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ$〺つふすそ, reason: contains not printable characters */
    public static class C1028 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C1029[] f5431;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f5432;

        public C1028(int i, C1029[] c1029Arr) {
            this.f5432 = i;
            this.f5431 = c1029Arr;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1029 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5433;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f5434;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Uri f5435;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int f5436;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final boolean f5437;

        public C1029(Uri uri, int i, int i2, boolean z, int i3) {
            uri.getClass();
            this.f5435 = uri;
            this.f5433 = i;
            this.f5434 = i2;
            this.f5437 = z;
            this.f5436 = i3;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1030 implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i = bArr3[i3];
                        i2 = bArr4[i3];
                    }
                }
                return 0;
            }
            i = bArr3.length;
            i2 = bArr4.length;
            return i - i2;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ$びぐびあび, reason: contains not printable characters */
    public static final class C1031 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5438;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Typeface f5439;

        public C1031(Typeface typeface, int i) {
            this.f5439 = typeface;
            this.f5438 = i;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1031 m2366(Context context, C1026 c1026, int i) {
        try {
            C1028 m2367 = m2367(context, null, c1026);
            int i2 = m2367.f5432;
            if (i2 != 0) {
                return new C1031(null, i2 == 1 ? -2 : -3);
            }
            Typeface mo2333 = C1019.f5409.mo2333(context, null, m2367.f5431, i);
            return new C1031(mo2333, mo2333 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1031(null, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[LOOP:1: B:14:0x004b->B:28:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[EDGE_INSN: B:29:0x0094->B:30:0x0094 BREAK  A[LOOP:1: B:14:0x004b->B:28:0x0090], SYNTHETIC] */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p034.p035.p040.C1027.C1028 m2367(android.content.Context r22, android.os.CancellationSignal r23, p034.p035.p040.C1026 r24) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p040.C1027.m2367(android.content.Context, android.os.CancellationSignal, づざかべべ.〳ぜぞぜべっ.いいにぽつ.げつ〴ぬぐ):づざかべべ.〳ぜぞぜべっ.いいにぽつ.づざかべべ$〺つふすそ");
    }
}
