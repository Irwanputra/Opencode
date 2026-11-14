package dev.epro.r0;

import android.app.ActivityManager;
import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G5774777475416047446 {
    public final V6281043481934004271 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public androidx.sqlite.db.Z11244019023321623390 h;
    public boolean i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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
            Integer numValueOf = Integer.valueOf(k13242289086361784648.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(k13242289086361784648.b));
        }
        for (K13242289086361784648 k132422890863617846482 : (K13242289086361784648[]) Arrays.copyOf(k13242289086361784648Arr, k13242289086361784648Arr.length)) {
            this.j.b(k132422890863617846482);
        }
    }

    public final J196785984016436306 b() {
        String name;
        Y7729682184936279366 y7729682184936279366F;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperB;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperB2;
        boolean zContainsKey;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            L15510417080911867038 l15510417080911867038 = I6631487105893062076.e;
            this.g = l15510417080911867038;
            this.f = l15510417080911867038;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.k;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    S10973172697741180971.i(G6547577305291411977.n(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        androidx.sqlite.db.Z11244019023321623390 i11216539464071129279 = this.h;
        if (i11216539464071129279 == null) {
            i11216539464071129279 = new I11216539464071129279();
        }
        androidx.sqlite.db.Z11244019023321623390 z11244019023321623390 = i11216539464071129279;
        boolean z = this.i;
        Context context = this.b;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        T4723177084556306713 t4723177084556306713 = (activityManager == null || activityManager.isLowRamDevice()) ? T4723177084556306713.a : T4723177084556306713.b;
        Executor executor2 = this.f;
        if (executor2 == null) {
            S10973172697741180971.j("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            S10973172697741180971.j("Required value was null.");
            return null;
        }
        I574271773787654072 i574271773787654072 = new I574271773787654072(context, this.c, z11244019023321623390, this.j, this.d, z, t4723177084556306713, executor2, executor3, null, this.n, this.f255o, linkedHashSet2, null, null, null, this.e, this.m, this.p, null, null);
        Class clsH = U16229988784104357932.H(this.a);
        Package r0 = clsH.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsH.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsH.getClassLoader());
            cls.getClass();
            J196785984016436306 j196785984016436306 = (J196785984016436306) cls.getDeclaredConstructor(null).newInstance(null);
            j196785984016436306.getClass();
            j196785984016436306.k = true;
            try {
                y7729682184936279366F = j196785984016436306.f();
                y7729682184936279366F.getClass();
            } catch (X12144930698824946031 unused) {
                y7729682184936279366F = null;
            }
            if (y7729682184936279366F == null) {
                new R3533078172067811153(i574271773787654072, new V3436737973405206042(j196785984016436306), new J7674436703016904089(2, j196785984016436306, O8620973563946607355.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 2));
                throw null;
            }
            j196785984016436306.e = new R3533078172067811153(i574271773787654072, y7729682184936279366F, new J7674436703016904089(2, j196785984016436306, O8620973563946607355.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 3));
            j196785984016436306.f = j196785984016436306.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setI = j196785984016436306.i();
            List list = i574271773787654072.n;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setI.iterator();
            while (true) {
                int i = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                break;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                        S10973172697741180971.j("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        return null;
                    }
                    for (K13242289086361784648 k13242289086361784648 : j196785984016436306.d(linkedHashMap)) {
                        byte b = k13242289086361784648.a;
                        byte b2 = k13242289086361784648.b;
                        S11323950170556863336 s11323950170556863336 = i574271773787654072.d;
                        LinkedHashMap linkedHashMap2 = s11323950170556863336.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(b))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b));
                            if (map == null) {
                                map = X9852054718446117252.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(b2));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            s11323950170556863336.b(k13242289086361784648);
                        }
                    }
                    LinkedHashMap linkedHashMapJ = j196785984016436306.j();
                    List list2 = i574271773787654072.m;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                        V6281043481934004271 v6281043481934004271 = (V6281043481934004271) entry.getKey();
                        for (V6281043481934004271 v62810434819340042712 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i3 = size3 - 1;
                                    if (v62810434819340042712.d(list2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    }
                                    if (i3 < 0) {
                                        break;
                                    }
                                    size3 = i3;
                                }
                                size3 = -1;
                            } else {
                                size3 = -1;
                            }
                            if (size3 < 0) {
                                D11988991656201568495.t("A required type converter (", v62810434819340042712.b(), ") for ", v6281043481934004271.b(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size3);
                            v62810434819340042712.getClass();
                            obj.getClass();
                            j196785984016436306.j.put(v62810434819340042712, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i4 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size4 = i4;
                        }
                    }
                    j196785984016436306.c = i574271773787654072.h;
                    j196785984016436306.d = new V15499216873564893116(i574271773787654072.i);
                    Executor executor4 = j196785984016436306.c;
                    if (executor4 == null) {
                        S10823041268949770285.b0("internalQueryExecutor");
                        throw null;
                    }
                    A2789795882633926065 a2789795882633926065A = O8620973563946607355.a(S10823041268949770285.O(V933048422416352811.r(executor4), V3311072669930093336.b()));
                    j196785984016436306.a = a2789795882633926065A;
                    G8001132634698687269 g8001132634698687269 = a2789795882633926065A.a;
                    V15499216873564893116 v15499216873564893116 = j196785984016436306.d;
                    if (v15499216873564893116 == null) {
                        S10823041268949770285.b0("internalTransactionExecutor");
                        throw null;
                    }
                    j196785984016436306.b = g8001132634698687269.plus(V933048422416352811.r(v15499216873564893116));
                    j196785984016436306.h = i574271773787654072.f;
                    R3533078172067811153 r3533078172067811153 = j196785984016436306.e;
                    if (r3533078172067811153 == null) {
                        S10823041268949770285.b0("connectionManager");
                        throw null;
                    }
                    SupportSQLiteOpenHelper supportSQLiteOpenHelper = r3533078172067811153.g;
                    if (supportSQLiteOpenHelper == null) {
                        supportSQLiteOpenHelperB = null;
                        break;
                    }
                    supportSQLiteOpenHelperB = supportSQLiteOpenHelper;
                    while (!(supportSQLiteOpenHelperB instanceof J15317094764572138728)) {
                        if (!(supportSQLiteOpenHelperB instanceof F18170440248835345798)) {
                            supportSQLiteOpenHelperB = null;
                            break;
                        }
                        supportSQLiteOpenHelperB = ((F18170440248835345798) supportSQLiteOpenHelperB).b();
                    }
                    R3533078172067811153 r35330781720678111532 = j196785984016436306.e;
                    if (r35330781720678111532 == null) {
                        S10823041268949770285.b0("connectionManager");
                        throw null;
                    }
                    SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = r35330781720678111532.g;
                    if (supportSQLiteOpenHelper2 == null) {
                        supportSQLiteOpenHelperB2 = null;
                        break;
                    }
                    supportSQLiteOpenHelperB2 = supportSQLiteOpenHelper2;
                    while (!(supportSQLiteOpenHelperB2 instanceof K14102948420904535724)) {
                        if (!(supportSQLiteOpenHelperB2 instanceof F18170440248835345798)) {
                            supportSQLiteOpenHelperB2 = null;
                            break;
                        }
                        supportSQLiteOpenHelperB2 = ((F18170440248835345798) supportSQLiteOpenHelperB2).b();
                    }
                    return j196785984016436306;
                }
                V6281043481934004271 v62810434819340042713 = (V6281043481934004271) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i5 = size5 - 1;
                        if (v62810434819340042713.d(list.get(size5))) {
                            zArr[size5] = true;
                            i = size5;
                            break;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size5 = i5;
                    }
                }
                if (i < 0) {
                    K2042933864045806308.l("A required auto migration spec (", v62810434819340042713.b(), ") is missing in the database configuration.");
                    return null;
                }
                linkedHashMap.put(v62810434819340042713, list.get(i));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsH.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsH.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsH.getCanonicalName(), e3);
        }
    }
}
