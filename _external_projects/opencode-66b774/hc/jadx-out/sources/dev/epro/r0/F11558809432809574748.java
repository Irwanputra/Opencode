package dev.epro.r0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F11558809432809574748 implements ViewTranslationCallback {
    public static final F11558809432809574748 a = new F11558809432809574748();

    public final boolean onClearTranslation(View view) {
        B13729205492206812220 b13729205492206812220;
        view.getClass();
        Y9618897734314500490 contentCaptureManager$ui = ((S7974369370986781936) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = V10616265840975294035.a;
        W13131470296662841006 w13131470296662841006G = contentCaptureManager$ui.g();
        Object[] objArr = w13131470296662841006G.c;
        long[] jArr = w13131470296662841006G.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        A4559761392562572984 a4559761392562572984 = ((D16246464706717523548) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = a4559761392562572984.g(D10671166500636893138.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = a4559761392562572984.g(E5458822993765169982.n);
                            R17587901753867651123 r17587901753867651123 = (R17587901753867651123) (objG2 != null ? objG2 : null);
                            if (r17587901753867651123 != null && (b13729205492206812220 = (B13729205492206812220) r17587901753867651123.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        F4096073349764486348 f4096073349764486348;
        view.getClass();
        Y9618897734314500490 contentCaptureManager$ui = ((S7974369370986781936) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = V10616265840975294035.a;
        W13131470296662841006 w13131470296662841006G = contentCaptureManager$ui.g();
        Object[] objArr = w13131470296662841006G.c;
        long[] jArr = w13131470296662841006G.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        A4559761392562572984 a4559761392562572984 = ((D16246464706717523548) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = a4559761392562572984.g(D10671166500636893138.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (S10823041268949770285.t(objG, Boolean.TRUE)) {
                            Object objG2 = a4559761392562572984.g(E5458822993765169982.m);
                            R17587901753867651123 r17587901753867651123 = (R17587901753867651123) (objG2 != null ? objG2 : null);
                            if (r17587901753867651123 != null && (f4096073349764486348 = (F4096073349764486348) r17587901753867651123.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        F4096073349764486348 f4096073349764486348;
        view.getClass();
        Y9618897734314500490 contentCaptureManager$ui = ((S7974369370986781936) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = V10616265840975294035.b;
        W13131470296662841006 w13131470296662841006G = contentCaptureManager$ui.g();
        Object[] objArr = w13131470296662841006G.c;
        long[] jArr = w13131470296662841006G.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        A4559761392562572984 a4559761392562572984 = ((D16246464706717523548) objArr[(i << 3) + i3]).a.d.a;
                        Object objG = a4559761392562572984.g(D10671166500636893138.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (S10823041268949770285.t(objG, Boolean.FALSE)) {
                            Object objG2 = a4559761392562572984.g(E5458822993765169982.m);
                            R17587901753867651123 r17587901753867651123 = (R17587901753867651123) (objG2 != null ? objG2 : null);
                            if (r17587901753867651123 != null && (f4096073349764486348 = (F4096073349764486348) r17587901753867651123.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
