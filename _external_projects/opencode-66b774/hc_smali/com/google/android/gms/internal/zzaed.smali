.class public final Lcom/google/android/gms/internal/zzaed;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private mErrorCode:I

.field private zzced:Ljava/lang/String;

.field private zzcvq:Ljava/lang/String;

.field private zzcvr:J


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzaed;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaed;->zzced:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzaed;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaed;->zzcvq:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzaed;)I
    .registers 1

    iget p0, p0, Lcom/google/android/gms/internal/zzaed;->mErrorCode:I

    return p0
.end method

.method public static synthetic zzd(Lcom/google/android/gms/internal/zzaed;)J
    .registers 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzaed;->zzcvr:J

    return-wide v0
.end method


# virtual methods
.method public final zzab(I)Lcom/google/android/gms/internal/zzaed;
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzaed;->mErrorCode:I

    return-object p0
.end method

.method public final zzbs(Ljava/lang/String;)Lcom/google/android/gms/internal/zzaed;
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaed;->zzced:Ljava/lang/String;

    return-object p0
.end method

.method public final zzbt(Ljava/lang/String;)Lcom/google/android/gms/internal/zzaed;
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaed;->zzcvq:Ljava/lang/String;

    return-object p0
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/zzaed;
    .registers 3

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzaed;->zzcvr:J

    return-object p0
.end method

.method public final zzog()Lcom/google/android/gms/internal/zzaeb;
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzaeb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzaeb;-><init>(Lcom/google/android/gms/internal/zzaed;Lcom/google/android/gms/internal/zzaec;)V

    return-object v0
.end method
