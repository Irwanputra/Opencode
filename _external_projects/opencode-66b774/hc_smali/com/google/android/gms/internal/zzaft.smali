.class public final Lcom/google/android/gms/internal/zzaft;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzahg;
.implements Lcom/google/android/gms/internal/zzhj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzanq:Lcom/google/android/gms/internal/zzfs;

.field private zzapr:Lcom/google/android/gms/internal/zzakd;

.field private zzare:Z

.field private zzazc:Lcom/google/android/gms/internal/zzhf;

.field private zzcsn:Z

.field private zzcso:Z

.field private zzcsp:Z

.field private zzcsw:Z

.field private final zzcyq:Lcom/google/android/gms/internal/zzafx;

.field private zzcyr:Ljava/math/BigInteger;

.field private final zzcys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/zzafq;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcyt:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzafz;",
            ">;"
        }
    .end annotation
.end field

.field private zzcyu:Z

.field private zzcyv:I

.field private zzcyw:Lcom/google/android/gms/internal/zznk;

.field private zzcyx:Lcom/google/android/gms/internal/zzhk;

.field private zzcyy:Ljava/lang/String;

.field private zzcyz:Ljava/lang/String;

.field private zzcza:Ljava/lang/Boolean;

.field private zzczb:Ljava/lang/String;

.field private zzczc:Z

.field private zzczd:Z

.field private zzcze:Ljava/lang/String;

.field private zzczf:J

.field private zzczg:J

.field private zzczh:J

.field private zzczi:I

.field private zzczj:Lorg/json/JSONObject;

.field private zzczk:I

.field private final zzczl:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzczm:Lcom/google/android/gms/internal/zzafv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzahn;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyr:Ljava/math/BigInteger;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyt:Ljava/util/HashMap;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyu:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    iput p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyv:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzare:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyw:Lcom/google/android/gms/internal/zznk;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaft;->zzcso:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaft;->zzcsp:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyx:Lcom/google/android/gms/internal/zzhk;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzazc:Lcom/google/android/gms/internal/zzhf;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcza:Ljava/lang/Boolean;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczc:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczd:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczh:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;

    iput p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczk:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczl:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Lcom/google/android/gms/internal/zzafv;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/zzafv;-><init>(Lcom/google/android/gms/internal/zzafu;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczm:Lcom/google/android/gms/internal/zzafv;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzic()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/zzafx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzafx;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    return-void
.end method

.method private final zzad(I)Ljava/util/concurrent/Future;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzb(Landroid/content/Context;I)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_d
    move-exception p1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    throw p1
.end method

.method private final zzj(J)Ljava/util/concurrent/Future;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1, p2}, Lcom/google/android/gms/internal/zzagh;->zza(Landroid/content/Context;J)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_d
    move-exception p1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    throw p1
.end method


