.class public Landroidx/transition/ChangeTransform$びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/View;

.field public final くし〴〺ぅ:[F

.field public final げつ〴ぬぐ:Landroid/graphics/Matrix;

.field public づざかべべ:F

.field public びぐびあび:F


# direct methods
.method public constructor <init>(Landroid/view/View;[F)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/transition/ChangeTransform$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    iput-object p1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iput-object p1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->くし〴〺ぅ:[F

    const/4 p2, 0x2

    aget p2, p1, p2

    iput p2, p0, Landroidx/transition/ChangeTransform$びぐびあび;->びぐびあび:F

    const/4 p2, 0x5

    aget p1, p1, p2

    iput p1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->づざかべべ:F

    invoke-virtual {p0}, Landroidx/transition/ChangeTransform$びぐびあび;->げつ〴ぬぐ()V

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Landroidx/transition/ChangeTransform$びぐびあび;->くし〴〺ぅ:[F

    iget v1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->びぐびあび:F

    const/4 v2, 0x2

    aput v1, v0, v2

    iget v1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->づざかべべ:F

    const/4 v2, 0x5

    aput v1, v0, v2

    iget-object v1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object v0, p0, Landroidx/transition/ChangeTransform$びぐびあび;->〺つふすそ:Landroid/view/View;

    iget-object v1, p0, Landroidx/transition/ChangeTransform$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    .line 1
    sget-object v2, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v2, v0, v1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->びぐびあび(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
