.class public final Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    }
.end annotation


# static fields
.field public static final DEVICE_ID_EMULATOR:Ljava/lang/String; = "B3EEABB8EE11C2BE770B684D95219ECB"

.field public static final ERROR_CODE_INTERNAL_ERROR:I = 0x0

.field public static final ERROR_CODE_INVALID_REQUEST:I = 0x1

.field public static final ERROR_CODE_NETWORK_ERROR:I = 0x2

.field public static final ERROR_CODE_NO_FILL:I = 0x3

.field public static final GENDER_FEMALE:I = 0x2

.field public static final GENDER_MALE:I = 0x1

.field public static final GENDER_UNKNOWN:I


# instance fields
.field public final げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/zzlt;

    .line 2
    iget-object p1, p1, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlu;

    .line 3
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzlt;-><init>(Lcom/google/android/gms/internal/zzlu;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    return-void
.end method

.method public static updateCorrelator()V
    .registers 0

    return-void
.end method


# virtual methods
.method public final getBirthday()Ljava/util/Date;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getBirthday()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final getContentUrl()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlt;->getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final getCustomTargeting()Landroid/os/Bundle;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getCustomTargeting()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getGender()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getGender()I

    move-result v0

    return v0
.end method

.method public final getKeywords()Ljava/util/Set;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getKeywords()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public final getManualImpressionsEnabled()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getManualImpressionsEnabled()Z

    move-result v0

    return v0
.end method

.method public final getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlt;->getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;

    move-result-object p1

    return-object p1
.end method

.method public final getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlt;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final getPublisherProvidedId()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlt;->getPublisherProvidedId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isTestDevice(Landroid/content/Context;)Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzlt;->isTestDevice(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public final zzbg()Lcom/google/android/gms/internal/zzlt;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzlt;

    return-object v0
.end method
