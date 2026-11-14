package ads_mobile_sdk;

import dev.epro.r0.K16859880908517287624;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fg implements K16859880908517287624 {
    public final FileChannel a;
    public final long b;
    public final long c;

    public fg(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // dev.epro.r0.K16859880908517287624
    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // dev.epro.r0.K16859880908517287624
    public final long size() {
        return this.c;
    }
}
