.class public Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:I

.field public final synthetic げつ〴ぬぐ:I

.field public final synthetic びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionMenu;III)V
    .registers 5

    iput-object p1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;

    iput p2, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    iput p3, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:I

    iput p4, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 6

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Lcom/github/clans/fab/FloatingActionMenu;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    iget v2, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:I

    iget v3, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {p1, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    return-void
.end method
