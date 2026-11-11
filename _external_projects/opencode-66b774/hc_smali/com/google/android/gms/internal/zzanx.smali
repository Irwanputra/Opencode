.class public final Lcom/google/android/gms/internal/zzanx;
.super Landroid/webkit/WebView;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/webkit/DownloadListener;
.implements Lcom/google/android/gms/internal/zzanh;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private zzalx:Ljava/lang/String;

.field private final zzanr:Lcom/google/android/gms/ads/internal/zzv;

.field private final zzapr:Lcom/google/android/gms/internal/zzakd;

.field private zzavi:Lcom/google/android/gms/internal/zzajq;

.field private final zzavx:Landroid/view/WindowManager;

.field private final zzbuv:Lcom/google/android/gms/internal/zzcv;

.field private zzchl:I

.field private zzchm:I

.field private zzcho:I

.field private zzchp:I

.field private final zzcmo:Lcom/google/android/gms/internal/zzis;

.field private zzcrt:Ljava/lang/String;

.field private zzcza:Ljava/lang/Boolean;

.field private zzdje:Lcom/google/android/gms/internal/zzns;

.field private final zzdly:Lcom/google/android/gms/internal/zzaoz;

.field private final zzdlz:Lcom/google/android/gms/ads/internal/zzbl;

.field private zzdma:Lcom/google/android/gms/internal/zzani;

.field private zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

.field private zzdmc:Lcom/google/android/gms/internal/zzapa;

.field private zzdmd:Z

.field private zzdme:Z

.field private zzdmf:Z

.field private zzdmg:Z

.field private zzdmh:I

.field private zzdmi:Z

.field private zzdmj:Z

.field private zzdmk:Lcom/google/android/gms/internal/zzaoa;

.field private zzdml:Z

.field private zzdmm:Z

.field private zzdmn:Lcom/google/android/gms/internal/zzoq;

.field private zzdmo:I

.field private zzdmp:I

.field private zzdmq:Lcom/google/android/gms/internal/zzns;

.field private zzdmr:Lcom/google/android/gms/internal/zzns;

.field private zzdms:Lcom/google/android/gms/internal/zznt;

.field private zzdmt:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View$OnClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private zzdmu:Lcom/google/android/gms/ads/internal/overlay/zzd;

.field private zzdmv:Z

