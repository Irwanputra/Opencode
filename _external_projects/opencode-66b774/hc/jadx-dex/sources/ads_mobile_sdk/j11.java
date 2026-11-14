package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j11 {
    public final java.util.concurrent.ExecutorService a;
    public final java.lang.String b;
    public final long c;

    public j11(java.util.concurrent.ExecutorService executorService, java.lang.String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    public static byte[] a(java.net.HttpURLConnection httpURLConnection, int i) throws java.io.IOException {
        java.io.InputStream inputStream = i < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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
                    int i2 = inputStream.read(bArr2);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i2);
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final dev.epro.r0.G5920303990939058292 a(java.lang.String str, java.lang.String str2, boolean z, byte[] bArr) {
        dev.epro.r0.X627358512999327803 x627358512999327803 = new dev.epro.r0.X627358512999327803();
        x627358512999327803.c = new dev.epro.r0.W8823188230031025271();
        dev.epro.r0.G5920303990939058292 g5920303990939058292 = new dev.epro.r0.G5920303990939058292(x627358512999327803);
        x627358512999327803.b = g5920303990939058292;
        x627358512999327803.a = dev.epro.r0.L11610354117192841236.class;
        try {
            this.a.execute(new dev.epro.r0.L12449384090336186263(this, str, x627358512999327803, z, str2, bArr));
            x627358512999327803.a = "";
            return g5920303990939058292;
        } catch (java.lang.Exception e) {
            g5920303990939058292.b.h(e);
            return g5920303990939058292;
        }
    }
}
