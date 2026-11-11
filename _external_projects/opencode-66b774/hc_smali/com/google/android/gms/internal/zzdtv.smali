.class public final Lcom/google/android/gms/internal/zzdtv;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtv$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtv;",
        "Lcom/google/android/gms/internal/zzdtv$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtv;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlyb:Lcom/google/android/gms/internal/zzdtv;


# instance fields
.field private zzlwy:I

.field private zzlxz:Ljava/lang/String;

.field private zzlya:Lcom/google/android/gms/internal/zzfgd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgd<",
            "Lcom/google/android/gms/internal/zzdtf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtv;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/zzffu;->zzcxo()Lcom/google/android/gms/internal/zzfgd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdtf;)V
    .registers 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzfgd;->zzcvi()Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

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

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    :cond_1e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtv;Lcom/google/android/gms/internal/zzdtf;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtv;->zza(Lcom/google/android/gms/internal/zzdtf;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtv;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtv;->zzoq(Ljava/lang/String;)V

    return-void
.end method

.method public static zzbqg()Lcom/google/android/gms/internal/zzdtv$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtv;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdtv$zza;

    return-object v1
.end method

.method public static synthetic zzbqh()Lcom/google/android/gms/internal/zzdtv;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    return-object v0
.end method

.method private final zzoq(Ljava/lang/String;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdtw;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_f0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_10
    return-object v0

    :pswitch_11
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_16
    sget-object p1, Lcom/google/android/gms/internal/zzdtv;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_2f

    const-class p1, Lcom/google/android/gms/internal/zzdtv;

    monitor-enter p1

    :try_start_1d
    sget-object p2, Lcom/google/android/gms/internal/zzdtv;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2a

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtv;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2a
    monitor-exit p1

    goto :goto_2f

    :catchall_2c
    move-exception p2

    monitor-exit p1
    :try_end_2e
    .catchall {:try_start_1d .. :try_end_2e} :catchall_2c

    throw p2

    :cond_2f
    :goto_2f
    sget-object p1, Lcom/google/android/gms/internal/zzdtv;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_32
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_3a
    :goto_3a
    if-nez p1, :cond_a5

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result v0

    if-eqz v0, :cond_81

    const/16 v2, 0xa

    if-eq v0, v2, :cond_7a

    const/16 v3, 0x12

    if-eq v0, v3, :cond_51

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto :goto_81

    :cond_51
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzfgd;->zzcvi()Z

    move-result v0

    if-nez v0, :cond_6a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_62

    goto :goto_64

    :cond_62
    shl-int/lit8 v2, v3, 0x1

    :goto_64
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzfgd;->zzly(I)Lcom/google/android/gms/internal/zzfgd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    :cond_6a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-static {}, Lcom/google/android/gms/internal/zzdtf;->zzbpa()Lcom/google/android/gms/internal/zzdtf;

    move-result-object v2

    invoke-virtual {p2, v2, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzdtf;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_7a
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;
    :try_end_80
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_80} :catch_99
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_80} :catch_85
    .catchall {:try_start_3c .. :try_end_80} :catchall_83

    goto :goto_3a

    :cond_81
    :goto_81
    const/4 p1, 0x1

    goto :goto_3a

    :catchall_83
    move-exception p1

    goto :goto_a4

    :catch_85
    move-exception p1

    :try_start_86
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_99
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_a4
    .catchall {:try_start_86 .. :try_end_a4} :catchall_83

    :goto_a4
    throw p1

    :cond_a5
    :pswitch_a5
    sget-object p1, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    return-object p1

    :pswitch_a8
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtv;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    iget-object v0, p3, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfgd;Lcom/google/android/gms/internal/zzfgd;)Lcom/google/android/gms/internal/zzfgd;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    sget-object p1, Lcom/google/android/gms/internal/zzffu$zzf;->zzphb:Lcom/google/android/gms/internal/zzffu$zzf;

    if-ne p2, p1, :cond_d9

    iget p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlwy:I

    iget p2, p3, Lcom/google/android/gms/internal/zzdtv;->zzlwy:I

    or-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlwy:I

    :cond_d9
    return-object p0

    :pswitch_da
    new-instance p1, Lcom/google/android/gms/internal/zzdtv$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdtv$zza;-><init>(Lcom/google/android/gms/internal/zzdtw;)V

    return-object p1

    :pswitch_e0
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzfgd;->zzbiy()V

    return-object v0

    :pswitch_e6
    sget-object p1, Lcom/google/android/gms/internal/zzdtv;->zzlyb:Lcom/google/android/gms/internal/zzdtv;

    return-object p1

    :pswitch_e9
    new-instance p1, Lcom/google/android/gms/internal/zzdtv;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtv;-><init>()V

    return-object p1

    nop

    :pswitch_data_f0
    .packed-switch 0x1
        :pswitch_e9
        :pswitch_e6
        :pswitch_e0
        :pswitch_da
        :pswitch_a8
        :pswitch_32
        :pswitch_a5
        :pswitch_16
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    const/4 v0, 0x0

    :goto_f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_26

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzfhe;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_26
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbqf()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzdtf;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    return-object v0
.end method

.method public final zzho()I
    .registers 5

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_18

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtv;->zzlxz:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    goto :goto_19

    :cond_18
    const/4 v0, 0x0

    :goto_19
    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_32

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzdtv;->zzlya:Lcom/google/android/gms/internal/zzfgd;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    :cond_32
    iget-object v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v1
.end method
