.class public Lcom/google/android/gms/internal/zzdm;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdm$zza;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "zzdm"


# instance fields
.field private volatile zzahr:Z

.field public zzair:Landroid/content/Context;

.field private zzais:Ljava/util/concurrent/ExecutorService;

.field private zzait:Ldalvik/system/DexClassLoader;

.field private zzaiu:Lcom/google/android/gms/internal/zzcx;

.field private zzaiv:[B

.field private volatile zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

.field private zzaix:Ljava/util/concurrent/Future;

.field private zzaiy:Z

.field private volatile zzaiz:Lcom/google/android/gms/internal/zzaz;

.field private zzaja:Ljava/util/concurrent/Future;

.field private zzajb:Lcom/google/android/gms/internal/zzcp;

.field private zzajc:Z

.field private zzajd:Z

.field private zzaje:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/zzer;",
            ">;"
        }
    .end annotation
.end field

.field private zzajf:Z

.field private zzajg:Z

.field private zzajh:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzahr:Z

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaix:Ljava/util/concurrent/Future;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiz:Lcom/google/android/gms/internal/zzaz;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaja:Ljava/util/concurrent/Future;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzajc:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzajd:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzajf:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajg:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzajh:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_21

    const/4 v1, 0x1

    :cond_21
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzdm;->zzaiy:Z

    if-eqz v1, :cond_26

    move-object p1, v2

    :cond_26
    iput-object p1, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdm;->zzaje:Ljava/util/Map;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzaz;)Lcom/google/android/gms/internal/zzaz;
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdm;->zzaiz:Lcom/google/android/gms/internal/zzaz;

    return-object p1
.end method