# virtual methods
.method public final getResources()Landroid/content/res/Resources;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzakd;->zzdel:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_d
    :try_start_d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ:Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;

    const-string v2, "com.google.android.gms.ads.dynamite"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v0

    .line 1
    iget-object v0, v0, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0
    :try_end_1d
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_d .. :try_end_1d} :catch_1e

    return-object v0

    :catch_1e
    move-exception v0

    const-string v1, "Cannot load resource from dynamite apk or local jar"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzafy;Ljava/lang/String;)Landroid/os/Bundle;
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "app"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    invoke-virtual {v3, p1, p3}, Lcom/google/android/gms/internal/zzafx;->zzl(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaft;->zzcyt:Ljava/util/HashMap;

    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_22
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3e

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaft;->zzcyt:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzafz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafz;->toBundle()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_22

    :cond_3e
    const-string p3, "slots"

    invoke-virtual {v1, p3, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    invoke-virtual {p3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_4e
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_62

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzafq;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafq;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4e

    :cond_62
    const-string p3, "ads"

    invoke-virtual {v1, p3, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/zzafy;->zza(Ljava/util/HashSet;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    monitor-exit v0

    return-object v1

    :catchall_73
    move-exception p1

    monitor-exit v0
    :try_end_75
    .catchall {:try_start_3 .. :try_end_75} :catchall_73

    goto :goto_77

    :goto_76
    throw p1

    :goto_77
    goto :goto_76
.end method

.method public final zza(Lcom/google/android/gms/internal/zzafq;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    throw p1
.end method

.method public final zza(Ljava/lang/Boolean;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcza:Ljava/lang/Boolean;

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzafz;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyt:Ljava/util/HashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    throw p1
.end method

.method public final zza(Ljava/lang/Throwable;Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzzp;->zzj(Landroid/content/Context;)Lcom/google/android/gms/internal/zzzt;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzzt;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final zzac(Landroid/content/Context;)Lcom/google/android/gms/internal/zzhk;
    .registers 5

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbjo:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_14

    return-object v1

    :cond_14
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbjw:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_39

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbju:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_39

    return-object v1

    :cond_39
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaft;->zzoy()Z

    move-result v0

    if-eqz v0, :cond_46

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaft;->zzoz()Z

    move-result v0

    if-eqz v0, :cond_46

    return-object v1

    :cond_46
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_49
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eqz v2, :cond_79

    if-nez p1, :cond_52

    goto :goto_79

    :cond_52
    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzazc:Lcom/google/android/gms/internal/zzhf;

    if-nez p1, :cond_5d

    new-instance p1, Lcom/google/android/gms/internal/zzhf;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzhf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzazc:Lcom/google/android/gms/internal/zzhf;

    :cond_5d
    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyx:Lcom/google/android/gms/internal/zzhk;

    if-nez p1, :cond_70

    new-instance p1, Lcom/google/android/gms/internal/zzhk;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzazc:Lcom/google/android/gms/internal/zzhf;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzzp;->zzj(Landroid/content/Context;)Lcom/google/android/gms/internal/zzzt;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Lcom/google/android/gms/internal/zzhk;-><init>(Lcom/google/android/gms/internal/zzhf;Lcom/google/android/gms/internal/zzzt;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyx:Lcom/google/android/gms/internal/zzhk;

    :cond_70
    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyx:Lcom/google/android/gms/internal/zzhk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzhk;->zzgt()V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyx:Lcom/google/android/gms/internal/zzhk;

    monitor-exit v0

    return-object p1

    :cond_79
    :goto_79
    monitor-exit v0

    return-object v1

    :catchall_7b
    move-exception p1

    monitor-exit v0
    :try_end_7d
    .catchall {:try_start_49 .. :try_end_7d} :catchall_7b

    throw p1
.end method

.method public final zzac(I)Ljava/util/concurrent/Future;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczk:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zza(Landroid/content/Context;I)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_d
    move-exception p1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    throw p1
.end method

.method public final zzb(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/concurrent/Future;
    .registers 11

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;

    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-nez v0, :cond_10

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    :cond_10
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_16
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_41

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_3e

    const-string v5, "template_id"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3e

    const/4 v1, 0x1

    if-ne p4, v1, :cond_3c

    const-string v1, "uses_media_view"

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-ne v1, p4, :cond_3c

    const/4 p2, 0x0

    monitor-exit p1
    :try_end_3b
    .catchall {:try_start_3 .. :try_end_3b} :catchall_7f

    return-object p2

    :cond_3c
    move v1, v3

    goto :goto_41

    :cond_3e
    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    :cond_41
    :goto_41
    :try_start_41
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "template_id"

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "uses_media_view"

    invoke-virtual {v2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p3, "timestamp_ms"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object p4

    check-cast p4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 2
    invoke-virtual {v2, p3, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;

    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6a
    .catch Lorg/json/JSONException; {:try_start_41 .. :try_end_6a} :catch_6b
    .catchall {:try_start_41 .. :try_end_6a} :catchall_7f

    goto :goto_71

    :catch_6b
    move-exception p2

    :try_start_6c
    const-string p3, "Could not update native advanced settings"

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_71
    iget-object p2, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;

    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/zzagh;->zzo(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object p2

    monitor-exit p1

    return-object p2

    :catchall_7f
    move-exception p2

    monitor-exit p1
    :try_end_81
    .catchall {:try_start_6c .. :try_end_81} :catchall_7f

    goto :goto_83

    :goto_82
    throw p2

    :goto_83
    goto :goto_82
.end method

.method public final zzb(Landroid/os/Bundle;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    const-string v1, "use_https"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    const-string v1, "webview_cache_version"

    iget v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcyv:I

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyv:I

    const-string v1, "content_url_opted_out"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    const-string v1, "content_url_opted_out"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzaft;->zzx(Z)V

    :cond_28
    const-string v1, "content_url_hashes"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    const-string v1, "content_url_hashes"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyy:Ljava/lang/String;

    :cond_38
    const-string v1, "auto_collect_location"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    const-string v1, "content_vertical_opted_out"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_53

    const-string v1, "content_vertical_opted_out"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzaft;->zzy(Z)V

    :cond_53
    const-string v1, "content_vertical_hashes"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_63

    const-string v1, "content_vertical_hashes"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyz:Ljava/lang/String;

    :cond_63
    const-string v1, "native_advanced_settings"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1
    :try_end_69
    .catchall {:try_start_3 .. :try_end_69} :catchall_cc

    if-eqz v1, :cond_7f

    :try_start_6b
    new-instance v1, Lorg/json/JSONObject;

    const-string v2, "native_advanced_settings"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;
    :try_end_78
    .catch Lorg/json/JSONException; {:try_start_6b .. :try_end_78} :catch_79
    .catchall {:try_start_6b .. :try_end_78} :catchall_cc

    goto :goto_7f

    :catch_79
    move-exception v1

    :try_start_7a
    const-string v2, "Could not convert native advanced settings to json object"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7f
    :goto_7f
    const-string v1, "version_code"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8f

    const-string v1, "version_code"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczk:I

    :cond_8f
    const-string v1, "app_settings_json"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9e

    const-string v1, "app_settings_json"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_a0

    :cond_9e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    :goto_a0
    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    const-string v1, "app_settings_last_update_ms"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    const-string v1, "app_last_background_time_ms"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    const-string v1, "request_in_session_count"

    iget v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    const-string v1, "first_ad_req_time_ms"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczh:J

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczh:J

    monitor-exit v0

    return-void

    :catchall_cc
    move-exception p1

    monitor-exit v0
    :try_end_ce
    .catchall {:try_start_7a .. :try_end_ce} :catchall_cc

    throw p1
.end method

.method public final zzb(Ljava/util/HashSet;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/zzafq;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcys:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    throw p1
.end method

.method public final zzc(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V
    .registers 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzare:Z

    if-nez v1, :cond_85

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaft;->zzapr:Lcom/google/android/gms/internal/zzakd;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzel()Lcom/google/android/gms/internal/zzhg;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/zzhg;->zza(Lcom/google/android/gms/internal/zzhj;)V

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzh(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzf(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzd(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zze(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzg(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzi(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzj(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzagh;->zzk(Landroid/content/Context;Lcom/google/android/gms/internal/zzahg;)Ljava/util/concurrent/Future;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzzp;->zzj(Landroid/content/Context;)Lcom/google/android/gms/internal/zzzt;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    iget-object p2, p2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/zzahn;->zzp(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaft;->zzczb:Ljava/lang/String;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-lt p2, v1, :cond_5b

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object p2

    invoke-virtual {p2}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted()Z

    move-result p2

    if-nez p2, :cond_5b

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczd:Z

    :cond_5b
    new-instance p2, Lcom/google/android/gms/internal/zzfs;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzapr:Lcom/google/android/gms/internal/zzakd;

    invoke-direct {p2, p1, v1}, Lcom/google/android/gms/internal/zzfs;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaft;->zzanq:Lcom/google/android/gms/internal/zzfs;

    new-instance p1, Lcom/google/android/gms/internal/zznj;

    iget-object p2, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-direct {p1, p2, v1}, Lcom/google/android/gms/internal/zznj;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_73
    .catchall {:try_start_3 .. :try_end_73} :catchall_87

    :try_start_73
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeq()Lcom/google/android/gms/internal/zznm;

    invoke-static {p1}, Lcom/google/android/gms/internal/zznm;->zza(Lcom/google/android/gms/internal/zznj;)Lcom/google/android/gms/internal/zznk;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyw:Lcom/google/android/gms/internal/zznk;
    :try_end_7c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_73 .. :try_end_7c} :catch_7d
    .catchall {:try_start_73 .. :try_end_7c} :catchall_87

    goto :goto_83

    :catch_7d
    move-exception p1

    :try_start_7e
    const-string p2, "Cannot initialize CSI reporter."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_83
    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzaft;->zzare:Z

    :cond_85
    monitor-exit v0

    return-void

    :catchall_87
    move-exception p1

    monitor-exit v0
    :try_end_89
    .catchall {:try_start_7e .. :try_end_89} :catchall_87

    throw p1
.end method

.method public final zzca(Ljava/lang/String;)Ljava/util/concurrent/Future;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_17

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyy:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyy:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzm(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_17
    const/4 p1, 0x0

    monitor-exit v0

    return-object p1

    :catchall_1a
    move-exception p1

    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_5 .. :try_end_1c} :catchall_1a

    throw p1
.end method

.method public final zzcb(Ljava/lang/String;)Ljava/util/concurrent/Future;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_17

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyz:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyz:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzn(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_17
    const/4 p1, 0x0

    monitor-exit v0

    return-object p1

    :catchall_1a
    move-exception p1

    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_5 .. :try_end_1c} :catchall_1a

    throw p1
.end method

.method public final zzf(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    if-eq p2, v1, :cond_f

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzagh;->zzf(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_f
    const/4 p1, 0x0

    monitor-exit v0

    return-object p1

    :catchall_12
    move-exception p1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_12

    throw p1
.end method

.method public final zzg(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    if-eq p2, v1, :cond_f

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzagh;->zzi(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_f
    const/4 p1, 0x0

    monitor-exit v0

    return-object p1

    :catchall_12
    move-exception p1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_12

    throw p1
.end method

.method public final zzg(Z)V
    .registers 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    if-eqz p1, :cond_33

    .line 2
    iget-wide v2, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    sub-long/2addr v0, v2

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzblg:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_2c

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    const/4 v0, -0x1

    iput v0, p1, Lcom/google/android/gms/internal/zzafx;->zzczi:I

    return-void

    :cond_2c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    iget v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    iput v0, p1, Lcom/google/android/gms/internal/zzafx;->zzczi:I

    return-void

    :cond_33
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzaft;->zzj(J)Ljava/util/concurrent/Future;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    iget p1, p1, Lcom/google/android/gms/internal/zzafx;->zzczi:I

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzaft;->zzad(I)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final zzk(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/zzakv;
    .registers 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iput-wide v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p2, :cond_26

    :try_start_14
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/zzagh;->zza(Landroid/content/Context;Ljava/lang/String;J)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_26
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakl;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaku;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_2d
    move-exception p1

    monitor-exit v0
    :try_end_2f
    .catchall {:try_start_14 .. :try_end_2f} :catchall_2d

    throw p1
.end method

.method public final zzk(J)Ljava/util/concurrent/Future;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaft;->zzczh:J

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1, p2}, Lcom/google/android/gms/internal/zzagh;->zzb(Landroid/content/Context;J)Ljava/util/concurrent/Future;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_d
    move-exception p1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_d

    throw p1
.end method

.method public final zzoy()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcso:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzoz()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsp:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpa()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyr:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcyr:Ljava/math/BigInteger;

    sget-object v3, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcyr:Ljava/math/BigInteger;

    monitor-exit v0

    return-object v1

    :catchall_15
    move-exception v1

    monitor-exit v0
    :try_end_17
    .catchall {:try_start_3 .. :try_end_17} :catchall_15

    throw v1
.end method

.method public final zzpb()Lcom/google/android/gms/internal/zzafx;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyq:Lcom/google/android/gms/internal/zzafx;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpc()Lcom/google/android/gms/internal/zznk;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyw:Lcom/google/android/gms/internal/zznk;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpd()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsn:Z

    if-nez v1, :cond_e

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczd:Z

    if-eqz v1, :cond_c

    goto :goto_e

    :cond_c
    const/4 v1, 0x0

    goto :goto_f

    :cond_e
    :goto_e
    const/4 v1, 0x1

    :goto_f
    monitor-exit v0

    return v1

    :catchall_11
    move-exception v1

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_3 .. :try_end_13} :catchall_11

    throw v1
.end method

.method public final zzpe()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyy:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpf()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcyz:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpg()Ljava/lang/Boolean;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcza:Ljava/lang/Boolean;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzph()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsw:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpi()J
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczg:J

    monitor-exit v0

    return-wide v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpj()J
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-wide v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczh:J

    monitor-exit v0

    return-wide v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpk()I
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczk:I

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpl()I
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczi:I

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpm()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczm:Lcom/google/android/gms/internal/zzafv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafv;->zzpm()Z

    move-result v0

    return v0
.end method

.method public final zzpn()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczm:Lcom/google/android/gms/internal/zzafv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafv;->zzpn()Z

    move-result v0

    return v0
.end method

.method public final zzpo()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczm:Lcom/google/android/gms/internal/zzafv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafv;->zzpo()V

    return-void
.end method

.method public final zzpp()Lcom/google/android/gms/internal/zzafs;
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    new-instance v1, Lcom/google/android/gms/internal/zzafs;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaft;->zzcze:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzaft;->zzczf:J

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafs;-><init>(Ljava/lang/String;J)V

    monitor-exit v0

    return-object v1

    :catchall_e
    move-exception v1

    monitor-exit v0
    :try_end_10
    .catchall {:try_start_3 .. :try_end_10} :catchall_e

    throw v1
.end method

.method public final zzpq()Lorg/json/JSONObject;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->zzczj:Lorg/json/JSONObject;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzpr()Ljava/util/concurrent/Future;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagh;->zzaf(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_b
    move-exception v1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_3 .. :try_end_d} :catchall_b

    throw v1
.end method

.method public final zzps()Lcom/google/android/gms/internal/zzfs;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzanq:Lcom/google/android/gms/internal/zzfs;

    return-object v0
.end method

.method public final zzpt()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczl:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final zzpu()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczl:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method

.method public final zzpv()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczl:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final zzx(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcso:Z

    if-eq v1, p1, :cond_c

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzh(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    :cond_c
    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcso:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaft;->zzac(Landroid/content/Context;)Lcom/google/android/gms/internal/zzhk;

    move-result-object p1

    if-eqz p1, :cond_24

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_24

    const-string v1, "start fetching content..."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzhk;->zzgt()V

    :cond_24
    monitor-exit v0

    return-void

    :catchall_26
    move-exception p1

    monitor-exit v0
    :try_end_28
    .catchall {:try_start_3 .. :try_end_28} :catchall_26

    throw p1
.end method

.method public final zzy(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsp:Z

    if-eq v1, p1, :cond_c

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzh(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzagh;->zzh(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzaft;->zzcsp:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/zzaft;->mContext:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaft;->zzac(Landroid/content/Context;)Lcom/google/android/gms/internal/zzhk;

    move-result-object p1

    if-eqz p1, :cond_29

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_29

    const-string v1, "start fetching content..."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzhk;->zzgt()V

    :cond_29
    monitor-exit v0

    return-void

    :catchall_2b
    move-exception p1

    monitor-exit v0
    :try_end_2d
    .catchall {:try_start_3 .. :try_end_2d} :catchall_2b

    throw p1
.end method

.method public final zzz(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaft;->zzczm:Lcom/google/android/gms/internal/zzafv;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafv;->zzz(Z)V

    return-void
.end method
