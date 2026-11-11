.class public final Lcom/google/android/gms/internal/zzkb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final sLock:Ljava/lang/Object;

.field private static zzbfi:Lcom/google/android/gms/internal/zzkb;


# instance fields
.field private final mSessionId:Ljava/lang/String;

.field private final zzbfj:Lcom/google/android/gms/internal/zzajr;

.field private final zzbfk:Lcom/google/android/gms/internal/zzjr;

.field private final zzbfl:Lcom/google/android/gms/internal/zznd;

.field private final zzbfm:Lcom/google/android/gms/internal/zzne;

.field private final zzbfn:Lcom/google/android/gms/internal/zznf;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzkb;->sLock:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/zzkb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzkb;-><init>()V

    monitor-enter v0

    :try_start_d
    sput-object v1, Lcom/google/android/gms/internal/zzkb;->zzbfi:Lcom/google/android/gms/internal/zzkb;

    monitor-exit v0

    return-void

    :catchall_11
    move-exception v1

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_d .. :try_end_13} :catchall_11

    throw v1
.end method

.method public constructor <init>()V
    .registers 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzajr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzajr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->zzbfj:Lcom/google/android/gms/internal/zzajr;

    new-instance v0, Lcom/google/android/gms/internal/zzjr;

    new-instance v2, Lcom/google/android/gms/internal/zzji;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzji;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/zzjh;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzjh;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/zzmb;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzmb;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/zzri;

    invoke-direct {v5}, Lcom/google/android/gms/internal/zzri;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/zzadt;

    invoke-direct {v6}, Lcom/google/android/gms/internal/zzadt;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/zzxd;

    invoke-direct {v7}, Lcom/google/android/gms/internal/zzxd;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/zzrj;

    invoke-direct {v8}, Lcom/google/android/gms/internal/zzrj;-><init>()V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/zzjr;-><init>(Lcom/google/android/gms/internal/zzji;Lcom/google/android/gms/internal/zzjh;Lcom/google/android/gms/internal/zzmb;Lcom/google/android/gms/internal/zzri;Lcom/google/android/gms/internal/zzadt;Lcom/google/android/gms/internal/zzxd;Lcom/google/android/gms/internal/zzrj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->zzbfk:Lcom/google/android/gms/internal/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/zzajr;->zzra()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->mSessionId:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/zznd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zznd;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->zzbfl:Lcom/google/android/gms/internal/zznd;

    new-instance v0, Lcom/google/android/gms/internal/zzne;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzne;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->zzbfm:Lcom/google/android/gms/internal/zzne;

    new-instance v0, Lcom/google/android/gms/internal/zznf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zznf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzkb;->zzbfn:Lcom/google/android/gms/internal/zznf;

    return-void
.end method

.method private static zzhz()Lcom/google/android/gms/internal/zzkb;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzkb;->sLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/zzkb;->zzbfi:Lcom/google/android/gms/internal/zzkb;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public static zzia()Lcom/google/android/gms/internal/zzajr;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->zzbfj:Lcom/google/android/gms/internal/zzajr;

    return-object v0
.end method

.method public static zzib()Lcom/google/android/gms/internal/zzjr;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->zzbfk:Lcom/google/android/gms/internal/zzjr;

    return-object v0
.end method

.method public static zzic()Ljava/lang/String;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->mSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public static zzid()Lcom/google/android/gms/internal/zzne;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->zzbfm:Lcom/google/android/gms/internal/zzne;

    return-object v0
.end method

.method public static zzie()Lcom/google/android/gms/internal/zznd;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->zzbfl:Lcom/google/android/gms/internal/zznd;

    return-object v0
.end method

.method public static zzif()Lcom/google/android/gms/internal/zznf;
    .registers 1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzhz()Lcom/google/android/gms/internal/zzkb;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzkb;->zzbfn:Lcom/google/android/gms/internal/zznf;

    return-object v0
.end method
