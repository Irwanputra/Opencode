.class public final Lcom/google/android/gms/internal/zzhp;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzazv:F

.field private final zzazw:F

.field private final zzazx:F

.field private final zzazy:F

.field private final zzazz:I


# direct methods
.method public constructor <init>(FFFFI)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/zzhp;->zzazv:F

    iput p2, p0, Lcom/google/android/gms/internal/zzhp;->zzazw:F

    add-float/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/zzhp;->zzazx:F

    add-float/2addr p2, p4

    iput p2, p0, Lcom/google/android/gms/internal/zzhp;->zzazy:F

    iput p5, p0, Lcom/google/android/gms/internal/zzhp;->zzazz:I

    return-void
.end method


# virtual methods
.method public final zzgy()F
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzhp;->zzazv:F

    return v0
.end method

.method public final zzgz()F
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzhp;->zzazw:F

    return v0
.end method

.method public final zzha()F
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzhp;->zzazx:F

    return v0
.end method

.method public final zzhb()F
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzhp;->zzazy:F

    return v0
.end method

.method public final zzhc()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzhp;->zzazz:I

    return v0
.end method