.method public static zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/zzdm;
    .registers 13

    const-string v0, "%s/%s.dex"

    new-instance v1, Lcom/google/android/gms/internal/zzdm;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzdm;-><init>(Landroid/content/Context;)V

    :try_start_7
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    iput-object p0, v1, Lcom/google/android/gms/internal/zzdm;->zzais:Ljava/util/concurrent/ExecutorService;

    iput-boolean p3, v1, Lcom/google/android/gms/internal/zzdm;->zzahr:Z

    if-eqz p3, :cond_1e

    iget-object p0, v1, Lcom/google/android/gms/internal/zzdm;->zzais:Ljava/util/concurrent/ExecutorService;

    new-instance p3, Lcom/google/android/gms/internal/zzdn;

    invoke-direct {p3, v1}, Lcom/google/android/gms/internal/zzdn;-><init>(Lcom/google/android/gms/internal/zzdm;)V

    invoke-interface {p0, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    iput-object p0, v1, Lcom/google/android/gms/internal/zzdm;->zzaix:Ljava/util/concurrent/Future;

    :cond_1e
    iget-object p0, v1, Lcom/google/android/gms/internal/zzdm;->zzais:Ljava/util/concurrent/ExecutorService;

    new-instance p3, Lcom/google/android/gms/internal/zzdp;

    invoke-direct {p3, v1}, Lcom/google/android/gms/internal/zzdp;-><init>(Lcom/google/android/gms/internal/zzdm;)V

    invoke-interface {p0, p3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_28
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_7 .. :try_end_28} :catch_161

    const/4 p0, 0x1

    const/4 p3, 0x0

    .line 1
    :try_start_2a
    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    .line 2
    iget-object v3, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-static {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ(Landroid/content/Context;)I

    move-result v3

    if-lez v3, :cond_36

    const/4 v3, 0x1

    goto :goto_37

    :cond_36
    const/4 v3, 0x0

    :goto_37
    iput-boolean v3, v1, Lcom/google/android/gms/internal/zzdm;->zzajc:Z

    iget-object v3, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->げつ〴ぬぐ(Landroid/content/Context;)I

    move-result v2

    if-nez v2, :cond_43

    const/4 v2, 0x1

    goto :goto_44

    :cond_43
    const/4 v2, 0x0

    :goto_44
    iput-boolean v2, v1, Lcom/google/android/gms/internal/zzdm;->zzajd:Z
    :try_end_46
    .catchall {:try_start_2a .. :try_end_46} :catchall_46

    :catchall_46
    :try_start_46
    invoke-virtual {v1, p3, p0}, Lcom/google/android/gms/internal/zzdm;->zza(IZ)V

    invoke-static {}, Lcom/google/android/gms/internal/zzdr;->zzau()Z

    move-result v2

    if-eqz v2, :cond_6a

    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbnv:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_62

    goto :goto_6a

    :cond_62
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Task Context initialization must not be called from the UI thread."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6a
    :goto_6a
    new-instance v2, Lcom/google/android/gms/internal/zzcx;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzcx;-><init>(Ljava/security/SecureRandom;)V

    iput-object v2, v1, Lcom/google/android/gms/internal/zzdm;->zzaiu:Lcom/google/android/gms/internal/zzcx;
    :try_end_72
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_46 .. :try_end_72} :catch_161

    :try_start_72
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzcx;->zzl(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, v1, Lcom/google/android/gms/internal/zzdm;->zzaiv:[B
    :try_end_78
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_72 .. :try_end_78} :catch_15a
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_72 .. :try_end_78} :catch_161

    :try_start_78
    iget-object p1, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_91

    iget-object p1, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    const-string v2, "dex"

    invoke-virtual {p1, v2, p3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_8b

    goto :goto_91

    :cond_8b
    new-instance p0, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzdj;-><init>()V

    throw p0

    :cond_91
    :goto_91
    const-string v2, "1505450608132"

    new-instance v4, Ljava/io/File;

    const-string v5, "%s/%s.jar"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    aput-object p1, v7, p3

    aput-object v2, v7, p0

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_c2

    iget-object v5, v1, Lcom/google/android/gms/internal/zzdm;->zzaiu:Lcom/google/android/gms/internal/zzcx;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzdm;->zzaiv:[B

    invoke-virtual {v5, v7, p2}, Lcom/google/android/gms/internal/zzcx;->zzb([BLjava/lang/String;)[B

    move-result-object p2

    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    array-length v7, p2

    invoke-virtual {v5, p2, p3, v7}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    :cond_c2
    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;Ljava/lang/String;)Z
    :try_end_c5
    .catch Ljava/io/FileNotFoundException; {:try_start_78 .. :try_end_c5} :catch_153
    .catch Ljava/io/IOException; {:try_start_78 .. :try_end_c5} :catch_14c
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_78 .. :try_end_c5} :catch_145
    .catch Ljava/lang/NullPointerException; {:try_start_78 .. :try_end_c5} :catch_13e
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_78 .. :try_end_c5} :catch_161

    :try_start_c5
    new-instance p2, Ldalvik/system/DexClassLoader;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-direct {p2, v5, v7, v3, v8}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    iput-object p2, v1, Lcom/google/android/gms/internal/zzdm;->zzait:Ldalvik/system/DexClassLoader;
    :try_end_da
    .catchall {:try_start_c5 .. :try_end_da} :catchall_129

    :try_start_da
    invoke-static {v4}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/zzdm;->zza(Ljava/io/File;Ljava/lang/String;)V

    new-array p2, v6, [Ljava/lang/Object;

    aput-object p1, p2, p3

    aput-object v2, p2, p0

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdm;->zzm(Ljava/lang/String;)V
    :try_end_ed
    .catch Ljava/io/FileNotFoundException; {:try_start_da .. :try_end_ed} :catch_153
    .catch Ljava/io/IOException; {:try_start_da .. :try_end_ed} :catch_14c
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_da .. :try_end_ed} :catch_145
    .catch Ljava/lang/NullPointerException; {:try_start_da .. :try_end_ed} :catch_13e
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_da .. :try_end_ed} :catch_161

    :try_start_ed
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbnn:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_11f

    iget-boolean p1, v1, Lcom/google/android/gms/internal/zzdm;->zzajh:Z

    if-eqz p1, :cond_104

    goto :goto_11f

    :cond_104
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string p2, "android.intent.action.USER_PRESENT"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object p2, v1, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    new-instance p3, Lcom/google/android/gms/internal/zzdm$zza;

    invoke-direct {p3, v1, v3}, Lcom/google/android/gms/internal/zzdm$zza;-><init>(Lcom/google/android/gms/internal/zzdm;Lcom/google/android/gms/internal/zzdn;)V

    invoke-virtual {p2, p3, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-boolean p0, v1, Lcom/google/android/gms/internal/zzdm;->zzajh:Z

    :cond_11f
    :goto_11f
    new-instance p1, Lcom/google/android/gms/internal/zzcp;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/zzcp;-><init>(Lcom/google/android/gms/internal/zzdm;)V

    iput-object p1, v1, Lcom/google/android/gms/internal/zzdm;->zzajb:Lcom/google/android/gms/internal/zzcp;

    iput-boolean p0, v1, Lcom/google/android/gms/internal/zzdm;->zzajf:Z
    :try_end_128
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_ed .. :try_end_128} :catch_161

    goto :goto_161

    :catchall_129
    move-exception p2

    :try_start_12a
    invoke-static {v4}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/zzdm;->zza(Ljava/io/File;Ljava/lang/String;)V

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p1, v3, p3

    aput-object v2, v3, p0

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzdm;->zzm(Ljava/lang/String;)V

    throw p2
    :try_end_13e
    .catch Ljava/io/FileNotFoundException; {:try_start_12a .. :try_end_13e} :catch_153
    .catch Ljava/io/IOException; {:try_start_12a .. :try_end_13e} :catch_14c
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_12a .. :try_end_13e} :catch_145
    .catch Ljava/lang/NullPointerException; {:try_start_12a .. :try_end_13e} :catch_13e
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_12a .. :try_end_13e} :catch_161

    :catch_13e
    move-exception p0

    :try_start_13f
    new-instance p1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzdj;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_145
    move-exception p0

    new-instance p1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzdj;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_14c
    move-exception p0

    new-instance p1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzdj;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_153
    move-exception p0

    new-instance p1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzdj;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_15a
    move-exception p0

    new-instance p1, Lcom/google/android/gms/internal/zzdj;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/zzdj;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_161
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_13f .. :try_end_161} :catch_161

    :catch_161
    :goto_161
    return-object v1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdm;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzdm;->zzaq()V

    return-void
