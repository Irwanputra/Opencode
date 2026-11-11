.class public final Lcom/google/android/gms/ads/formats/NativeAdOptions;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;,
        Lcom/google/android/gms/ads/formats/NativeAdOptions$AdChoicesPlacement;
    }
.end annotation


# static fields
.field public static final ADCHOICES_BOTTOM_LEFT:I = 0x3

.field public static final ADCHOICES_BOTTOM_RIGHT:I = 0x2

.field public static final ADCHOICES_TOP_LEFT:I = 0x0

.field public static final ADCHOICES_TOP_RIGHT:I = 0x1

.field public static final ORIENTATION_ANY:I = 0x0

.field public static final ORIENTATION_LANDSCAPE:I = 0x2

.field public static final ORIENTATION_PORTRAIT:I = 0x1


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Z

.field public final づざかべべ:Lcom/google/android/gms/ads/VideoOptions;

.field public final びぐびあび:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean p2, p1, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->げつ〴ぬぐ:Z

    .line 3
    iput-boolean p2, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->げつ〴ぬぐ:Z

    .line 4
    iget p2, p1, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->〺つふすそ:I

    .line 5
    iput p2, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->〺つふすそ:I

    .line 6
    iget-boolean p2, p1, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->くし〴〺ぅ:Z

    .line 7
    iput-boolean p2, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->くし〴〺ぅ:Z

    .line 8
    iget p2, p1, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->づざかべべ:I

    .line 9
    iput p2, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->びぐびあび:I

    .line 10
    iget-object p1, p1, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->びぐびあび:Lcom/google/android/gms/ads/VideoOptions;

    .line 11
    iput-object p1, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->づざかべべ:Lcom/google/android/gms/ads/VideoOptions;

    return-void
.end method


# virtual methods
.method public final getAdChoicesPlacement()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->びぐびあび:I

    return v0
.end method

.method public final getImageOrientation()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->〺つふすそ:I

    return v0
.end method

.method public final getVideoOptions()Lcom/google/android/gms/ads/VideoOptions;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->づざかべべ:Lcom/google/android/gms/ads/VideoOptions;

    return-object v0
.end method

.method public final shouldRequestMultipleImages()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->くし〴〺ぅ:Z

    return v0
.end method

.method public final shouldReturnUrlsForImageAssets()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/NativeAdOptions;->げつ〴ぬぐ:Z

    return v0
.end method
