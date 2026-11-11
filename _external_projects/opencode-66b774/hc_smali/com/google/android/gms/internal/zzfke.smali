.class public final Lcom/google/android/gms/internal/zzfke;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzfke;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzpoz:[Lcom/google/android/gms/internal/zzfke;


# instance fields
.field public url:Ljava/lang/String;

.field public zzjjw:Ljava/lang/Integer;

.field public zzppa:Lcom/google/android/gms/internal/zzfjz;

.field private zzppb:Lcom/google/android/gms/internal/zzfkb;

.field private zzppc:Ljava/lang/Integer;

.field private zzppd:[I

.field private zzppe:Ljava/lang/String;

.field public zzppf:Ljava/lang/Integer;

.field public zzppg:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzjjw:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppc:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/zzfjv;->zzpnp:[I

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppe:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/zzfjv;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method

.method private final zzaq(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfke;
    .registers 8

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_12c

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_f
    const/16 v0, 0x4a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    if-nez v2, :cond_1b

    const/4 v3, 0x0

    goto :goto_1c

    :cond_1b
    array-length v3, v2

    :goto_1c
    add-int/2addr v0, v3

    new-array v4, v0, [Ljava/lang/String;

    if-eqz v3, :cond_24

    invoke-static {v2, v1, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_24
    :goto_24
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_34

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_24

    :cond_34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    goto :goto_0

    :sswitch_3d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    :try_start_41
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v2

    if-eqz v2, :cond_6a

    const/4 v3, 0x1

    if-eq v2, v3, :cond_6a

    const/4 v3, 0x2

    if-eq v2, v3, :cond_6a

    const/4 v3, 0x3

    if-ne v2, v3, :cond_51

    goto :goto_6a

    :cond_51
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x2e

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not a valid enum AdResourceType"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_6a
    :goto_6a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;
    :try_end_70
    .catch Ljava/lang/IllegalArgumentException; {:try_start_41 .. :try_end_70} :catch_71

    goto :goto_0

    :catch_71
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    goto :goto_0

    :sswitch_78
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppe:Ljava/lang/String;

    goto :goto_0

    :sswitch_7f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwi()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzks(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v2

    const/4 v3, 0x0

    :goto_8c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcwk()I

    move-result v4

    if-lez v4, :cond_98

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_8c

    :cond_98
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    if-nez v2, :cond_a1

    const/4 v4, 0x0

    goto :goto_a2

    :cond_a1
    array-length v4, v2

    :goto_a2
    add-int/2addr v3, v4

    new-array v5, v3, [I

    if-eqz v4, :cond_aa

    invoke-static {v2, v1, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_aa
    :goto_aa
    if-ge v4, v3, :cond_b5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v1

    aput v1, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_aa

    :cond_b5
    iput-object v5, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zzkt(I)V

    goto/16 :goto_0

    :sswitch_bc
    const/16 v0, 0x30

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    if-nez v2, :cond_c8

    const/4 v3, 0x0

    goto :goto_c9

    :cond_c8
    array-length v3, v2

    :goto_c9
    add-int/2addr v0, v3

    new-array v4, v0, [I

    if-eqz v3, :cond_d1

    invoke-static {v2, v1, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d1
    :goto_d1
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_e1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v1

    aput v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_d1

    :cond_e1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v0

    aput v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    goto/16 :goto_0

    :sswitch_eb
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppc:Ljava/lang/Integer;

    goto/16 :goto_0

    :sswitch_f7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    if-nez v0, :cond_102

    new-instance v0, Lcom/google/android/gms/internal/zzfkb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfkb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    :cond_102
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    goto :goto_112

    :sswitch_105
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    if-nez v0, :cond_110

    new-instance v0, Lcom/google/android/gms/internal/zzfjz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfjz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    :cond_110
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    :goto_112
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    goto/16 :goto_0

    :sswitch_117
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_11f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzjjw:Ljava/lang/Integer;

    goto/16 :goto_0

    :sswitch_12b
    return-object p0

    :sswitch_data_12c
    .sparse-switch
        0x0 -> :sswitch_12b
        0x8 -> :sswitch_11f
        0x12 -> :sswitch_117
        0x1a -> :sswitch_105
        0x22 -> :sswitch_f7
        0x28 -> :sswitch_eb
        0x30 -> :sswitch_bc
        0x32 -> :sswitch_7f
        0x3a -> :sswitch_78
        0x40 -> :sswitch_3d
        0x4a -> :sswitch_f
    .end sparse-switch
.end method

.method public static zzdao()[Lcom/google/android/gms/internal/zzfke;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzfke;->zzpoz:[Lcom/google/android/gms/internal/zzfke;

    if-nez v0, :cond_15

    sget-object v0, Lcom/google/android/gms/internal/zzfjq;->zzpnk:Ljava/lang/Object;

    monitor-enter v0

    :try_start_7
    sget-object v1, Lcom/google/android/gms/internal/zzfke;->zzpoz:[Lcom/google/android/gms/internal/zzfke;

    if-nez v1, :cond_10

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/zzfke;

    sput-object v1, Lcom/google/android/gms/internal/zzfke;->zzpoz:[Lcom/google/android/gms/internal/zzfke;

    :cond_10
    monitor-exit v0

    goto :goto_15

    :catchall_12
    move-exception v1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_7 .. :try_end_14} :catchall_12

    throw v1

    :cond_15
    :goto_15
    sget-object v0, Lcom/google/android/gms/internal/zzfke;->zzpoz:[Lcom/google/android/gms/internal/zzfke;

    return-object v0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzfke;->zzaq(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfke;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzjjw:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    if-eqz v0, :cond_12

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_12
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    if-eqz v0, :cond_1a

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_1a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    if-eqz v0, :cond_22

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_22
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppc:Ljava/lang/Integer;

    if-eqz v0, :cond_2e

    const/4 v1, 0x5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_2e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    const/4 v1, 0x0

    if-eqz v0, :cond_45

    array-length v0, v0

    if-lez v0, :cond_45

    const/4 v0, 0x0

    :goto_37
    iget-object v2, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    array-length v3, v2

    if-ge v0, v3, :cond_45

    const/4 v3, 0x6

    aget v2, v2, v0

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_37

    :cond_45
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppe:Ljava/lang/String;

    if-eqz v0, :cond_4d

    const/4 v2, 0x7

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_4d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;

    if-eqz v0, :cond_5a

    const/16 v2, 0x8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_5a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    if-eqz v0, :cond_72

    array-length v0, v0

    if-lez v0, :cond_72

    :goto_61
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    array-length v2, v0

    if-ge v1, v2, :cond_72

    aget-object v0, v0, v1

    if-eqz v0, :cond_6f

    const/16 v2, 0x9

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_6f
    add-int/lit8 v1, v1, 0x1

    goto :goto_61

    :cond_72
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 7

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzjjw:Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->url:Ljava/lang/String;

    if-eqz v1, :cond_15

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_15
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppa:Lcom/google/android/gms/internal/zzfjz;

    if-eqz v1, :cond_1f

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppb:Lcom/google/android/gms/internal/zzfkb;

    if-eqz v1, :cond_29

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_29
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppc:Ljava/lang/Integer;

    if-eqz v1, :cond_32

    const/4 v2, 0x5

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_32
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    const/4 v2, 0x0

    if-eqz v1, :cond_50

    array-length v1, v1

    if-lez v1, :cond_50

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_3c
    iget-object v4, p0, Lcom/google/android/gms/internal/zzfke;->zzppd:[I

    array-length v5, v4

    if-ge v1, v5, :cond_4b

    aget v4, v4, v1

    invoke-static {v4}, Lcom/google/android/gms/internal/zzfjk;->zzlh(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_3c

    :cond_4b
    add-int/2addr v0, v3

    array-length v1, v4

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_50
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppe:Ljava/lang/String;

    if-eqz v1, :cond_5a

    const/4 v3, 0x7

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5a
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppf:Ljava/lang/Integer;

    if-eqz v1, :cond_64

    const/16 v3, 0x8

    invoke-static {v1, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_64
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    if-eqz v1, :cond_85

    array-length v1, v1

    if-lez v1, :cond_85

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_6d
    iget-object v4, p0, Lcom/google/android/gms/internal/zzfke;->zzppg:[Ljava/lang/String;

    array-length v5, v4

    if-ge v2, v5, :cond_81

    aget-object v4, v4, v2

    if-eqz v4, :cond_7e

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4}, Lcom/google/android/gms/internal/zzfjk;->zztt(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v4, v1

    move v1, v4

    :cond_7e
    add-int/lit8 v2, v2, 0x1

    goto :goto_6d

    :cond_81
    add-int/2addr v0, v1

    mul-int/lit8 v3, v3, 0x1

    add-int/2addr v0, v3

    :cond_85
    return v0
.end method
