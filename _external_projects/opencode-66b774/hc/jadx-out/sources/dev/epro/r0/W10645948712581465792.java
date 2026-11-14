package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W10645948712581465792 {
    public static final X354568553596380848 a = new X354568553596380848(new G5865513469313204166((byte) 10), (byte) 0);
    public static final X354568553596380848 b = new X354568553596380848(new U1207462583958712397((byte) 20), (byte) 0);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dev.epro.r0.A13182230205880306765 r22, dev.epro.r0.B13729205492206812220 r23, dev.epro.r0.R6081921892807856809 r24, dev.epro.r0.T15443218846549482730 r25, dev.epro.r0.M3727281027331139839 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W10645948712581465792.a(dev.epro.r0.A13182230205880306765, dev.epro.r0.B13729205492206812220, dev.epro.r0.R6081921892807856809, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
