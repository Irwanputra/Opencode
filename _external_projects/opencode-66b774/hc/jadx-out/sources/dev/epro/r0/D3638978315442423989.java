package dev.epro.r0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D3638978315442423989 {
    public static final Object j = new Object();
    public static volatile D3638978315442423989 k;
    public final ReentrantReadWriteLock a;
    public final K4498948325030944807 b;
    public volatile byte c;
    public final Handler d;
    public final N16333696292855081967 e;
    public final H11246634969386575622 f;
    public final J3301701597851028733 g;
    public final boolean h;
    public final B466272788290408887 i;

    public D3638978315442423989(X17355325846973801304 x17355325846973801304) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        H11246634969386575622 h11246634969386575622 = x17355325846973801304.a;
        this.f = h11246634969386575622;
        boolean z = x17355325846973801304.b;
        this.h = z;
        this.i = x17355325846973801304.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new K4498948325030944807(0);
        this.g = new J3301701597851028733((byte) 9);
        N16333696292855081967 n16333696292855081967 = new N16333696292855081967(this);
        this.e = n16333696292855081967;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                h11246634969386575622.a(new A3977949523195115163(n16333696292855081967));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static D3638978315442423989 a() {
        D3638978315442423989 d3638978315442423989;
        synchronized (j) {
            try {
                d3638978315442423989 = k;
                if (!(d3638978315442423989 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return d3638978315442423989;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            S10973172697741180971.m("Not initialized yet");
            return 0;
        }
        K5751602218013079365.x("charSequence cannot be null", charSequence);
        Q7316561721656982910 q7316561721656982910 = this.e.b;
        q7316561721656982910.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            A7769137806217985202[] a7769137806217985202Arr = (A7769137806217985202[]) spanned.getSpans(i, i + 1, A7769137806217985202.class);
            if (a7769137806217985202Arr.length > 0) {
                return spanned.getSpanStart(a7769137806217985202Arr[0]);
            }
        }
        return ((U17123917892906321416) q7316561721656982910.J(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new U17123917892906321416(i))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h)) {
            S10973172697741180971.m("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            N16333696292855081967 n16333696292855081967 = this.e;
            D3638978315442423989 d3638978315442423989 = n16333696292855081967.a;
            try {
                d3638978315442423989.f.a(new A3977949523195115163(n16333696292855081967));
            } catch (Throwable th) {
                d3638978315442423989.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new B2550074485188857304(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009d, B:60:0x00ad, B:61:0x00b0), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009d, B:60:0x00ad, B:61:0x00b0), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:65:0x00bf, B:68:0x00c7, B:50:0x0082), top: B:101:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D3638978315442423989.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(N2001496495389762459 n2001496495389762459) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new B2550074485188857304(Arrays.asList(n2001496495389762459), this.c, null));
            } else {
                this.b.add(n2001496495389762459);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        N16333696292855081967 n16333696292855081967 = this.e;
        n16333696292855081967.getClass();
        Bundle bundle = editorInfo.extras;
        E13661095186259607145 e13661095186259607145 = (E13661095186259607145) n16333696292855081967.c.c;
        int iA = e13661095186259607145.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) e13661095186259607145.d).getInt(iA + e13661095186259607145.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
