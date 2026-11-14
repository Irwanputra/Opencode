package dev.epro.r0;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U3506079075055770632 extends Thread {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ U3506079075055770632(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                break;
            default:
                HashMap hashMap = (HashMap) this.b;
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            new StringBuilder(String.valueOf(uri).length() + 65);
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    String message2 = e2.getMessage();
                    new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    String message3 = e.getMessage();
                    new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    return;
                }
        }
        while (true) {
            synchronized (((Vector) ((J15730374346044043770) this.b).c)) {
                if (((Vector) ((J15730374346044043770) this.b).c).size() == 0) {
                    try {
                        ((Vector) ((J15730374346044043770) this.b).c).wait(2000L);
                    } catch (InterruptedException unused) {
                    }
                    if (((Vector) ((J15730374346044043770) this.b).c).size() == 0) {
                        ((J15730374346044043770) this.b).d = null;
                        return;
                    }
                }
                bArr = (byte[]) ((Vector) ((J15730374346044043770) this.b).c).remove(0);
            }
            try {
                ((T1177712003054613961) ((J15730374346044043770) this.b).e).m(bArr);
            } catch (IOException unused2) {
                return;
            }
        }
    }
}
