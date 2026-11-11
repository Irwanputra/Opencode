.class public final Lcom/google/android/gms/internal/zzaig;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mState:I

.field private zzapq:Ljava/lang/String;

.field private zzavn:Ljava/lang/String;

.field private final zzchk:F

.field private zzcsd:Ljava/lang/String;

.field private zzdbh:Ljava/lang/String;

.field private zzdbi:F

.field private zzdbj:F

.field private zzdbk:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lcom/google/android/gms/internal/zzaig;->zzchk:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzaig;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaig;->zzdbh:Ljava/lang/String;

    return-void
.end method

.method private static zza(Ljava/util/List;Ljava/lang/String;Z)I
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)I"
        }
    .end annotation

    if-nez p2, :cond_4

    const/4 p0, -0x1

    return p0

    :cond_4
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method private final zza(IFF)V
    .registers 9

    if-nez p1, :cond_c

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    iput p2, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    iput p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbj:F

    iput p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbk:F

    return-void

    :cond_c
    iget v0, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_12

    return-void

    :cond_12
    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne p1, v2, :cond_7c

    iget p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbj:F

    cmpl-float p1, p3, p1

    if-lez p1, :cond_1f

    iput p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbj:F

    goto :goto_27

    :cond_1f
    iget p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbk:F

    cmpg-float p1, p3, p1

    if-gez p1, :cond_27

    iput p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbk:F

    :cond_27
    :goto_27
    iget p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbj:F

    iget p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbk:F

    sub-float/2addr p1, p3

    const/high16 p3, 0x41f00000    # 30.0f

    iget v4, p0, Lcom/google/android/gms/internal/zzaig;->zzchk:F

    mul-float p3, p3, v4

    cmpl-float p1, p1, p3

    if-lez p1, :cond_39

    iput v1, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    return-void

    :cond_39
    const/4 p1, 0x3

    if-eqz v0, :cond_50

    if-ne v0, v2, :cond_3f

    goto :goto_50

    :cond_3f
    if-eq v0, v3, :cond_43

    if-ne v0, p1, :cond_61

    :cond_43
    iget p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    sub-float p3, p2, p3

    const/high16 v1, -0x3db80000    # -50.0f

    mul-float v4, v4, v1

    cmpg-float p3, p3, v4

    if-gtz p3, :cond_61

    goto :goto_5c

    :cond_50
    :goto_50
    iget p3, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    sub-float p3, p2, p3

    const/high16 v1, 0x42480000    # 50.0f

    mul-float v4, v4, v1

    cmpl-float p3, p3, v4

    if-ltz p3, :cond_61

    :goto_5c
    iput p2, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    :cond_61
    iget p3, p0, Lcom/google/android/gms/internal/zzaig;->mState:I

    if-eq p3, v3, :cond_73

    if-ne p3, p1, :cond_68

    goto :goto_73

    :cond_68
    if-ne p3, v2, :cond_84

    iget p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    cmpg-float p1, p2, p1

    if-gez p1, :cond_84

    iput p2, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    return-void

    :cond_73
    :goto_73
    iget p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    cmpl-float p1, p2, p1

    if-lez p1, :cond_84

    iput p2, p0, Lcom/google/android/gms/internal/zzaig;->zzdbi:F

    return-void

    :cond_7c
    if-ne p1, v3, :cond_84

    const/4 p1, 0x4

    if-ne v0, p1, :cond_84

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaig;->showDialog()V

    :cond_84
    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzaig;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaig;->zzqm()V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzaig;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaig;->zzqn()V

    return-void
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzaig;)V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaig;->zzqo()V

    return-void
.end method

