package dev.epro.r0;

import android.webkit.ConsoleMessage;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class T14695866877392366749 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
