package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6544101850911802081 implements androidx.sqlite.SQLiteConnection, dev.epro.r0.R8015591507171738907 {
    public final androidx.sqlite.SQLiteConnection a;
    public final dev.epro.r0.R8015591507171738907 b;
    public dev.epro.r0.G8001132634698687269 c;
    public java.lang.Throwable d;
    public final dev.epro.r0.U9795041254872424247 e;

    public D6544101850911802081(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        dev.epro.r0.H15186625828076266306 h15186625828076266306 = new dev.epro.r0.H15186625828076266306();
        sQLiteConnection.getClass();
        this.a = sQLiteConnection;
        this.b = h15186625828076266306;
        this.e = new dev.epro.r0.U9795041254872424247(this);
    }

    public final void b(java.lang.Object obj) {
        this.b.b((java.lang.Object) null);
    }

    public final java.lang.Object c(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return this.b.c(r4833348786910499294);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws java.lang.Exception {
        dev.epro.r0.U9795041254872424247 u9795041254872424247 = this.e;
        if (u9795041254872424247 != null) {
            u9795041254872424247.e(-1);
        }
        this.a.close();
    }

    public final void d(java.lang.StringBuilder sb) {
        int i;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            dev.epro.r0.G8001132634698687269 g8001132634698687269 = this.c;
            if (g8001132634698687269 != null) {
                sb.append("\t\tCoroutine: " + g8001132634698687269);
                sb.append('\n');
            }
            if (this.d != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                new java.io.PrintWriter(stringWriter).flush();
                java.lang.String string = stringWriter.toString();
                string.getClass();
                java.util.Iterator it = dev.epro.r0.R9411874267597469228.x0(dev.epro.r0.M8927913404651150384.d0(string), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((java.lang.String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.e != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t\tPrepared Statement Cache Size: ");
            dev.epro.r0.U9795041254872424247 u9795041254872424247 = this.e;
            synchronized (u9795041254872424247.c) {
                i = u9795041254872424247.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final androidx.sqlite.SQLiteStatement prepare(java.lang.String str) {
        str.getClass();
        dev.epro.r0.U9795041254872424247 u9795041254872424247 = this.e;
        if (u9795041254872424247 == null) {
            return this.a.prepare(str);
        }
        java.lang.Object objC = u9795041254872424247.c(str);
        objC.getClass();
        return new dev.epro.r0.F2048878279943039499((androidx.sqlite.SQLiteStatement) objC);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
