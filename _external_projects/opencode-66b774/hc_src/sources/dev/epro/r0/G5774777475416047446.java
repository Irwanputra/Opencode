package dev.epro.r0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G5774777475416047446 {
    public final V6281043481934004271 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public androidx.sqlite.db.Z11244019023321623390 h;
    public boolean i;

    /* renamed from: o, reason: collision with root package name */
    public boolean f255o;
    public boolean p;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final S11323950170556863336 j = new S11323950170556863336((byte) 3);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;

    public G5774777475416047446(Context context, Class cls, String str) {
        this.a = J17975719213314763068.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(K13242289086361784648... k13242289086361784648Arr) {
        for (K13242289086361784648 k13242289086361784648 : k13242289086361784648Arr) {
            Integer valueOf = Integer.valueOf(k13242289086361784648.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(k13242289086361784648.b));
        }
        for (K13242289086361784648 k132422890863617846482 : (K13242289086361784648[]) Arrays.copyOf(k13242289086361784648Arr, k13242289086361784648Arr.length)) {
            this.j.b(k132422890863617846482);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b3, code lost:
    
        dev.epro.r0.S10973172697741180971.j("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.J196785984016436306 b() {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G5774777475416047446.b():dev.epro.r0.J196785984016436306");
    }
}
