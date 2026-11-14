package dev.epro.r0;

import java.io.Closeable;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class K15455132743820483959 implements Closeable {
    public final JSONObject a;
    public final byte[] b;

    static {
        izmyclvb.dpqpjfpoanwt1(1710);
    }

    private native void gunyqdcledgb(JSONObject jSONObject, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public K15455132743820483959(JSONObject jSONObject, byte[] bArr) {
        jSONObject.getClass();
        bArr.getClass();
        gunyqdcledgb(jSONObject, bArr);
    }
}
