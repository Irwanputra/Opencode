package org.chromium.net;

import android.os.ParcelFileDescriptor;
import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.P15983149023236604271;
import dev.epro.r0.S5657828437777738775;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@Deprecated
/* loaded from: classes4.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new P15983149023236604271(ByteBuffer.wrap(bArr, 0, bArr.length).slice(), (byte) 0);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new S5657828437777738775(new M9197813449740923653(parcelFileDescriptor, (byte) 27));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new P15983149023236604271(byteBuffer.slice(), (byte) 0);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new P15983149023236604271(ByteBuffer.wrap(bArr, i, i2).slice(), (byte) 0);
    }

    public static UploadDataProvider create(File file) {
        return new S5657828437777738775(new M9197813449740923653(file, (byte) 26));
    }
}
