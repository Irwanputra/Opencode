.class public final Lcom/google/android/gms/internal/zzns;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzbsm:J

.field private final zzbsn:Ljava/lang/String;

.field private final zzbso:Lcom/google/android/gms/internal/zzns;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/android/gms/internal/zzns;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzns;->zzbsm:J

    iput-object p3, p0, Lcom/google/android/gms/internal/zzns;->zzbsn:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzns;->zzbso:Lcom/google/android/gms/internal/zzns;

    return-void
.end method


# virtual methods
.method public final getTime()J
    .registers 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzns;->zzbsm:J

    return-wide v0
.end method

.method public final zzjc()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzns;->zzbsn:Ljava/lang/String;

    return-object v0
.end method

.method public final zzjd()Lcom/google/android/gms/internal/zzns;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzns;->zzbso:Lcom/google/android/gms/internal/zzns;

    return-object v0
.end method
