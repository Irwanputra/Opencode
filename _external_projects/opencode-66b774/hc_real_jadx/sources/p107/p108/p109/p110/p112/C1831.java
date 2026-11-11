package p107.p108.p109.p110.p112;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import team.dev.epro.apkcustom.models.VPNServer;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.いいにぽつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1831 extends SQLiteOpenHelper {
    public C1831(Context context) {
        super(context, Crypt.a(Crypt.xrc("Kkh\u001d7jK0gJ6i\u001bk9@bnMej\u001c3lI6<K6j\u0019d")), (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(Crypt.a(Crypt.xrc("\u001b7h\u001b7lIck\u001a0lKeo\u0019km\u00196<Ob:J3k\u001c0f\u0019kf\u0019ji\u001a`nIjgI1=Kg:\u001bkhMa<\u0019k<\u001bji\u001dajM3mLggAjf@ek\u001eagK7n\u001akfM1n\u001bfl\u001ekoO3j\u001a69Of:Afm@kiH`=Hb9Oeh\u001939OcoH4f\u001d6k\u001ajg@g:\u001d4jNen\u001d1l\u001d`oLk:Of;\u001daoAdn\u00196iMjiIc:K3mAbnO1f\u001a0<I3>MkgKegK`m\u001ee:O4>\u001d4m\u0019gf\u001ad>H69\u001eji\u00190kAbiIgjL`;\u001d3m\u001e0n\u001c1hJal\u0019kmNemIj=\u001bbiM4:\u0019f9\u001ekj\u00194=KghMb=\u001ad9Lc9Hg9K0nKbiAe<OffJfhN3>HdnI0:Jc:\u001d3lN0j\u001d1<J4hL1nK4l\u0019d=L1f@0nI3nH0m\u001eg>\u001cehMe9\u001cdo@e=A7l\u001a4gNelI6<AeiJ7hI6lJcl\u001adfKd<\u001defIag\u001ejh\u001ef<NdgK3=J1:N`kHflKkj\u001e0:Oel@ko\u001ba9LclHgn\u001djn\u0019f9@c>\u001d0lIb:K6nN3oH7j\u0019a;\u001b0k\u001bf=\u001ck=\u001ee=A0nN7=A6;@ao\u0019a>Jk;\u001dd<\u001e7=@6h\u001a4=Ib;Haf\u001d6=M6i\u0019e:Ikf\u001bj9Hk<M7>N`iHjnNj;I1gOk<@f=M")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(Crypt.a(Crypt.xrc("J3n\u001e4k\u001bciAe9Nb:\u001aglJjhMb9\u0019e;\u001bj<I3gHe>Jbn@koAgi\u001d4:J`mJdjAk>\u001e4i\u001dbiA")));
        sQLiteDatabase.execSQL(Crypt.a(Crypt.xrc("\u001b7h\u001b7lIck\u001a0lKeo\u0019km\u00196<Ob:J3k\u001c0f\u0019kf\u0019ji\u001a`nIjgI1=Kg:\u001bkhMa<\u0019k<\u001bji\u001dajM3mLggAjf@ek\u001eagK7n\u001akfM1n\u001bfl\u001ekoO3j\u001a69Of:Afm@kiH`=Hb9Oeh\u001939OcoH4f\u001d6k\u001ajg@g:\u001d4jNen\u001d1l\u001d`oLk:Of;\u001daoAdn\u00196iMjiIc:K3mAbnO1f\u001a0<I3>MkgKegK`m\u001ee:O4>\u001d4m\u0019gf\u001ad>H69\u001eji\u00190kAbiIgjL`;\u001d3m\u001e0n\u001c1hJal\u0019kmNemIj=\u001bbiM4:\u0019f9\u001ekj\u00194=KghMb=\u001ad9Lc9Hg9K0nKbiAe<OffJfhN3>HdnI0:Jc:\u001d3lN0j\u001d1<J4hL1nK4l\u0019d=L1f@0nI3nH0m\u001eg>\u001cehMe9\u001cdo@e=A7l\u001a4gNelI6<AeiJ7hI6lJcl\u001adfKd<\u001defIag\u001ejh\u001ef<NdgK3=J1:N`kHflKkj\u001e0:Oel@ko\u001ba9LclHgn\u001djn\u0019f9@c>\u001d0lIb:K6nN3oH7j\u0019a;\u001b0k\u001bf=\u001ck=\u001ee=A0nN7=A6;@ao\u0019a>Jk;\u001dd<\u001e7=@6h\u001a4=Ib;Haf\u001d6=M6i\u0019e:Ikf\u001bj9Hk<M7>N`iHjnNj;I1gOk<@f=M")));
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m3944(String str) {
        String str2;
        String a = Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj"));
        String[] split = str.split(Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3")));
        if (split.length == 15) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Crypt.a(Crypt.xrc("\u001baoLkf\u001c6gN7:\u001ek9I`iIelO0n@dm\u001a7:A`")), split[0]);
            contentValues.put(Crypt.a(Crypt.xrc("\u00194kN4nL69\u001b0jJe>Mg;Lj9HclLcoAdmJf")), split[1]);
            contentValues.put(Crypt.a(Crypt.xrc("\u001ef=\u00193>O7hM6jJ0lL19KfoHcgKdn@1=\u001e`")), split[2]);
            contentValues.put(Crypt.a(Crypt.xrc("@4:LjiLk:J`lO7;K0nIkfNcmKj>O4=L0")), split[3]);
            contentValues.put(Crypt.a(Crypt.xrc("\u0019ehAcjMd;@j:\u001c69A4kJegH6h\u001e4l\u0019dkKk")), split[4]);
            contentValues.put(Crypt.a(Crypt.xrc("\u001e6nJ6iIg;\u001cdmK0i\u001ben\u001ej:\u001dd<LjgHc>\u001a7")), split[5]);
            contentValues.put(Crypt.a(Crypt.xrc("\u001ajgMd;Jel@g;Oj=AdlH1h\u001aflL3kMbh\u001ac")), split[6]);
            contentValues.put(Crypt.a(Crypt.xrc("\u001den\u001e6g\u00197=\u001b0i\u001b`f\u001e7;\u001c`o\u001dchJ4<MbnO0")), split[7]);
            contentValues.put(Crypt.a(Crypt.xrc("\u001d0k\u001ekgIkiIdk\u001b6;Ib=IafO`<\u001adfNk>Mj")), split[8]);
            contentValues.put(Crypt.a(Crypt.xrc("N7>K7iN6fAbmAef@jhOb;\u001b`fIg;I0f\u001ea")), split[9]);
            contentValues.put(Crypt.a(Crypt.xrc("\u0019jg\u00196=Iaf\u001b4kL0>O7>\u001c1m\u001a0iKegNeh\u001e4")), split[10]);
            contentValues.put(Crypt.a(Crypt.xrc("A7>Hf=I3l\u001djf\u001c1=\u0019bo\u0019a<Kb9Ljh\u001c6;J1")), split[11]);
            contentValues.put(Crypt.a(Crypt.xrc("Jdj\u0019jmJ6mK4l\u001d1jAk>\u001cam\u001b6g\u001e6l\u001cd:\u001b6")), split[12]);
            contentValues.put(Crypt.a(Crypt.xrc("Jek\u001a`=N0jO7l\u001de>Hbn\u001ckj\u00194g\u0019giL`9I7")), split[13]);
            contentValues.put(Crypt.a(Crypt.xrc("\u0019k:O1j\u001d0hHj9Kjm\u001cfjMbk@dmLefHgl\u001a3")), split[14]);
            try {
                String[] split2 = new String(Base64.decode(split[14], 0), Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"))).split("\\n");
                for (int i = 0; i < split2.length; i++) {
                    if (split2[i].startsWith(a)) {
                        str2 = split2[i].split(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")))[1].trim();
                        break;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
            str2 = "";
            contentValues.put(a, str2);
            writableDatabase.insert(Crypt.a(Crypt.xrc("L1h\u001ejiO6g\u001ea<\u001ckmOb<\u0019aoO7j\u001djnH6m\u001c`")), null, contentValues);
            writableDatabase.close();
        }
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public long m3945() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        long simpleQueryForLong = writableDatabase.compileStatement(Crypt.a(Crypt.xrc("\u001e0j@3>N`;L3:J`>Ljf\u001a`g\u001a6hJ0<\u00191>AenLelHdk\u001c0oLj=\u001bgo\u001bjl\u001e1m\u001b3oHeiA1=\u00196n\u001bdnH1l\u001cj;\u001ck;OkfO7fNf:J6lMd=\u001ecnOfhK0j\u001ccj\u001bcfAgjAamO3<J3h\u001baj\u001a4:\u001bk"))).simpleQueryForLong();
        writableDatabase.close();
        return simpleQueryForLong;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public List<VPNServer> m3946(String str) {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor rawQuery = writableDatabase.rawQuery(Crypt.a(Crypt.xrc("Hf9\u001ac>Kf=Leo\u001bf>J4nH4<KdgJd>AglNdfLbl@eiMbf\u001ea<J4gNfoN0hNfkOelHk>\u001d6h@1j\u001dcoNfoHek\u001e0<O`:\u001d09\u001e`oJ`;\u001ee9")) + str, null);
        if (rawQuery.moveToFirst()) {
            while (true) {
                sQLiteDatabase = writableDatabase;
                arrayList.add(new VPNServer(rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3), rawQuery.getString(4), rawQuery.getString(5), rawQuery.getString(6), rawQuery.getString(7), rawQuery.getString(8), rawQuery.getString(9), rawQuery.getString(10), rawQuery.getString(11), rawQuery.getString(12), rawQuery.getString(13), rawQuery.getString(14), rawQuery.getString(15), rawQuery.getString(16)));
                if (!rawQuery.moveToNext()) {
                    break;
                }
                writableDatabase = sQLiteDatabase;
            }
        } else {
            sQLiteDatabase = writableDatabase;
        }
        rawQuery.close();
        sQLiteDatabase.close();
        return arrayList;
    }
}
