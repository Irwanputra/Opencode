.class public abstract Lcom/google/android/gms/internal/zzfjm;
.super Lcom/google/android/gms/internal/zzfjs;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/zzfjm<",
        "TM;>;>",
        "Lcom/google/android/gms/internal/zzfjs;"
    }
.end annotation


# instance fields
.field public zzpnc:Lcom/google/android/gms/internal/zzfjo;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjs;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzfjm;->zzdaf()Lcom/google/android/gms/internal/zzfjm;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjn;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzfjn<",
            "TM;TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget v2, p1, Lcom/google/android/gms/internal/zzfjn;->tag:I

    ushr-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzfjo;->zzmj(I)Lcom/google/android/gms/internal/zzfjp;

    move-result-object v0

    if-nez v0, :cond_11

    return-object v1

    :cond_11
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfjp;->zzb(Lcom/google/android/gms/internal/zzfjn;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    :goto_6
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfjo;->size()I

    move-result v1

    if-ge v0, v1, :cond_1a

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzfjo;->zzmk(I)Lcom/google/android/gms/internal/zzfjp;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzfjp;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_1a
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjj;I)Z
    .registers 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzfjj;->zzkq(I)Z

    move-result v1

    if-nez v1, :cond_c

    const/4 p1, 0x0

    return p1

    :cond_c
    ushr-int/lit8 v1, p2, 0x3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/zzfjj;->zzal(II)[B

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/zzfju;

    invoke-direct {v0, p2, p1}, Lcom/google/android/gms/internal/zzfju;-><init>(I[B)V

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    if-nez p2, :cond_29

    new-instance p2, Lcom/google/android/gms/internal/zzfjo;

    invoke-direct {p2}, Lcom/google/android/gms/internal/zzfjo;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    goto :goto_2d

    :cond_29
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/zzfjo;->zzmj(I)Lcom/google/android/gms/internal/zzfjp;

    move-result-object p1

    :goto_2d
    if-nez p1, :cond_39

    new-instance p1, Lcom/google/android/gms/internal/zzfjp;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzfjp;-><init>()V

    iget-object p2, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/zzfjo;->zza(ILcom/google/android/gms/internal/zzfjp;)V

    :cond_39
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjp;->zza(Lcom/google/android/gms/internal/zzfju;)V

    const/4 p1, 0x1

    return p1
.end method

.method public zzdaf()Lcom/google/android/gms/internal/zzfjm;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjs;->zzdag()Lcom/google/android/gms/internal/zzfjs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzfjm;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzfjq;->zza(Lcom/google/android/gms/internal/zzfjm;Lcom/google/android/gms/internal/zzfjm;)V

    return-object v0
.end method

.method public synthetic zzdag()Lcom/google/android/gms/internal/zzfjs;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzfjm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzfjm;

    return-object v0
.end method

.method public zzq()I
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    const/4 v0, 0x0

    :goto_6
    iget-object v2, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzfjo;->size()I

    move-result v2

    if-ge v1, v2, :cond_1c

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzfjo;->zzmk(I)Lcom/google/android/gms/internal/zzfjp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzfjp;->zzq()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_1c
    move v1, v0

    :cond_1d
    return v1
.end method
