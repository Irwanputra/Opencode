package com.google.android.gms.internal;

import android.webkit.ConsoleMessage;

/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class zzaop {
    public static final /* synthetic */ int[] zzdnr;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        zzdnr = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdnr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdnr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdnr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzdnr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
