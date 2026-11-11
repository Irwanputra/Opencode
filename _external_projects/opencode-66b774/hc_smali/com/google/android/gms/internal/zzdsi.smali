.class public final Lcom/google/android/gms/internal/zzdsi;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdsi$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdsi;",
        "Lcom/google/android/gms/internal/zzdsi$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdsi;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzluy:Lcom/google/android/gms/internal/zzdsi;


# instance fields
.field private zzltn:I

.field private zzltv:Lcom/google/android/gms/internal/zzfes;

.field private zzlux:Lcom/google/android/gms/internal/zzdsk;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdsi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsi;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method private final setVersion(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsi;I)V
    .registers 2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsi;->setVersion(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsi;Lcom/google/android/gms/internal/zzdsk;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsi;->zza(Lcom/google/android/gms/internal/zzdsk;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdsi;Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdsi;->zzk(Lcom/google/android/gms/internal/zzfes;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdsk;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    return-void
.end method

.method public static zzbnr()Lcom/google/android/gms/internal/zzdsi$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsi;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdsi$zza;

    return-object v1
.end method

.method public static synthetic zzbns()Lcom/google/android/gms/internal/zzdsi;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    return-object v0
.end method

.method private final zzk(Lcom/google/android/gms/internal/zzfes;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method public static zzx(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdsi;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdsi;

    return-object p0
.end method


# virtual methods
.method public final getVersion()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdsj;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_102

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsi;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdsi;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdsi;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdsi;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsi;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_b4

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_90

    const/16 v3, 0x8

    if-eq p1, v3, :cond_89

    const/16 v3, 0x12

    if-eq p1, v3, :cond_5c

    const/16 v3, 0x1a

    if-eq p1, v3, :cond_55

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_90

    :cond_55
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_5c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    if-eqz p1, :cond_6e

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdsk;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdsk$zza;

    goto :goto_6f

    :cond_6e
    move-object v3, v2

    :goto_6f
    invoke-static {}, Lcom/google/android/gms/internal/zzdsk;->zzbnw()Lcom/google/android/gms/internal/zzdsk;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsk;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsk;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    goto :goto_3a

    :cond_89
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I
    :try_end_8f
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_8f} :catch_a8
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_8f} :catch_94
    .catchall {:try_start_3c .. :try_end_8f} :catchall_92

    goto :goto_3a

    :cond_90
    :goto_90
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_92
    move-exception p1

    goto :goto_b3

    :catch_94
    move-exception p1

    :try_start_95
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_a8
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_b3
    .catchall {:try_start_95 .. :try_end_b3} :catchall_92

    :goto_b3
    throw p1

    :cond_b4
    :pswitch_b4
    sget-object p1, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    return-object p1

    :pswitch_b7
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdsi;

    iget p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    if-eqz p1, :cond_c1

    const/4 v2, 0x1

    goto :goto_c2

    :cond_c1
    const/4 v2, 0x0

    :goto_c2
    iget v3, p3, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    if-eqz v3, :cond_c8

    const/4 v4, 0x1

    goto :goto_c9

    :cond_c8
    const/4 v4, 0x0

    :goto_c9
    invoke-interface {p2, v2, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsk;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    sget-object v2, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v2, :cond_e3

    const/4 v3, 0x1

    goto :goto_e4

    :cond_e3
    const/4 v3, 0x0

    :goto_e4
    iget-object p3, p3, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    if-eq p3, v2, :cond_e9

    goto :goto_ea

    :cond_e9
    const/4 v1, 0x0

    :goto_ea
    invoke-interface {p2, v3, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-object p0

    :pswitch_f1
    new-instance p1, Lcom/google/android/gms/internal/zzdsi$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdsi$zza;-><init>(Lcom/google/android/gms/internal/zzdsj;)V

    return-object p1

    :pswitch_f7
    return-object v2

    :pswitch_f8
    sget-object p1, Lcom/google/android/gms/internal/zzdsi;->zzluy:Lcom/google/android/gms/internal/zzdsi;

    return-object p1

    :pswitch_fb
    new-instance p1, Lcom/google/android/gms/internal/zzdsi;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdsi;-><init>()V

    return-object p1

    nop

    :pswitch_data_102
    .packed-switch 0x1
        :pswitch_fb
        :pswitch_f8
        :pswitch_f7
        :pswitch_f1
        :pswitch_b7
        :pswitch_33
        :pswitch_b4
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    if-eqz v0, :cond_16

    const/4 v1, 0x2

    if-nez v0, :cond_13

    invoke-static {}, Lcom/google/android/gms/internal/zzdsk;->zzbnw()Lcom/google/android/gms/internal/zzdsk;

    move-result-object v0

    :cond_13
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbmj()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzbnq()Lcom/google/android/gms/internal/zzdsk;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdsk;->zzbnw()Lcom/google/android/gms/internal/zzdsk;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltn:I

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzlux:Lcom/google/android/gms/internal/zzdsk;

    if-eqz v0, :cond_21

    const/4 v2, 0x2

    if-nez v0, :cond_1c

    invoke-static {}, Lcom/google/android/gms/internal/zzdsk;->zzbnw()Lcom/google/android/gms/internal/zzdsk;

    move-result-object v0

    :cond_1c
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_31

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdsi;->zzltv:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_31
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
