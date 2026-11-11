.class public final Lcom/google/android/gms/internal/zzffq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FieldDescriptorType::",
        "Lcom/google/android/gms/internal/zzffs<",
        "TFieldDescriptorType;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final zzpgm:Lcom/google/android/gms/internal/zzffq;


# instance fields
.field private zzktj:Z

.field private final zzpgk:Lcom/google/android/gms/internal/zzfhy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhy<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzpgl:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/google/android/gms/internal/zzffq;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzffq;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/zzffq;->zzpgm:Lcom/google/android/gms/internal/zzffq;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfhy;->zzma(I)Lcom/google/android/gms/internal/zzfhy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    return-void
.end method

.method private constructor <init>(Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzfhy;->zzma(I)Lcom/google/android/gms/internal/zzfhy;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzffq;->zzktj:Z

    if-nez v0, :cond_16

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfhy;->zzbiy()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzffq;->zzktj:Z

    :cond_16
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzfiy;ILjava/lang/Object;)I
    .registers 4

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzlg(I)I

    move-result p1

    sget-object v0, Lcom/google/android/gms/internal/zzfiy;->zzply:Lcom/google/android/gms/internal/zzfiy;

    if-ne p0, v0, :cond_10

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzffz;->zzh(Lcom/google/android/gms/internal/zzfhe;)Z

    shl-int/lit8 p1, p1, 0x1

    :cond_10
    invoke-static {p0, p2}, Lcom/google/android/gms/internal/zzffq;->zzb(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static zza(Lcom/google/android/gms/internal/zzffb;Lcom/google/android/gms/internal/zzfiy;Z)Ljava/lang/Object;
    .registers 4

    sget-object p2, Lcom/google/android/gms/internal/zzfje;->zzpmw:Lcom/google/android/gms/internal/zzfje;

    sget-object v0, Lcom/google/android/gms/internal/zzfix;->zzpgo:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_ac

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle enums."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle embedded messages."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_25
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "readPrimitiveField() cannot handle nested groups."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_2d
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/zzfje;->zza(Lcom/google/android/gms/internal/zzffb;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :pswitch_32
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwh()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_3b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwg()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :pswitch_44
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwf()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_4d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwe()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :pswitch_56
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :pswitch_5f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p0

    return-object p0

    :pswitch_64
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvz()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_6d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvy()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :pswitch_76
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvx()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_7f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvw()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :pswitch_88
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvu()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_91
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->zzcvv()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :pswitch_9a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->readFloat()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :pswitch_a3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzffb;->readDouble()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :pswitch_data_ac
    .packed-switch 0x1
        :pswitch_a3
        :pswitch_9a
        :pswitch_91
        :pswitch_88
        :pswitch_7f
        :pswitch_76
        :pswitch_6d
        :pswitch_64
        :pswitch_5f
        :pswitch_56
        :pswitch_4d
        :pswitch_44
        :pswitch_3b
        :pswitch_32
        :pswitch_2d
        :pswitch_25
        :pswitch_1d
        :pswitch_15
    .end packed-switch
.end method

.method public static zza(Lcom/google/android/gms/internal/zzffg;Lcom/google/android/gms/internal/zzfiy;ILjava/lang/Object;)V
    .registers 5

    sget-object v0, Lcom/google/android/gms/internal/zzfiy;->zzply:Lcom/google/android/gms/internal/zzfiy;

    if-ne p1, v0, :cond_d

    check-cast p3, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {p3}, Lcom/google/android/gms/internal/zzffz;->zzh(Lcom/google/android/gms/internal/zzfhe;)Z

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/zzffg;->zze(ILcom/google/android/gms/internal/zzfhe;)V

    return-void

    :cond_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfiy;->zzdae()I

    move-result v0

    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/zzffg;->zzz(II)V

    sget-object p2, Lcom/google/android/gms/internal/zzffr;->zzpgo:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_ea

    goto/16 :goto_e9

    :pswitch_21
    instance-of p1, p3, Lcom/google/android/gms/internal/zzfga;

    if-eqz p1, :cond_2f

    check-cast p3, Lcom/google/android/gms/internal/zzfga;

    invoke-interface {p3}, Lcom/google/android/gms/internal/zzfga;->zzhq()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzlc(I)V

    return-void

    :cond_2f
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzlc(I)V

    goto/16 :goto_e9

    :pswitch_3a
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzcu(J)V

    return-void

    :pswitch_44
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzle(I)V

    return-void

    :pswitch_4e
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzcv(J)V

    return-void

    :pswitch_58
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzlf(I)V

    return-void

    :pswitch_62
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzld(I)V

    return-void

    :pswitch_6c
    instance-of p1, p3, Lcom/google/android/gms/internal/zzfes;

    if-eqz p1, :cond_76

    check-cast p3, Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/zzffg;->zzay(Lcom/google/android/gms/internal/zzfes;)V

    return-void

    :cond_76
    check-cast p3, [B

    const/4 p1, 0x0

    array-length p2, p3

    invoke-virtual {p0, p3, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzi([BII)V

    return-void

    :pswitch_7e
    instance-of p1, p3, Lcom/google/android/gms/internal/zzfes;

    if-eqz p1, :cond_88

    check-cast p3, Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/zzffg;->zzay(Lcom/google/android/gms/internal/zzfes;)V

    return-void

    :cond_88
    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/zzffg;->zzts(Ljava/lang/String;)V

    return-void

    :pswitch_8e
    check-cast p3, Lcom/google/android/gms/internal/zzfhe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/zzffg;->zze(Lcom/google/android/gms/internal/zzfhe;)V

    return-void

    :pswitch_94
    check-cast p3, Lcom/google/android/gms/internal/zzfhe;

    invoke-interface {p3, p0}, Lcom/google/android/gms/internal/zzfhe;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void

    :pswitch_9a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzdd(Z)V

    return-void

    :pswitch_a4
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzlf(I)V

    return-void

    :pswitch_ae
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzcv(J)V

    return-void

    :pswitch_b8
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzlc(I)V

    return-void

    :pswitch_c2
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzct(J)V

    return-void

    :pswitch_cc
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzct(J)V

    return-void

    :pswitch_d6
    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzf(F)V

    return-void

    :pswitch_e0
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffg;->zzn(D)V

    :goto_e9
    return-void

    :pswitch_data_ea
    .packed-switch 0x1
        :pswitch_e0
        :pswitch_d6
        :pswitch_cc
        :pswitch_c2
        :pswitch_b8
        :pswitch_ae
        :pswitch_a4
        :pswitch_9a
        :pswitch_94
        :pswitch_8e
        :pswitch_7e
        :pswitch_6c
        :pswitch_62
        :pswitch_58
        :pswitch_4e
        :pswitch_44
        :pswitch_3a
        :pswitch_21
    .end packed-switch
.end method

.method private zza(Lcom/google/android/gms/internal/zzffs;Ljava/lang/Object;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzffs;->zzcxj()Z

    move-result v0

    if-eqz v0, :cond_33

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_2b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_19
    if-ge v1, p2, :cond_29

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzffs;->zzcxh()Lcom/google/android/gms/internal/zzfiy;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)V

    goto :goto_19

    :cond_29
    move-object p2, v0

    goto :goto_3a

    :cond_2b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_33
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzffs;->zzcxh()Lcom/google/android/gms/internal/zzfiy;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)V

    :goto_3a
    instance-of v0, p2, Lcom/google/android/gms/internal/zzfgg;

    if-eqz v0, :cond_41

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    :cond_41
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzfhy;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)V
    .registers 4

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffz;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/zzffr;->zzpgn:[I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzfiy;->zzdad()Lcom/google/android/gms/internal/zzfjd;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_52

    goto :goto_44

    :pswitch_15
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfhe;

    if-nez p0, :cond_43

    instance-of p0, p1, Lcom/google/android/gms/internal/zzfgg;

    if-eqz p0, :cond_1e

    goto :goto_43

    :cond_1e
    const/4 v0, 0x0

    goto :goto_43

    :pswitch_20
    instance-of p0, p1, Ljava/lang/Integer;

    if-nez p0, :cond_43

    instance-of p0, p1, Lcom/google/android/gms/internal/zzfga;

    if-eqz p0, :cond_1e

    goto :goto_43

    :pswitch_29
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfes;

    if-nez p0, :cond_43

    instance-of p0, p1, [B

    if-eqz p0, :cond_1e

    goto :goto_43

    :pswitch_32
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_43

    :pswitch_35
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_43

    :pswitch_38
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_43

    :pswitch_3b
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_43

    :pswitch_3e
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_43

    :pswitch_41
    instance-of v0, p1, Ljava/lang/Integer;

    :cond_43
    :goto_43
    move v1, v0

    :goto_44
    if-eqz v1, :cond_47

    return-void

    :cond_47
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_50

    :goto_4f
    throw p0

    :goto_50
    goto :goto_4f

    nop

    :pswitch_data_52
    .packed-switch 0x1
        :pswitch_41
        :pswitch_3e
        :pswitch_3b
        :pswitch_38
        :pswitch_35
        :pswitch_32
        :pswitch_29
        :pswitch_20
        :pswitch_15
    .end packed-switch
.end method

.method private static zzb(Lcom/google/android/gms/internal/zzffs;Ljava/lang/Object;)I
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzffs<",
            "*>;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzffs;->zzcxh()Lcom/google/android/gms/internal/zzfiy;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzffs;->zzhq()I

    move-result v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzffs;->zzcxj()Z

    move-result v2

    if-eqz v2, :cond_4b

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzffs;->zzcxk()Z

    move-result p0

    const/4 v2, 0x0

    check-cast p1, Ljava/util/List;

    if-eqz p0, :cond_36

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzffq;->zzb(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_1b

    :cond_2b
    invoke-static {v1}, Lcom/google/android/gms/internal/zzffg;->zzlg(I)I

    move-result p0

    add-int/2addr p0, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzffg;->zzlp(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1

    :cond_36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzfiy;ILjava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_3a

    :cond_4a
    return v2

    :cond_4b
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzfiy;ILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static zzb(Lcom/google/android/gms/internal/zzfiy;Ljava/lang/Object;)I
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzffr;->zzpgo:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_fa

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_13
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfga;

    if-eqz p0, :cond_22

    check-cast p1, Lcom/google/android/gms/internal/zzfga;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzfga;->zzhq()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzlm(I)I

    move-result p0

    return p0

    :cond_22
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzlm(I)I

    move-result p0

    return p0

    :pswitch_2d
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzcy(J)I

    move-result p0

    return p0

    :pswitch_38
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzlj(I)I

    move-result p0

    return p0

    :pswitch_43
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzda(J)I

    move-result p0

    return p0

    :pswitch_4e
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzll(I)I

    move-result p0

    return p0

    :pswitch_59
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzli(I)I

    move-result p0

    return p0

    :pswitch_64
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfes;

    if-eqz p0, :cond_6f

    check-cast p1, Lcom/google/android/gms/internal/zzfes;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzaz(Lcom/google/android/gms/internal/zzfes;)I

    move-result p0

    return p0

    :cond_6f
    check-cast p1, [B

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzbd([B)I

    move-result p0

    return p0

    :pswitch_76
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfes;

    if-eqz p0, :cond_81

    check-cast p1, Lcom/google/android/gms/internal/zzfes;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzaz(Lcom/google/android/gms/internal/zzfes;)I

    move-result p0

    return p0

    :cond_81
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zztt(Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_88
    instance-of p0, p1, Lcom/google/android/gms/internal/zzfgg;

    if-eqz p0, :cond_93

    check-cast p1, Lcom/google/android/gms/internal/zzfgg;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zza(Lcom/google/android/gms/internal/zzfgk;)I

    move-result p0

    return p0

    :cond_93
    check-cast p1, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzf(Lcom/google/android/gms/internal/zzfhe;)I

    move-result p0

    return p0

    :pswitch_9a
    check-cast p1, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzffg;->zzg(Lcom/google/android/gms/internal/zzfhe;)I

    move-result p0

    return p0

    :pswitch_a1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzde(Z)I

    move-result p0

    return p0

    :pswitch_ac
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzlk(I)I

    move-result p0

    return p0

    :pswitch_b7
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzcz(J)I

    move-result p0

    return p0

    :pswitch_c2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzlh(I)I

    move-result p0

    return p0

    :pswitch_cd
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzcx(J)I

    move-result p0

    return p0

    :pswitch_d8
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzcw(J)I

    move-result p0

    return p0

    :pswitch_e3
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/zzffg;->zzg(F)I

    move-result p0

    return p0

    :pswitch_ee
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzffg;->zzo(D)I

    move-result p0

    return p0

    nop

    :pswitch_data_fa
    .packed-switch 0x1
        :pswitch_ee
        :pswitch_e3
        :pswitch_d8
        :pswitch_cd
        :pswitch_c2
        :pswitch_b7
        :pswitch_ac
        :pswitch_a1
        :pswitch_9a
        :pswitch_88
        :pswitch_76
        :pswitch_64
        :pswitch_59
        :pswitch_4e
        :pswitch_43
        :pswitch_38
        :pswitch_2d
        :pswitch_13
    .end packed-switch
.end method

.method private static zzb(Ljava/util/Map$Entry;)I
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzffs;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzffs;->zzcxi()Lcom/google/android/gms/internal/zzfjd;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/zzfjd;->zzpms:Lcom/google/android/gms/internal/zzfjd;

    if-ne v2, v3, :cond_3a

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzffs;->zzcxj()Z

    move-result v2

    if-nez v2, :cond_3a

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzffs;->zzcxk()Z

    move-result v2

    if-nez v2, :cond_3a

    instance-of v0, v1, Lcom/google/android/gms/internal/zzfgg;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzffs;

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzffs;->zzhq()I

    move-result p0

    if-eqz v0, :cond_33

    check-cast v1, Lcom/google/android/gms/internal/zzfgg;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzffg;->zzb(ILcom/google/android/gms/internal/zzfgk;)I

    move-result p0

    return p0

    :cond_33
    check-cast v1, Lcom/google/android/gms/internal/zzfhe;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzffg;->zzd(ILcom/google/android/gms/internal/zzfhe;)I

    move-result p0

    return p0

    :cond_3a
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffq;->zzb(Lcom/google/android/gms/internal/zzffs;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static zzcxf()Lcom/google/android/gms/internal/zzffq;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/zzffs<",
            "TT;>;>()",
            "Lcom/google/android/gms/internal/zzffq<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzffq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzffq;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .registers 5

    new-instance v0, Lcom/google/android/gms/internal/zzffq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzffq;-><init>()V

    const/4 v1, 0x0

    :goto_6
    iget-object v2, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzfhy;->zzczj()I

    move-result v2

    if-ge v1, v2, :cond_24

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzfhy;->zzmb(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffs;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzffs;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_24
    iget-object v1, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfhy;->zzczk()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_48

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffs;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/zzffq;->zza(Lcom/google/android/gms/internal/zzffs;Ljava/lang/Object;)V

    goto :goto_2e

    :cond_48
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 3

    if-ne p0, p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    instance-of v0, p1, Lcom/google/android/gms/internal/zzffq;

    if-nez v0, :cond_a

    const/4 p1, 0x0

    return p1

    :cond_a
    check-cast p1, Lcom/google/android/gms/internal/zzffq;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfhy;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfhy;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgl:Z

    if-eqz v0, :cond_14

    new-instance v0, Lcom/google/android/gms/internal/zzfgj;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzfhy;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzfgj;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfhy;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final zzcxg()I
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzfhy;->zzczj()I

    move-result v2

    if-ge v0, v2, :cond_18

    iget-object v2, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzfhy;->zzmb(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzffq;->zzb(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffq;->zzpgk:Lcom/google/android/gms/internal/zzfhy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfhy;->zzczk()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzffq;->zzb(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_22

    :cond_34
    return v1
.end method