.method public static synthetic zzd(Lcom/google/android/gms/internal/zzaig;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic zze(Lcom/google/android/gms/internal/zzaig;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaig;->zzapq:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/zzaig;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaig;->zzavn:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzg(Lcom/google/android/gms/internal/zzaig;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzaig;->zzcsd:Ljava/lang/String;

    return-object p0
.end method

.method private final zzqm()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_c

    const-string v0, "Can not create dialog without Activity Context"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    return-void

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaig;->zzdbh:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6f

    const-string v1, "\\+"

    const-string v2, "%20"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahn;->zzf(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_60

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " = "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3d

    :cond_60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6f

    goto :goto_71

    :cond_6f
    const-string v0, "No debug information"

    :goto_71
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const-string v2, "Ad Information"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    new-instance v2, Lcom/google/android/gms/internal/zzaii;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/zzaii;-><init>(Lcom/google/android/gms/internal/zzaig;Ljava/lang/String;)V

    const-string v0, "Share"

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance v0, Lcom/google/android/gms/internal/zzaij;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaij;-><init>(Lcom/google/android/gms/internal/zzaig;)V

    const-string v2, "Close"

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private final zzqn()V
    .registers 2

    const-string v0, "Debug mode [Creative Preview] selected."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaik;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaik;-><init>(Lcom/google/android/gms/internal/zzaig;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahh;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/zzakv;

    return-void
.end method

.method private final zzqo()V
    .registers 2

    const-string v0, "Debug mode [Troubleshooting] selected."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzail;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzail;-><init>(Lcom/google/android/gms/internal/zzaig;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahh;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/zzakv;

    return-void
.end method


# virtual methods
.method public final setAdUnitId(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaig;->zzapq:Ljava/lang/String;

    return-void
.end method

.method public final showDialog()V
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbqv:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_29

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbqu:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_25

    goto :goto_29

    :cond_25
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaig;->zzqm()V

    return-void

    :cond_29
    :goto_29
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    if-nez v1, :cond_35

    const-string v0, "Can not create dialog without Activity Context"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    return-void

    :cond_35
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzer()Lcom/google/android/gms/internal/zzaim;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaim;->zzqp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_46

    const-string v1, "Creative Preview (Enabled)"

    goto :goto_48

    :cond_46
    const-string v1, "Creative Preview"

    :goto_48
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzer()Lcom/google/android/gms/internal/zzaim;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaim;->zzqq()Z

    move-result v2

    if-eqz v2, :cond_55

    const-string v2, "Troubleshooting (Enabled)"

    goto :goto_57

    :cond_55
    const-string v2, "Troubleshooting"

    :goto_57
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x1

    const-string v5, "Ad Information"

    invoke-static {v3, v5, v4}, Lcom/google/android/gms/internal/zzaig;->zza(Ljava/util/List;Ljava/lang/String;Z)I

    move-result v4

    sget-object v5, Lcom/google/android/gms/internal/zznh;->zzbqu:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-static {v3, v1, v5}, Lcom/google/android/gms/internal/zzaig;->zza(Ljava/util/List;Ljava/lang/String;Z)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v3, v2, v0}, Lcom/google/android/gms/internal/zzaig;->zza(Ljava/util/List;Ljava/lang/String;Z)I

    move-result v0

    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzaig;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/zzaht;->zzqk()I

    move-result v6

    invoke-direct {v2, v5, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-string v5, "Select a Debug Mode"

    invoke-virtual {v2, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/CharSequence;

    new-instance v6, Lcom/google/android/gms/internal/zzaih;

    invoke-direct {v6, p0, v4, v1, v0}, Lcom/google/android/gms/internal/zzaih;-><init>(Lcom/google/android/gms/internal/zzaig;III)V

    invoke-virtual {v5, v3, v6}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final zzcl(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaig;->zzavn:Ljava/lang/String;

    return-void
.end method

.method public final zzcm(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaig;->zzdbh:Ljava/lang/String;

    return-void
.end method

.method public final zzcn(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaig;->zzcsd:Ljava/lang/String;

    return-void
.end method

.method public final zze(Landroid/view/MotionEvent;)V
    .registers 8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_1a

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v4

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/google/android/gms/internal/zzaig;->zza(IFF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_1a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/zzaig;->zza(IFF)V

    return-void
.end method
