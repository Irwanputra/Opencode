.class public Lcom/google/android/gms/internal/zzani;
.super Landroid/webkit/WebViewClient;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final zzdkm:[Ljava/lang/String;

.field private static final zzdkn:[Ljava/lang/String;


# instance fields
.field private final mLock:Ljava/lang/Object;

.field public zzaoq:Lcom/google/android/gms/internal/zzafb;

.field private zzavo:Z

.field private zzbdd:Lcom/google/android/gms/internal/zzje;

.field private zzbwv:Lcom/google/android/gms/ads/internal/gmsg/zzb;

.field private zzbyc:Lcom/google/android/gms/ads/internal/gmsg/zzx;

.field private zzbye:Lcom/google/android/gms/ads/internal/zzw;

.field private zzbyf:Lcom/google/android/gms/internal/zzwr;

.field private zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

.field private zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

.field public zzbyk:Lcom/google/android/gms/internal/zzanh;

.field private zzcgu:Lcom/google/android/gms/internal/zzxc;

.field private final zzckd:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "-",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private zzdko:Lcom/google/android/gms/internal/zzanm;

.field private zzdkp:Lcom/google/android/gms/internal/zzann;

.field private zzdkq:Lcom/google/android/gms/internal/zzano;

.field private zzdkr:Z

.field private zzdks:Z

.field private zzdkt:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private zzdku:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private zzdkv:Z

.field private final zzdkw:Lcom/google/android/gms/internal/zzxa;

.field private zzdkx:Lcom/google/android/gms/internal/zzanq;

.field private zzdky:Z

.field private zzdkz:Z

.field private zzdla:Z

.field private zzdlb:I

.field private zzdlc:Landroid/view/View$OnAttachStateChangeListener;


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "HOST_LOOKUP"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "UNSUPPORTED_AUTH_SCHEME"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "AUTHENTICATION"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "PROXY_AUTHENTICATION"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "CONNECT"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, "IO"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const/4 v1, 0x7

    const-string v9, "TIMEOUT"

    aput-object v9, v0, v1

    const/16 v1, 0x8

    const-string v9, "REDIRECT_LOOP"

    aput-object v9, v0, v1

    const/16 v1, 0x9

    const-string v9, "UNSUPPORTED_SCHEME"

    aput-object v9, v0, v1

    const/16 v1, 0xa

    const-string v9, "FAILED_SSL_HANDSHAKE"

    aput-object v9, v0, v1

    const/16 v1, 0xb

    const-string v9, "BAD_URL"

    aput-object v9, v0, v1

    const/16 v1, 0xc

    const-string v9, "FILE"

    aput-object v9, v0, v1

    const/16 v1, 0xd

    const-string v9, "FILE_NOT_FOUND"

    aput-object v9, v0, v1

    const/16 v1, 0xe

    const-string v9, "TOO_MANY_REQUESTS"

    aput-object v9, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/zzani;->zzdkm:[Ljava/lang/String;

    new-array v0, v8, [Ljava/lang/String;

    const-string v1, "NOT_YET_VALID"

    aput-object v1, v0, v2

    const-string v1, "EXPIRED"

    aput-object v1, v0, v3

    const-string v1, "ID_MISMATCH"

    aput-object v1, v0, v4

    const-string v1, "UNTRUSTED"

    aput-object v1, v0, v5

    const-string v1, "DATE_INVALID"

    aput-object v1, v0, v6

    const-string v1, "INVALID"

    aput-object v1, v0, v7

    sput-object v0, Lcom/google/android/gms/internal/zzani;->zzdkn:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzanh;Z)V
    .registers 7

    new-instance v0, Lcom/google/android/gms/internal/zzxa;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zzsu()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzmt;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzmt;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/zzxa;-><init>(Lcom/google/android/gms/internal/zzanh;Landroid/content/Context;Lcom/google/android/gms/internal/zzmt;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/zzani;-><init>(Lcom/google/android/gms/internal/zzanh;ZLcom/google/android/gms/internal/zzxa;Lcom/google/android/gms/internal/zzwr;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzanh;ZLcom/google/android/gms/internal/zzxa;Lcom/google/android/gms/internal/zzwr;)V
    .registers 5

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    new-instance p4, Ljava/lang/Object;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    const/4 p4, 0x0

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzani;->zzavo:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzani;->zzdkw:Lcom/google/android/gms/internal/zzxa;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzani;)Lcom/google/android/gms/internal/zzano;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzani;->zzdkq:Lcom/google/android/gms/internal/zzano;

    return-object p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzani;Lcom/google/android/gms/internal/zzano;)Lcom/google/android/gms/internal/zzano;
    .registers 2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkq:Lcom/google/android/gms/internal/zzano;

    return-object p1
.end method

.method private final zza(Landroid/view/View;Lcom/google/android/gms/internal/zzafb;I)V
    .registers 6

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzafb;->zzol()Z

    move-result v0

    if-eqz v0, :cond_1d

    if-lez p3, :cond_1d

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/zzafb;->zzq(Landroid/view/View;)V

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzafb;->zzol()Z

    move-result v0

    if-eqz v0, :cond_1d

    sget-object v0, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzanj;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzanj;-><init>(Lcom/google/android/gms/internal/zzani;Landroid/view/View;Lcom/google/android/gms/internal/zzafb;I)V

    const-wide/16 p1, 0x64

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1d
    return-void
.end method

.method private final zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzwr;->zzmr()Z

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeg()Lcom/google/android/gms/ads/internal/overlay/zzl;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v1

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/zzl;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    if-eqz v0, :cond_29

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->url:Ljava/lang/String;

    if-nez v1, :cond_26

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->zzciv:Lcom/google/android/gms/ads/internal/overlay/zzc;

    if-eqz p1, :cond_26

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/zzc;->url:Ljava/lang/String;

    :cond_26
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzafb;->zzbv(Ljava/lang/String;)V

    :cond_29
    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzani;Landroid/view/View;Lcom/google/android/gms/internal/zzafb;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzani;->zza(Landroid/view/View;Lcom/google/android/gms/internal/zzafb;I)V

    return-void
.end method

.method private final zzd(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 12

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmu:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_13

    return-void

    :cond_13
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v0, "err"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "code"

    invoke-virtual {v5, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_37

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_37

    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p2

    goto :goto_39

    :cond_37
    const-string p2, ""

    :goto_39
    const-string p3, "host"

    invoke-virtual {v5, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    iget-object p2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object p2

    iget-object v3, p2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    const/4 v6, 0x1

    const-string v4, "gmob-apps"

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method private final zzdb(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .registers 10

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :goto_7
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x14

    if-gt v1, v2, :cond_d8

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const/16 v3, 0x2710

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_d0

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v4}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v5}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {v3, v4, v5, p1, v2}, Lcom/google/android/gms/internal/zzahn;->zza(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V

    new-instance v3, Lcom/google/android/gms/internal/zzajv;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzajv;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;[B)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/internal/zzahn;->zzci(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/internal/zzahn;->zzcj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v2, v5}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/net/HttpURLConnection;I)V

    const/16 v3, 0x12c

    if-lt v5, v3, :cond_c6

    const/16 v3, 0x190

    if-ge v5, v3, :cond_c6

    const-string v3, "Location"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_be

    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v0, v3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7b

    const-string p1, "Protocol is null"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-object v4

    :cond_7b
    const-string v6, "http"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a2

    const-string v6, "https"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a2

    const-string p1, "Unsupported scheme: "

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_98

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_9e

    :cond_98
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_9e
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-object v4

    :cond_a2
    const-string v0, "Redirecting to "

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_af

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_b5

    :cond_af
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v3

    :goto_b5
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    move-object v0, v5

    goto/16 :goto_7

    :cond_be
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Missing Location header in redirect"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c6
    new-instance p1, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p1, v6, v7, v0}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p1

    :cond_d0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid protocol."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Too many redirects (20)"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_e1

    :goto_e0
    throw p1

    :goto_e1
    goto :goto_e0
.end method

.method private final zzh(Landroid/net/Uri;)V
    .registers 8

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_96

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahn;->zzf(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result v2

    if-eqz v2, :cond_7f

    const-string v2, "Received GMSG: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2d

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_32

    :cond_2d
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_32
    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    goto :goto_3d

    :cond_7f
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_83
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_95

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/internal/gmsg/zzt;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/ads/internal/gmsg/zzt;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    goto :goto_83

    :cond_95
    return-void

    :cond_96
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x20

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "No GMSG handler found for GMSG: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    return-void
.end method

.method private final zzts()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzdlc:Landroid/view/View$OnAttachStateChangeListener;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method private final zztx()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzdko:Lcom/google/android/gms/internal/zzanm;

    if-eqz v0, :cond_1c

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkz:Z

    if-eqz v1, :cond_c

    iget v1, p0, Lcom/google/android/gms/internal/zzani;->zzdlb:I

    if-lez v1, :cond_10

    :cond_c
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdla:Z

    if-eqz v1, :cond_1c

    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzani;->zzdla:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzanm;->zza(Lcom/google/android/gms/internal/zzanh;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzdko:Lcom/google/android/gms/internal/zzanm;

    :cond_1c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zzti()V

    return-void
.end method


# virtual methods
.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .registers 5

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Loading resource: "

    if-eqz v0, :cond_11

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_16

    :cond_11
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_16
    invoke-static {p1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p2

    const-string v0, "gmsg"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_38

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p2

    const-string v0, "mobileads.google.com"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_38

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzani;->zzh(Landroid/net/Uri;)V

    :cond_38
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    iget-boolean p2, p0, Lcom/google/android/gms/internal/zzani;->zzdky:Z

    if-eqz p2, :cond_13

    const-string p2, "Blank page loaded, 1..."

    invoke-static {p2}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzanh;->zztd()V

    monitor-exit p1

    return-void

    :cond_13
    monitor-exit p1
    :try_end_14
    .catchall {:try_start_3 .. :try_end_14} :catchall_27

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkz:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkp:Lcom/google/android/gms/internal/zzann;

    if-eqz p1, :cond_23

    iget-object p2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/zzann;->zzg(Lcom/google/android/gms/internal/zzanh;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkp:Lcom/google/android/gms/internal/zzann;

    :cond_23
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zztx()V

    return-void

    :catchall_27
    move-exception p2

    :try_start_28
    monitor-exit p1
    :try_end_29
    .catchall {:try_start_28 .. :try_end_29} :catchall_27

    throw p2
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .registers 8

    if-gez p2, :cond_d

    neg-int v0, p2

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lcom/google/android/gms/internal/zzani;->zzdkm:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_d

    aget-object v0, v1, v0

    goto :goto_11

    :cond_d
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_11
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "http_err"

    invoke-direct {p0, v1, v2, v0, p4}, Lcom/google/android/gms/internal/zzani;->zzd(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .registers 8

    if-eqz p3, :cond_27

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v0

    if-ltz v0, :cond_10

    sget-object v1, Lcom/google/android/gms/internal/zzani;->zzdkn:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_10

    aget-object v0, v1, v0

    goto :goto_14

    :cond_10
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_14
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzek()Lcom/google/android/gms/internal/zzaht;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/zzaht;->zza(Landroid/net/http/SslError;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ssl_err"

    invoke-direct {p0, v1, v3, v0, v2}, Lcom/google/android/gms/internal/zzani;->zzd(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_27
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void
.end method

.method public final reset()V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzafb;->zzon()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    :cond_a
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zzts()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_10
    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdko:Lcom/google/android/gms/internal/zzanm;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkp:Lcom/google/android/gms/internal/zzann;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbwv:Lcom/google/android/gms/ads/internal/gmsg/zzb;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzani;->zzavo:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzani;->zzdks:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/zzani;->zzdkv:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkq:Lcom/google/android/gms/internal/zzano;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    if-eqz v2, :cond_36

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzwr;->zzl(Z)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    :cond_36
    monitor-exit v0

    return-void

    :catchall_38
    move-exception v1

    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_10 .. :try_end_3a} :catchall_38

    throw v1
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .registers 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    const-string p1, ""

    const/4 v0, 0x0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/zzafi;->zzb(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzani;->zzdb(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_18
    invoke-static {p2}, Lcom/google/android/gms/internal/zzil;->zzab(Ljava/lang/String;)Lcom/google/android/gms/internal/zzil;

    move-result-object v1

    if-eqz v1, :cond_38

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzen()Lcom/google/android/gms/internal/zzid;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzid;->zza(Lcom/google/android/gms/internal/zzil;)Lcom/google/android/gms/internal/zzii;

    move-result-object v1

    if-eqz v1, :cond_38

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzii;->zzhf()Z

    move-result v2

    if-eqz v2, :cond_38

    new-instance p2, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzii;->zzhg()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p2, p1, p1, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p2

    :cond_38
    invoke-static {}, Lcom/google/android/gms/internal/zzajv;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_55

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbmj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_55

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzani;->zzdb(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_54} :catch_58
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_54} :catch_56

    return-object p1

    :cond_55
    return-object v0

    :catch_56
    move-exception p1

    goto :goto_59

    :catch_58
    move-exception p1

    :goto_59
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object p2

    const-string v1, "AdWebViewClient.interceptRequest"

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-object v0
.end method

.method public shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .registers 3

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 p2, 0x4f

    if-eq p1, p2, :cond_14

    const/16 p2, 0xde

    if-eq p1, p2, :cond_14

    packed-switch p1, :pswitch_data_16

    packed-switch p1, :pswitch_data_28

    const/4 p1, 0x0

    return p1

    :cond_14
    :pswitch_14
    const/4 p1, 0x1

    return p1

    :pswitch_data_16
    .packed-switch 0x55
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    :pswitch_data_28
    .packed-switch 0x7e
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .registers 14

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "AdWebView shouldOverrideUrlLoading: "

    if-eqz v1, :cond_11

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_16

    :cond_11
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_16
    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "gmsg"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3b

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v3, "mobileads.google.com"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzani;->zzh(Landroid/net/Uri;)V

    goto/16 :goto_118

    :cond_3b
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    if-eqz v1, :cond_8b

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    if-ne p1, v1, :cond_8b

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v3, "http"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5e

    const-string v3, "https"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5c

    goto :goto_5e

    :cond_5c
    const/4 v1, 0x0

    goto :goto_5f

    :cond_5e
    :goto_5e
    const/4 v1, 0x1

    :goto_5f
    if-eqz v1, :cond_8b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    if-eqz v0, :cond_86

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbkj:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_86

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzje;->onAdClicked()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    if-eqz v0, :cond_83

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzafb;->zzbv(Ljava/lang/String;)V

    :cond_83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    :cond_86
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_8b
    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->willNotDraw()Z

    move-result p1

    if-nez p1, :cond_fe

    :try_start_97
    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object p1

    if-eqz p1, :cond_d8

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzcv;->zzb(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_d8

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;
    :try_end_ad
    .catch Lcom/google/android/gms/internal/zzcw; {:try_start_97 .. :try_end_ad} :catch_bd

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_b0
    move-object v4, v3

    check-cast v4, Landroid/view/View;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->zzsi()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v4, v3}, Lcom/google/android/gms/internal/zzcv;->zza(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object p1
    :try_end_bb
    .catch Lcom/google/android/gms/internal/zzcw; {:try_start_b0 .. :try_end_bb} :catch_bd

    move-object v0, p1

    goto :goto_d8

    :catch_bd
    nop

    const-string p1, "Unable to append parameter to URL: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_cf

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_d5

    :cond_cf
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_d5
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_d8
    :goto_d8
    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbye:Lcom/google/android/gms/ads/internal/zzw;

    if-eqz p1, :cond_e9

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzw;->zzda()Z

    move-result p1

    if-eqz p1, :cond_e3

    goto :goto_e9

    :cond_e3
    iget-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzbye:Lcom/google/android/gms/ads/internal/zzw;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/internal/zzw;->zzt(Ljava/lang/String;)V

    goto :goto_118

    :cond_e9
    :goto_e9
    new-instance p1, Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v4, "android.intent.action.VIEW"

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/ads/internal/overlay/zzc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    goto :goto_118

    :cond_fe
    const-string p1, "AdWebView unable to handle URL: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_10f

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_115

    :cond_10f
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_115
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_118
    return v2
.end method

.method public final zza(IIZ)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzdkw:Lcom/google/android/gms/internal/zzxa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzxa;->zzc(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzwr;->zza(IIZ)V

    :cond_c
    return-void
.end method

.method public final zza(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdks:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzth()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkt:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzani;->zzdku:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    monitor-exit v0

    return-void

    :catchall_11
    move-exception p1

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_4 .. :try_end_13} :catchall_11

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)V
    .registers 10

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result v0

    new-instance v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v1, 0x0

    if-eqz v0, :cond_19

    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v2

    if-nez v2, :cond_19

    move-object v3, v1

    goto :goto_1c

    :cond_19
    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    move-object v3, v2

    :goto_1c
    if-eqz v0, :cond_20

    move-object v4, v1

    goto :goto_23

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    move-object v4, v0

    :goto_23
    iget-object v5, p0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v6

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/overlay/zzc;Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzakd;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzanm;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdko:Lcom/google/android/gms/internal/zzanm;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzann;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkp:Lcom/google/android/gms/internal/zzann;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzano;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkq:Lcom/google/android/gms/internal/zzano;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzanq;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkx:Lcom/google/android/gms/internal/zzanq;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzq;ZLcom/google/android/gms/ads/internal/gmsg/zzx;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/zzxc;Lcom/google/android/gms/internal/zzafb;)V
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v11, p3

    move-object/from16 v12, p6

    move-object/from16 v13, p8

    move-object/from16 v1, p9

    if-nez p7, :cond_1a

    new-instance v2, Lcom/google/android/gms/ads/internal/zzw;

    iget-object v3, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v1, v4}, Lcom/google/android/gms/ads/internal/zzw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzafb;Lcom/google/android/gms/internal/zzaaz;)V

    move-object v14, v2

    goto :goto_1c

    :cond_1a
    move-object/from16 v14, p7

    :goto_1c
    new-instance v2, Lcom/google/android/gms/internal/zzwr;

    iget-object v3, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-direct {v2, v3, v13}, Lcom/google/android/gms/internal/zzwr;-><init>(Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/internal/zzxc;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    new-instance v1, Lcom/google/android/gms/ads/internal/gmsg/zza;

    invoke-direct {v1, v11}, Lcom/google/android/gms/ads/internal/gmsg/zza;-><init>(Lcom/google/android/gms/ads/internal/gmsg/zzb;)V

    const-string v2, "/appEvent"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxg:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/backButton"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxh:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/refresh"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwx:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/canOpenURLs"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwy:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/canOpenIntents"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbwz:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/click"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxa:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/close"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxb:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/customClose"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxk:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/instrument"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxm:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/delayPageLoaded"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxn:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/delayPageClosed"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxo:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/getLocationInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxc:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/httpTrack"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxd:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/log"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v1, Lcom/google/android/gms/ads/internal/gmsg/zzaa;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    invoke-direct {v1, v14, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzaa;-><init>(Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/zzwr;)V

    const-string v2, "/mraid"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzdkw:Lcom/google/android/gms/internal/zzxa;

    const-string v2, "/mraidLoaded"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v15, Lcom/google/android/gms/ads/internal/gmsg/zzab;

    iget-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v3

    iget-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zztb()Lcom/google/android/gms/internal/zzcv;

    move-result-object v4

    iget-object v10, v0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    move-object v1, v15

    move-object/from16 v5, p4

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p2

    move-object v9, v14

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/ads/internal/gmsg/zzab;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/zzwr;)V

    const-string v1, "/open"

    invoke-virtual {v0, v1, v15}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    new-instance v1, Lcom/google/android/gms/internal/zzane;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzane;-><init>()V

    const-string v2, "/precache"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxf:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/touch"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxi:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/video"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzd;->zzbxj:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    const-string v2, "/videoMeta"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzfd()Lcom/google/android/gms/internal/zzaff;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaff;->zzq(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_106

    new-instance v1, Lcom/google/android/gms/ads/internal/gmsg/zzz;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzz;-><init>(Landroid/content/Context;)V

    const-string v2, "/logScionEvent"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    :cond_106
    if-eqz v12, :cond_112

    new-instance v1, Lcom/google/android/gms/ads/internal/gmsg/zzw;

    invoke-direct {v1, v12}, Lcom/google/android/gms/ads/internal/gmsg/zzw;-><init>(Lcom/google/android/gms/ads/internal/gmsg/zzx;)V

    const-string v2, "/setInterstitialProperties"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/zzani;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V

    :cond_112
    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iput-object v11, v0, Lcom/google/android/gms/internal/zzani;->zzbwv:Lcom/google/android/gms/ads/internal/gmsg/zzb;

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iput-object v14, v0, Lcom/google/android/gms/internal/zzani;->zzbye:Lcom/google/android/gms/ads/internal/zzw;

    iput-object v13, v0, Lcom/google/android/gms/internal/zzani;->zzcgu:Lcom/google/android/gms/internal/zzxc;

    iput-object v12, v0, Lcom/google/android/gms/internal/zzani;->zzbyc:Lcom/google/android/gms/ads/internal/gmsg/zzx;

    move/from16 v1, p5

    iput-boolean v1, v0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V
    .registers 6
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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_17

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_1c
    move-exception p1

    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_1c

    throw p1
.end method

.method public final zza(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/くし〴〺ぅ;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050/\u3073\u3050\u3073\u3042\u3073/\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045<",
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "-",
            "Lcom/google/android/gms/internal/zzanh;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_f

    monitor-exit v0

    return-void

    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_41

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/ads/internal/gmsg/zzt;

    move-object v4, p2

    check-cast v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/〳ぜぞぜべっ;

    .line 1
    iget-object v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    instance-of v5, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/へぬ〴づぞ;

    if-eqz v5, :cond_3a

    move-object v5, v3

    check-cast v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/へぬ〴づぞ;

    .line 2
    iget-object v5, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/へぬ〴づぞ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    .line 3
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3a

    const/4 v4, 0x1

    goto :goto_3b

    :cond_3a
    const/4 v4, 0x0

    :goto_3b
    if-eqz v4, :cond_18

    .line 4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_41
    invoke-interface {p1, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_46
    move-exception p1

    monitor-exit v0
    :try_end_48
    .catchall {:try_start_3 .. :try_end_48} :catchall_46

    goto :goto_4a

    :goto_49
    throw p1

    :goto_4a
    goto :goto_49
.end method

.method public final zza(ZI)V
    .registers 13

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result v0

    new-instance v9, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v0

    if-nez v0, :cond_18

    const/4 v0, 0x0

    goto :goto_1a

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    :goto_1a
    move-object v2, v0

    iget-object v3, p0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v5}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v8

    move-object v1, v9

    move v6, p1

    move v7, p2

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzanh;ZILcom/google/android/gms/internal/zzakd;)V

    invoke-direct {p0, v9}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final zza(ZILjava/lang/String;)V
    .registers 16

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result v0

    new-instance v11, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v1, 0x0

    if-eqz v0, :cond_19

    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v2

    if-nez v2, :cond_19

    move-object v2, v1

    goto :goto_1b

    :cond_19
    iget-object v2, p0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    :goto_1b
    if-eqz v0, :cond_1f

    move-object v3, v1

    goto :goto_29

    :cond_1f
    new-instance v0, Lcom/google/android/gms/internal/zzanp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzanp;-><init>(Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/ads/internal/overlay/zzn;)V

    move-object v3, v0

    :goto_29
    iget-object v4, p0, Lcom/google/android/gms/internal/zzani;->zzbwv:Lcom/google/android/gms/ads/internal/gmsg/zzb;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v6}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v10

    move-object v1, v11

    move v7, p1

    move v8, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzanh;ZILjava/lang/String;Lcom/google/android/gms/internal/zzakd;)V

    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final zza(ZILjava/lang/String;Ljava/lang/String;)V
    .registers 19

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result v1

    new-instance v13, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v2, 0x0

    if-eqz v1, :cond_1a

    iget-object v3, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result v3

    if-nez v3, :cond_1a

    move-object v3, v2

    goto :goto_1c

    :cond_1a
    iget-object v3, v0, Lcom/google/android/gms/internal/zzani;->zzbdd:Lcom/google/android/gms/internal/zzje;

    :goto_1c
    if-eqz v1, :cond_20

    move-object v4, v2

    goto :goto_2a

    :cond_20
    new-instance v1, Lcom/google/android/gms/internal/zzanp;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    iget-object v4, v0, Lcom/google/android/gms/internal/zzani;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/zzanp;-><init>(Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/ads/internal/overlay/zzn;)V

    move-object v4, v1

    :goto_2a
    iget-object v5, v0, Lcom/google/android/gms/internal/zzani;->zzbwv:Lcom/google/android/gms/ads/internal/gmsg/zzb;

    iget-object v6, v0, Lcom/google/android/gms/internal/zzani;->zzbyi:Lcom/google/android/gms/ads/internal/overlay/zzq;

    iget-object v7, v0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v7}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object v12

    move-object v2, v13

    move v8, p1

    move/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/zzje;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzq;Lcom/google/android/gms/internal/zzanh;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzakd;)V

    invoke-direct {p0, v13}, Lcom/google/android/gms/internal/zzani;->zza(Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    return-void
.end method

.method public final zzac(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    return-void
.end method

.method public final zzb(II)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyf:Lcom/google/android/gms/internal/zzwr;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzwr;->zzb(II)V

    :cond_7
    return-void
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzt;)V
    .registers 5
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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzckd:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_f

    monitor-exit v0

    return-void

    :cond_f
    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_14
    move-exception p1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    throw p1
.end method

.method public final zzfv()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzavo:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzmv()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkr:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzavo:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    new-instance v1, Lcom/google/android/gms/internal/zzanl;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzanl;-><init>(Lcom/google/android/gms/internal/zzani;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahn;->runOnUiThread(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_16
    move-exception v1

    monitor-exit v0
    :try_end_18
    .catchall {:try_start_4 .. :try_end_18} :catchall_16

    throw v1
.end method

.method public final zztm()Lcom/google/android/gms/ads/internal/zzw;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbye:Lcom/google/android/gms/ads/internal/zzw;

    return-object v0
.end method

.method public final zztn()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdks:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zzto()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkt:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztp()Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdku:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztq()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkv:Z

    monitor-exit v0

    return v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public final zztr()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    const-string v1, "Loading blank page in WebView, 2..."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdky:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    const-string v2, "about:blank"

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzanh;->zzcz(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_14
    move-exception v1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_3 .. :try_end_16} :catchall_14

    throw v1
.end method

.method public final zztt()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    if-eqz v0, :cond_2a

    iget-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_16

    const/16 v2, 0xa

    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/gms/internal/zzani;->zza(Landroid/view/View;Lcom/google/android/gms/internal/zzafb;I)V

    return-void

    :cond_16
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zzts()V

    new-instance v1, Lcom/google/android/gms/internal/zzank;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzank;-><init>(Lcom/google/android/gms/internal/zzani;Lcom/google/android/gms/internal/zzafb;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzani;->zzdlc:Landroid/view/View$OnAttachStateChangeListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzbyk:Lcom/google/android/gms/internal/zzanh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_2a
    return-void
.end method

.method public final zztu()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzani;->zzdkv:Z

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_4 .. :try_end_7} :catchall_10

    iget v0, p0, Lcom/google/android/gms/internal/zzani;->zzdlb:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzani;->zzdlb:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zztx()V

    return-void

    :catchall_10
    move-exception v1

    :try_start_11
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_11 .. :try_end_12} :catchall_10

    throw v1
.end method

.method public final zztv()V
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzani;->zzdlb:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzani;->zzdlb:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zztx()V

    return-void
.end method

.method public final zztw()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzani;->zzdla:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzani;->zztx()V

    return-void
.end method

.method public final zzty()Lcom/google/android/gms/internal/zzanq;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzani;->zzdkx:Lcom/google/android/gms/internal/zzanq;

    return-object v0
.end method
