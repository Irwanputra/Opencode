.class public final Lcom/google/android/gms/internal/zzdtj;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtj$zza;,
        Lcom/google/android/gms/internal/zzdtj$zzb;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtj;",
        "Lcom/google/android/gms/internal/zzdtj$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtj;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxh:Lcom/google/android/gms/internal/zzdtj;


# instance fields
.field private zzlwy:I

.field private zzlwz:I

.field private zzlxg:Lcom/google/android/gms/internal/zzfgd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgd<",
            "Lcom/google/android/gms/internal/zzdtj$zzb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtj;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzffu;->zzcxo()Lcom/google/android/gms/internal/zzfgd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdtj$zzb;)V
    .registers 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzfgd;->zzcvi()Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_16

    const/16 v1, 0xa

    goto :goto_18

    :cond_16
    shl-int/lit8 v1, v1, 0x1

    :goto_18
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzfgd;->zzly(I)Lcom/google/android/gms/internal/zzfgd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    :cond_1e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj;I)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj;->zzfx(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj;Lcom/google/android/gms/internal/zzdtj$zzb;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj;->zza(Lcom/google/android/gms/internal/zzdtj$zzb;)V

    return-void
.end method

.method public static zzbpn()Lcom/google/android/gms/internal/zzdtj$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtj;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdtj$zza;

    return-object v1
.end method

.method public static synthetic zzbpo()Lcom/google/android/gms/internal/zzdtj;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    return-object v0
.end method

.method private final zzfx(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    return-void
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdtk;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_ec

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v2

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdtj;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdtj;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdtj;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtj;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2b
    monitor-exit p1

    goto :goto_30

    :catchall_2d
    move-exception p2

    monitor-exit p1
    :try_end_2f
    .catchall {:try_start_1e .. :try_end_2f} :catchall_2d

    throw p2

    :cond_30
    :goto_30
    sget-object p1, Lcom/google/android/gms/internal/zzdtj;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_a7

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_83

    const/16 v2, 0x8

    if-eq p1, v2, :cond_7c

    const/16 v2, 0x12

    if-eq p1, v2, :cond_51

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_83

    :cond_51
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzfgd;->zzcvi()Z

    move-result p1

    if-nez p1, :cond_6c

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_64

    const/16 v2, 0xa

    goto :goto_66

    :cond_64
    shl-int/lit8 v2, v2, 0x1

    :goto_66
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/zzfgd;->zzly(I)Lcom/google/android/gms/internal/zzfgd;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    :cond_6c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-static {}, Lcom/google/android/gms/internal/zzdtj$zzb;->zzbpq()Lcom/google/android/gms/internal/zzdtj$zzb;

    move-result-object v2

    invoke-virtual {p2, v2, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzdtj$zzb;

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_7c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I
    :try_end_82
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_82} :catch_9b
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_82} :catch_87
    .catchall {:try_start_3c .. :try_end_82} :catchall_85

    goto :goto_3a

    :cond_83
    :goto_83
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_85
    move-exception p1

    goto :goto_a6

    :catch_87
    move-exception p1

    :try_start_88
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_9b
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_a6
    .catchall {:try_start_88 .. :try_end_a6} :catchall_85

    :goto_a6
    throw p1

    :cond_a7
    :pswitch_a7
    sget-object p1, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    return-object p1

    :pswitch_aa
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtj;

    iget p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    if-eqz p1, :cond_b4

    const/4 v2, 0x1

    goto :goto_b5

    :cond_b4
    const/4 v2, 0x0

    :goto_b5
    iget v3, p3, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    if-eqz v3, :cond_ba

    goto :goto_bb

    :cond_ba
    const/4 v1, 0x0

    :goto_bb
    invoke-interface {p2, v2, p1, v1, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    iget-object v0, p3, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfgd;Lcom/google/android/gms/internal/zzfgd;)Lcom/google/android/gms/internal/zzfgd;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    sget-object p1, Lcom/google/android/gms/internal/zzffu$zzf;->zzphb:Lcom/google/android/gms/internal/zzffu$zzf;

    if-ne p2, p1, :cond_d6

    iget p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwy:I

    iget p2, p3, Lcom/google/android/gms/internal/zzdtj;->zzlwy:I

    or-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwy:I

    :cond_d6
    return-object p0

    :pswitch_d7
    new-instance p1, Lcom/google/android/gms/internal/zzdtj$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdtj$zza;-><init>(Lcom/google/android/gms/internal/zzdtk;)V

    return-object p1

    :pswitch_dd
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzfgd;->zzbiy()V

    return-object v2

    :pswitch_e3
    sget-object p1, Lcom/google/android/gms/internal/zzdtj;->zzlxh:Lcom/google/android/gms/internal/zzdtj;

    return-object p1

    :pswitch_e6
    new-instance p1, Lcom/google/android/gms/internal/zzdtj;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtj;-><init>()V

    return-object p1

    :pswitch_data_ec
    .packed-switch 0x1
        :pswitch_e6
        :pswitch_e3
        :pswitch_dd
        :pswitch_d7
        :pswitch_aa
        :pswitch_33
        :pswitch_a7
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 5

    iget v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    const/4 v0, 0x0

    :goto_9
    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_20

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzfhe;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzho()I
    .registers 5

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj;->zzlwz:I

    const/4 v1, 0x0

    if-eqz v0, :cond_12

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v0, v1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2c

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzdtj;->zzlxg:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_2c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v1
.end method
