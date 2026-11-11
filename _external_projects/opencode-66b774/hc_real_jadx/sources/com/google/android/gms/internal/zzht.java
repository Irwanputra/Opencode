package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzht {
    private ByteArrayOutputStream zzbaf = new ByteArrayOutputStream(NotificationCompat.FLAG_BUBBLE);
    private Base64OutputStream zzbag = new Base64OutputStream(this.zzbaf, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.zzbag.close();
        } catch (IOException e) {
            zzakb.zzb("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zzbaf.close();
                str = this.zzbaf.toString();
            } catch (IOException e2) {
                zzakb.zzb("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.zzbaf = null;
            this.zzbag = null;
        }
    }

    public final void write(byte[] bArr) {
        this.zzbag.write(bArr);
    }
}
