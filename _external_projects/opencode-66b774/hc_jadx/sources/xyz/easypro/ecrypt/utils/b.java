package xyz.easypro.ecrypt.utils;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: /tmp/opencode/apk_x/classes.dex */
public class b {
    public static final void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
