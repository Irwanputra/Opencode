.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;
.super Landroid/webkit/WebViewClient;
.source ""


# instance fields
.field public synthetic げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzbm;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .registers 4

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->〳ぜぞぜべっ:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_11

    const/4 p2, 0x0

    .line 2
    :try_start_7
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_a} :catch_b

    return-void

    :catch_b
    move-exception p1

    const-string p2, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .registers 7

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzbm;->〺つふすそ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_e

    return v0

    :cond_e
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbpp:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    const/4 v2, 0x1

    if-eqz p1, :cond_38

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->〳ぜぞぜべっ:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_32

    const/4 p2, 0x3

    .line 2
    :try_start_2a
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V
    :try_end_2d
    .catch Landroid/os/RemoteException; {:try_start_2a .. :try_end_2d} :catch_2e

    goto :goto_32

    :catch_2e
    move-exception p1

    :goto_2f
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :catch_32
    :cond_32
    :goto_32
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/zzbm;->ぺふねづ〺(I)V

    return v2

    :cond_38
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbpq:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_56

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 3
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->〳ぜぞぜべっ:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_32

    .line 4
    :try_start_50
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V
    :try_end_53
    .catch Landroid/os/RemoteException; {:try_start_50 .. :try_end_53} :catch_54

    goto :goto_32

    :catch_54
    move-exception p1

    goto :goto_2f

    :cond_56
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbpr:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9c

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 5
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->〳ぜぞぜべっ:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_78

    .line 6
    :try_start_6e
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzkh;->onAdLoaded()V
    :try_end_71
    .catch Landroid/os/RemoteException; {:try_start_6e .. :try_end_71} :catch_72

    goto :goto_78

    :catch_72
    move-exception p1

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_78
    :goto_78
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    const-string v1, "height"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8e

    goto :goto_32

    :cond_8e
    :try_start_8e
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->づざかべべ:Landroid/content/Context;

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzajr;->zzc(Landroid/content/Context;I)I

    move-result v0
    :try_end_9b
    .catch Ljava/lang/NumberFormatException; {:try_start_8e .. :try_end_9b} :catch_32

    goto :goto_32

    :cond_9c
    const-string p1, "gmsg://"

    .line 8
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a5

    return v2

    :cond_a5
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 9
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->〳ぜぞぜべっ:Lcom/google/android/gms/internal/zzkh;

    if-eqz p1, :cond_b5

    .line 10
    :try_start_ab
    invoke-interface {p1}, Lcom/google/android/gms/internal/zzkh;->onAdLeftApplication()V
    :try_end_ae
    .catch Landroid/os/RemoteException; {:try_start_ab .. :try_end_ae} :catch_af

    goto :goto_b5

    :catch_af
    move-exception p1

    const-string v0, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b5
    :goto_b5
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbm;->ぺぁあねじ:Lcom/google/android/gms/internal/zzcv;

    if-nez v0, :cond_bc

    goto :goto_d4

    :cond_bc
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :try_start_c0
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbm;->ぺぁあねじ:Lcom/google/android/gms/internal/zzcv;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->づざかべべ:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1, v1}, Lcom/google/android/gms/internal/zzcv;->zza(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    move-result-object p2
    :try_end_c9
    .catch Lcom/google/android/gms/internal/zzcw; {:try_start_c0 .. :try_end_c9} :catch_ca

    goto :goto_d0

    :catch_ca
    move-exception p1

    const-string v0, "Unable to process ad data"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_d0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    .line 12
    :goto_d4
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/びえぁぜい;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->づざかべべ:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return v2
.end method
