package ads_mobile_sdk;

import dev.epro.r0.G5920303990939058292;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.L12449384090336186263;
import dev.epro.r0.W8823188230031025271;
import dev.epro.r0.X627358512999327803;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class j11 {
    public final ExecutorService a;
    public final String b;
    public final long c;

    public j11(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    public static byte[] a(HttpURLConnection httpURLConnection, int i) {
        InputStream inputStream = i < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (inputStream == null) {
                    byte[] bArr = new byte[0];
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bArr;
                }
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final G5920303990939058292 a(String str, String str2, boolean z, byte[] bArr) {
        X627358512999327803 x627358512999327803 = new X627358512999327803();
        x627358512999327803.c = new W8823188230031025271();
        G5920303990939058292 g5920303990939058292 = new G5920303990939058292(x627358512999327803);
        x627358512999327803.b = g5920303990939058292;
        x627358512999327803.a = L11610354117192841236.class;
        try {
            this.a.execute(new L12449384090336186263(this, str, x627358512999327803, z, str2, bArr));
            x627358512999327803.a = "";
            return g5920303990939058292;
        } catch (Exception e) {
            g5920303990939058292.b.h(e);
            return g5920303990939058292;
        }
    }
}
