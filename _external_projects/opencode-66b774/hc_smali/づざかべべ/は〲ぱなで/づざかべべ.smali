.class public Lづざかべべ/は〲ぱなで/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "[F>;"
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:[F


# direct methods
.method public constructor <init>([F)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/づざかべべ;->げつ〴ぬぐ:[F

    return-void
.end method


# virtual methods
.method public evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    check-cast p2, [F

    check-cast p3, [F

    .line 1
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/づざかべべ;->げつ〴ぬぐ:[F

    if-nez v0, :cond_b

    array-length v0, p2

    new-array v0, v0, [F

    :cond_b
    const/4 v1, 0x0

    :goto_c
    array-length v2, v0

    if-ge v1, v2, :cond_1c

    aget v2, p2, v1

    aget v3, p3, v1

    invoke-static {v3, v2, p1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_1c
    return-object v0
.end method
