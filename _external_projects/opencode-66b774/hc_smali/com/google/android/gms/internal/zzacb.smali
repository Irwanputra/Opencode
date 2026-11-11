.class public final Lcom/google/android/gms/internal/zzacb;
.super Lcom/google/android/gms/internal/zzabc;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final sLock:Ljava/lang/Object;

.field private static zzcrk:Lcom/google/android/gms/internal/zzacb;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzcrl:Lcom/google/android/gms/internal/zzaca;

.field private final zzcrm:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzacb;->sLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaca;)V
    .registers 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzabc;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacb;->zzcrm:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzacb;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzacb;->zzcrl:Lcom/google/android/gms/internal/zzaca;

    return-void
.end method

.method private static zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaca;Lcom/google/android/gms/internal/zzaat;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzaax;
    .registers 23

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    const-string v3, "Starting ad request from service using: google.afma.request.getAdDictionary"

    invoke-static {v3}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v8, Lcom/google/android/gms/internal/zznu;

    sget-object v3, Lcom/google/android/gms/internal/zznh;->zzbjl:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v4, v0, Lcom/google/android/gms/internal/zzaat;->zzauc:Lcom/google/android/gms/internal/zzjn;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzjn;->zzbek:Ljava/lang/String;

    const-string v5, "load_ad"

    invoke-direct {v8, v3, v5, v4}, Lcom/google/android/gms/internal/zznu;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    iget v3, v0, Lcom/google/android/gms/internal/zzaat;->versionCode:I

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/16 v4, 0xa

    if-le v3, v4, :cond_45

    iget-wide v3, v0, Lcom/google/android/gms/internal/zzaat;->zzcnt:J

    const-wide/16 v5, -0x1

    cmp-long v11, v3, v5

    if-eqz v11, :cond_45

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/zznu;->zzd(J)Lcom/google/android/gms/internal/zzns;

    move-result-object v3

    new-array v4, v9, [Ljava/lang/String;

    const-string v5, "cts"

    aput-object v5, v4, v10

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    :cond_45
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zznu;->zzjf()Lcom/google/android/gms/internal/zzns;

    move-result-object v11

    iget-object v3, v7, Lcom/google/android/gms/internal/zzaca;->zzcrh:Lcom/google/android/gms/internal/zzxk;

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/zzxk;->zzi(Landroid/content/Context;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/zznh;->zzbpy:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v5, v6, v12, v2}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v3

    iget-object v5, v7, Lcom/google/android/gms/internal/zzaca;->zzcrg:Lcom/google/android/gms/internal/zzacx;

    invoke-interface {v5, v1}, Lcom/google/android/gms/internal/zzacx;->zzp(Landroid/content/Context;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/zznh;->zzbnd:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v13

    invoke-virtual {v13, v6}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static {v5, v13, v14, v12, v2}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v5

    iget-object v6, v7, Lcom/google/android/gms/internal/zzaca;->zzcrb:Lcom/google/android/gms/internal/zzafj;

    iget-object v13, v0, Lcom/google/android/gms/internal/zzaat;->zzcne:Landroid/content/pm/PackageInfo;

    iget-object v13, v13, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v6, v13}, Lcom/google/android/gms/internal/zzafj;->zzby(Ljava/lang/String;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v6

    iget-object v13, v7, Lcom/google/android/gms/internal/zzaca;->zzcri:Lcom/google/android/gms/internal/zzafn;

    iget-object v14, v0, Lcom/google/android/gms/internal/zzaat;->zzcnf:Ljava/lang/String;

    iget-object v15, v0, Lcom/google/android/gms/internal/zzaat;->zzcne:Landroid/content/pm/PackageInfo;

    invoke-interface {v13, v14, v15}, Lcom/google/android/gms/internal/zzafn;->zza(Ljava/lang/String;Landroid/content/pm/PackageInfo;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v13

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzes()Lcom/google/android/gms/internal/zzacq;

    move-result-object v14

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/zzacq;->zzo(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v15}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object v16

    iget-object v9, v0, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v9, v9, Lcom/google/android/gms/internal/zzjj;->extras:Landroid/os/Bundle;

    const-string v10, "_ad"

    if-eqz v9, :cond_b0

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_b0

    const/4 v9, 0x1

    goto :goto_b1

    :cond_b0
    const/4 v9, 0x0

    :goto_b1
    iget-boolean v15, v0, Lcom/google/android/gms/internal/zzaat;->zzcnz:Z

    if-eqz v15, :cond_bf

    if-nez v9, :cond_bf

    iget-object v9, v7, Lcom/google/android/gms/internal/zzaca;->zzcre:Lcom/google/android/gms/internal/zzue;

    iget-object v15, v0, Lcom/google/android/gms/internal/zzaat;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-interface {v9, v15}, Lcom/google/android/gms/internal/zzue;->zza(Landroid/content/pm/ApplicationInfo;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v16

    :cond_bf
    move-object/from16 v9, v16

    sget-object v15, Lcom/google/android/gms/internal/zznh;->zzbph:Lcom/google/android/gms/internal/zzmx;

    move-object/from16 v16, v8

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v8

    invoke-virtual {v8, v15}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    move-object/from16 v17, v14

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-static {v9, v14, v15, v12, v2}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v9}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object v14

    sget-object v9, Lcom/google/android/gms/internal/zznh;->zzblh:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v15

    invoke-virtual {v15, v9}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_10a

    iget-object v9, v7, Lcom/google/android/gms/internal/zzaca;->zzcri:Lcom/google/android/gms/internal/zzafn;

    invoke-interface {v9, v1}, Lcom/google/android/gms/internal/zzafn;->zzab(Landroid/content/Context;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v9

    sget-object v14, Lcom/google/android/gms/internal/zznh;->zzbli:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v15

    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Long;

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-static {v9, v14, v15, v12, v2}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v14

    :cond_10a
    iget v9, v0, Lcom/google/android/gms/internal/zzaat;->versionCode:I

    const/4 v15, 0x4

    if-lt v9, v15, :cond_114

    iget-object v9, v0, Lcom/google/android/gms/internal/zzaat;->zzcnk:Landroid/os/Bundle;

    if-eqz v9, :cond_114

    goto :goto_115

    :cond_114
    const/4 v9, 0x0

    :goto_115
    sget-object v15, Lcom/google/android/gms/internal/zznh;->zzbkb:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v15, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v1, v2, v15}, Lcom/google/android/gms/internal/zzahn;->zzd(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_146

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-nez v2, :cond_146

    const-string v2, "Device is offline."

    invoke-static {v2}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    :cond_146
    iget v2, v0, Lcom/google/android/gms/internal/zzaat;->versionCode:I

    const/4 v15, 0x7

    if-lt v2, v15, :cond_14e

    iget-object v2, v0, Lcom/google/android/gms/internal/zzaat;->zzcnq:Ljava/lang/String;

    goto :goto_156

    :cond_14e
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_156
    new-instance v15, Lcom/google/android/gms/internal/zzach;

    move-object/from16 v18, v11

    iget-object v11, v0, Lcom/google/android/gms/internal/zzaat;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-direct {v15, v1, v2, v11}, Lcom/google/android/gms/internal/zzach;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v11, v0, Lcom/google/android/gms/internal/zzaat;->zzcnd:Lcom/google/android/gms/internal/zzjj;

    iget-object v11, v11, Lcom/google/android/gms/internal/zzjj;->extras:Landroid/os/Bundle;

    if-eqz v11, :cond_172

    invoke-virtual {v11, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_172

    invoke-static {v1, v0, v10}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v0

    return-object v0

    :cond_172
    iget-object v10, v7, Lcom/google/android/gms/internal/zzaca;->zzcrc:Lcom/google/android/gms/internal/zzmw;

    iget-object v11, v0, Lcom/google/android/gms/internal/zzaat;->zzcnr:Ljava/util/List;

    invoke-interface {v10, v11}, Lcom/google/android/gms/internal/zzmw;->zzf(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v11

    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    move-object v11, v2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v2, v12}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzacy;

    invoke-static {v8, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/Location;

    invoke-static {v14, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-static {v13, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v12, v17

    invoke-static {v12, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/zzaco;

    if-nez v12, :cond_1c4

    const-string v0, "Error fetching device info. This is not recoverable."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object v0

    :cond_1c4
    new-instance v4, Lcom/google/android/gms/internal/zzabz;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzabz;-><init>()V

    iput-object v0, v4, Lcom/google/android/gms/internal/zzabz;->zzcqv:Lcom/google/android/gms/internal/zzaat;

    iput-object v12, v4, Lcom/google/android/gms/internal/zzabz;->zzcqw:Lcom/google/android/gms/internal/zzaco;

    iput-object v2, v4, Lcom/google/android/gms/internal/zzabz;->zzcqs:Lcom/google/android/gms/internal/zzacy;

    iput-object v3, v4, Lcom/google/android/gms/internal/zzabz;->zzbdn:Landroid/location/Location;

    iput-object v1, v4, Lcom/google/android/gms/internal/zzabz;->zzcqr:Landroid/os/Bundle;

    iput-object v8, v4, Lcom/google/android/gms/internal/zzabz;->zzcnf:Ljava/lang/String;

    iput-object v5, v4, Lcom/google/android/gms/internal/zzabz;->zzcqu:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v10, :cond_1de

    iget-object v1, v4, Lcom/google/android/gms/internal/zzabz;->zzcnr:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_1de
    iput-object v10, v4, Lcom/google/android/gms/internal/zzabz;->zzcnr:Ljava/util/List;

    iput-object v9, v4, Lcom/google/android/gms/internal/zzabz;->zzcnk:Landroid/os/Bundle;

    iput-object v6, v4, Lcom/google/android/gms/internal/zzabz;->zzcqt:Ljava/lang/String;

    iget-object v1, v7, Lcom/google/android/gms/internal/zzaca;->zzcra:Lcom/google/android/gms/internal/zzin;

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzin;->zze(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, v4, Lcom/google/android/gms/internal/zzabz;->zzcqx:Lorg/json/JSONObject;

    iget-boolean v1, v7, Lcom/google/android/gms/internal/zzaca;->zzcqy:Z

    iput-boolean v1, v4, Lcom/google/android/gms/internal/zzabz;->zzcqy:Z

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzabz;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1ff

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object v0

    :cond_1ff
    iget v3, v0, Lcom/google/android/gms/internal/zzaat;->versionCode:I

    const/4 v4, 0x7

    if-ge v3, v4, :cond_20b

    :try_start_204
    const-string v3, "request_id"

    invoke-virtual {v1, v3, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_209
    .catch Lorg/json/JSONException; {:try_start_204 .. :try_end_209} :catch_20a

    goto :goto_20b

    :catch_20a
    nop

    :cond_20b
    :goto_20b
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    const-string v3, "arc"

    const/4 v5, 0x0

    aput-object v3, v4, v5

    move-object/from16 v8, v16

    move-object/from16 v9, v18

    invoke-virtual {v8, v9, v4}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zznu;->zzjf()Lcom/google/android/gms/internal/zzns;

    iget-object v3, v7, Lcom/google/android/gms/internal/zzaca;->zzcrj:Lcom/google/android/gms/internal/zzacf;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzacf;->zznq()Lcom/google/android/gms/internal/zztp;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/zztp;->zzg(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/zzacc;->zzcrn:Lcom/google/android/gms/internal/zzakg;

    move-object/from16 v4, p3

    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;Lcom/google/android/gms/internal/zzakg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    const-wide/16 v10, 0xa

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v10, v11, v3, v4}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    iget-object v3, v7, Lcom/google/android/gms/internal/zzaca;->zzcrd:Lcom/google/android/gms/internal/zzacv;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzacv;->zznz()Lcom/google/android/gms/internal/zzakv;

    move-result-object v3

    if-eqz v3, :cond_247

    const-string v4, "AdRequestServiceImpl.loadAd.flags"

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/zzakj;->zza(Lcom/google/android/gms/internal/zzakv;Ljava/lang/String;)V

    :cond_247
    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/zzakl;->zza(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/gms/internal/zzacn;

    if-nez v5, :cond_258

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object v0

    :cond_258
    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->getErrorCode()I

    move-result v1

    const/4 v4, -0x2

    if-eq v1, v4, :cond_269

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->getErrorCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object v0

    :cond_269
    invoke-virtual {v8}, Lcom/google/android/gms/internal/zznu;->zzji()Lcom/google/android/gms/internal/zzns;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->zznw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_27f

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->zznw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/zzacg;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v15

    goto :goto_280

    :cond_27f
    move-object v15, v3

    :goto_280
    if-nez v15, :cond_2a2

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2a2

    iget-object v1, v0, Lcom/google/android/gms/internal/zzaat;->zzaty:Lcom/google/android/gms/internal/zzakd;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzacn;->getUrl()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p2

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, v8

    move-object/from16 v7, p1

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/zzacb;->zza(Lcom/google/android/gms/internal/zzaat;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzacn;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzaca;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v15

    :cond_2a2
    if-nez v15, :cond_2ab

    new-instance v15, Lcom/google/android/gms/internal/zzaax;

    const/4 v0, 0x0

    invoke-direct {v15, v0}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    goto :goto_2ac

    :cond_2ab
    const/4 v0, 0x0

    :goto_2ac
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "tts"

    aput-object v2, v1, v0

    invoke-virtual {v8, v9, v1}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zznu;->zzjg()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Lcom/google/android/gms/internal/zzaax;->zzcpj:Ljava/lang/String;

    return-object v15
.end method

.method public static zza(Lcom/google/android/gms/internal/zzaat;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzacn;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzaca;)Lcom/google/android/gms/internal/zzaax;
    .registers 24

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    if-eqz v1, :cond_b

    invoke-virtual/range {p6 .. p6}, Lcom/google/android/gms/internal/zznu;->zzjf()Lcom/google/android/gms/internal/zzns;

    move-result-object v3

    goto :goto_c

    :cond_b
    const/4 v3, 0x0

    :goto_c
    :try_start_c
    new-instance v4, Lcom/google/android/gms/internal/zzacl;

    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/zzacn;->zznt()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Lcom/google/android/gms/internal/zzacl;-><init>(Lcom/google/android/gms/internal/zzaat;Ljava/lang/String;)V

    const-string v5, "AdRequestServiceImpl: Sending request: "

    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_26

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2c

    :cond_26
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v5, v6

    :goto_2c
    invoke-static {v5}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v5, Ljava/net/URL;

    move-object/from16 v6, p3

    invoke-direct {v5, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v6

    check-cast v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 2
    :goto_45
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v10

    check-cast v10, Ljava/net/HttpURLConnection;
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_4b} :catch_196

    :try_start_4b
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v11

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    invoke-virtual {v11, v12, v13, v8, v10}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V

    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_6a

    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/zzacn;->zznv()Z

    move-result v11

    if-eqz v11, :cond_6a

    const-string v11, "x-afma-drt-cookie"

    move-object/from16 v14, p4

    invoke-virtual {v10, v11, v14}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6c

    :cond_6a
    move-object/from16 v14, p4

    :goto_6c
    iget-object v11, v0, Lcom/google/android/gms/internal/zzaat;->zzcoa:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_7e

    const-string v15, "Sending webview cookie in ad request header."

    invoke-static {v15}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    const-string v15, "Cookie"

    invoke-virtual {v10, v15, v11}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7e
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/zzacn;->zznu()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    const/4 v15, 0x1

    if-nez v11, :cond_b2

    invoke-virtual {v10, v15}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/zzacn;->zznu()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->getBytes()[B

    move-result-object v11

    array-length v2, v11

    invoke-virtual {v10, v2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_98
    .catchall {:try_start_4b .. :try_end_98} :catchall_191

    :try_start_98
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8

    invoke-direct {v2, v8}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_a1
    .catchall {:try_start_98 .. :try_end_a1} :catchall_aa

    :try_start_a1
    invoke-virtual {v2, v11}, Ljava/io/BufferedOutputStream;->write([B)V
    :try_end_a4
    .catchall {:try_start_a1 .. :try_end_a4} :catchall_a8

    .line 3
    :try_start_a4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_a7
    .catch Ljava/io/IOException; {:try_start_a4 .. :try_end_a7} :catch_b3
    .catchall {:try_start_a4 .. :try_end_a7} :catchall_191

    goto :goto_b3

    :catchall_a8
    move-exception v0

    goto :goto_ac

    :catchall_aa
    move-exception v0

    const/4 v2, 0x0

    :goto_ac
    if-eqz v2, :cond_b1

    :try_start_ae
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_b1
    .catch Ljava/io/IOException; {:try_start_ae .. :try_end_b1} :catch_b1
    .catchall {:try_start_ae .. :try_end_b1} :catchall_191

    .line 4
    :catch_b1
    :cond_b1
    :try_start_b1
    throw v0

    :cond_b2
    const/4 v11, 0x0

    :catch_b3
    :goto_b3
    new-instance v2, Lcom/google/android/gms/internal/zzajv;

    iget-object v8, v0, Lcom/google/android/gms/internal/zzaat;->zzcnq:Ljava/lang/String;

    invoke-direct {v2, v8}, Lcom/google/android/gms/internal/zzajv;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10, v11}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;[B)V

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v2, v10, v8}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;I)V

    const/16 v15, 0xc8

    const/16 v0, 0x12c

    if-lt v8, v15, :cond_114

    if-ge v8, v0, :cond_114

    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_d4
    .catchall {:try_start_b1 .. :try_end_d4} :catchall_191

    :try_start_d4
    new-instance v5, Ljava/io/InputStreamReader;

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    invoke-direct {v5, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_dd
    .catchall {:try_start_d4 .. :try_end_dd} :catchall_10c

    :try_start_dd
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzahn;->zza(Ljava/io/InputStreamReader;)Ljava/lang/String;

    move-result-object v9
    :try_end_e4
    .catchall {:try_start_dd .. :try_end_e4} :catchall_109

    .line 5
    :try_start_e4
    invoke-virtual {v5}, Ljava/io/InputStreamReader;->close()V
    :try_end_e7
    .catch Ljava/io/IOException; {:try_start_e4 .. :try_end_e7} :catch_e7
    .catchall {:try_start_e4 .. :try_end_e7} :catchall_191

    .line 6
    :catch_e7
    :try_start_e7
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/zzajv;->zzcr(Ljava/lang/String;)V

    invoke-static {v0, v11, v9, v8}, Lcom/google/android/gms/internal/zzacb;->zza(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V

    invoke-virtual {v4, v0, v11, v9}, Lcom/google/android/gms/internal/zzacl;->zza(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    if-eqz v1, :cond_fd

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "ufe"

    const/4 v5, 0x0

    aput-object v2, v0, v5

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/zznu;->zza(Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    :cond_fd
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/zzacn;->zznx()Z

    move-result v0

    invoke-virtual {v4, v6, v7, v0}, Lcom/google/android/gms/internal/zzacl;->zza(JZ)Lcom/google/android/gms/internal/zzaax;

    move-result-object v0
    :try_end_105
    .catchall {:try_start_e7 .. :try_end_105} :catchall_191

    :try_start_105
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_108
    .catch Ljava/io/IOException; {:try_start_105 .. :try_end_108} :catch_196

    return-object v0

    :catchall_109
    move-exception v0

    move-object v2, v5

    goto :goto_10e

    :catchall_10c
    move-exception v0

    const/4 v2, 0x0

    :goto_10e
    if-eqz v2, :cond_113

    .line 7
    :try_start_110
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_113
    .catch Ljava/io/IOException; {:try_start_110 .. :try_end_113} :catch_113
    .catchall {:try_start_110 .. :try_end_113} :catchall_191

    .line 8
    :catch_113
    :cond_113
    :try_start_113
    throw v0

    :cond_114
    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v11, v5, v8}, Lcom/google/android/gms/internal/zzacb;->zza(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V

    if-lt v8, v0, :cond_171

    const/16 v0, 0x190

    if-ge v8, v0, :cond_171

    const-string v0, "Location"

    invoke-virtual {v10, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_13d

    const-string v0, "No location header to follow redirect."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V
    :try_end_139
    .catchall {:try_start_113 .. :try_end_139} :catchall_191

    :try_start_139
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13c
    .catch Ljava/io/IOException; {:try_start_139 .. :try_end_13c} :catch_196

    return-object v0

    :cond_13d
    :try_start_13d
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    add-int/2addr v9, v0

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbrh:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v9, v0, :cond_165

    const-string v0, "Too many redirects."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V
    :try_end_161
    .catchall {:try_start_13d .. :try_end_161} :catchall_191

    :try_start_161
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_164
    .catch Ljava/io/IOException; {:try_start_161 .. :try_end_164} :catch_196

    return-object v0

    :cond_165
    :try_start_165
    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/zzacl;->zzo(Ljava/util/Map;)V
    :try_end_168
    .catchall {:try_start_165 .. :try_end_168} :catchall_191

    :try_start_168
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_16b
    .catch Ljava/io/IOException; {:try_start_168 .. :try_end_16b} :catch_196

    move-object/from16 v0, p0

    move-object v5, v2

    const/4 v8, 0x0

    goto/16 :goto_45

    :cond_171
    const/16 v0, 0x2e

    :try_start_173
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Received error HTTP response code: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V
    :try_end_18d
    .catchall {:try_start_173 .. :try_end_18d} :catchall_191

    :try_start_18d
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_191
    move-exception v0

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0
    :try_end_196
    .catch Ljava/io/IOException; {:try_start_18d .. :try_end_196} :catch_196

    :catch_196
    move-exception v0

    const-string v1, "Error while connecting to ad server: "

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1ac

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1b1

    :cond_1ac
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1b1
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    return-object v0
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaca;)Lcom/google/android/gms/internal/zzacb;
    .registers 4

    sget-object v0, Lcom/google/android/gms/internal/zzacb;->sLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/zzacb;->zzcrk:Lcom/google/android/gms/internal/zzacb;

    if-nez v1, :cond_2b

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :cond_11
    invoke-static {p0}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/gms/internal/zzacb;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzacb;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzaca;)V

    sput-object v1, Lcom/google/android/gms/internal/zzacb;->zzcrk:Lcom/google/android/gms/internal/zzacb;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_28

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzahn;->zzai(Landroid/content/Context;)Z

    :cond_28
    invoke-static {p0}, Lcom/google/android/gms/internal/zzagd;->zzae(Landroid/content/Context;)V

    :cond_2b
    sget-object p0, Lcom/google/android/gms/internal/zzacb;->zzcrk:Lcom/google/android/gms/internal/zzacb;

    monitor-exit v0

    return-object p0

    :catchall_2f
    move-exception p0

    monitor-exit v0
    :try_end_31
    .catchall {:try_start_3 .. :try_end_31} :catchall_2f

    throw p0
.end method

.method private static zza(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result v0

    if-eqz v0, :cond_db

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x27

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Http Response: {\n  URL:\n    "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n  Headers:"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    if-eqz p1, :cond_93

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_34
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_93

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "    "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "      "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_8a

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_8f

    :cond_8a
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_8f
    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    goto :goto_6d

    :cond_93
    const-string p0, "  Body:"

    invoke-static {p0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    if-eqz p2, :cond_bb

    const/4 p0, 0x0

    :goto_9b
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    const v0, 0x186a0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge p0, p1, :cond_c0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit16 v0, p0, 0x3e8

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    move p0, v0

    goto :goto_9b

    :cond_bb
    const-string p0, "    null"

    invoke-static {p0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :cond_c0
    const/16 p0, 0x22

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "  Response Code:\n    "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "\n}"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :cond_db
    return-void
.end method

.method public static final synthetic zzm(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzakv;
    .registers 2

    new-instance v0, Lcom/google/android/gms/internal/zzacn;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzacn;-><init>(Lorg/json/JSONObject;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzabe;)V
    .registers 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacb;->mContext:Landroid/content/Context;

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaat;->zzaty:Lcom/google/android/gms/internal/zzakd;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzaft;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V

    new-instance v0, Lcom/google/android/gms/internal/zzacd;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzacd;-><init>(Lcom/google/android/gms/internal/zzacb;Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzabe;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahh;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzew()Lcom/google/android/gms/internal/zzajf;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzajf;->zzqs()Landroid/os/Looper;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzew()Lcom/google/android/gms/internal/zzajf;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzajf;->getHandler()Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/zzace;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzace;-><init>(Lcom/google/android/gms/internal/zzacb;Ljava/util/concurrent/Future;)V

    const-wide/32 v1, 0xea60

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzabm;Lcom/google/android/gms/internal/zzabh;)V
    .registers 3

    const-string p1, "Nonagon code path entered in octagon"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzaax;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacb;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacb;->zzcrl:Lcom/google/android/gms/internal/zzaca;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacb;->zzcrm:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/gms/internal/zzacb;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaca;Lcom/google/android/gms/internal/zzaat;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/zzaax;

    move-result-object p1

    return-object p1
.end method
