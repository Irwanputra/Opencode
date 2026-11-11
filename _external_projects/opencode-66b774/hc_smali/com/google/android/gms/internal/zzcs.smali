.class public abstract Lcom/google/android/gms/internal/zzcs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzcr;


# instance fields
.field public zzagx:Landroid/view/MotionEvent;

.field public zzagy:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/view/MotionEvent;",
            ">;"
        }
    .end annotation
.end field

.field public zzagz:J

.field public zzaha:J

.field public zzahb:J

.field public zzahc:J

.field public zzahd:J

.field public zzahe:J

.field public zzahf:J

.field public zzahg:D

.field private zzahh:D

.field private zzahi:D

.field public zzahj:F

.field public zzahk:F

.field public zzahl:F

.field public zzahm:F

.field private zzahn:Z

.field public zzaho:Z

.field public zzahp:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagz:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzaha:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahb:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahc:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahd:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahe:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahf:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahn:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzcs;->zzaho:Z

    :try_start_1f
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbnu:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-static {}, Lcom/google/android/gms/internal/zzbw;->zzz()V

    goto :goto_38

    :cond_35
    invoke-static {}, Lcom/google/android/gms/internal/zzbz;->zzab()Z

    :goto_38
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzcs;->zzahp:Landroid/util/DisplayMetrics;
    :try_end_42
    .catchall {:try_start_1f .. :try_end_42} :catchall_42

    :catchall_42
    return-void
.end method

.method private final zza(Landroid/content/Context;Ljava/lang/String;ZLandroid/view/View;Landroid/app/Activity;[B)Ljava/lang/String;
    .registers 7

    if-eqz p3, :cond_a

    :try_start_2
    invoke-virtual {p0, p1, p4, p5}, Lcom/google/android/gms/internal/zzcs;->zza(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lcom/google/android/gms/internal/zzaz;

    move-result-object p1

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzcs;->zzahn:Z

    goto :goto_f

    :cond_a
    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/zzcs;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaw;)Lcom/google/android/gms/internal/zzaz;

    move-result-object p1

    :goto_f
    if-eqz p1, :cond_1d

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjs;->zzho()I

    move-result p3

    if-nez p3, :cond_18

    goto :goto_1d

    :cond_18
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzbw;->zza(Lcom/google/android/gms/internal/zzaz;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2a

    :cond_1d
    :goto_1d
    const/4 p1, 0x5

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_22
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_22} :catch_25
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_22} :catch_25
    .catchall {:try_start_2 .. :try_end_22} :catchall_23

    goto :goto_2a

    :catchall_23
    const/4 p1, 0x3

    goto :goto_26

    :catch_25
    const/4 p1, 0x7

    :goto_26
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    :goto_2a
    return-object p1
.end method


