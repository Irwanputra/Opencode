.class public final Lcom/google/android/gms/internal/zzfex;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final buffer:[B

.field private final zzpfl:Lcom/google/android/gms/internal/zzffg;


# direct methods
.method private constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfex;->buffer:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzbc([B)Lcom/google/android/gms/internal/zzffg;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfex;->zzpfl:Lcom/google/android/gms/internal/zzffg;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/gms/internal/zzfet;)V
    .registers 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzfex;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zzcvr()Lcom/google/android/gms/internal/zzfes;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfex;->zzpfl:Lcom/google/android/gms/internal/zzffg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzffg;->zzcwt()V

    new-instance v0, Lcom/google/android/gms/internal/zzfez;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfex;->buffer:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzfez;-><init>([B)V

    return-object v0
.end method

.method public final zzcvs()Lcom/google/android/gms/internal/zzffg;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfex;->zzpfl:Lcom/google/android/gms/internal/zzffg;

    return-object v0
.end method
