.class public final Lcom/google/android/gms/internal/zzbb;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzbb;",
        ">;"
    }
.end annotation


# instance fields
.field private zzep:Ljava/lang/Long;

.field private zzeq:Ljava/lang/Long;

.field public zzgd:Ljava/lang/Long;

.field public zzge:Ljava/lang/Long;

.field public zzgf:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzep:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzeq:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgd:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzge:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgf:Ljava/lang/Long;

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

    if-eqz v0, :cond_58

    const/16 v1, 0x8

    if-eq v0, v1, :cond_4d

    const/16 v1, 0x10

    if-eq v0, v1, :cond_42

    const/16 v1, 0x18

    if-eq v0, v1, :cond_37

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2c

    const/16 v1, 0x28

    if-eq v0, v1, :cond_21

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_21
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgf:Ljava/lang/Long;

    goto :goto_0

    :cond_2c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzge:Ljava/lang/Long;

    goto :goto_0

    :cond_37
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgd:Ljava/lang/Long;

    goto :goto_0

    :cond_42
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzeq:Ljava/lang/Long;

    goto :goto_0

    :cond_4d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzep:Ljava/lang/Long;

    goto :goto_0

    :cond_58
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzep:Ljava/lang/Long;

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzeq:Ljava/lang/Long;

    if-eqz v0, :cond_18

    const/4 v1, 0x2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgd:Ljava/lang/Long;

    if-eqz v0, :cond_24

    const/4 v1, 0x3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzge:Ljava/lang/Long;

    if-eqz v0, :cond_30

    const/4 v1, 0x4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_30
    iget-object v0, p0, Lcom/google/android/gms/internal/zzbb;->zzgf:Ljava/lang/Long;

    if-eqz v0, :cond_3c

    const/4 v1, 0x5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_3c
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 4

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbb;->zzep:Ljava/lang/Long;

    if-eqz v1, :cond_d

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbb;->zzeq:Ljava/lang/Long;

    if-eqz v1, :cond_16

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbb;->zzgd:Ljava/lang/Long;

    if-eqz v1, :cond_1f

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_1f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbb;->zzge:Ljava/lang/Long;

    if-eqz v1, :cond_28

    const/4 v2, 0x4

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_28
    iget-object v1, p0, Lcom/google/android/gms/internal/zzbb;->zzgf:Ljava/lang/Long;

    if-eqz v1, :cond_31

    const/4 v2, 0x5

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_31
    return v0
.end method
