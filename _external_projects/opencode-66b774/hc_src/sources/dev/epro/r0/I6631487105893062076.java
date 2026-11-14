package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I6631487105893062076 extends V16504496955554646429 {
    public static volatile I6631487105893062076 d;
    public static final L15510417080911867038 e = new L15510417080911867038((byte) 0);
    public final J7273067030976909159 c = new J7273067030976909159();

    public static I6631487105893062076 t() {
        if (d != null) {
            return d;
        }
        synchronized (I6631487105893062076.class) {
            try {
                if (d == null) {
                    d = new I6631487105893062076();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }
}
