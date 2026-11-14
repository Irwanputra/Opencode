package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D6544101850911802081 implements SQLiteConnection, R8015591507171738907 {
    public final SQLiteConnection a;
    public final R8015591507171738907 b;
    public G8001132634698687269 c;
    public Throwable d;
    public final U9795041254872424247 e;

    public D6544101850911802081(SQLiteConnection sQLiteConnection) {
        H15186625828076266306 h15186625828076266306 = new H15186625828076266306();
        sQLiteConnection.getClass();
        this.a = sQLiteConnection;
        this.b = h15186625828076266306;
        this.e = new U9795041254872424247(this);
    }

    @Override // dev.epro.r0.R8015591507171738907
    public final void b(Object obj) {
        this.b.b(null);
    }

    @Override // dev.epro.r0.R8015591507171738907
    public final Object c(R4833348786910499294 r4833348786910499294) {
        return this.b.c(r4833348786910499294);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        U9795041254872424247 u9795041254872424247 = this.e;
        if (u9795041254872424247 != null) {
            u9795041254872424247.e(-1);
        }
        this.a.close();
    }

    public final void d(StringBuilder sb) {
        int i;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            G8001132634698687269 g8001132634698687269 = this.c;
            if (g8001132634698687269 != null) {
                sb.append("\t\tCoroutine: " + g8001132634698687269);
                sb.append('\n');
            }
            if (this.d != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                new PrintWriter(stringWriter).flush();
                String string = stringWriter.toString();
                string.getClass();
                Iterator it = R9411874267597469228.x0(M8927913404651150384.d0(string), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.e != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            U9795041254872424247 u9795041254872424247 = this.e;
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
    public final SQLiteStatement prepare(String str) {
        str.getClass();
        U9795041254872424247 u9795041254872424247 = this.e;
        if (u9795041254872424247 == null) {
            return this.a.prepare(str);
        }
        Object objC = u9795041254872424247.c(str);
        objC.getClass();
        return new F2048878279943039499((SQLiteStatement) objC);
    }

    public final String toString() {
        return this.a.toString();
    }
}
