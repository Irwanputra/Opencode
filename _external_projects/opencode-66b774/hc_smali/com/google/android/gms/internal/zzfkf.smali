.class public final Lcom/google/android/gms/internal/zzfkf;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzfkf;",
        ">;"
    }
.end annotation


# instance fields
.field public zzpph:Ljava/lang/String;

.field public zzppi:Ljava/lang/Long;

.field public zzppj:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzpph:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppi:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppj:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 4

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_36

    const/16 v1, 0xa

    if-eq v0, v1, :cond_2f

    const/16 v1, 0x10

    if-eq v0, v1, :cond_24

    const/16 v1, 0x18

    if-eq v0, v1, :cond_19

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvz()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppj:Ljava/lang/Boolean;

    goto :goto_0

    :cond_24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvv()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppi:Ljava/lang/Long;

    goto :goto_0

    :cond_2f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzpph:Ljava/lang/String;

    goto :goto_0

    :cond_36
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzpph:Ljava/lang/String;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppi:Ljava/lang/Long;

    if-eqz v0, :cond_14

    const/4 v1, 0x2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfkf;->zzppj:Ljava/lang/Boolean;

    if-eqz v0, :cond_20

    const/4 v1, 0x3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzl(IZ)V

    :cond_20
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 5

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkf;->zzpph:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkf;->zzppi:Ljava/lang/Long;

    if-eqz v1, :cond_17

    const/4 v3, 0x2

    invoke-static {v1, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfkf;->zzppj:Ljava/lang/Boolean;

    if-eqz v1, :cond_25

    const/4 v3, 0x3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_25
    return v0
.end method
