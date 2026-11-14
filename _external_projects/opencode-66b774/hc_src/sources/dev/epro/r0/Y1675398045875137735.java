package dev.epro.r0;

import java.io.InputStream;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Y1675398045875137735 extends InputStream {
    public final InputStream a;
    public final M17934926394694525382 b;

    static {
        izmyclvb.qgayjvbiagej2(207);
    }

    private native void pvqrbjymwiqp(InputStream inputStream, M17934926394694525382 m17934926394694525382);

    @Override // java.io.InputStream
    public final native int read();

    @Override // java.io.InputStream
    public final native int read(byte[] bArr, int i, int i2);

    public Y1675398045875137735(InputStream inputStream, M17934926394694525382 m17934926394694525382) {
        inputStream.getClass();
        m17934926394694525382.getClass();
        pvqrbjymwiqp(inputStream, m17934926394694525382);
    }
}
