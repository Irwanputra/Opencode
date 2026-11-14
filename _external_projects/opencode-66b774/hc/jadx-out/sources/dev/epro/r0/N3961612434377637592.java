package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N3961612434377637592 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ N3961612434377637592(long j, String str, byte b) {
        this.a = b;
        this.b = j;
        this.c = str;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) throws Exception {
        SQLiteStatement sQLiteStatementPrepare;
        byte b = this.a;
        String str = this.c;
        long j = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (b) {
            case 0:
                sQLiteConnection.getClass();
                sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j);
                    sQLiteStatementPrepare.bindText(2, str);
                    sQLiteStatementPrepare.step();
                    int iO = E2166724654553415323.o(sQLiteConnection);
                    sQLiteStatementPrepare.close();
                    return Integer.valueOf(iO);
                } finally {
                }
            default:
                sQLiteConnection.getClass();
                sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j);
                    sQLiteStatementPrepare.bindText(2, str);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return O9245300239821758723.a;
                } finally {
                }
        }
    }
}
