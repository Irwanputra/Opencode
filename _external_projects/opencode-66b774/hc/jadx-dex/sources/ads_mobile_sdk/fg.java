package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fg implements dev.epro.r0.K16859880908517287624 {
    public final java.nio.channels.FileChannel a;
    public final long b;
    public final long c;

    public fg(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    public final void a(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.a.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public final long size() {
        return this.c;
    }
}
