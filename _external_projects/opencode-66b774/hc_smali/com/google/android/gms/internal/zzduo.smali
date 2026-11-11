.class public final Lcom/google/android/gms/internal/zzduo;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final zzlza:Lcom/google/android/gms/internal/zzdve;

.field private final zzlzb:Lcom/google/android/gms/internal/zzdve;


# direct methods
.method public constructor <init>([B[B)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdve;->zzal([B)Lcom/google/android/gms/internal/zzdve;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzduo;->zzlza:Lcom/google/android/gms/internal/zzdve;

    invoke-static {p2}, Lcom/google/android/gms/internal/zzdve;->zzal([B)Lcom/google/android/gms/internal/zzdve;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzduo;->zzlzb:Lcom/google/android/gms/internal/zzdve;

    return-void
.end method


# virtual methods
.method public final zzbqk()[B
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzduo;->zzlza:Lcom/google/android/gms/internal/zzdve;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdve;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public final zzbql()[B
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzduo;->zzlzb:Lcom/google/android/gms/internal/zzdve;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdve;->getBytes()[B

    move-result-object v0

    return-object v0
.end method
