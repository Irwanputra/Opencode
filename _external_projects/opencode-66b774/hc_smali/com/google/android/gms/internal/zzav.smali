.class public final Lcom/google/android/gms/internal/zzav;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzav;",
        ">;"
    }
.end annotation


# instance fields
.field private stackTrace:Ljava/lang/String;

.field public zzcn:Ljava/lang/String;

.field public zzco:Ljava/lang/Long;

.field private zzcp:Ljava/lang/String;

.field private zzcq:Ljava/lang/String;

.field private zzcr:Ljava/lang/Long;

.field private zzcs:Ljava/lang/Long;

.field private zzct:Ljava/lang/String;

.field private zzcu:Ljava/lang/Long;

.field private zzcv:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcn:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzco:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->stackTrace:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcp:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcq:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcr:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcs:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzct:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcu:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcv:Ljava/lang/String;

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

    sparse-switch v0, :sswitch_data_66

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcv:Ljava/lang/String;

    goto :goto_0

    :sswitch_15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcu:Ljava/lang/Long;

    goto :goto_0

    :sswitch_20
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzct:Ljava/lang/String;

    goto :goto_0

    :sswitch_27
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcs:Ljava/lang/Long;

    goto :goto_0

    :sswitch_32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcr:Ljava/lang/Long;

    goto :goto_0

    :sswitch_3d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcq:Ljava/lang/String;

    goto :goto_0

    :sswitch_44
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcp:Ljava/lang/String;

    goto :goto_0

    :sswitch_4b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->stackTrace:Ljava/lang/String;

    goto :goto_0

    :sswitch_52
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwn()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzco:Ljava/lang/Long;

    goto :goto_0

    :sswitch_5d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcn:Ljava/lang/String;

    goto :goto_0

    :sswitch_64
    return-object p0

    nop

    :sswitch_data_66
    .sparse-switch
        0x0 -> :sswitch_64
        0xa -> :sswitch_5d
        0x10 -> :sswitch_52
        0x1a -> :sswitch_4b
        0x22 -> :sswitch_44
        0x2a -> :sswitch_3d
        0x30 -> :sswitch_32
        0x38 -> :sswitch_27
        0x42 -> :sswitch_20
        0x48 -> :sswitch_15
        0x52 -> :sswitch_e
    .end sparse-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcn:Ljava/lang/String;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzco:Ljava/lang/Long;

    if-eqz v0, :cond_14

    const/4 v1, 0x2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->stackTrace:Ljava/lang/String;

    if-eqz v0, :cond_1c

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_1c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcp:Ljava/lang/String;

    if-eqz v0, :cond_24

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcq:Ljava/lang/String;

    if-eqz v0, :cond_2c

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcr:Ljava/lang/Long;

    if-eqz v0, :cond_38

    const/4 v1, 0x6

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_38
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcs:Ljava/lang/Long;

    if-eqz v0, :cond_44

    const/4 v1, 0x7

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_44
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzct:Ljava/lang/String;

    if-eqz v0, :cond_4d

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_4d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcu:Ljava/lang/Long;

    if-eqz v0, :cond_5a

    const/16 v1, 0x9

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/zzfjk;->zzf(IJ)V

    :cond_5a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzav;->zzcv:Ljava/lang/String;

    if-eqz v0, :cond_63

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_63
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 4

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcn:Ljava/lang/String;

    if-eqz v1, :cond_e

    const/4 v2, 0x1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzco:Ljava/lang/Long;

    if-eqz v1, :cond_17

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->stackTrace:Ljava/lang/String;

    if-eqz v1, :cond_21

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_21
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcp:Ljava/lang/String;

    if-eqz v1, :cond_2b

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2b
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcq:Ljava/lang/String;

    if-eqz v1, :cond_35

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_35
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcr:Ljava/lang/Long;

    if-eqz v1, :cond_3e

    const/4 v2, 0x6

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_3e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcs:Ljava/lang/Long;

    if-eqz v1, :cond_47

    const/4 v2, 0x7

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_47
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzct:Ljava/lang/String;

    if-eqz v1, :cond_52

    const/16 v2, 0x8

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_52
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcu:Ljava/lang/Long;

    if-eqz v1, :cond_5c

    const/16 v2, 0x9

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〻ぞまぎな〻(Ljava/lang/Long;II)I

    move-result v0

    :cond_5c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzav;->zzcv:Ljava/lang/String;

    if-eqz v1, :cond_67

    const/16 v2, 0xa

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_67
    return v0
.end method
