.class public final Landroidx/transition/Slide$くし〴〺ぅ;
.super Landroidx/transition/Slide$ぺぁあねじ;
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

    invoke-direct {p0, v0}, Landroidx/transition/Slide$ぺぁあねじ;-><init>(Landroidx/transition/Slide$げつ〴ぬぐ;)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p2, p1

    return p2
.end method