.field private zzdmw:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzana;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzaoz;Lcom/google/android/gms/internal/zzapa;Ljava/lang/String;ZZLcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzbl;Lcom/google/android/gms/ads/internal/zzv;Lcom/google/android/gms/internal/zzis;)V
    .registers 14

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance p5, Ljava/lang/Object;

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    const/4 p5, 0x1

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzanx;->zzdmi:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmj:Z

    const-string v1, ""

    iput-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzcrt:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzchm:I

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzchl:I

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzcho:I

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzchp:I

    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzanx;->zzalx:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmh:I

    iput-object p6, p0, Lcom/google/android/gms/internal/zzanx;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzanx;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iput-object p9, p0, Lcom/google/android/gms/internal/zzanx;->zzdlz:Lcom/google/android/gms/ads/internal/zzbl;

    iput-object p10, p0, Lcom/google/android/gms/internal/zzanx;->zzanr:Lcom/google/android/gms/ads/internal/zzv;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "window"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzavx:Landroid/view/WindowManager;

    iput-object p11, p0, Lcom/google/android/gms/internal/zzanx;->zzcmo:Lcom/google/android/gms/internal/zzis;

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    :try_start_49
    invoke-virtual {p2, p5}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
    :try_end_4c
    .catch Ljava/lang/NullPointerException; {:try_start_49 .. :try_end_4c} :catch_4d

    goto :goto_53

    :catch_4d
    move-exception p3

    const-string p4, "Unable to enable Javascript."

    invoke-static {p4, p3}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_53
    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    invoke-virtual {p2, p5}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    invoke-virtual {p2, p5}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x15

    if-lt p3, p4, :cond_66

    const/4 p3, 0x2

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_66
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object p3

    iget-object p4, p7, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {p3, p1, p4}, Lcom/google/android/gms/internal/zzahn;->zzp(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p3

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {p3, p4, p2}, Lcom/google/android/gms/internal/zzaht;->zza(Landroid/content/Context;Landroid/webkit/WebSettings;)Z

    invoke-virtual {p0, p0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzub()V

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱〵つてう()Z

    move-result p2

    if-eqz p2, :cond_99

    new-instance p2, Lcom/google/android/gms/internal/zzaod;

    new-instance p3, Lcom/google/android/gms/internal/zzaoe;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/zzaoe;-><init>(Lcom/google/android/gms/internal/zzanh;)V

    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/internal/zzaod;-><init>(Lcom/google/android/gms/internal/zzaog;Lcom/google/android/gms/internal/zzaof;)V

    const-string p3, "googleAdsJsInterface"

    invoke-virtual {p0, p2, p3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_99
    const-string p2, "accessibility"

    invoke-virtual {p0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string p2, "accessibilityTraversal"

    invoke-virtual {p0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/internal/zzajq;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzaoz;->zzsi()Landroid/app/Activity;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {p2, p3, p0, p0, p4}, Lcom/google/android/gms/internal/zzajq;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzue()V

    new-instance p2, Lcom/google/android/gms/internal/zznt;

    new-instance p3, Lcom/google/android/gms/internal/zznu;

    iget-object p6, p0, Lcom/google/android/gms/internal/zzanx;->zzalx:Ljava/lang/String;

    const-string p7, "make_wv"

    invoke-direct {p3, p5, p7, p6}, Lcom/google/android/gms/internal/zznu;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zznt;-><init>(Lcom/google/android/gms/internal/zznu;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object p2

    invoke-virtual {p2, p8}, Lcom/google/android/gms/internal/zznu;->zzc(Lcom/google/android/gms/internal/zznu;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/zznn;->zzb(Lcom/google/android/gms/internal/zznu;)Lcom/google/android/gms/internal/zzns;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzdje:Lcom/google/android/gms/internal/zzns;

    iget-object p3, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    const-string p5, "native:view_create"

    invoke-virtual {p3, p5, p2}, Lcom/google/android/gms/internal/zznt;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzns;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzanx;->zzdmr:Lcom/google/android/gms/internal/zzns;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzanx;->zzdmq:Lcom/google/android/gms/internal/zzns;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/zzaht;->zzax(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzanx;I)I
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmp:I

    return p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzanx;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method private final zza(Ljava/lang/Boolean;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzcza:Ljava/lang/Boolean;

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_3 .. :try_end_6} :catchall_e

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Boolean;)V

    return-void

    :catchall_e
    move-exception p1

    :try_start_f
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_e

    throw p1
.end method

.method private final zzah(Z)V
    .registers 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_a

    const-string p1, "1"

    goto :goto_c

    :cond_a
    const-string p1, "0"

    :goto_c
    const-string v1, "isVisible"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onAdVisibilityChanged"

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzanx;)I
    .registers 1

    iget p0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmp:I

    return p0
.end method

.method public static zzb(Landroid/content/Context;Lcom/google/android/gms/internal/zzapa;Ljava/lang/String;ZZLcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzbl;Lcom/google/android/gms/ads/internal/zzv;Lcom/google/android/gms/internal/zzis;)Lcom/google/android/gms/internal/zzanx;
    .registers 24

    new-instance v1, Lcom/google/android/gms/internal/zzaoz;

    move-object v0, p0

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzaoz;-><init>(Landroid/content/Context;)V

    new-instance v12, Lcom/google/android/gms/internal/zzanx;

    move-object v0, v12

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/zzanx;-><init>(Lcom/google/android/gms/internal/zzaoz;Lcom/google/android/gms/internal/zzapa;Ljava/lang/String;ZZLcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/ads/internal/zzbl;Lcom/google/android/gms/ads/internal/zzv;Lcom/google/android/gms/internal/zzis;)V

    return-object v12
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzanx;)V
    .registers 1

    invoke-super {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method private final zzdc(Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzanx;->loadUrl(Ljava/lang/String;)V

    goto :goto_12

    :cond_d
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_12
    monitor-exit v0

    return-void

    :catchall_14
    move-exception p1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    throw p1
.end method

.method private final zzdd(Ljava/lang/String;)V
    .registers 5

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁにあがあ()Z

    move-result v0

    if-eqz v0, :cond_6c

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzpg()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_31

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaft;->zzpg()Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzcza:Ljava/lang/Boolean;
    :try_end_1a
    .catchall {:try_start_10 .. :try_end_1a} :catchall_2e

    if-nez v2, :cond_2c

    :try_start_1c
    const-string v2, "(function(){})()"

    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/internal/zzanx;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/Boolean;)V
    :try_end_26
    .catch Ljava/lang/IllegalStateException; {:try_start_1c .. :try_end_26} :catch_27
    .catchall {:try_start_1c .. :try_end_26} :catchall_2e

    goto :goto_2c

    :catch_27
    :try_start_27
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/Boolean;)V

    :cond_2c
    :goto_2c
    monitor-exit v0

    goto :goto_31

    :catchall_2e
    move-exception p1

    monitor-exit v0
    :try_end_30
    .catchall {:try_start_27 .. :try_end_30} :catchall_2e

    throw p1

    :cond_31
    :goto_31
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzpg()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_52

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_48

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/zzanx;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_4d

    :cond_48
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_4d
    monitor-exit v0

    return-void

    :catchall_4f
    move-exception p1

    monitor-exit v0
    :try_end_51
    .catchall {:try_start_3e .. :try_end_51} :catchall_4f

    throw p1

    :cond_52
    const-string v0, "javascript:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_63

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_68

    :cond_63
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_68
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzanx;->zzdc(Ljava/lang/String;)V

    return-void

    :cond_6c
    const-string v0, "javascript:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_7d

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_82

    :cond_7d
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_82
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzanx;->zzdc(Ljava/lang/String;)V

    return-void
.end method

.method private final zzpg()Ljava/lang/Boolean;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzcza:Ljava/lang/Boolean;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method private final zzpu()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmv:Z

    if-nez v1, :cond_11

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmv:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaft;->zzpu()V

    :cond_11
    monitor-exit v0

    return-void

    :catchall_13
    move-exception v1

    monitor-exit v0
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_13

    throw v1
.end method

.method private final zztz()Z
    .registers 11

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzani;->zzfv()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_12

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzani;->zztn()Z

    move-result v0

    if-nez v0, :cond_12

    return v1

    :cond_12
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzavx:Landroid/view/WindowManager;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/view/WindowManager;)Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v4

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaoz;->zzsi()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_58

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v6

    if-nez v6, :cond_3d

    goto :goto_58

    :cond_3d
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzahn;->zzf(Landroid/app/Activity;)[I

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    aget v6, v2, v1

    invoke-static {v0, v6}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v6

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    aget v2, v2, v3

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzajr;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v2

    move v7, v2

    goto :goto_5a

    :cond_58
    :goto_58
    move v6, v4

    move v7, v5

    :goto_5a
    iget v2, p0, Lcom/google/android/gms/internal/zzanx;->zzchl:I

    if-ne v2, v4, :cond_6b

    iget v8, p0, Lcom/google/android/gms/internal/zzanx;->zzchm:I

    if-ne v8, v5, :cond_6b

    iget v8, p0, Lcom/google/android/gms/internal/zzanx;->zzcho:I

    if-ne v8, v6, :cond_6b

    iget v8, p0, Lcom/google/android/gms/internal/zzanx;->zzchp:I

    if-ne v8, v7, :cond_6b

    return v1

    :cond_6b
    if-ne v2, v4, :cond_71

    iget v2, p0, Lcom/google/android/gms/internal/zzanx;->zzchm:I

    if-eq v2, v5, :cond_72

    :cond_71
    const/4 v1, 0x1

    :cond_72
    iput v4, p0, Lcom/google/android/gms/internal/zzanx;->zzchl:I

    iput v5, p0, Lcom/google/android/gms/internal/zzanx;->zzchm:I

    iput v6, p0, Lcom/google/android/gms/internal/zzanx;->zzcho:I

    iput v7, p0, Lcom/google/android/gms/internal/zzanx;->zzchp:I

    new-instance v3, Lcom/google/android/gms/internal/zzxb;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/zzxb;-><init>(Lcom/google/android/gms/internal/zzanh;)V

    iget v8, v0, Landroid/util/DisplayMetrics;->density:F

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzavx:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v9

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/zzxb;->zza(IIIIFI)V

    return v1
.end method

.method private final zzua()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdje:Lcom/google/android/gms/internal/zzns;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aeh2"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    return-void
.end method

.method private final zzub()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    if-nez v1, :cond_3a

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_3a

    :cond_10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-ge v1, v2, :cond_31

    const-string v1, "Disabling hardware acceleration on an AdView."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_42

    :try_start_1e
    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdmg:Z

    if-nez v2, :cond_29

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/zzaht;->zzy(Landroid/view/View;)Z

    :cond_29
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdmg:Z

    monitor-exit v1

    goto :goto_40

    :catchall_2e
    move-exception v2

    monitor-exit v1
    :try_end_30
    .catchall {:try_start_1e .. :try_end_30} :catchall_2e

    :try_start_30
    throw v2

    :cond_31
    const-string v1, "Enabling hardware acceleration on an AdView."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    :goto_36
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzuc()V

    goto :goto_40

    :cond_3a
    :goto_3a
    const-string v1, "Enabling hardware acceleration on an overlay."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    goto :goto_36

    :goto_40
    monitor-exit v0

    return-void

    :catchall_42
    move-exception v1

    monitor-exit v0
    :try_end_44
    .catchall {:try_start_30 .. :try_end_44} :catchall_42

    goto :goto_46

    :goto_45
    throw v1

    :goto_46
    goto :goto_45
.end method

.method private final zzuc()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmg:Z

    if-eqz v1, :cond_e

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/zzaht;->zzx(Landroid/view/View;)Z

    :cond_e
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmg:Z

    monitor-exit v0

    return-void

    :catchall_13
    move-exception v1

    monitor-exit v0
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_13

    throw v1
.end method

.method private final zzud()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    iput-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmw:Ljava/util/Map;

    monitor-exit v0

    return-void

    :catchall_8
    move-exception v1

    monitor-exit v0
    :try_end_a
    .catchall {:try_start_4 .. :try_end_a} :catchall_8

    throw v1
.end method

.method private final zzue()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaft;->zzpc()Lcom/google/android/gms/internal/zznk;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaft;->zzpc()Lcom/google/android/gms/internal/zznk;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznk;->zza(Lcom/google/android/gms/internal/zznu;)Z

    :cond_20
    return-void
.end method


# virtual methods
.method public final destroy()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzue()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzajq;->zzqv()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->close()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->onDestroy()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    :cond_1a
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->reset()V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdme:Z

    if-eqz v1, :cond_25

    monitor-exit v0

    return-void

    :cond_25
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfb()Lcom/google/android/gms/internal/zzamz;

    invoke-static {p0}, Lcom/google/android/gms/internal/zzamz;->zzb(Lcom/google/android/gms/internal/zzamp;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzud()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdme:Z

    const-string v1, "Initiating WebView self destruct sequence in 3..."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zztr()V

    monitor-exit v0

    return-void

    :catchall_3d
    move-exception v1

    monitor-exit v0
    :try_end_3f
    .catchall {:try_start_3 .. :try_end_3f} :catchall_3d

    throw v1
.end method

.method public final evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .registers 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_16

    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    if-eqz p2, :cond_14

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_14
    monitor-exit v0

    return-void

    :cond_16
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    monitor-exit v0

    return-void

    :catchall_1b
    move-exception p1

    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_1b

    throw p1
.end method

.method public final finalize()V
    .registers 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    if-eqz v0, :cond_1f

    monitor-enter v0
    :try_end_5
    .catchall {:try_start_0 .. :try_end_5} :catchall_23

    :try_start_5
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdme:Z

    if-nez v1, :cond_1a

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->reset()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfb()Lcom/google/android/gms/internal/zzamz;

    invoke-static {p0}, Lcom/google/android/gms/internal/zzamz;->zzb(Lcom/google/android/gms/internal/zzamp;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzud()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzpu()V

    :cond_1a
    monitor-exit v0

    goto :goto_1f

    :catchall_1c
    move-exception v1

    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_5 .. :try_end_1e} :catchall_1c

    :try_start_1e
    throw v1
    :try_end_1f
    .catchall {:try_start_1e .. :try_end_1f} :catchall_23

    :cond_1f
    :goto_1f
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_23
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public final getOnClickListener()Landroid/view/View$OnClickListener;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmt:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public final getRequestId()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzcrt:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final getRequestedOrientation()I
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmh:I

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .registers 1

    return-object p0
.end method

.method public final isDestroyed()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdme:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_d
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_12
    monitor-exit v0

    return-void

    :catchall_14
    move-exception p1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    throw p1
.end method

.method public final loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-super/range {p0 .. p5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_12

    :cond_d
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_12
    monitor-exit v0

    return-void

    :catchall_14
    move-exception p1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    throw p1
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_28

    if-nez v1, :cond_21

    :try_start_9
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_c} :catch_11
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_9 .. :try_end_c} :catch_f
    .catch Ljava/lang/IncompatibleClassChangeError; {:try_start_9 .. :try_end_c} :catch_d
    .catchall {:try_start_9 .. :try_end_c} :catchall_28

    goto :goto_26

    :catch_d
    move-exception p1

    goto :goto_12

    :catch_f
    move-exception p1

    goto :goto_12

    :catch_11
    move-exception p1

    :goto_12
    :try_start_12
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    const-string v2, "AdWebViewImpl.loadUrl"

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Could not call loadUrl. "

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_26

    :cond_21
    const-string p1, "The webview is destroyed. Ignoring action."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_26
    monitor-exit v0

    return-void

    :catchall_28
    move-exception p1

    monitor-exit v0
    :try_end_2a
    .catchall {:try_start_12 .. :try_end_2a} :catchall_28

    throw p1
.end method

.method public final onAttachedToWindow()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_11

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzajq;->onAttachedToWindow()V

    :cond_11
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdml:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    const/4 v3, 0x1

    if-eqz v2, :cond_44

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzani;->zztn()Z

    move-result v2

    if-eqz v2, :cond_44

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmm:Z

    if-nez v1, :cond_40

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zzto()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v1

    if-eqz v1, :cond_30

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_30
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zztp()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object v1

    if-eqz v1, :cond_3e

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfc()Lcom/google/android/gms/internal/zzaln;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzaln;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_3e
    iput-boolean v3, p0, Lcom/google/android/gms/internal/zzanx;->zzdmm:Z

    :cond_40
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zztz()Z

    const/4 v1, 0x1

    :cond_44
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzanx;->zzah(Z)V

    monitor-exit v0

    return-void

    :catchall_49
    move-exception v1

    monitor-exit v0
    :try_end_4b
    .catchall {:try_start_3 .. :try_end_4b} :catchall_49

    throw v1
.end method

.method public final onDetachedFromWindow()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzajq;->onDetachedFromWindow()V

    :cond_e
    invoke-super {p0}, Landroid/webkit/WebView;->onDetachedFromWindow()V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmm:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_54

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    if-eqz v1, :cond_54

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zztn()Z

    move-result v1

    if-eqz v1, :cond_54

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    if-eqz v1, :cond_54

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_54

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zzto()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v1

    if-eqz v1, :cond_43

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v3

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/zzaht;->zza(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_43
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzani;->zztp()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object v1

    if-eqz v1, :cond_52

    invoke-virtual {p0}, Landroid/webkit/WebView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_52
    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdmm:Z

    :cond_54
    monitor-exit v0
    :try_end_55
    .catchall {:try_start_3 .. :try_end_55} :catchall_59

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/zzanx;->zzah(Z)V

    return-void

    :catchall_59
    move-exception v1

    :try_start_5a
    monitor-exit v0
    :try_end_5b
    .catchall {:try_start_5a .. :try_end_5b} :catchall_59

    throw v1
.end method

.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .registers 7

    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p2, p3, p4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_18
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_18} :catch_19

    return-void

    :catch_19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x33

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Couldn\'t find an Activity to view url/mimetype: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " / "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_1a

    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Landroid/webkit/WebView;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1a

    return-void

    :cond_1a
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    if-eqz p1, :cond_30

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzani;->zzty()Lcom/google/android/gms/internal/zzanq;

    move-result-object p1

    if-eqz p1, :cond_30

    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzani;->zzty()Lcom/google/android/gms/internal/zzanq;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanq;->zzdb()V

    :cond_30
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbla:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_53

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_53

    const/4 v2, -0x1

    const/4 v3, 0x0

    cmpl-float v4, v0, v3

    if-lez v4, :cond_32

    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result v4

    if-eqz v4, :cond_51

    :cond_32
    const/4 v4, 0x1

    cmpg-float v0, v0, v3

    if-gez v0, :cond_3d

    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_51

    :cond_3d
    cmpl-float v0, v1, v3

    if-lez v0, :cond_47

    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_51

    :cond_47
    cmpg-float v0, v1, v3

    if-gez v0, :cond_53

    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_53

    :cond_51
    const/4 p1, 0x0

    return p1

    :cond_53
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onGlobalLayout()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zztz()Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->zzsv()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v1

    if-eqz v1, :cond_f

    if-eqz v0, :cond_f

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zzmy()V

    :cond_f
    return-void
.end method

.method public final onMeasure(II)V
    .registers 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    invoke-virtual {p0, v2, v2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    monitor-exit v0

    return-void

    :cond_f
    invoke-virtual {p0}, Landroid/webkit/WebView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_18c

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    if-nez v1, :cond_18c

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzapa;->zzui()Z

    move-result v1

    if-eqz v1, :cond_23

    goto/16 :goto_18c

    :cond_23
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzapa;->zzuj()Z

    move-result v1

    if-eqz v1, :cond_6f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->zzsg()Lcom/google/android/gms/internal/zzaoa;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_37

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaoa;->getAspectRatio()F

    move-result v1

    goto :goto_38

    :cond_37
    const/4 v1, 0x0

    :goto_38
    cmpl-float v2, v1, v2

    if-nez v2, :cond_41

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V

    monitor-exit v0

    return-void

    :cond_41
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    int-to-float v2, p2

    mul-float v2, v2, v1

    float-to-int v2, v2

    int-to-float v3, p1

    div-float/2addr v3, v1

    float-to-int v3, v3

    if-nez p2, :cond_5a

    if-eqz v3, :cond_5a

    int-to-float p2, v3

    mul-float p2, p2, v1

    float-to-int v2, p2

    move p2, v3

    goto :goto_62

    :cond_5a
    if-nez p1, :cond_62

    if-eqz v2, :cond_62

    int-to-float p1, v2

    div-float/2addr p1, v1

    float-to-int v3, p1

    move p1, v2

    :cond_62
    :goto_62
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    monitor-exit v0

    return-void

    :cond_6f
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzapa;->isFluid()Z

    move-result v1

    if-eqz v1, :cond_c7

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbpa:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_c2

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱〵つてう()Z

    move-result v1

    if-nez v1, :cond_90

    goto :goto_c2

    :cond_90
    const-string v1, "/contentHeight"

    new-instance v2, Lcom/google/android/gms/internal/zzany;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzany;-><init>(Lcom/google/android/gms/internal/zzanx;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    const-string v1, "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzanx;->zzdd(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v1}, Landroid/content/MutableContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdmp:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_b9

    int-to-float p2, v2

    mul-float p2, p2, v1

    float-to-int p2, p2

    goto :goto_bd

    :cond_b9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    :goto_bd
    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    monitor-exit v0

    return-void

    :cond_c2
    :goto_c2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V

    monitor-exit v0

    return-void

    :cond_c7
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v1

    if-eqz v1, :cond_e6

    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object p2, p0, Lcom/google/android/gms/internal/zzanx;->zzavx:Landroid/view/WindowManager;

    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p0, p2, p1}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    monitor-exit v0

    return-void

    :cond_e6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, -0x80000000

    const v6, 0x7fffffff

    if-eq v1, v5, :cond_106

    if-ne v1, v4, :cond_102

    goto :goto_106

    :cond_102
    const v1, 0x7fffffff

    goto :goto_107

    :cond_106
    :goto_106
    move v1, p1

    :goto_107
    if-eq v3, v5, :cond_10b

    if-ne v3, v4, :cond_10c

    :cond_10b
    move v6, p2

    :cond_10c
    iget-object v3, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    iget v4, v3, Lcom/google/android/gms/internal/zzapa;->widthPixels:I

    const/16 v5, 0x8

    if-gt v4, v1, :cond_12c

    iget v1, v3, Lcom/google/android/gms/internal/zzapa;->heightPixels:I

    if-le v1, v6, :cond_119

    goto :goto_12c

    :cond_119
    invoke-virtual {p0}, Landroid/webkit/WebView;->getVisibility()I

    move-result p1

    if-eq p1, v5, :cond_122

    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_122
    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    iget p2, p1, Lcom/google/android/gms/internal/zzapa;->widthPixels:I

    iget p1, p1, Lcom/google/android/gms/internal/zzapa;->heightPixels:I

    invoke-virtual {p0, p2, p1}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    goto :goto_18a

    :cond_12c
    :goto_12c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v1}, Landroid/content/MutableContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iget-object v3, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    iget v4, v3, Lcom/google/android/gms/internal/zzapa;->widthPixels:I

    int-to-float v4, v4

    div-float/2addr v4, v1

    float-to-int v4, v4

    iget v3, v3, Lcom/google/android/gms/internal/zzapa;->heightPixels:I

    int-to-float v3, v3

    div-float/2addr v3, v1

    float-to-int v3, v3

    int-to-float p1, p1

    div-float/2addr p1, v1

    float-to-int p1, p1

    int-to-float p2, p2

    div-float/2addr p2, v1

    float-to-int p2, p2

    const/16 v1, 0x67

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Not enough space to show ad. Needs "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " dp, but only has "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " dp."

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getVisibility()I

    move-result p1

    if-eq p1, v5, :cond_187

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setVisibility(I)V

    :cond_187
    invoke-virtual {p0, v2, v2}, Landroid/webkit/WebView;->setMeasuredDimension(II)V

    :goto_18a
    monitor-exit v0

    return-void

    :cond_18c
    :goto_18c
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V

    monitor-exit v0

    return-void

    :catchall_191
    move-exception p1

    monitor-exit v0
    :try_end_193
    .catchall {:try_start_3 .. :try_end_193} :catchall_191

    throw p1
.end method

.method public final onPause()V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    :try_start_7
    invoke-super {p0}, Landroid/webkit/WebView;->onPause()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception v0

    const-string v1, "Could not pause webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onResume()V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    :try_start_7
    invoke-super {p0}, Landroid/webkit/WebView;->onResume()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception v0

    const-string v1, "Could not resume webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzani;->zztn()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_b
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmn:Lcom/google/android/gms/internal/zzoq;

    if-eqz v1, :cond_12

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzoq;->zzc(Landroid/view/MotionEvent;)V

    :cond_12
    monitor-exit v0

    goto :goto_1e

    :catchall_14
    move-exception p1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_b .. :try_end_16} :catchall_14

    throw p1

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    if-eqz v0, :cond_1e

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzcv;->zza(Landroid/view/MotionEvent;)V

    :cond_1e
    :goto_1e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_26

    const/4 p1, 0x0

    return p1

    :cond_26
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final setContext(Landroid/content/Context;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaoz;->setBaseContext(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaoz;->zzsi()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzajq;->zzi(Landroid/app/Activity;)V

    return-void
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .registers 3

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmt:Ljava/lang/ref/WeakReference;

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setRequestedOrientation(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmh:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v1, :cond_c

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->setRequestedOrientation(I)V

    :cond_c
    monitor-exit v0

    return-void

    :catchall_e
    move-exception p1

    monitor-exit v0
    :try_end_10
    .catchall {:try_start_3 .. :try_end_10} :catchall_e

    throw p1
.end method

.method public final setWebViewClient(Landroid/webkit/WebViewClient;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    instance-of v0, p1, Lcom/google/android/gms/internal/zzani;

    if-eqz v0, :cond_b

    check-cast p1, Lcom/google/android/gms/internal/zzani;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    :cond_b
    return-void
.end method

.method public final stopLoading()V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    :try_start_7
    invoke-super {p0}, Landroid/webkit/WebView;->stopLoading()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception v0

    const-string v1, "Could not stop loading webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzaoa;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmk:Lcom/google/android/gms/internal/zzaoa;

    if-eqz v1, :cond_e

    const-string p1, "Attempt to create multiple AdWebViewVideoControllers."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_e
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmk:Lcom/google/android/gms/internal/zzaoa;

    monitor-exit v0

    return-void

    :catchall_12
    move-exception p1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_12

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzapa;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    invoke-virtual {p0}, Landroid/webkit/WebView;->requestLayout()V

    monitor-exit v0

    return-void

    :catchall_a
    move-exception p1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzgs;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean p1, p1, Lcom/google/android/gms/internal/zzgs;->zzake:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdml:Z

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_3 .. :try_end_8} :catchall_c

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzanx;->zzah(Z)V

    return-void

    :catchall_c
    move-exception p1

    :try_start_d
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_d .. :try_end_e} :catchall_c

    throw p1
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "-",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    :cond_7
    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/util/Map;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzahn;->zzq(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p2
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_8} :catch_c

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :catch_c
    const-string p1, "Could not convert parameters to JSON."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lorg/json/JSONObject;)V
    .registers 5

    if-nez p2, :cond_7

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    :cond_7
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(window.AFMA_ReceiveMessage || function() {})(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Dispatching AFMA event: "

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3f

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_45

    :cond_3f
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_45
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzanx;->zzdd(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(ZI)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzani;->zza(ZI)V

    return-void
.end method

.method public final zza(ZILjava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzani;->zza(ZILjava/lang/String;)V

    return-void
.end method

.method public final zza(ZILjava/lang/String;Ljava/lang/String;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzani;->zza(ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final zzac(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzani;->zzac(Z)V

    return-void
.end method

.method public final zzad(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    if-eq p1, v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzub()V

    if-eqz v1, :cond_20

    new-instance v1, Lcom/google/android/gms/internal/zzxb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzxb;-><init>(Lcom/google/android/gms/internal/zzanh;)V

    if-eqz p1, :cond_1b

    const-string p1, "expanded"

    goto :goto_1d

    :cond_1b
    const-string p1, "default"

    :goto_1d
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzxb;->zzbo(Ljava/lang/String;)V

    :cond_20
    monitor-exit v0

    return-void

    :catchall_22
    move-exception p1

    monitor-exit v0
    :try_end_24
    .catchall {:try_start_3 .. :try_end_24} :catchall_22

    throw p1
.end method

.method public final zzae(Z)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v1, :cond_11

    iget-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzani;->zzfv()Z

    move-result v2

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zza(ZZ)V

    goto :goto_13

    :cond_11
    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmd:Z

    :goto_13
    monitor-exit v0

    return-void

    :catchall_15
    move-exception p1

    monitor-exit v0
    :try_end_17
    .catchall {:try_start_3 .. :try_end_17} :catchall_15

    throw p1
.end method

.method public final zzaf(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmi:Z

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zzag(I)V
    .registers 7

    if-nez p1, :cond_15

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdje:Lcom/google/android/gms/internal/zzns;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aebb2"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    :cond_15
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzua()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    if-eqz v0, :cond_2f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "close_type"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zznu;->zzf(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2f
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "closetype"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const-string v1, "version"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onhide"

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zzag(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmo:I

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_a

    :cond_9
    const/4 p1, -0x1

    :goto_a
    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmo:I

    if-gtz v1, :cond_16

    iget-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zznb()V

    :cond_16
    monitor-exit v0

    return-void

    :catchall_18
    move-exception p1

    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_18

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzoq;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmn:Lcom/google/android/gms/internal/zzoq;

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "-",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzani;->zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    :cond_7
    return-void
.end method

.method public final zzb(Ljava/lang/String;Lorg/json/JSONObject;)V
    .registers 5

    if-nez p2, :cond_7

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    :cond_7
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzanx;->zzdd(Ljava/lang/String;)V

    return-void
.end method

.method public final zzbq()Lcom/google/android/gms/ads/internal/zzv;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzanr:Lcom/google/android/gms/ads/internal/zzv;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmu:Lcom/google/android/gms/ads/internal/overlay/zzd;

    monitor-exit v0

    return-void

    :catchall_7
    move-exception p1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw p1
.end method

.method public final zzcq()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmj:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdlz:Lcom/google/android/gms/ads/internal/zzbl;

    if-eqz v1, :cond_d

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/zzbl;->zzcq()V

    :cond_d
    monitor-exit v0

    return-void

    :catchall_f
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_4 .. :try_end_11} :catchall_f

    throw v1
.end method

.method public final zzcr()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmj:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdlz:Lcom/google/android/gms/ads/internal/zzbl;

    if-eqz v1, :cond_d

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/zzbl;->zzcr()V

    :cond_d
    monitor-exit v0

    return-void

    :catchall_f
    move-exception v1

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_4 .. :try_end_11} :catchall_f

    throw v1
.end method

.method public final zzcz(Ljava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_6} :catch_f
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_6} :catch_d
    .catch Ljava/lang/IncompatibleClassChangeError; {:try_start_3 .. :try_end_6} :catch_b
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_3 .. :try_end_6} :catch_9
    .catchall {:try_start_3 .. :try_end_6} :catchall_7

    goto :goto_1e

    :catchall_7
    move-exception p1

    goto :goto_20

    :catch_9
    move-exception p1

    goto :goto_10

    :catch_b
    move-exception p1

    goto :goto_10

    :catch_d
    move-exception p1

    goto :goto_10

    :catch_f
    move-exception p1

    :goto_10
    :try_start_10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    const-string v2, "AdWebViewImpl.loadUrlUnsafe"

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Could not call loadUrl. "

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1e
    monitor-exit v0

    return-void

    :goto_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_10 .. :try_end_21} :catchall_7

    throw p1
.end method

.method public final zzda(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    if-nez p1, :cond_a

    :try_start_5
    const-string p1, ""

    goto :goto_a

    :catchall_8
    move-exception p1

    goto :goto_e

    :cond_a
    :goto_a
    iput-object p1, p0, Lcom/google/android/gms/internal/zzanx;->zzcrt:Ljava/lang/String;

    monitor-exit v0

    return-void

    :goto_e
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_5 .. :try_end_f} :catchall_8

    throw p1
.end method

.method public final zzmz()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmq:Lcom/google/android/gms/internal/zzns;

    const/4 v1, 0x1

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdje:Lcom/google/android/gms/internal/zzns;

    new-array v3, v1, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "aes2"

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/zznn;->zza(Lcom/google/android/gms/internal/zznu;Lcom/google/android/gms/internal/zzns;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zznn;->zzb(Lcom/google/android/gms/internal/zznu;)Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmq:Lcom/google/android/gms/internal/zzns;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    const-string v3, "native:view_show"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/zznt;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzns;)V

    :cond_2a
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onshow"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zzna()V
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzanx;->zzsv()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zzna()V

    :cond_9
    return-void
.end method

.method public final zzsf()Lcom/google/android/gms/internal/zzamg;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzsg()Lcom/google/android/gms/internal/zzaoa;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmk:Lcom/google/android/gms/internal/zzaoa;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzsh()Lcom/google/android/gms/internal/zzns;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdje:Lcom/google/android/gms/internal/zzns;

    return-object v0
.end method

.method public final zzsi()Landroid/app/Activity;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaoz;->zzsi()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final zzsj()Lcom/google/android/gms/internal/zznt;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    return-object v0
.end method

.method public final zzsk()Lcom/google/android/gms/internal/zzakd;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzapr:Lcom/google/android/gms/internal/zzakd;

    return-object v0
.end method

.method public final zzsl()I
    .registers 2

    invoke-virtual {p0}, Landroid/webkit/WebView;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public final zzsm()I
    .registers 2

    invoke-virtual {p0}, Landroid/webkit/WebView;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public final zzss()V
    .registers 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzua()V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzapr:Lcom/google/android/gms/internal/zzakd;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onhide"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zzst()V
    .registers 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzdo()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_muted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzdn()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_volume"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahn;->zzaq(Landroid/content/Context;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device_volume"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "volume"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/zzanx;->zza(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zzsu()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdly:Lcom/google/android/gms/internal/zzaoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaoz;->zzsu()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final zzsv()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmb:Lcom/google/android/gms/ads/internal/overlay/zzd;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzsw()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmu:Lcom/google/android/gms/ads/internal/overlay/zzd;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzsx()Lcom/google/android/gms/internal/zzapa;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmc:Lcom/google/android/gms/internal/zzapa;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzsy()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzalx:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzsz()Lcom/google/android/gms/internal/zzani;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdma:Lcom/google/android/gms/internal/zzani;

    return-object v0
.end method

.method public final zzta()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmd:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztb()Lcom/google/android/gms/internal/zzcv;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzbuv:Lcom/google/android/gms/internal/zzcv;

    return-object v0
.end method

.method public final zztc()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmf:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztd()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    const-string v1, "Destroying WebView!"

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzanx;->zzpu()V

    sget-object v1, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/zzanz;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzanz;-><init>(Lcom/google/android/gms/internal/zzanx;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0

    return-void

    :catchall_17
    move-exception v1

    monitor-exit v0
    :try_end_19
    .catchall {:try_start_3 .. :try_end_19} :catchall_17

    throw v1
.end method

.method public final zzte()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmi:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztf()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmj:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztg()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmo:I

    if-lez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    monitor-exit v0

    return v1

    :catchall_c
    move-exception v1

    monitor-exit v0
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_c

    throw v1
.end method

.method public final zzth()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzavi:Lcom/google/android/gms/internal/zzajq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzajq;->zzqu()V

    return-void
.end method

.method public final zzti()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmr:Lcom/google/android/gms/internal/zzns;

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zznt;->zzje()Lcom/google/android/gms/internal/zznu;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zznn;->zzb(Lcom/google/android/gms/internal/zznu;)Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzanx;->zzdmr:Lcom/google/android/gms/internal/zzns;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdms:Lcom/google/android/gms/internal/zznt;

    const-string v2, "native:view_load"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zznt;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzns;)V

    :cond_17
    return-void
.end method

.method public final zztj()Lcom/google/android/gms/internal/zzoq;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanx;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzanx;->zzdmn:Lcom/google/android/gms/internal/zzoq;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztk()V
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-void
.end method

.method public final zztl()V
    .registers 2

    const-string v0, "Cannot add text view to inner AdWebView"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    return-void
.end method
