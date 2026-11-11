.class public Landroidx/transition/Fade$〺つふすそ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Fade;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public final げつ〴ぬぐ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 3

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/Fade$〺つふすそ;->〺つふすそ:Z

    iput-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    iget-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    .line 1
    sget-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, p1, v1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->なぎぱいぢぎ(Landroid/view/View;F)V

    .line 2
    iget-boolean p1, p0, Landroidx/transition/Fade$〺つふすそ;->〺つふすそ:Z

    if-eqz p1, :cond_14

    iget-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_14
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 5

    iget-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    .line 1
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-lt v0, v1, :cond_10

    invoke-virtual {p1}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result p1

    goto :goto_11

    :cond_10
    const/4 p1, 0x1

    :goto_11
    if-eqz p1, :cond_24

    .line 2
    iget-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result p1

    if-nez p1, :cond_24

    iput-boolean v2, p0, Landroidx/transition/Fade$〺つふすそ;->〺つふすそ:Z

    iget-object p1, p0, Landroidx/transition/Fade$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_24
    return-void
.end method
