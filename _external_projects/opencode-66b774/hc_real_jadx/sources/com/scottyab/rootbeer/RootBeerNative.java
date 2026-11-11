package com.scottyab.rootbeer;

import p131.p132.p133.p134.C1970;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RootBeerNative {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean f3651;

    static {
        try {
            System.loadLibrary("tool-checker");
            f3651 = true;
        } catch (UnsatisfiedLinkError e) {
            C1970.m4089(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