# virtual methods
.method public abstract zza([Ljava/lang/StackTraceElement;)J
.end method

.method public abstract zza(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Lcom/google/android/gms/internal/zzaz;
.end method

.method public abstract zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzaw;)Lcom/google/android/gms/internal/zzaz;
.end method

.method public final zza(Landroid/content/Context;)Ljava/lang/String;
    .registers 10

    invoke-static {}, Lcom/google/android/gms/internal/zzdr;->zzau()Z

    move-result v0

    if-eqz v0, :cond_21

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbnw:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_21

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The caller must not be called from the UI thread."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    :goto_21
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzcs;->zza(Landroid/content/Context;Ljava/lang/String;ZLandroid/view/View;Landroid/app/Activity;[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/zzcs;->zza(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .registers 12

    const/4 v3, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzcs;->zza(Landroid/content/Context;Ljava/lang/String;ZLandroid/view/View;Landroid/app/Activity;[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final zza(III)V
    .registers 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/zzcs;->zzagx:Landroid/view/MotionEvent;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/zzcs;->zzahp:Landroid/util/DisplayMetrics;

    if-eqz v1, :cond_2b

    const-wide/16 v2, 0x0

    move/from16 v4, p3

    int-to-long v4, v4

    const/4 v6, 0x1

    move/from16 v7, p1

    int-to-float v7, v7

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v7, v7, v1

    move/from16 v8, p2

    int-to-float v8, v8

    mul-float v8, v8, v1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v15}, Landroid/view/MotionEvent;->obtain(JJIFFFFIFFII)Landroid/view/MotionEvent;

    move-result-object v1

    goto :goto_2c

    :cond_2b
    const/4 v1, 0x0

    :goto_2c
    iput-object v1, v0, Lcom/google/android/gms/internal/zzcs;->zzagx:Landroid/view/MotionEvent;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/zzcs;->zzaho:Z

    return-void
.end method

.method public final zza(Landroid/view/MotionEvent;)V
    .registers 16

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahn:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_35

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzahc:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzahb:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzaha:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzagz:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzahd:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzahf:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzcs;->zzahe:J

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_1b

    :cond_2b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagx:Landroid/view/MotionEvent;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzcs;->zzahn:Z

    :cond_35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_6d

    if-eq v0, v3, :cond_42

    if-eq v0, v2, :cond_42

    goto :goto_7f

    :cond_42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-double v4, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-double v6, v0

    iget-wide v8, p0, Lcom/google/android/gms/internal/zzcs;->zzahh:D

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v8, v4, v8

    iget-wide v10, p0, Lcom/google/android/gms/internal/zzcs;->zzahi:D

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v10, v6, v10

    iget-wide v12, p0, Lcom/google/android/gms/internal/zzcs;->zzahg:D

    mul-double v8, v8, v8

    mul-double v10, v10, v10

    add-double/2addr v10, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    add-double/2addr v8, v12

    iput-wide v8, p0, Lcom/google/android/gms/internal/zzcs;->zzahg:D

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahh:D

    iput-wide v6, p0, Lcom/google/android/gms/internal/zzcs;->zzahi:D

    goto :goto_7f

    :cond_6d
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahg:D

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-double v4, v0

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahh:D

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-double v4, v0

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahi:D

    :goto_7f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const-wide/16 v4, 0x1

    if-eqz v0, :cond_11f

    if-eq v0, v3, :cond_eb

    if-eq v0, v2, :cond_97

    const/4 p1, 0x3

    if-eq v0, p1, :cond_90

    goto/16 :goto_14e

    :cond_90
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahc:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahc:J

    goto/16 :goto_14e

    :cond_97
    iget-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzaha:J

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v0

    add-int/2addr v0, v3

    int-to-long v6, v0

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzaha:J

    :try_start_a2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzcs;->zzb(Landroid/view/MotionEvent;)Lcom/google/android/gms/internal/zzdq;

    move-result-object p1

    if-eqz p1, :cond_b2

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzfm:Ljava/lang/Long;

    if-eqz v0, :cond_b2

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzajp:Ljava/lang/Long;

    if-eqz v0, :cond_b2

    const/4 v0, 0x1

    goto :goto_b3

    :cond_b2
    const/4 v0, 0x0

    :goto_b3
    if-eqz v0, :cond_c7

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahe:J

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzfm:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzajp:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    add-long/2addr v6, v8

    add-long/2addr v6, v4

    iput-wide v6, p0, Lcom/google/android/gms/internal/zzcs;->zzahe:J

    :cond_c7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahp:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_d6

    if-eqz p1, :cond_d6

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzfk:Ljava/lang/Long;

    if-eqz v0, :cond_d6

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdq;->zzajq:Ljava/lang/Long;

    if-eqz v0, :cond_d6

    const/4 v1, 0x1

    :cond_d6
    if-eqz v1, :cond_14e

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahf:J

    iget-object v2, p1, Lcom/google/android/gms/internal/zzdq;->zzfk:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object p1, p1, Lcom/google/android/gms/internal/zzdq;->zzajq:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long/2addr v4, v6

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/google/android/gms/internal/zzcs;->zzahf:J
    :try_end_ea
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_a2 .. :try_end_ea} :catch_14e

    goto :goto_14e

    :cond_eb
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzcs;->zzagx:Landroid/view/MotionEvent;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    const/4 v0, 0x6

    if-le p1, v0, :cond_10a

    iget-object p1, p0, Lcom/google/android/gms/internal/zzcs;->zzagy:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    :cond_10a
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahb:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahb:J

    :try_start_10f
    new-instance p1, Ljava/lang/Throwable;

    invoke-direct {p1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzcs;->zza([Ljava/lang/StackTraceElement;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahd:J
    :try_end_11e
    .catch Lcom/google/android/gms/internal/zzdj; {:try_start_10f .. :try_end_11e} :catch_14e

    goto :goto_14e

    :cond_11f
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbnr:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_149

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahj:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahk:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzcs;->zzahl:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzcs;->zzahm:F

    :cond_149
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagz:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzcs;->zzagz:J

    :catch_14e
    :cond_14e
    :goto_14e
    iput-boolean v3, p0, Lcom/google/android/gms/internal/zzcs;->zzaho:Z

    return-void
.end method

.method public abstract zzb(Landroid/view/MotionEvent;)Lcom/google/android/gms/internal/zzdq;
.end method

.method public zzb(Landroid/view/View;)V
    .registers 2

    return-void
.end method