.end method

.method private final zza(Ljava/io/File;Ljava/lang/String;)V
    .registers 11

    new-instance v0, Ljava/io/File;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v4, 0x1

    aput-object p2, v2, v4

    const-string v5, "%s/%s.tmp"

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1b

    return-void

    :cond_1b
    new-instance v2, Ljava/io/File;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object p2, v1, v4

    const-string p1, "%s/%s.dex"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_33

    return-void

    :cond_33
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-gtz p1, :cond_3e

    return-void

    :cond_3e
    long-to-int p1, v4

    new-array p1, p1, [B

    const/4 v1, 0x0

    :try_start_42
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_47
    .catch Ljava/io/IOException; {:try_start_42 .. :try_end_47} :catch_b3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_42 .. :try_end_47} :catch_b3
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_42 .. :try_end_47} :catch_b3
    .catchall {:try_start_42 .. :try_end_47} :catchall_a1

    :try_start_47
    invoke-virtual {v4, p1}, Ljava/io/FileInputStream;->read([B)I

    move-result v5
    :try_end_4b
    .catch Ljava/io/IOException; {:try_start_47 .. :try_end_4b} :catch_9e
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_47 .. :try_end_4b} :catch_9e
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_47 .. :try_end_4b} :catch_9e
    .catchall {:try_start_47 .. :try_end_4b} :catchall_9a

    if-gtz v5, :cond_54

    :try_start_4d
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_50
    .catch Ljava/io/IOException; {:try_start_4d .. :try_end_50} :catch_50

    :catch_50
    invoke-static {v2}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    return-void

    :cond_54
    :try_start_54
    new-instance v5, Lcom/google/android/gms/internal/zzbd;

    invoke-direct {v5}, Lcom/google/android/gms/internal/zzbd;-><init>()V

    sget-object v6, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    iput-object v6, v5, Lcom/google/android/gms/internal/zzbd;->zzgn:[B

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    iput-object p2, v5, Lcom/google/android/gms/internal/zzbd;->zzgm:[B

    iget-object p2, p0, Lcom/google/android/gms/internal/zzdm;->zzaiu:Lcom/google/android/gms/internal/zzcx;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzdm;->zzaiv:[B

    invoke-virtual {p2, v6, p1}, Lcom/google/android/gms/internal/zzcx;->zzc([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    iput-object p1, v5, Lcom/google/android/gms/internal/zzbd;->data:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbw;->zzb([B)[B

    move-result-object p1

    iput-object p1, v5, Lcom/google/android/gms/internal/zzbd;->zzgl:[B

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_83
    .catch Ljava/io/IOException; {:try_start_54 .. :try_end_83} :catch_9e
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_54 .. :try_end_83} :catch_9e
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_54 .. :try_end_83} :catch_9e
    .catchall {:try_start_54 .. :try_end_83} :catchall_9a

    :try_start_83
    invoke-static {v5}, Lcom/google/android/gms/internal/zzfjs;->zzc(Lcom/google/android/gms/internal/zzfjs;)[B

    move-result-object p2

    array-length v0, p2

    invoke-virtual {p1, p2, v3, v0}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_8e
    .catch Ljava/io/IOException; {:try_start_83 .. :try_end_8e} :catch_9f
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_83 .. :try_end_8e} :catch_9f
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_83 .. :try_end_8e} :catch_9f
    .catchall {:try_start_83 .. :try_end_8e} :catchall_98

    :try_start_8e
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_91
    .catch Ljava/io/IOException; {:try_start_8e .. :try_end_91} :catch_91

    :catch_91
    :try_start_91
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_94
    .catch Ljava/io/IOException; {:try_start_91 .. :try_end_94} :catch_94

    :catch_94
    invoke-static {v2}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    return-void

    :catchall_98
    move-exception p2

    goto :goto_9c

    :catchall_9a
    move-exception p2

    move-object p1, v1

    :goto_9c
    move-object v1, v4

    goto :goto_a3

    :catch_9e
    move-object p1, v1

    :catch_9f
    move-object v1, v4

    goto :goto_b4

    :catchall_a1
    move-exception p2

    move-object p1, v1

    :goto_a3
    if-eqz v1, :cond_aa

    :try_start_a5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_a8
    .catch Ljava/io/IOException; {:try_start_a5 .. :try_end_a8} :catch_a9

    goto :goto_aa

    :catch_a9
    nop

    :cond_aa
    :goto_aa
    if-eqz p1, :cond_af

    :try_start_ac
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_af
    .catch Ljava/io/IOException; {:try_start_ac .. :try_end_af} :catch_af

    :catch_af
    :cond_af
    invoke-static {v2}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    throw p2

    :catch_b3
    move-object p1, v1

    :goto_b4
    if-eqz v1, :cond_bb

    :try_start_b6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_b9
    .catch Ljava/io/IOException; {:try_start_b6 .. :try_end_b9} :catch_ba

    goto :goto_bb

    :catch_ba
    nop

    :cond_bb
    :goto_bb
    if-eqz p1, :cond_c0

    :try_start_bd
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_c0
    .catch Ljava/io/IOException; {:try_start_bd .. :try_end_c0} :catch_c0

    :catch_c0
    :cond_c0
    invoke-static {v2}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    return-void
.end method

.method private static zza(ILcom/google/android/gms/internal/zzaz;)Z
    .registers 6

    const/4 v0, 0x4

    if-ge p0, v0, :cond_4b

    const/4 p0, 0x1

    if-nez p1, :cond_7

    return p0

    :cond_7
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbny:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaz;->zzcw:Ljava/lang/String;

    if-eqz v0, :cond_25

    const-string v1, "0000000000000000000000000000000000000000000000000000000000000000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    :cond_25
    return p0

    :cond_26
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbnz:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4b

    iget-object p1, p1, Lcom/google/android/gms/internal/zzaz;->zzfi:Lcom/google/android/gms/internal/zzbe;

    if-eqz p1, :cond_4a

    iget-object p1, p1, Lcom/google/android/gms/internal/zzbe;->zzgg:Ljava/lang/Long;

    if-eqz p1, :cond_4a

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x2

    cmp-long p1, v0, v2

    if-nez p1, :cond_4b

    :cond_4a
    return p0

    :cond_4b
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdm;Z)Z
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzdm;->zzajg:Z

    return p1
.end method

.method private final zzaq()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    if-nez v0, :cond_14

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiy:Z

    if-eqz v0, :cond_14

    new-instance v0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->start()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    :try_end_14
    .catch Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/げつ〴ぬぐ; {:try_start_0 .. :try_end_14} :catch_15
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_14} :catch_15

    :cond_14
    return-void

    :catch_15
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    return-void
.end method

.method private final zzar()Lcom/google/android/gms/internal/zzaz;
    .registers 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/zzcbm;->zzm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzaz;

    move-result-object v0
    :try_end_21
    .catchall {:try_start_0 .. :try_end_21} :catchall_22

    goto :goto_23

    :catchall_22
    const/4 v0, 0x0

    :goto_23
    return-object v0
.end method

.method private static zzb(Ljava/io/File;)V
    .registers 3

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_16

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "File %s not found. No need for deletion"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    return-void

    :cond_16
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public static synthetic zzb(ILcom/google/android/gms/internal/zzaz;)Z
    .registers 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzdm;->zza(ILcom/google/android/gms/internal/zzaz;)Z

    move-result p0

    return p0
.end method

.method private final zzb(Ljava/io/File;Ljava/lang/String;)Z
    .registers 12

    new-instance v0, Ljava/io/File;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v4, 0x1

    aput-object p2, v2, v4

    const-string v5, "%s/%s.tmp"

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1b

    return v3

    :cond_1b
    new-instance v2, Ljava/io/File;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object p2, v1, v4

    const-string p1, "%s/%s.dex"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_33

    return v3

    :cond_33
    const/4 p1, 0x0

    :try_start_34
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v1, v5, v7

    if-gtz v1, :cond_42

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    return v3

    :cond_42
    long-to-int v1, v5

    new-array v1, v1, [B

    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_4a
    .catch Ljava/io/IOException; {:try_start_34 .. :try_end_4a} :catch_cd
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_34 .. :try_end_4a} :catch_cd
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_34 .. :try_end_4a} :catch_cd
    .catchall {:try_start_34 .. :try_end_4a} :catchall_be

    :try_start_4a
    invoke-virtual {v5, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v6

    if-gtz v6, :cond_57

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V
    :try_end_53
    .catch Ljava/io/IOException; {:try_start_4a .. :try_end_53} :catch_bb
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4a .. :try_end_53} :catch_bb
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_4a .. :try_end_53} :catch_bb
    .catchall {:try_start_4a .. :try_end_53} :catchall_b7

    :try_start_53
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_56
    .catch Ljava/io/IOException; {:try_start_53 .. :try_end_56} :catch_56

    :catch_56
    return v3

    :cond_57
    :try_start_57
    new-instance v6, Lcom/google/android/gms/internal/zzbd;

    invoke-direct {v6}, Lcom/google/android/gms/internal/zzbd;-><init>()V

    invoke-static {v6, v1}, Lcom/google/android/gms/internal/zzfjs;->zza(Lcom/google/android/gms/internal/zzfjs;[B)Lcom/google/android/gms/internal/zzfjs;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzbd;

    new-instance v6, Ljava/lang/String;

    iget-object v7, v1, Lcom/google/android/gms/internal/zzbd;->zzgm:[B

    invoke-direct {v6, v7}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b0

    iget-object p2, v1, Lcom/google/android/gms/internal/zzbd;->zzgl:[B

    iget-object v6, v1, Lcom/google/android/gms/internal/zzbd;->data:[B

    invoke-static {v6}, Lcom/google/android/gms/internal/zzbw;->zzb([B)[B

    move-result-object v6

    invoke-static {p2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-eqz p2, :cond_b0

    iget-object p2, v1, Lcom/google/android/gms/internal/zzbd;->zzgn:[B

    sget-object v6, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-static {p2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_8c

    goto :goto_b0

    :cond_8c
    iget-object p2, p0, Lcom/google/android/gms/internal/zzdm;->zzaiu:Lcom/google/android/gms/internal/zzcx;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiv:[B

    new-instance v6, Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzbd;->data:[B

    invoke-direct {v6, v1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p2, v0, v6}, Lcom/google/android/gms/internal/zzcx;->zzb([BLjava/lang/String;)[B

    move-result-object p2

    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_a3
    .catch Ljava/io/IOException; {:try_start_57 .. :try_end_a3} :catch_bb
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_57 .. :try_end_a3} :catch_bb
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_57 .. :try_end_a3} :catch_bb
    .catchall {:try_start_57 .. :try_end_a3} :catchall_b7

    :try_start_a3
    array-length p1, p2

    invoke-virtual {v0, p2, v3, p1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_a7
    .catch Ljava/io/IOException; {:try_start_a3 .. :try_end_a7} :catch_bc
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_a3 .. :try_end_a7} :catch_bc
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_a3 .. :try_end_a7} :catch_bc
    .catchall {:try_start_a3 .. :try_end_a7} :catchall_ae

    :try_start_a7
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_aa
    .catch Ljava/io/IOException; {:try_start_a7 .. :try_end_aa} :catch_aa

    :catch_aa
    :try_start_aa
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_ad
    .catch Ljava/io/IOException; {:try_start_aa .. :try_end_ad} :catch_ad

    :catch_ad
    return v4

    :catchall_ae
    move-exception p2

    goto :goto_b9

    :cond_b0
    :goto_b0
    :try_start_b0
    invoke-static {v0}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V
    :try_end_b3
    .catch Ljava/io/IOException; {:try_start_b0 .. :try_end_b3} :catch_bb
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_b0 .. :try_end_b3} :catch_bb
    .catch Lcom/google/android/gms/internal/zzcy; {:try_start_b0 .. :try_end_b3} :catch_bb
    .catchall {:try_start_b0 .. :try_end_b3} :catchall_b7

    :try_start_b3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_b6
    .catch Ljava/io/IOException; {:try_start_b3 .. :try_end_b6} :catch_b6

    :catch_b6
    return v3

    :catchall_b7
    move-exception p2

    move-object v0, p1

    :goto_b9
    move-object p1, v5

    goto :goto_c0

    :catch_bb
    move-object v0, p1

    :catch_bc
    move-object p1, v5

    goto :goto_ce

    :catchall_be
    move-exception p2

    move-object v0, p1

    :goto_c0
    if-eqz p1, :cond_c7

    :try_start_c2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_c5
    .catch Ljava/io/IOException; {:try_start_c2 .. :try_end_c5} :catch_c6

    goto :goto_c7

    :catch_c6
    nop

    :cond_c7
    :goto_c7
    if-eqz v0, :cond_cc

    :try_start_c9
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_cc
    .catch Ljava/io/IOException; {:try_start_c9 .. :try_end_cc} :catch_cc

    :catch_cc
    :cond_cc
    throw p2

    :catch_cd
    move-object v0, p1

    :goto_ce
    if-eqz p1, :cond_d5

    :try_start_d0
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_d3
    .catch Ljava/io/IOException; {:try_start_d0 .. :try_end_d3} :catch_d4

    goto :goto_d5

    :catch_d4
    nop

    :cond_d5
    :goto_d5
    if-eqz v0, :cond_da

    :try_start_d7
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_da
    .catch Ljava/io/IOException; {:try_start_d7 .. :try_end_da} :catch_da

    :catch_da
    :cond_da
    return v3
.end method

.method private static zzm(Ljava/lang/String;)V
    .registers 2

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdm;->zzb(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    return-object v0
.end method

.method public final isInitialized()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajf:Z

    return v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaje:Ljava/util/Map;

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzer;

    if-nez p1, :cond_11

    const/4 p1, 0x0

    return-object p1

    :cond_11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzer;->zzbd()Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final zza(IZ)V
    .registers 5

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajd:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzais:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/zzdo;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/zzdo;-><init>(Lcom/google/android/gms/internal/zzdm;IZ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p2

    if-nez p1, :cond_14

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdm;->zzaja:Ljava/util/concurrent/Future;

    :cond_14
    return-void
.end method

.method public final varargs zza(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaje:Ljava/util/Map;

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaje:Ljava/util/Map;

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/zzer;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzer;-><init>(Lcom/google/android/gms/internal/zzdm;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_1e
    const/4 p1, 0x0

    return p1
.end method

.method public final zzac()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajb:Lcom/google/android/gms/internal/zzcp;

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/google/android/gms/internal/zzcp;->zzac()I

    move-result v0

    goto :goto_b

    :cond_9
    const/high16 v0, -0x80000000

    :goto_b
    return v0
.end method

.method public final zzag()Ljava/util/concurrent/ExecutorService;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzais:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public final zzah()Ldalvik/system/DexClassLoader;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzait:Ldalvik/system/DexClassLoader;

    return-object v0
.end method

.method public final zzai()Lcom/google/android/gms/internal/zzcx;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiu:Lcom/google/android/gms/internal/zzcx;

    return-object v0
.end method

.method public final zzaj()[B
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiv:[B

    return-object v0
.end method

.method public final zzak()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajc:Z

    return v0
.end method

.method public final zzal()Lcom/google/android/gms/internal/zzcp;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajb:Lcom/google/android/gms/internal/zzcp;

    return-object v0
.end method

.method public final zzam()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajd:Z

    return v0
.end method

.method public final zzan()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzajg:Z

    return v0
.end method

.method public final zzao()Lcom/google/android/gms/internal/zzaz;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiz:Lcom/google/android/gms/internal/zzaz;

    return-object v0
.end method

.method public final zzap()Ljava/util/concurrent/Future;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaja:Ljava/util/concurrent/Future;

    return-object v0
.end method

.method public final zzas()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    .registers 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdm;->zzahr:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    return-object v0

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaix:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_21

    const-wide/16 v2, 0x7d0

    :try_start_13
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzdm;->zzaix:Ljava/util/concurrent/Future;
    :try_end_1a
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_1a} :catch_21
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_13 .. :try_end_1a} :catch_21
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_13 .. :try_end_1a} :catch_1b

    goto :goto_21

    :catch_1b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaix:Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :catch_21
    :cond_21
    :goto_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdm;->zzaiw:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    return-object v0
.end method

.method public final zzb(IZ)Lcom/google/android/gms/internal/zzaz;
    .registers 3

    if-lez p1, :cond_a

    if-eqz p2, :cond_a

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long p1, p1

    :try_start_7
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_a} :catch_a

    :catch_a
    :cond_a
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzdm;->zzar()Lcom/google/android/gms/internal/zzaz;

    move-result-object p1

    return-object p1
.end method
