.class public final Landroidx/transition/Slide$〺つふすそ;
.super Landroidx/transition/Slide$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/transition/Slide$〳ぜぞぜべっ;-><init>(Landroidx/transition/Slide$げつ〴ぬぐ;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 5

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    goto :goto_9

    :cond_8
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    int-to-float p1, p1

    if-eqz v1, :cond_16

    add-float/2addr p2, p1

    goto :goto_17

    :cond_16
    sub-float/2addr p2, p1

    :goto_17
    return p2
.end method
